package yapily.examples;

import java.awt.Desktop;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Collections;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import static yapily.examples.Constants.APPLICATION_USER_ID;
import yapily.sdk.ApiResponseOfPaymentAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentResponse;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.Consent;
import yapily.sdk.ConsentsApi;
import yapily.sdk.PaymentAuthorisationRequest;
import yapily.sdk.PaymentRequest;
import yapily.sdk.PaymentResponse;
import yapily.sdk.PaymentsApi;

public class ExamplePayment {

    private static final String INSTITUTION_ID = "modelo-sandbox";

    public static void main(String[] args) throws Exception {
        // Set access credentials
        ApiClient defaultClient = ApiClientUtils.basicAuth();

        System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

        final ApplicationUsersApi usersApi = new ApplicationUsersApi();

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

        // Send the payment authorisation request
        ApiResponseOfPaymentAuthorisationRequestResponse authorizationResponse = paymentsApi.createPaymentAuthorisationUsingPOST(paymentAuthorisationRequest, null, null, null);

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

                final String consentToken = consent.getConsentToken();

                // Create the payment with the same payment request object used in the payment authorisation request
                ApiResponseOfPaymentResponse response = paymentsApi.createPaymentUsingPOST(consentToken, paymentRequest);

                System.out.println("Payment submitted");

                PaymentResponse.StatusEnum status = response.getData().getStatus();

                while (status == PaymentResponse.StatusEnum.PENDING) {
                    ApiResponseOfPaymentResponse apiResponseOfPaymentResponse = paymentsApi.getPaymentStatusUsingGET(response.getData().getId(), consentToken);
                    status = apiResponseOfPaymentResponse.getData().getStatus();
                    Thread.sleep(1000);
                }

                System.out.println("Payment was executed with status: " + status);

            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }
}
