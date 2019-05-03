package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfConsent;
import yapily.sdk.ApiResponseOfConsentDeleteResponse;
import yapily.sdk.Consent;
import yapily.sdk.ConsentAuthCodeRequest;
import yapily.sdk.CreateConsentAccessToken;
import yapily.sdk.OneTimeTokenRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-03T09:12:54.133Z")
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
   * @param createConsentAccessToken createConsentAccessToken (required)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent addConsentUsingPOST(String userUuid, CreateConsentAccessToken createConsentAccessToken) throws ApiException {
    Object localVarPostBody = createConsentAccessToken;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling addConsentUsingPOST");
    }
    
    // verify the required parameter 'createConsentAccessToken' is set
    if (createConsentAccessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'createConsentAccessToken' when calling addConsentUsingPOST");
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

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<Consent> localVarReturnType = new GenericType<Consent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post auth-code and auth-state
   * 
   * @param consentByAuthCode consentByAuthCode (required)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent createConsentWithCodeUsingPOST(ConsentAuthCodeRequest consentByAuthCode) throws ApiException {
    Object localVarPostBody = consentByAuthCode;
    
    // verify the required parameter 'consentByAuthCode' is set
    if (consentByAuthCode == null) {
      throw new ApiException(400, "Missing the required parameter 'consentByAuthCode' when calling createConsentWithCodeUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/consent-auth-code";

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

    GenericType<Consent> localVarReturnType = new GenericType<Consent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete consent
   * 
   * @param consentId consentId (required)
   * @param forceDelete forceDelete (optional)
   * @return ApiResponseOfConsentDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfConsentDeleteResponse deleteUsingDELETE(String consentId, Boolean forceDelete) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling deleteUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/consents/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forceDelete", forceDelete));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfConsentDeleteResponse> localVarReturnType = new GenericType<ApiResponseOfConsentDeleteResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get consent
   * 
   * @param consentId consentId (required)
   * @return ApiResponseOfConsent
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfConsent getConsentByIdUsingGET(String consentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling getConsentByIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/consents/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

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

    GenericType<ApiResponseOfConsent> localVarReturnType = new GenericType<ApiResponseOfConsent>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Post one time token
   * 
   * @param oneTimeToken oneTimeToken (required)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent getConsentBySingleAccessConsentUsingPOST(OneTimeTokenRequest oneTimeToken) throws ApiException {
    Object localVarPostBody = oneTimeToken;
    
    // verify the required parameter 'oneTimeToken' is set
    if (oneTimeToken == null) {
      throw new ApiException(400, "Missing the required parameter 'oneTimeToken' when calling getConsentBySingleAccessConsentUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/consent-one-time-token";

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

    GenericType<Consent> localVarReturnType = new GenericType<Consent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<List<Consent>> localVarReturnType = new GenericType<List<Consent>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
