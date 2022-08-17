/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package yapily.sdk.api;

import yapily.sdk.*;
import yapily.sdk.auth.*;
import yapily.sdk.models.AccountAuthorisationRequest;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfAccountAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfEmbeddedAccountAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfPaymentAuthorisationRequestResponse;
import yapily.sdk.models.ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse;
import yapily.sdk.models.BulkPaymentAuthorisationRequest;
import yapily.sdk.models.BulkPaymentEmbeddedAuthorisationRequest;
import yapily.sdk.models.EmbeddedAccountAuthorisationRequest;
import yapily.sdk.models.PaymentAuthorisationRequest;
import yapily.sdk.models.PaymentEmbeddedAuthorisationRequest;
import yapily.sdk.models.PaymentPreAuthorisationRequest;
import yapily.sdk.models.PreAuthorisationRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorisationsApi
 */
public class AuthorisationsApiTest {

    private final AuthorisationsApi api = new AuthorisationsApi();

    /**
     * Create Bulk Payment Authorisation
     *
     * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_BULK_PAYMENT&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBulkPaymentAuthorisationTest() throws ApiException {
        //BulkPaymentAuthorisationRequest bulkPaymentAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentAuthorisationRequestResponse response = api.createBulkPaymentAuthorisation(bulkPaymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Create Embedded Bulk Payment Authorisation
     *
     * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60; feature in order to obtain the the user&#39;s authorisation for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmbeddedBulkPaymentAuthorisationTest() throws ApiException {
        //BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.createEmbeddedBulkPaymentAuthorisation(bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Create Embedded Payment Authorisation
     *
     * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60; feature in order to obtain the the user&#39;s authorisation for a payment.&lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmbeddedPaymentAuthorisationTest() throws ApiException {
        //PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.createEmbeddedPaymentAuthorisation(paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Create Payment Authorisation
     *
     * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a payment. This endpoint is used to initiate all the different payment listed below. Based on the type of payment you wish to make, you may be required to provide specific properties in [PaymentRequest](https://docs.yapily.com/api/reference/#operation/createPaymentAuthorisation!path&#x3D;paymentRequest&amp;t&#x3D;request). First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/reference/#operation/getInstitution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentAuthorisationTest() throws ApiException {
        //PaymentAuthorisationRequest paymentAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentAuthorisationRequestResponse response = api.createPaymentAuthorisation(paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Create Payment Pre-authorisation
     *
     * Used to initiate the pre-authorisation process for payments for CbiGlobe &#x60;Institution&#x60; that contains the &#x60;INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS&#x60; feature to authenticate the user. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentPreAuthorisationRequestTest() throws ApiException {
        //PaymentPreAuthorisationRequest paymentPreAuthorisationRequest = null;
        //Boolean raw = null;
        //ApiResponseOfAccountAuthorisationResponse response = api.createPaymentPreAuthorisationRequest(paymentPreAuthorisationRequest, raw);
        // TODO: test validations
    }

    /**
     * Create Pre-authorisation
     *
     * Used to initiate the pre-authorisation process for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature to authenticate the user. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_PRE_AUTHORISATION&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPreAuthorisationRequestTest() throws ApiException {
        //PreAuthorisationRequest preAuthorisationRequest = null;
        //Boolean raw = null;
        //ApiResponseOfAccountAuthorisationResponse response = api.createPreAuthorisationRequest(preAuthorisationRequest, raw);
        // TODO: test validations
    }

    /**
     * Create Account Authorisation
     *
     * Used to initiate the authorisation process and direct users to the login screen of their financial institution in order to give consent to access account data.&lt;br&gt;&lt;br&gt;See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_ACCOUNT_REQUEST&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateAccountRequestTest() throws ApiException {
        //AccountAuthorisationRequest accountAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfAccountAuthorisationResponse response = api.initiateAccountRequest(accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Create Embedded Account Authorisation
     *
     * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60; feature in order to obtain the the user&#39;s authorisation to access their account information. &lt;br&gt;&lt;br&gt;See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateEmbeddedAccountRequestTest() throws ApiException {
        //EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfEmbeddedAccountAuthorisationResponse response = api.initiateEmbeddedAccountRequest(embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Re-authorise Account Consent
     *
     * Used to prompt the account holder for continued access to their financial data. This endpoint should be used when a &#x60;Consent&#x60; that was previously &#x60;AUTHORIZED&#x60; can no longer be used to retrieve data.&lt;br&gt;&lt;br&gt;See [Re-Authorisation](https://docs.yapily.com/pages/key-concepts/account-data/account-consents/#re-authorisation) for more information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reAuthoriseAccountTest() throws ApiException {
        //String consent = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfAccountAuthorisationResponse response = api.reAuthoriseAccount(consent, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Update Embedded Account Authorisation
     *
     * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to access the user&#39;s financial data. &lt;br&gt;&lt;br&gt;See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmbeddedAccountRequestTest() throws ApiException {
        //String consentId = null;
        //EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfEmbeddedAccountAuthorisationResponse response = api.updateEmbeddedAccountRequest(consentId, embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Update Embedded Bulk Payment Authorisation
     *
     * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to initiate a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt;See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmbeddedBulkPaymentAuthorisationTest() throws ApiException {
        //String consentId = null;
        //BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.updateEmbeddedBulkPaymentAuthorisation(consentId, bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Update Embedded Payment Authorisation
     *
     * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to initiate a payment. &lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/embedded/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmbeddedPaymentAuthorisationTest() throws ApiException {
        //String consentId = null;
        //PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.updateEmbeddedPaymentAuthorisation(consentId, paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Update Payment Pre-authorisation
     *
     * Used to continue the authorisation process and for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature and direct user to the login screen of their financial institution in order to give consent to initiate a payment. &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_PRE_AUTHORISATION&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentAuthorisationTest() throws ApiException {
        //String consent = null;
        //PaymentAuthorisationRequest paymentAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentAuthorisationRequestResponse response = api.updatePaymentAuthorisation(consent, paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Update Account Pre-authorisation
     *
     * Used to continue the authorisation process and for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature and direct user to the login screen of their financial institution in order to give consent to access account data. &lt;br&gt;&lt;br&gt;See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow. &lt;br&gt;&lt;br&gt;Features: &lt;ul&gt;&lt;li&gt;&#x60;INITIATE_ACCOUNT_REQUEST&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_PRE_AUTHORISATION&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePreAuthoriseAccountConsentTest() throws ApiException {
        //String consent = null;
        //AccountAuthorisationRequest accountAuthorisationRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfAccountAuthorisationResponse response = api.updatePreAuthoriseAccountConsent(consent, accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

}