package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.Consent;
import yapily.sdk.CreateConsentApiKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-12T17:29:25.799Z")
public class ConsentsApi {
  private ApiClient apiClient;

  public ConsentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConsentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Post consent
   * 
   * @param userUuid userUuid (required)
   * @param createConsentApiKey createConsentApiKey (required)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent addConsentUsingPOST(String userUuid, CreateConsentApiKey createConsentApiKey) throws ApiException {
    Object localVarPostBody = createConsentApiKey;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling addConsentUsingPOST");
    }
    
    // verify the required parameter 'createConsentApiKey' is set
    if (createConsentApiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'createConsentApiKey' when calling addConsentUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/consents"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Consent> localVarReturnType = new GenericType<Consent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete consent
   * 
   * @param userUuid userUuid (required)
   * @param consentToken consentToken (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteUsingDELETE(String userUuid, String consentToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling deleteUsingDELETE");
    }
    
    // verify the required parameter 'consentToken' is set
    if (consentToken == null) {
      throw new ApiException(400, "Missing the required parameter 'consentToken' when calling deleteUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/consents/{consentToken}"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()))
      .replaceAll("\\{" + "consentToken" + "\\}", apiClient.escapeString(consentToken.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user consents
   * 
   * @param userUuid userUuid (required)
   * @param institutionId institutionId (optional)
   * @return List&lt;Consent&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Consent> getUserConsentsUsingGET(String userUuid, String institutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling getUserConsentsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/consents"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "institutionId", institutionId));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<Consent>> localVarReturnType = new GenericType<List<Consent>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
