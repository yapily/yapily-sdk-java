package yapily.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import yapily.ApiException;
import yapily.Configuration;
import yapily.auth.HttpBasicAuth;
import static yapily.examples.Constants.APPLICATION_ID;
import static yapily.examples.Constants.APPLICATION_SECRET;
import static yapily.examples.Constants.STARLING_PERSONAL_ACCESS_TOKEN;

import yapily.sdk.Account;
import yapily.sdk.AccountsApi;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiListResponseOfTransaction;
import yapily.sdk.ApiResponseOfIdentity;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.Consent;
import yapily.sdk.ConsentsApi;
import yapily.sdk.CreateConsentAccessToken;
import yapily.sdk.Identity;
import yapily.sdk.IdentityApi;
import yapily.sdk.NewApplicationUser;
import yapily.sdk.Transaction;
import yapily.sdk.TransactionsApi;

/**
 * This example simulates creating and adding a personal access token for an institution user, returning normalised data
 * from AccountsApi, TransactionsApi and Identity endpoints. Application credentials must be created
 * and managed in the Yapily Dashboard Application. For demo purposes, the application ID and secret
 * are included as constants.
 */
public class ExampleAccountDetailsWithToken {

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
            usersApi.addUserUsingPOST(user);

            System.out.println("Adding new user [Bojack] with POST /users");
            final ApplicationUser applicationUser = usersApi.addUserUsingPOST(user);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("Created user:");
            System.out.println(gson.toJson(applicationUser));

            // Set user and institution id variables
            String institutionId = "starling-personal-access";
            String userUuid = applicationUser.getUuid();

            // Get user consents
            final ConsentsApi consentsApi = new ConsentsApi();

            System.out.println("Reading user consents filtered by institution [" + institutionId +
                               "] with GET /users/{userUuid}/consents?institutionId={institutionId}");

            CreateConsentAccessToken createConsentApiKey = new CreateConsentAccessToken();
            createConsentApiKey.setAccessToken(STARLING_PERSONAL_ACCESS_TOKEN);
            createConsentApiKey.setInstitutionId(institutionId);

            consentsApi.addConsentUsingPOST(userUuid,createConsentApiKey);

            Consent consent = consentsApi.getUserConsentsUsingGET(userUuid, institutionId)
                                         .stream()
                                         .findFirst()
                                         .orElseThrow(() -> new RuntimeException(String.format("No consent token present for user %s", userUuid)));

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
                        transactionsApi.getTransactionsUsingGET(consent.getConsentToken(), accountOpt.get().getId(), Collections.emptyList());

                List<Transaction> transactions = transactionsResponse.getData();

                System.out.println("Transactions:");
                System.out.println(gson.toJson(transactions));

                // Get transactions with merchant details
                System.out.println("Request account transactions (with merchants) using GET /accounts/{accountId}/transactions");
                ApiListResponseOfTransaction transactionsWithMerchantsResponse =
                        transactionsApi.getTransactionsUsingGET(consent.getConsentToken(), accountOpt.get().getId(), Collections.singletonList("merchant"));

                List<Transaction> transactionsWithMerchants = transactionsWithMerchantsResponse.getData();

                System.out.println("Transactions (including merchant info):");
                System.out.println(gson.toJson(transactionsWithMerchants));
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
                if (e.getCode() == 404) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

}
