package yapily.examples;

import java.awt.Desktop;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Optional;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.sdk.ApiClient;
import static yapily.examples.Constants.APPLICATION_USER_ID;
import yapily.sdk.api.AuthorisationsApi;
import yapily.sdk.models.ApiResponseOfPaymentAuthorisationRequestResponse;
import yapily.sdk.models.ApiResponseOfPaymentResponse;
import yapily.sdk.models.ApiResponseOfPaymentResponses;
import yapily.sdk.models.ApplicationUser;
import yapily.sdk.api.UsersApi;
import yapily.sdk.models.AuthorisationStatus;
import yapily.sdk.models.Consent;
import yapily.sdk.api.ConsentsApi;
import yapily.sdk.models.PaymentAuthorisationRequest;
import yapily.sdk.models.PaymentRequest;
import yapily.sdk.models.PaymentResponse;
import yapily.sdk.api.PaymentsApi;
import yapily.sdk.models.PaymentStatus;

public class ExamplePayment {

    private static final String INSTITUTION_ID = "modelo-sandbox";

    public static void main(String[] args) throws Exception {
        // Set access credentials
        ApiClient defaultClient = ApiClientUtils.basicAuth();

        System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

        final UsersApi usersApi = new UsersApi();

        ApplicationUser applicationUser = UserUtils.createOrUseExistingApplciationUser(APPLICATION_USER_ID, defaultClient);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("Using user:");
        System.out.println(gson.toJson(applicationUser));

        PaymentsApi paymentsApi = new PaymentsApi(defaultClient);

        // Create a new payment authorisation request
        PaymentAuthorisationRequest paymentAuthorisationRequest = new PaymentAuthorisationRequest();
        paymentAuthorisationRequest.setApplicationUserId(APPLICATION_USER_ID);
        paymentAuthorisationRequest.setInstitutionId(INSTITUTION_ID);

        // Create the payment request detailing the payment to attach to the authorisation request
        PaymentRequest paymentRequest = PaymentRequestUtils.createNewDomesticPaymentRequestWithSortCodeAndAccountNumber(
                new BigDecimal(1),
                "GBP",
                "Test Domestic payment",
                "anyUniqueStringOver18characters",
                "Bob Smith",
                "700001",
                "70000005"
        );
        paymentAuthorisationRequest.setPaymentRequest(paymentRequest);
        System.out.println();
        System.out.println("Sending a new payment authorisation request: ");
        System.out.println(gson.toJson(paymentAuthorisationRequest));
        final AuthorisationsApi authorisationsApi = new AuthorisationsApi(defaultClient);
        // Send the payment authorisation request
        ApiResponseOfPaymentAuthorisationRequestResponse authorizationResponse = authorisationsApi.createPaymentAuthorisation(paymentAuthorisationRequest, null, null, null, false);

        URI url = new URI(authorizationResponse.getData().getAuthorisationUrl());

        if (Desktop.isDesktopSupported()) {
            try {
                System.out.println("Opening browser with auth url.");
                Desktop.getDesktop().browse(url);

                // After authentication, you should be redirected to a static page that can be closed
                System.out.println("After completing authentication, press Enter to continue: [enter]");
                System.in.read();

                // Get user consents
                final ConsentsApi consentsApi = new ConsentsApi(defaultClient);

                System.out.println("Obtaining the most recent consent filtered by application user Id [" +
                                   APPLICATION_USER_ID + "] and institution [" + INSTITUTION_ID + "] with GET /consents?" +
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

                final String consentToken = consent.getConsentToken();

                // Create the payment with the same payment request object used in the payment authorisation request
                ApiResponseOfPaymentResponse response = paymentsApi.createPayment(consentToken, paymentRequest, null, null, null, false);

                System.out.println("Payment submitted");

                PaymentStatus status = response.getData().getStatus();

                while (status == PaymentStatus.PENDING) {
                    ApiResponseOfPaymentResponses apiResponseOfPaymentResponse = paymentsApi.getPayments(response.getData().getId(), consentToken, null, null, null, false);
                    Optional<PaymentResponse> payment = apiResponseOfPaymentResponse.getData()
                                                                                    .getPayments()
                                                                                    .stream()
                                                                                    .filter(p -> p.getStatus() != PaymentStatus.PENDING).findFirst();
                    if (payment.get() != null) {
                        status = payment.get().getStatus();
                    }

                    Thread.sleep(1000);
                }

                System.out.println("Payment was executed with status: " + status);

            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }
}
