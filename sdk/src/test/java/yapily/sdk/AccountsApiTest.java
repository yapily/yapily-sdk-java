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
import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiListResponseOfPaymentResponse;
import yapily.sdk.ApiResponseOfAccount;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfListOfBeneficiary;
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
     * Get account direct debits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountDirectDebitsUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        String xYapilyApiVersion = null;
        Integer limit = null;
        ApiListResponseOfPaymentResponse response = api.getAccountDirectDebitsUsingGET(accountId, consent, xYapilyApiVersion, limit);

        // TODO: test validations
    }
    
    /**
     * Get account payments detail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountPeriodicPaymentsUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        String xYapilyApiVersion = null;
        Integer limit = null;
        ApiListResponseOfPaymentResponse response = api.getAccountPeriodicPaymentsUsingGET(accountId, consent, xYapilyApiVersion, limit);

        // TODO: test validations
    }
    
    /**
     * Get account scheduled payments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountScheduledPaymentsUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        String xYapilyApiVersion = null;
        Integer limit = null;
        ApiListResponseOfPaymentResponse response = api.getAccountScheduledPaymentsUsingGET(accountId, consent, xYapilyApiVersion, limit);

        // TODO: test validations
    }
    
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
        String accountId = null;
        String consent = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAccount response = api.getAccountUsingGET(accountId, consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

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
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiListResponseOfAccount response = api.getAccountsUsingGET(consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Get Beneficiaries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBeneficiariesUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        String xYapilyApiVersion = null;
        ApiResponseOfListOfBeneficiary response = api.getBeneficiariesUsingGET(accountId, consent, xYapilyApiVersion);

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
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.initiateAccountRequestUsingPOST(accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Re-authorise account request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reAuthoriseAccountUsingPATCHTest() throws ApiException {
        String consent = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.reAuthoriseAccountUsingPATCH(consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Update pre authorize consent for user to authorise account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePreAuthoriseAccountConsentUsingPUTTest() throws ApiException {
        String consent = null;
        AccountAuthorisationRequest accountAuthRequest = null;
        String xYapilyApiVersion = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.updatePreAuthoriseAccountConsentUsingPUT(consent, accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
}
