package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiListResponseOfPaymentResponse;
import yapily.sdk.ApiResponseOfAccount;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfListOfBeneficiary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-08T12:32:55.720Z")
public class AccountsApi {
  private ApiClient apiClient;

  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get account direct debits
   * 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @return ApiListResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfPaymentResponse getAccountDirectDebitsUsingGET(String accountId, String consent, String xYapilyApiVersion, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountDirectDebitsUsingGET");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountDirectDebitsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/direct-debits"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiListResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account payments detail
   * 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @return ApiListResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfPaymentResponse getAccountPeriodicPaymentsUsingGET(String accountId, String consent, String xYapilyApiVersion, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountPeriodicPaymentsUsingGET");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountPeriodicPaymentsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/periodic-payments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiListResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account scheduled payments
   * 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @return ApiListResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfPaymentResponse getAccountScheduledPaymentsUsingGET(String accountId, String consent, String xYapilyApiVersion, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountScheduledPaymentsUsingGET");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountScheduledPaymentsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/scheduled-payments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiListResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account
   * 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfAccount
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAccount getAccountUsingGET(String accountId, String consent, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountUsingGET");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfAccount> localVarReturnType = new GenericType<ApiResponseOfAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get accounts
   * 
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiListResponseOfAccount
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfAccount getAccountsUsingGET(String consent, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfAccount> localVarReturnType = new GenericType<ApiListResponseOfAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Beneficiaries
   * 
   * @param accountId __Mandatory__. The account Id of the user&#39;s bank account. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return ApiResponseOfListOfBeneficiary
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfListOfBeneficiary getBeneficiariesUsingGET(String accountId, String consent, String xYapilyApiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBeneficiariesUsingGET");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getBeneficiariesUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{accountId}/beneficiaries"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfListOfBeneficiary> localVarReturnType = new GenericType<ApiResponseOfListOfBeneficiary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Initiate a new account request for user to authorize
   * 
   * @param accountAuthRequest accountAuthRequest (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse initiateAccountRequestUsingPOST(AccountAuthorisationRequest accountAuthRequest, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = accountAuthRequest;
    
    // verify the required parameter 'accountAuthRequest' is set
    if (accountAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountAuthRequest' when calling initiateAccountRequestUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/account-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Re-authorise account request
   * 
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse reAuthoriseAccountUsingPATCH(String consent, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling reAuthoriseAccountUsingPATCH");
    }
    
    // create path and map variables
    String localVarPath = "/account-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update pre authorize consent for user to authorise account
   * 
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountAuthRequest accountAuthRequest (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse updatePreAuthoriseAccountConsentUsingPUT(String consent, AccountAuthorisationRequest accountAuthRequest, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = accountAuthRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling updatePreAuthoriseAccountConsentUsingPUT");
    }
    
    // verify the required parameter 'accountAuthRequest' is set
    if (accountAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountAuthRequest' when calling updatePreAuthoriseAccountConsentUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/account-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
