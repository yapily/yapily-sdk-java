/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.157.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse;
import yapily.sdk.BulkPaymentEmbeddedAuthorisationRequest;
import yapily.sdk.PaymentEmbeddedAuthorisationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmbeddedPaymentsApi
 */
@Ignore
public class EmbeddedPaymentsApiTest {

    private final EmbeddedPaymentsApi api = new EmbeddedPaymentsApi();

    
    /**
     * Initiate an embedded bulk payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmbeddedBulkPaymentAuthorisationUsingPOSTTest() throws ApiException {
        BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.createEmbeddedBulkPaymentAuthorisationUsingPOST(bulkPaymentEmbeddedAuthorisationRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Initiate an embedded payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmbeddedPaymentAuthorisationUsingPOSTTest() throws ApiException {
        PaymentEmbeddedAuthorisationRequest paymentAuthRequest = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.createEmbeddedPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Update an embedded bulk payment initiation with SCA info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmbeddedBulkPaymentAuthorisationUsingPUTTest() throws ApiException {
        String consentId = null;
        BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.updateEmbeddedBulkPaymentAuthorisationUsingPUT(consentId, bulkPaymentEmbeddedAuthorisationRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Update an embedded payment initiation with SCA info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmbeddedPaymentAuthorisationUsingPUTTest() throws ApiException {
        String consentId = null;
        PaymentEmbeddedAuthorisationRequest paymentAuthRequest = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse response = api.updateEmbeddedPaymentAuthorisationUsingPUT(consentId, paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
}
