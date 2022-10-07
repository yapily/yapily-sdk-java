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
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfPaymentResponse;
import yapily.sdk.models.ApiResponseOfPaymentResponses;
import yapily.sdk.models.BulkPaymentRequest;
import yapily.sdk.models.PaymentRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    /**
     * Create Bulk Payment
     *
     * Used to initiate a bulk payment after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Feature: &#x60;CREATE_BULK_PAYMENT&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBulkPaymentTest() throws ApiException {
        //String consent = null;
        //BulkPaymentRequest bulkPaymentRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentResponse response = api.createBulkPayment(consent, bulkPaymentRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Create Payment
     *
     * Used to initiate a payment after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentTest() throws ApiException {
        //String consent = null;
        //PaymentRequest paymentRequest = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentResponse response = api.createPayment(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

    /**
     * Get Payment Details
     *
     * Used to get the payment details of a payment. This is most commonly used to check for any updates to the payment status. &lt;br&gt;&lt;br&gt;Feature: &#x60;EXISTING_PAYMENTS_DETAILS&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentsTest() throws ApiException {
        //String paymentId = null;
        //String consent = null;
        //String psuId = null;
        //String psuCorporateId = null;
        //String psuIpAddress = null;
        //Boolean raw = null;
        //ApiResponseOfPaymentResponses response = api.getPayments(paymentId, consent, psuId, psuCorporateId, psuIpAddress, raw);
        // TODO: test validations
    }

}
