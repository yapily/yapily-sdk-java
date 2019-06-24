package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfListOfATMOpenDataResponse;
import yapily.sdk.ApiResponseOfListOfPersonalCurrentAccountData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-24T17:26:26.439Z")
public class InstitutionsOpenDataApi {
  private ApiClient apiClient;

  public InstitutionsOpenDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InstitutionsOpenDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieves data about all ATMs of the selected institution
   * 
   * @param institutionId institutionId (required)
   * @return ApiResponseOfListOfATMOpenDataResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfListOfATMOpenDataResponse getATMDataUsingGET(String institutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'institutionId' is set
    if (institutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'institutionId' when calling getATMDataUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/institutions/{institutionId}/atms"
      .replaceAll("\\{" + "institutionId" + "\\}", apiClient.escapeString(institutionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfListOfATMOpenDataResponse> localVarReturnType = new GenericType<ApiResponseOfListOfATMOpenDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves details of personal current accounts for an institution
   * 
   * @param institutionId institutionId (required)
   * @return ApiResponseOfListOfPersonalCurrentAccountData
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfListOfPersonalCurrentAccountData getPersonalCurrentAccountsUsingGET(String institutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'institutionId' is set
    if (institutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'institutionId' when calling getPersonalCurrentAccountsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/institutions/{institutionId}/personal-current-accounts"
      .replaceAll("\\{" + "institutionId" + "\\}", apiClient.escapeString(institutionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfListOfPersonalCurrentAccountData> localVarReturnType = new GenericType<ApiResponseOfListOfPersonalCurrentAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
