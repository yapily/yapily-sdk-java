/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.13.1
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package yapily.sdk.api;

import yapily.sdk.*;
import yapily.sdk.auth.*;
import yapily.sdk.models.ApiErrorResponse;
import yapily.sdk.models.ApiResponseOfFundsConfirmationResponse;
import yapily.sdk.models.ApiResponseOfNonSweepingAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfSubmissionResponse;
import yapily.sdk.models.ApiResponseOfSweepingAuthorisationResponse;
import yapily.sdk.models.FundsConfirmationRequest;
import yapily.sdk.models.NonSweepingAuthorisationRequest;
import yapily.sdk.models.SubmissionRequest;
import yapily.sdk.models.SweepingAuthorisationRequest;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VariableRecurringPaymentsApi
 */
public class VariableRecurringPaymentsApiTest {

    private final VariableRecurringPaymentsApi api = new VariableRecurringPaymentsApi();

    /**
     * Create Non-Sweeping Variable Recurring Payment Authorisation
     *
     * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Non-Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNonSweepingAuthorisationTest() throws ApiException {
        //NonSweepingAuthorisationRequest nonSweepingAuthorisationRequest = null;
        //ApiResponseOfNonSweepingAuthorisationResponse response = api.createNonSweepingAuthorisation(nonSweepingAuthorisationRequest);
        // TODO: test validations
    }

    /**
     * Create Sweeping Variable Recurring Payment Authorisation
     *
     * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSweepingAuthorisationTest() throws ApiException {
        //SweepingAuthorisationRequest sweepingAuthorisationRequest = null;
        //ApiResponseOfSweepingAuthorisationResponse response = api.createSweepingAuthorisation(sweepingAuthorisationRequest);
        // TODO: test validations
    }

    /**
     * Confirm Funds for Variable Recurring Payment
     *
     * Used to confirm funds on the Payer account to execute Variable Recurring Payments after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;VARIABLE_RECURRING_PAYMENT_FUNDS_CONFIRMATION&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVrpFundsConfirmationTest() throws ApiException {
        //String consent = null;
        //FundsConfirmationRequest fundsConfirmationRequest = null;
        //ApiResponseOfFundsConfirmationResponse response = api.createVrpFundsConfirmation(consent, fundsConfirmationRequest);
        // TODO: test validations
    }

    /**
     * Create Variable Recurring Payment
     *
     * Used to submit a Variable Recurring Payments transaction after obtaining the user&#39;s authorisation. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING&#x60;&lt;/li&gt;&lt;li&gt;&#x60;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVrpPaymentTest() throws ApiException {
        //String consent = null;
        //SubmissionRequest submissionRequest = null;
        //ApiResponseOfSubmissionResponse response = api.createVrpPayment(consent, submissionRequest);
        // TODO: test validations
    }

    /**
     * Get Sweeping Variable Recurring Payment Consent Details
     *
     * Get Sweeping Variable Recurring Payments consent details using the consent Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSweepingVrpConsentByIdTest() throws ApiException {
        //UUID consentId = null;
        //ApiResponseOfSweepingAuthorisationResponse response = api.getSweepingVrpConsentById(consentId);
        // TODO: test validations
    }

    /**
     * Get Variable Recurring Payment Details
     *
     * Get Variable Recurring Payment details using the Payment Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVrpPaymentDetailsTest() throws ApiException {
        //String paymentId = null;
        //String consent = null;
        //ApiResponseOfSubmissionResponse response = api.getVrpPaymentDetails(paymentId, consent);
        // TODO: test validations
    }

    /**
     * Get Non-Sweeping Variable Recurring Payment Consent Details
     *
     * Get Non-Sweeping Variable Recurring Payments consent details using the consent Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getpNonSweepingVrpConsentByIdTest() throws ApiException {
        //UUID consentId = null;
        //ApiResponseOfNonSweepingAuthorisationResponse response = api.getpNonSweepingVrpConsentById(consentId);
        // TODO: test validations
    }

}
