package yapily.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import yapily.ApiClient;
import yapily.ApiException;
import yapily.auth.OAuth;
import yapily.sdk.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static yapily.examples.Constants.APPLICATION_USER_ID;
import static yapily.examples.Constants.STARLING_PERSONAL_ACCESS_TOKEN;

/**
 * This example simulates creating and adding a personal access token for an institution user, returning normalised data
 * from AccountsApi, TransactionsApi and Identity endpoints. Application credentials must be created
 * and managed in the Yapily Dashboard Application. For demo purposes, the application ID and secret
 * are included as constants.
 */
public class ExampleAccountDetailsWithToken {

    private static final String INSTITUTION_ID = "starling-personal-access";

    public static void main(String[] args) {

        System.out.println("Institution authorisation flow and banking requests using Yapily API!");

        try {
            // Set access credentials
            ApiClient defaultClient = new ApiClient();

            // Configure Token authorization: tokenAuth
            OAuth oAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
            oAuth.setAccessToken(AuthorizationUtils.createAccessToken());

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            ApplicationUser applicationUser = UserUtils.createOrUseExistingApplciationUser(APPLICATION_USER_ID);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("Using user:");
            System.out.println(gson.toJson(applicationUser));

            // Get user consents
            final ConsentsApi consentsApi = new ConsentsApi();

            System.out.println("Obtaining the most recent consent filtered by application user Id [" +
                    APPLICATION_USER_ID +  "] and institution [" + INSTITUTION_ID + "] with GET /consents?" +
                    "filter[applicationUserId]=" + APPLICATION_USER_ID + "&filter[institution]=" + INSTITUTION_ID);
            System.out.println("Validating that the consent is AUTHORIZED");

            CreateConsentAccessToken createConsentApiKey = new CreateConsentAccessToken();
            createConsentApiKey.setAccessToken(STARLING_PERSONAL_ACCESS_TOKEN);
            createConsentApiKey.setInstitutionId(INSTITUTION_ID);

            consentsApi.addConsentUsingPOST(applicationUser.getUuid(), createConsentApiKey);

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

            // Get accounts
            final AccountsApi accountsApi = new AccountsApi();

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
                        transactionsApi.getTransactionsUsingGET(
                                consent.getConsentToken(),
                                accountOpt.get().getId(),
                                Collections.emptyList(),
                                "1980-01-01T00:00:00.000Z",
                                "2100-01-01T00:00:00.000Z",
                                10,
                                null,
                                0);

                List<Transaction> transactions = transactionsResponse.getData();

                System.out.println("Transactions:");
                System.out.println(gson.toJson(transactions));

                // Get transactions with merchant details
                System.out.println("Request account transactions (with merchants) using GET /accounts/{accountId}/transactions");
                ApiListResponseOfTransaction transactionsWithMerchantsResponse =
                        transactionsApi.getTransactionsUsingGET(
                                consent.getConsentToken(),
                                accountOpt.get().getId(),
                                Collections.singletonList("merchant"),
                                "1980-01-01T00:00:00.000Z",
                                "2100-01-01T00:00:00.000Z",
                                10,
                                null,
                                0);

                List<Transaction> transactionsWithMerchants = transactionsWithMerchantsResponse.getData();

                System.out.println("Transactions (including merchant info):");
                System.out.println(gson.toJson(transactionsWithMerchants));
            }

            // Check if identity is supported
            InstitutionsApi institutionsApi = new InstitutionsApi();
            Institution institution = institutionsApi.getInstitutionUsingGET(INSTITUTION_ID);
            Boolean supportsIdentity = institution.getFeatures().stream()
                    .anyMatch(featuresEnum -> featuresEnum!= null && featuresEnum.equals(Institution.FeaturesEnum.IDENTITY));

            if (supportsIdentity) {
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
                    if (e.getCode() == 404) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

}
