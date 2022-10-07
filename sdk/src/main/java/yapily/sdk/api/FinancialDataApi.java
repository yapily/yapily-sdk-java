package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.AccountApiListResponse;
import yapily.sdk.models.ApiListResponseOfAccountStatement;
import yapily.sdk.models.ApiListResponseOfBeneficiary;
import yapily.sdk.models.ApiListResponseOfCategory;
import yapily.sdk.models.ApiListResponseOfDirectDebitResponse;
import yapily.sdk.models.ApiListResponseOfPaymentResponse;
import yapily.sdk.models.ApiListResponseOfTransaction;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfAccount;
import yapily.sdk.models.ApiResponseOfAccountStatement;
import yapily.sdk.models.ApiResponseOfBalances;
import yapily.sdk.models.ApiResponseOfIdentity;
import java.io.File;
import yapily.sdk.models.SortEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
public class FinancialDataApi {
  private ApiClient apiClient;

  public FinancialDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FinancialDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Account
   * Used to return the account and balance information for the end user associated with the presented consent token.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNTS&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccount getAccount(String accountId, String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return getAccountWithHttpInfo(accountId, consent, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Get Account
   * Used to return the account and balance information for the end user associated with the presented consent token.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNTS&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccount> getAccountWithHttpInfo(String accountId, String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccount");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccount");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfAccount> localVarReturnType = new GenericType<ApiResponseOfAccount>() {};

    return apiClient.invokeAPI("FinancialDataApi.getAccount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Balances
   * Used to return the balance for the end user associated with the presented consent token.&lt;br&gt;&lt;br&gt; __Note__: This endpoint is only for obtaining the balance information of an account belonging to an &#x60;Institution&#x60; that exposes their APIs through the [CBI Globe Gateway](https://docs.yapily.com/pages/knowledge/open-banking/cbi_globe//). If the &#x60;Institution&#x60; you wish to obtain balance data is not in the CBI Globe, use [Get Account](https://docs.yapily.com/api/reference/#operation/getAccount) or [Get Accounts](https://docs.yapily.com/api/reference/#operation/getAccounts) to get balance data. &lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_BALANCES&#x60; 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfBalances
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfBalances getAccountBalances(String accountId, String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return getAccountBalancesWithHttpInfo(accountId, consent, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Get Account Balances
   * Used to return the balance for the end user associated with the presented consent token.&lt;br&gt;&lt;br&gt; __Note__: This endpoint is only for obtaining the balance information of an account belonging to an &#x60;Institution&#x60; that exposes their APIs through the [CBI Globe Gateway](https://docs.yapily.com/pages/knowledge/open-banking/cbi_globe//). If the &#x60;Institution&#x60; you wish to obtain balance data is not in the CBI Globe, use [Get Account](https://docs.yapily.com/api/reference/#operation/getAccount) or [Get Accounts](https://docs.yapily.com/api/reference/#operation/getAccounts) to get balance data. &lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_BALANCES&#x60; 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfBalances&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfBalances> getAccountBalancesWithHttpInfo(String accountId, String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountBalances");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountBalances");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/balances"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfBalances> localVarReturnType = new GenericType<ApiResponseOfBalances>() {};

    return apiClient.invokeAPI("FinancialDataApi.getAccountBalances", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Direct Debits
   * Used to get the list of direct debits for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_DIRECT_DEBIT&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiListResponseOfDirectDebitResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfDirectDebitResponse getAccountDirectDebits(String accountId, String consent, Integer limit, Boolean raw) throws ApiException {
    return getAccountDirectDebitsWithHttpInfo(accountId, consent, limit, raw).getData();
  }

  /**
   * Get Account Direct Debits
   * Used to get the list of direct debits for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_DIRECT_DEBIT&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiListResponseOfDirectDebitResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfDirectDebitResponse> getAccountDirectDebitsWithHttpInfo(String accountId, String consent, Integer limit, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountDirectDebits");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountDirectDebits");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/direct-debits"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfDirectDebitResponse> localVarReturnType = new GenericType<ApiListResponseOfDirectDebitResponse>() {};

    return apiClient.invokeAPI("FinancialDataApi.getAccountDirectDebits", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Periodic Payments
   * Used to get the list of periodic payments (standing orders in the UK) for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_PERIODIC_PAYMENTS&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiListResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfPaymentResponse getAccountPeriodicPayments(String accountId, String consent, Integer limit, Boolean raw) throws ApiException {
    return getAccountPeriodicPaymentsWithHttpInfo(accountId, consent, limit, raw).getData();
  }

  /**
   * Get Account Periodic Payments
   * Used to get the list of periodic payments (standing orders in the UK) for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_PERIODIC_PAYMENTS&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiListResponseOfPaymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfPaymentResponse> getAccountPeriodicPaymentsWithHttpInfo(String accountId, String consent, Integer limit, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountPeriodicPayments");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountPeriodicPayments");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/periodic-payments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiListResponseOfPaymentResponse>() {};

    return apiClient.invokeAPI("FinancialDataApi.getAccountPeriodicPayments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Scheduled Payments
   * Used to get the list of scheduled payments for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_SCHEDULED_PAYMENT&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiListResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfPaymentResponse getAccountScheduledPayments(String accountId, String consent, Integer limit, Boolean raw) throws ApiException {
    return getAccountScheduledPaymentsWithHttpInfo(accountId, consent, limit, raw).getData();
  }

  /**
   * Get Account Scheduled Payments
   * Used to get the list of scheduled payments for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_SCHEDULED_PAYMENT&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiListResponseOfPaymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfPaymentResponse> getAccountScheduledPaymentsWithHttpInfo(String accountId, String consent, Integer limit, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountScheduledPayments");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountScheduledPayments");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/scheduled-payments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiListResponseOfPaymentResponse>() {};

    return apiClient.invokeAPI("FinancialDataApi.getAccountScheduledPayments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Accounts
   * Used to return all accounts and balances for the end user associated with the presented consent token.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNTS&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return AccountApiListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public AccountApiListResponse getAccounts(String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return getAccountsWithHttpInfo(consent, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Get Accounts
   * Used to return all accounts and balances for the end user associated with the presented consent token.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNTS&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;AccountApiListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccountApiListResponse> getAccountsWithHttpInfo(String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AccountApiListResponse> localVarReturnType = new GenericType<AccountApiListResponse>() {};

    return apiClient.invokeAPI("FinancialDataApi.getAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Beneficiaries
   * Used to get all the beneficiaries of a user&#39;s account&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_BENEFICIARIES&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiListResponseOfBeneficiary
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfBeneficiary getBeneficiaries(String accountId, String consent, Boolean raw) throws ApiException {
    return getBeneficiariesWithHttpInfo(accountId, consent, raw).getData();
  }

  /**
   * Get Account Beneficiaries
   * Used to get all the beneficiaries of a user&#39;s account&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_BENEFICIARIES&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiListResponseOfBeneficiary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfBeneficiary> getBeneficiariesWithHttpInfo(String accountId, String consent, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBeneficiaries");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getBeneficiaries");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/beneficiaries"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfBeneficiary> localVarReturnType = new GenericType<ApiListResponseOfBeneficiary>() {};

    return apiClient.invokeAPI("FinancialDataApi.getBeneficiaries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Categories
   * Used to retrieve the list of categories returned by the Yapily Categorisation engine for a given locale. &lt;br&gt;&lt;br&gt;See [Data Enrichment](https://docs.yapily.com/pages/key-concepts/account-data/data-enrichment/intro-to-data-enrichment/) for more information.
   * @param country __Mandatory__. The 2 letter country code e.g. &#39;GB&#39;. (required)
   * @return ApiListResponseOfCategory
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfCategory getCategories(String country) throws ApiException {
    return getCategoriesWithHttpInfo(country).getData();
  }

  /**
   * Get Categories
   * Used to retrieve the list of categories returned by the Yapily Categorisation engine for a given locale. &lt;br&gt;&lt;br&gt;See [Data Enrichment](https://docs.yapily.com/pages/key-concepts/account-data/data-enrichment/intro-to-data-enrichment/) for more information.
   * @param country __Mandatory__. The 2 letter country code e.g. &#39;GB&#39;. (required)
   * @return ApiResponse&lt;ApiListResponseOfCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfCategory> getCategoriesWithHttpInfo(String country) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'country' is set
    if (country == null) {
      throw new ApiException(400, "Missing the required parameter 'country' when calling getCategories");
    }
    
    // create path and map variables
    String localVarPath = "/categories/{country}"
      .replaceAll("\\{" + "country" + "\\}", apiClient.escapeString(country.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfCategory> localVarReturnType = new GenericType<ApiListResponseOfCategory>() {};

    return apiClient.invokeAPI("FinancialDataApi.getCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Identity
   * Used to get the identity information for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;IDENTITY&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfIdentity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfIdentity getIdentity(String consent, Boolean raw) throws ApiException {
    return getIdentityWithHttpInfo(consent, raw).getData();
  }

  /**
   * Get Identity
   * Used to get the identity information for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;IDENTITY&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfIdentity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfIdentity> getIdentityWithHttpInfo(String consent, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/identity";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfIdentity> localVarReturnType = new GenericType<ApiResponseOfIdentity>() {};

    return apiClient.invokeAPI("FinancialDataApi.getIdentity", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Statement
   * Used to get a statement for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_STATEMENT&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param statementId __Mandatory__. The statement Id of the statement file. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccountStatement
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccountStatement getStatement(String consent, String accountId, String statementId, Boolean raw) throws ApiException {
    return getStatementWithHttpInfo(consent, accountId, statementId, raw).getData();
  }

  /**
   * Get Account Statement
   * Used to get a statement for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_STATEMENT&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param statementId __Mandatory__. The statement Id of the statement file. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccountStatement&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccountStatement> getStatementWithHttpInfo(String consent, String accountId, String statementId, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getStatement");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getStatement");
    }
    
    // verify the required parameter 'statementId' is set
    if (statementId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementId' when calling getStatement");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/statements/{statementId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "statementId" + "\\}", apiClient.escapeString(statementId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfAccountStatement> localVarReturnType = new GenericType<ApiResponseOfAccountStatement>() {};

    return apiClient.invokeAPI("FinancialDataApi.getStatement", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Statement File
   * Used to get the statement file for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_STATEMENT_FILE&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param statementId __Mandatory__. The statement Id of the statement file. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public File getStatementFile(String consent, String accountId, String statementId, Boolean raw) throws ApiException {
    return getStatementFileWithHttpInfo(consent, accountId, statementId, raw).getData();
  }

  /**
   * Get Account Statement File
   * Used to get the statement file for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_STATEMENT_FILE&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param statementId __Mandatory__. The statement Id of the statement file. (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> getStatementFileWithHttpInfo(String consent, String accountId, String statementId, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getStatementFile");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getStatementFile");
    }
    
    // verify the required parameter 'statementId' is set
    if (statementId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementId' when calling getStatementFile");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/statements/{statementId}/file"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "statementId" + "\\}", apiClient.escapeString(statementId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/pdf", "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("FinancialDataApi.getStatementFile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Statements
   * Used to get the list of statements for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_STATEMENTS&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param sort __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiListResponseOfAccountStatement
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfAccountStatement getStatements(String consent, String accountId, String from, String before, Integer limit, SortEnum sort, Integer offset, Boolean raw) throws ApiException {
    return getStatementsWithHttpInfo(consent, accountId, from, before, limit, sort, offset, raw).getData();
  }

  /**
   * Get Account Statements
   * Used to get the list of statements for an account.&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_STATEMENTS&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param sort __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiListResponseOfAccountStatement&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfAccountStatement> getStatementsWithHttpInfo(String consent, String accountId, String from, String before, Integer limit, SortEnum sort, Integer offset, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getStatements");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getStatements");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/statements"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfAccountStatement> localVarReturnType = new GenericType<ApiListResponseOfAccountStatement>() {};

    return apiClient.invokeAPI("FinancialDataApi.getStatements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account Transactions
   * Used to get the account transactions for an account&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_TRANSACTIONS&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param with __Optional__. Can be &#x60;categories&#x60; or &#x60;merchant&#x60;. When set, will include enrichment data in the transactions returned. &lt;br&gt;&lt;br&gt;Enrichment data is optional, e.g. when &#39;merchant&#39; enrichment data is requested, the enrichment response will include merchant data only if it can be evaluated from the transaction. (optional)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param sort __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional)
   * @param cursor __Optional__. This property is not currently in use. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiListResponseOfTransaction
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfTransaction getTransactions(String accountId, String consent, String psuId, String psuCorporateId, String psuIpAddress, List<String> with, String from, String before, Integer limit, SortEnum sort, Integer offset, String cursor, Boolean raw) throws ApiException {
    return getTransactionsWithHttpInfo(accountId, consent, psuId, psuCorporateId, psuIpAddress, with, from, before, limit, sort, offset, cursor, raw).getData();
  }

  /**
   * Get Account Transactions
   * Used to get the account transactions for an account&lt;br&gt;&lt;br&gt;Feature: &#x60;ACCOUNT_TRANSACTIONS&#x60;
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param with __Optional__. Can be &#x60;categories&#x60; or &#x60;merchant&#x60;. When set, will include enrichment data in the transactions returned. &lt;br&gt;&lt;br&gt;Enrichment data is optional, e.g. when &#39;merchant&#39; enrichment data is requested, the enrichment response will include merchant data only if it can be evaluated from the transaction. (optional)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param sort __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional)
   * @param cursor __Optional__. This property is not currently in use. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiListResponseOfTransaction&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfTransaction> getTransactionsWithHttpInfo(String accountId, String consent, String psuId, String psuCorporateId, String psuIpAddress, List<String> with, String from, String before, Integer limit, SortEnum sort, Integer offset, String cursor, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTransactions");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/transactions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "with", with));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfTransaction> localVarReturnType = new GenericType<ApiListResponseOfTransaction>() {};

    return apiClient.invokeAPI("FinancialDataApi.getTransactions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
