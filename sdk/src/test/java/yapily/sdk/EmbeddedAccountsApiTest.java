/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.347
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.AccountEmbeddedAuthorisationRequest;
import yapily.sdk.ApiResponseOfAuthorisationEmbeddedRequestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmbeddedAccountsApi
 */
@Ignore
public class EmbeddedAccountsApiTest {

    private final EmbeddedAccountsApi api = new EmbeddedAccountsApi();

    
    /**
     * Initiate a new embedded account request for user to authorize
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateEmbeddedAccountRequestUsingPOSTTest() throws ApiException {
        AccountEmbeddedAuthorisationRequest accountAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationEmbeddedRequestResponse response = api.initiateEmbeddedAccountRequestUsingPOST(accountAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Update an embedded account request with SCA info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmbeddedAccountRequestUsingPUTTest() throws ApiException {
        String consentId = null;
        AccountEmbeddedAuthorisationRequest accountAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationEmbeddedRequestResponse response = api.updateEmbeddedAccountRequestUsingPUT(consentId, accountAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
}
