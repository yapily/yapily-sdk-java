package yapily.examples;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import yapily.ApiException;
import static yapily.examples.Constants.APPLICATION_USER_ID;
import static yapily.examples.Constants.PARAMETER_APPLICATION_ID;
import static yapily.examples.Constants.PARAMETER_CALLBACK_URL;
import static yapily.examples.Constants.PARAMETER_USER_ID;
import yapily.sdk.Account;
import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.AccountRequest;
import yapily.sdk.AccountsApi;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiListResponseOfTransaction;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfIdentity;
import yapily.sdk.ApplicationUser;
import yapily.sdk.Consent;
import yapily.sdk.ConsentsApi;
import yapily.sdk.Identity;
import yapily.sdk.IdentityApi;
import yapily.sdk.Institution;
import yapily.sdk.InstitutionsApi;
import yapily.sdk.Transaction;
import yapily.sdk.TransactionsApi;

/**
 * This example simulates creating and authenticating an institution user, returning normalised data
 * from AccountsApi, TransactionsApi and Identity endpoints. Application credentials must be created
 * and managed in the Yapily Dashboard Application. For demo purposes, the application ID and secret
 * are included as constants.
 */
public class ExampleAccountDetails {

    private static final String INSTITUTION_ID = "modelo-sandbox";

    public static void main(String[] args) {
        System.out.println("Institution authorisation flow and banking requests using Yapily API!");

        try {
            // Set access credentials
            ApiClient defaultClient = ApiClientUtils.basicAuth();

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            ApplicationUser applicationUser = UserUtils.createOrUseExistingApplciationUser(APPLICATION_USER_ID, defaultClient);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("Using user:");
            System.out.println(gson.toJson(applicationUser));

            // Get accounts
            final AccountsApi accountsApi = new AccountsApi(defaultClient);
            AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest();
            accountAuthorisationRequest.setApplicationUserId(APPLICATION_USER_ID);
            accountAuthorisationRequest.setInstitutionId(INSTITUTION_ID);
            /**
             * Use the defaults
             */
            accountAuthorisationRequest.setAccountRequest(new AccountRequest());
            ApiResponseOfAuthorisationRequestResponse authorizationResponse = accountsApi.initiateAccountRequestUsingPOST(accountAuthorisationRequest, null, null, null);
            String directUrl = authorizationResponse.getData().getAuthorisationUrl();

            // Send applicationUser to authentication for an institution and add a callback with credentials
            System.out.println("Auth url: " + directUrl);

            if (Desktop.isDesktopSupported()) {
                try {
                    System.out.println("Opening browser with auth url.");
                    Desktop.getDesktop().browse(new URI(directUrl));

                    // After authentication, you should be redirected to a static page that can be closed
                    System.out.println("After completing authentication, press Enter to continue: [enter]");
                    System.in.read();

                    // Get user consents
                    ConsentsApi consentsApi = new ConsentsApi(defaultClient);

                    System.out.println("Obtaining the most recent consent filtered by application user Id [" +
                            APPLICATION_USER_ID +  "] and institution [" + INSTITUTION_ID + "] with GET /consents?" +
                            "filter[applicationUserId]=" + APPLICATION_USER_ID + "&filter[institution]=" + INSTITUTION_ID);
                    System.out.println("Validating that the consent is AUTHORIZED");

                    Consent consent = consentsApi.getConsentsUsingGET(
                            Collections.singletonList(APPLICATION_USER_ID),
                            Collections.emptyList(),
                            Collections.singletonList(INSTITUTION_ID),
                            Collections.emptyList(),
                            null,
                            null,
                            1,
                            null).getData().stream()
                            .filter(c -> c.getStatus().equals(Consent.StatusEnum.AUTHORIZED))
                            .findFirst()
                            .orElseThrow(() -> new RuntimeException(String.format("No consent token present for application user %s", APPLICATION_USER_ID)));

                    System.out.println("Request banking accounts with GET /accounts");
                    ApiListResponseOfAccount accountsResponse = accountsApi.getAccountsUsingGET(consent.getConsentToken());
                    List<Account> accounts = accountsResponse.getData();

                    System.out.println("Accounts:");
                    System.out.println(gson.toJson(accounts));

                    // Get transactions
                    TransactionsApi transactionsApi = new TransactionsApi(defaultClient);

                    Optional<Account> accountOpt = accounts.stream().findFirst();
                    if (accountOpt.isPresent()) {
                        System.out.println("Request account transactions with GET /accounts/{accountId}/transactions");
                        ApiListResponseOfTransaction transactionsResponse =
                                transactionsApi.getTransactionsUsingGET(
                                        consent.getConsentToken(),
                                        accountOpt.get().getId(),
                                        Collections.emptyList(),
                                        "1980-01-01T00:00:00.000Z",
                                        "2020-01-01T00:00:00.000Z",
                                        10,
                                        null,
                                        0,
                                        null);

                        List<Transaction> transactions = transactionsResponse.getData();

                        System.out.println("Transactions:");
                        System.out.println(gson.toJson(transactions));
                    }

                    // Check if identity is supported
                    InstitutionsApi institutionsApi = new InstitutionsApi(defaultClient);
                    Institution institution = institutionsApi.getInstitutionUsingGET(INSTITUTION_ID);
                    boolean supportsIdentity = institution.getFeatures().stream()
                                                          .anyMatch(featuresEnum -> featuresEnum!= null && featuresEnum.equals(Institution.FeaturesEnum.IDENTITY));

                    if (supportsIdentity) {
                        // Get identity
                        final IdentityApi identityApi = new IdentityApi(defaultClient);

                        try {
                            System.out.println("Request user identity with GET /identity");
                            ApiResponseOfIdentity identityResp = identityApi.getIdentityUsingGET(consent.getConsentToken());

                            Identity identity = identityResp.getData();

                            System.out.println("Identity:");
                            System.out.println(gson.toJson(identity));
                        } catch (ApiException e) {
                            // Some institutions don't provide Identity.
                            if (e.getCode() == 404) System.out.println(e.getMessage());
                        }
                    }
                } catch (final IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static List<NameValuePair> uriParameters(String applicationUuid,
                                                     String userUuid,
                                                     String callbackUrl) {
        List<NameValuePair> uriParameters = new ArrayList<>();
        uriParameters.add(new BasicNameValuePair(PARAMETER_APPLICATION_ID, applicationUuid));
        uriParameters.add(new BasicNameValuePair(PARAMETER_USER_ID, userUuid));
        if (callbackUrl != null) uriParameters.add(new BasicNameValuePair(PARAMETER_CALLBACK_URL, callbackUrl));
        return uriParameters;
    }

}
