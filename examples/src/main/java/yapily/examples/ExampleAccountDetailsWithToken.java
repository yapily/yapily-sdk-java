package yapily.examples;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import static yapily.examples.Constants.APPLICATION_USER_ID;
import static yapily.examples.Constants.STARLING_PERSONAL_ACCESS_TOKEN;
import yapily.sdk.api.FinancialDataApi;
import yapily.sdk.models.Account;
import yapily.sdk.models.AccountApiListResponse;
import yapily.sdk.models.ApiListResponseOfTransaction;
import yapily.sdk.models.ApiResponseOfIdentity;
import yapily.sdk.models.ApplicationUser;
import yapily.sdk.models.AuthorisationStatus;
import yapily.sdk.models.Consent;
import yapily.sdk.api.ConsentsApi;
import yapily.sdk.models.FeatureEnum;
import yapily.sdk.models.Identity;
import yapily.sdk.models.Institution;
import yapily.sdk.api.InstitutionsApi;
import yapily.sdk.models.Transaction;

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
            ApiClient defaultClient = ApiClientUtils.basicAuth();

            System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

            ApplicationUser applicationUser = UserUtils.createOrUseExistingApplciationUser(APPLICATION_USER_ID, defaultClient);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("Using user:");
            System.out.println(gson.toJson(applicationUser));

            // Get user consents
            final ConsentsApi consentsApi = new ConsentsApi(defaultClient);

            System.out.println("Obtaining the most recent consent filtered by application user Id [" +
                    APPLICATION_USER_ID +  "] and institution [" + INSTITUTION_ID + "] with GET /consents?" +
                    "filter[applicationUserId]=" + APPLICATION_USER_ID + "&filter[institution]=" + INSTITUTION_ID);
            System.out.println("Validating that the consent is AUTHORIZED");

            Consent consent = consentsApi.getConsents(
                                                 Set.of(APPLICATION_USER_ID),
                                                 Set.of(),
                                                 Set.of(INSTITUTION_ID),
                                                 Set.of(),
                                                 null,
                                                 null,
                                                 1,
                                                 null).getData().stream()
                    .filter(c -> c.getStatus().equals(AuthorisationStatus.AUTHORIZED))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException(String.format("No consent token present for application user %s", APPLICATION_USER_ID)));

            // Get accounts
            final FinancialDataApi accountsApi = new FinancialDataApi(defaultClient);

            System.out.println("Request banking accounts with GET /accounts");
            AccountApiListResponse accountsResponse = accountsApi.getAccounts(consent.getConsentToken(), null, null, null, false);
            List<Account> accounts = accountsResponse.getData();

            System.out.println("Accounts:");
            System.out.println(gson.toJson(accounts));

            // Get transactions
            Optional<Account> accountOpt = accounts.stream().findFirst();
            if (accountOpt.isPresent()) {
                System.out.println("Request account transactions with GET /accounts/{accountId}/transactions");
                ApiListResponseOfTransaction transactionsResponse =
                        accountsApi.getTransactions(
                                accountOpt.get().getId(),
                                consent.getConsentToken(),
                                "", "",
                                "",
                                Collections.emptyList(),
                                "1980-01-01T00:00:00.000Z",
                                "2020-01-01T00:00:00.000Z",
                                10,
                                null,
                                0,
                                null, false);

                List<Transaction> transactions = transactionsResponse.getData();

                System.out.println("Transactions:");
                System.out.println(gson.toJson(transactions));

                // Get transactions with merchant details
                System.out.println("Request account transactions (with merchants) using GET /accounts/{accountId}/transactions");
                ApiListResponseOfTransaction transactionsWithMerchantsResponse =
                        accountsApi.getTransactions(
                                accountOpt.get().getId(),
                                consent.getConsentToken(),
                                "", "",
                                "",
                                List.of("merchant"),
                                "1980-01-01T00:00:00.000Z",
                                "2020-01-01T00:00:00.000Z",
                                10,
                                null,
                                0,
                                null, false);

                List<Transaction> transactionsWithMerchants = transactionsWithMerchantsResponse.getData();

                System.out.println("Transactions (including merchant info):");
                System.out.println(gson.toJson(transactionsWithMerchants));
            }

            // Check if identity is supported
            InstitutionsApi institutionsApi = new InstitutionsApi(defaultClient);
            Institution institution = institutionsApi.getInstitution(INSTITUTION_ID);
            Boolean supportsIdentity = institution.getFeatures().stream()
                    .anyMatch(featuresEnum -> featuresEnum!= null && featuresEnum.equals(FeatureEnum.IDENTITY));

            if (supportsIdentity) {
                // Get identity
                 final FinancialDataApi identityApi = new FinancialDataApi(defaultClient);

                try {
                    System.out.println("Request user identity with GET /identity");
                    ApiResponseOfIdentity identityResp = identityApi.getIdentity(consent.getConsentToken(), false);
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
