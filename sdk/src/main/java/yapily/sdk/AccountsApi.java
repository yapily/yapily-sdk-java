package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiResponseOfAccount;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-04T15:51:42.300Z")
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
   * Get account
   * 
   * @param consent Consent Token (required)
   * @param accountId accountId (required)
   * @return ApiResponseOfAccount
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAccount getAccountUsingGET(String consent, String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getAccountUsingGET");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountUsingGET");
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
   * @param consent Consent Token (required)
   * @return ApiListResponseOfAccount
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfAccount getAccountsUsingGET(String consent) throws ApiException {
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

    GenericType<ApiListResponseOfAccount> localVarReturnType = new GenericType<ApiListResponseOfAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Initiate a new account request for user to authorize
   * 
   * @param accountAuthRequest accountAuthRequest (required)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse initiateAccountRequestUsingPOST(AccountAuthorisationRequest accountAuthRequest) throws ApiException {
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
}
