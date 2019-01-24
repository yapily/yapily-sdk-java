/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.68
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiResponseOfAccount;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * Get account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountUsingGETTest() throws ApiException {
        String consent = null;
        String accountId = null;
        ApiResponseOfAccount response = api.getAccountUsingGET(consent, accountId);

        // TODO: test validations
    }
    
    /**
     * Get accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsUsingGETTest() throws ApiException {
        String consent = null;
        ApiListResponseOfAccount response = api.getAccountsUsingGET(consent);

        // TODO: test validations
    }
    
    /**
     * Initiate a new account request for user to authorize
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateAccountRequestUsingPOSTTest() throws ApiException {
        AccountAuthorisationRequest accountAuthRequest = null;
        ApiResponseOfAuthorisationRequestResponse response = api.initiateAccountRequestUsingPOST(accountAuthRequest);

        // TODO: test validations
    }
    
}
