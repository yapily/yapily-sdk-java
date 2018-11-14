package yapily.examples;

import static yapily.examples.Constants.APPLICATION_ID;
import static yapily.examples.Constants.APPLICATION_SECRET;
import static yapily.examples.Constants.PARAMETER_APPLICATION_ID;
import static yapily.examples.Constants.PARAMETER_CALLBACK_URL;
import static yapily.examples.Constants.PARAMETER_USER_ID;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import yapily.ApiException;
import yapily.Configuration;
import yapily.auth.HttpBasicAuth;
import yapily.sdk.Account;
import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.AccountRequest;
import yapily.sdk.AccountsApi;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiListResponseOfTransaction;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfIdentity;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.Consent;
import yapily.sdk.ConsentsApi;
import yapily.sdk.Identity;
import yapily.sdk.IdentityApi;
import yapily.sdk.NewApplicationUser;
import yapily.sdk.Transaction;
import yapily.sdk.TransactionsApi;

/**
 * This example simulates creating and authenticating an institution user, returning normalised data
 * from AccountsApi, TransactionsApi and Identity endpoints. Application credentials must be created
 * and managed in the Yapily Dashboard Application. For demo purposes, the application ID and secret
 * are included as constants.
 */
public class ExampleAccountDetails {

    private static final String INSTITUTION_ID = "bbva-sandbox";

    public static void main(String[] args) {
        System.out.println("Institution authorisation flow and banking requests using Yapily API!");

        try {

            // Set access credentials
            ApiClient defaultClient = Configuration.getDefaultApiClient();

            // Configure HTTP basic authorization: basicAuth
            HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
            // Replace these demo constants with your application credentials
            basicAuth.setUsername(APPLICATION_ID);
            basicAuth.setPassword(APPLICATION_SECRET);

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            // Create a user for this application
            final ApplicationUsersApi usersApi = new ApplicationUsersApi();

            NewApplicationUser user = new NewApplicationUser();
            user.setReferenceId("Bojack");

            System.out.println("Adding new user [Bojack] with POST /users");
            final ApplicationUser applicationUser = usersApi.addUserUsingPOST(user);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("Created user:");
            System.out.println(gson.toJson(applicationUser));

            // Set user and institution id variables
            String userUuid = applicationUser.getUuid();

            // Get accounts
            final AccountsApi accountsApi = new AccountsApi();
            AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest();
            accountAuthorisationRequest.setUserUuid(userUuid);
            accountAuthorisationRequest.setInstitutionId(INSTITUTION_ID);
            /**
             * Use the defaults
             */
            accountAuthorisationRequest.setAccountRequest(new AccountRequest());
            ApiResponseOfAuthorisationRequestResponse authorizationResponse = accountsApi.initiateAccountRequestUsingPOST(accountAuthorisationRequest);
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
                    final ConsentsApi consentsApi = new ConsentsApi();
                    List<Consent> consents = consentsApi.getUserConsentsUsingGET(userUuid, INSTITUTION_ID);

                    System.out.println("Reading user consents filtered by institution [" + INSTITUTION_ID +
                                       "] with GET /users/{userUuid}/consents?institutionId={institutionId}");
                    Consent consent = consentsApi.getUserConsentsUsingGET(userUuid, INSTITUTION_ID)
                                                 .stream()
                                                 .findFirst()
                                                 .orElseThrow(() -> new RuntimeException(String.format("No consent token present for user %s", userUuid)));

                    System.out.println("Request banking accounts with GET /accounts");
                    ApiListResponseOfAccount accountsResponse = accountsApi.getAccountsUsingGET(consent.getConsentToken());
                    List<Account> accounts = accountsResponse.getData();

                    System.out.println("Accounts:");
                    System.out.println(gson.toJson(accounts));

                    // Get transactions
                    final TransactionsApi transactionsApi = new TransactionsApi();

                    Optional<Account> accountOpt = accounts.stream().findFirst();
                    if (accountOpt.isPresent()) {
                        System.out.println("Request account transactions with GET /accounts/{accountId}/transactions");
                        ApiListResponseOfTransaction transactionsResponse =
                                transactionsApi.getTransactionsUsingGET(consent.getConsentToken(), accountOpt.get().getId(),new ArrayList<>());

                        List<Transaction> transactions = transactionsResponse.getData();

                        System.out.println("Transactions:");
                        System.out.println(gson.toJson(transactions));
                    }

                    // Get identity
                    final IdentityApi identityApi = new IdentityApi();

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
