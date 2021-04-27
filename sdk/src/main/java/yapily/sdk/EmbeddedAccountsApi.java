package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.AccountEmbeddedAuthorisationRequest;
import yapily.sdk.ApiResponseOfAuthorisationEmbeddedRequestResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T17:43:34.097Z")
public class EmbeddedAccountsApi {
  private ApiClient apiClient;

  public EmbeddedAccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmbeddedAccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate a new embedded account request for user to authorize
   * 
   * @param accountAuthRequest accountAuthRequest (required)
   * @param psuId PSU ID (optional)
   * @param psuCorporateId PSU ID CORPORATE (optional)
   * @param psuIpAddress PSU IP ADDRESS (optional)
   * @return ApiResponseOfAuthorisationEmbeddedRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationEmbeddedRequestResponse initiateEmbeddedAccountRequestUsingPOST(AccountEmbeddedAuthorisationRequest accountAuthRequest, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = accountAuthRequest;
    
    // verify the required parameter 'accountAuthRequest' is set
    if (accountAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountAuthRequest' when calling initiateEmbeddedAccountRequestUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-account-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<ApiResponseOfAuthorisationEmbeddedRequestResponse> localVarReturnType = new GenericType<ApiResponseOfAuthorisationEmbeddedRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an embedded account request with SCA info
   * 
   * @param consentId consentId (required)
   * @param accountAuthRequest accountAuthRequest (required)
   * @param psuId PSU ID (optional)
   * @param psuCorporateId PSU ID CORPORATE (optional)
   * @param psuIpAddress PSU IP ADDRESS (optional)
   * @return ApiResponseOfAuthorisationEmbeddedRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationEmbeddedRequestResponse updateEmbeddedAccountRequestUsingPUT(String consentId, AccountEmbeddedAuthorisationRequest accountAuthRequest, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = accountAuthRequest;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling updateEmbeddedAccountRequestUsingPUT");
    }
    
    // verify the required parameter 'accountAuthRequest' is set
    if (accountAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountAuthRequest' when calling updateEmbeddedAccountRequestUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-account-auth-requests/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<ApiResponseOfAuthorisationEmbeddedRequestResponse> localVarReturnType = new GenericType<ApiResponseOfAuthorisationEmbeddedRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
