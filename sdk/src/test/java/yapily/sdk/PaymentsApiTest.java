/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.249
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentResponse;
import yapily.sdk.ApiResponseOfPaymentResponses;
import yapily.sdk.BulkPaymentAuthorisationRequest;
import yapily.sdk.BulkPaymentRequest;
import yapily.sdk.PaymentAuthorisationRequest;
import yapily.sdk.PaymentRequest;
import yapily.sdk.SortCodePaymentAuthRequest;
import yapily.sdk.SortCodePaymentRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Ignore
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    
    /**
     * Initiate bulk payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBulkPaymentAuthorisationUsingPOSTTest() throws ApiException {
        BulkPaymentAuthorisationRequest paymentAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentAuthorisationRequestResponse response = api.createBulkPaymentAuthorisationUsingPOST(paymentAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Create bulk payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBulkPaymentUsingPOSTTest() throws ApiException {
        String consent = null;
        BulkPaymentRequest paymentRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentResponse response = api.createBulkPaymentUsingPOST(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Initiate a payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentAuthorisationUsingPOSTTest() throws ApiException {
        PaymentAuthorisationRequest paymentAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentAuthorisationRequestResponse response = api.createPaymentAuthorisationUsingPOST(paymentAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Initiate a new single payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentAuthorisationWithSortCodeUsingPOSTTest() throws ApiException {
        SortCodePaymentAuthRequest paymentAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.createPaymentAuthorisationWithSortCodeUsingPOST(paymentAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Create a payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentUsingPOSTTest() throws ApiException {
        String consent = null;
        PaymentRequest paymentRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentResponse response = api.createPaymentUsingPOST(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Create a new single payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentWithSortCodeUsingPOSTTest() throws ApiException {
        String consent = null;
        SortCodePaymentRequest paymentRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentResponse response = api.createPaymentWithSortCodeUsingPOST(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Get status of a payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentStatusUsingGETTest() throws ApiException {
        String paymentId = null;
        String consent = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentResponse response = api.getPaymentStatusUsingGET(paymentId, consent, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Get payments detail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentsUsingGETTest() throws ApiException {
        String paymentId = null;
        String consent = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentResponses response = api.getPaymentsUsingGET(paymentId, consent, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Update pre authorize consent for user to authorise payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentAuthorisationUsingPUTTest() throws ApiException {
        String consent = null;
        PaymentAuthorisationRequest paymentAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentAuthorisationRequestResponse response = api.updatePaymentAuthorisationUsingPUT(consent, paymentAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
}
