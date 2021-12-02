package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiListResponseOfConsent;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfConsent;
import yapily.sdk.ApiResponseOfConsentDeleteResponse;
import yapily.sdk.Consent;
import yapily.sdk.ConsentAuthCodeRequest;
import yapily.sdk.CreateConsentAccessToken;
import yapily.sdk.OneTimeTokenRequest;
import yapily.sdk.PreAuthorisationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-01T13:54:24.254Z")
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
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param createConsentAccessToken createConsentAccessToken (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent addConsentUsingPOST(String userUuid, CreateConsentAccessToken createConsentAccessToken, String xYapilyApiVersion) throws ApiException {
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


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent createConsentWithCodeUsingPOST(ConsentAuthCodeRequest consentByAuthCode, String xYapilyApiVersion) throws ApiException {
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


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
   * Initiate request for user to pre authorise
   * 
   * @param preAuthorisationRequest preAuthorisationRequest (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse createPreAuthorisationRequestUsingPOST(PreAuthorisationRequest preAuthorisationRequest, String xYapilyApiVersion) throws ApiException {
    Object localVarPostBody = preAuthorisationRequest;
    
    // verify the required parameter 'preAuthorisationRequest' is set
    if (preAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'preAuthorisationRequest' when calling createPreAuthorisationRequestUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/pre-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
   * Delete consent
   * 
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param forceDelete __Optional__. Whether to force the deletion. (optional, default to true)
   * @return ApiResponseOfConsentDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfConsentDeleteResponse deleteUsingDELETE(String consentId, String xYapilyApiVersion, Boolean forceDelete) throws ApiException {
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

    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return ApiResponseOfConsent
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfConsent getConsentByIdUsingGET(String consentId, String xYapilyApiVersion) throws ApiException {
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


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @return Consent
   * @throws ApiException if fails to make API call
   */
  public Consent getConsentBySingleAccessConsentUsingPOST(OneTimeTokenRequest oneTimeToken, String xYapilyApiVersion) throws ApiException {
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


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
   * Get consents sorted by creation date
   * 
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param filterApplicationUserId __Optional__. Filter records based on the list of &#x60;applicationUserId&#x60; users provided. (optional)
   * @param filterUserUuid __Optional__. Filter records based on the list of &#x60;userUuid&#x60; users provided. (optional)
   * @param filterInstitution __Optional__. Filter records based on the list of &#x60;Institution&#x60; provided. (optional)
   * @param filterStatus __Optional__. Filter records based on the list of &#x60;Consent&#x60; [statuses](https://docs.yapily.com/api/#tocS_AuthorisationStatus). (optional)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit Use this parameter to limit consent results, max limit is 20 (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional, default to 0)
   * @return ApiListResponseOfConsent
   * @throws ApiException if fails to make API call
   */
  public ApiListResponseOfConsent getConsentsUsingGET(String xYapilyApiVersion, List<String> filterApplicationUserId, List<String> filterUserUuid, List<String> filterInstitution, List<String> filterStatus, String from, String before, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/consents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[applicationUserId]", filterApplicationUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[userUuid]", filterUserUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[institution]", filterInstitution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiListResponseOfConsent> localVarReturnType = new GenericType<ApiListResponseOfConsent>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get latest user consents
   * 
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param institutionId Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated &#x60;institutionId&#x60; query param. (optional)
   * @param limit Use this parameter to limit consent results, max limit is 20 (optional)
   * @return List&lt;Consent&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<Consent> getUserConsentsUsingGET(String userUuid, String xYapilyApiVersion, String institutionId, Integer limit) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));

    
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
