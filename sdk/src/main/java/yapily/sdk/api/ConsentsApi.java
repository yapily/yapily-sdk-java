package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiListResponseOfConsent;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfConsent;
import yapily.sdk.models.ApiResponseOfConsentDeleteResponse;
import yapily.sdk.models.Consent;
import yapily.sdk.models.ConsentAuthCodeRequest;
import yapily.sdk.models.OneTimeTokenRequest;
import java.util.Set;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
public class ConsentsApi {
  private ApiClient apiClient;

  public ConsentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConsentsApi(ApiClient apiClient) {
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
   * Exchange OAuth2 Code
   * Used to obtain a Yapily Consent object containing the &#x60;consentToken&#x60; once the user has authenticated and you have an OAuth2 authorisation code &#x60;auth-code&#x60; and state &#x60;auth-state&#x60;.
   * @param consentAuthCodeRequest  (required)
   * @return Consent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public Consent createConsentWithCode(ConsentAuthCodeRequest consentAuthCodeRequest) throws ApiException {
    return createConsentWithCodeWithHttpInfo(consentAuthCodeRequest).getData();
  }

  /**
   * Exchange OAuth2 Code
   * Used to obtain a Yapily Consent object containing the &#x60;consentToken&#x60; once the user has authenticated and you have an OAuth2 authorisation code &#x60;auth-code&#x60; and state &#x60;auth-state&#x60;.
   * @param consentAuthCodeRequest  (required)
   * @return ApiResponse&lt;Consent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Consent> createConsentWithCodeWithHttpInfo(ConsentAuthCodeRequest consentAuthCodeRequest) throws ApiException {
    Object localVarPostBody = consentAuthCodeRequest;
    
    // verify the required parameter 'consentAuthCodeRequest' is set
    if (consentAuthCodeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'consentAuthCodeRequest' when calling createConsentWithCode");
    }
    
    // create path and map variables
    String localVarPath = "/consent-auth-code";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Consent> localVarReturnType = new GenericType<Consent>() {};

    return apiClient.invokeAPI("ConsentsApi.createConsentWithCode", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Consent
   * Delete a consent using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param forceDelete __Optional__. Whether to force the deletion. (optional, default to true)
   * @return ApiResponseOfConsentDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfConsentDeleteResponse delete(UUID consentId, Boolean forceDelete) throws ApiException {
    return deleteWithHttpInfo(consentId, forceDelete).getData();
  }

  /**
   * Delete Consent
   * Delete a consent using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param forceDelete __Optional__. Whether to force the deletion. (optional, default to true)
   * @return ApiResponse&lt;ApiResponseOfConsentDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfConsentDeleteResponse> deleteWithHttpInfo(UUID consentId, Boolean forceDelete) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/consents/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forceDelete", forceDelete));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfConsentDeleteResponse> localVarReturnType = new GenericType<ApiResponseOfConsentDeleteResponse>() {};

    return apiClient.invokeAPI("ConsentsApi.delete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Consent
   * Get consent using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @return ApiResponseOfConsent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfConsent getConsentById(UUID consentId) throws ApiException {
    return getConsentByIdWithHttpInfo(consentId).getData();
  }

  /**
   * Get Consent
   * Get consent using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @return ApiResponse&lt;ApiResponseOfConsent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfConsent> getConsentByIdWithHttpInfo(UUID consentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling getConsentById");
    }
    
    // create path and map variables
    String localVarPath = "/consents/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

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

    GenericType<ApiResponseOfConsent> localVarReturnType = new GenericType<ApiResponseOfConsent>() {};

    return apiClient.invokeAPI("ConsentsApi.getConsentById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Exchange One Time Token
   * Exchange a One-time-token for the consent token
   * @param oneTimeTokenRequest  (required)
   * @return Consent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public Consent getConsentBySingleAccessConsent(OneTimeTokenRequest oneTimeTokenRequest) throws ApiException {
    return getConsentBySingleAccessConsentWithHttpInfo(oneTimeTokenRequest).getData();
  }

  /**
   * Exchange One Time Token
   * Exchange a One-time-token for the consent token
   * @param oneTimeTokenRequest  (required)
   * @return ApiResponse&lt;Consent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Consent> getConsentBySingleAccessConsentWithHttpInfo(OneTimeTokenRequest oneTimeTokenRequest) throws ApiException {
    Object localVarPostBody = oneTimeTokenRequest;
    
    // verify the required parameter 'oneTimeTokenRequest' is set
    if (oneTimeTokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'oneTimeTokenRequest' when calling getConsentBySingleAccessConsent");
    }
    
    // create path and map variables
    String localVarPath = "/consent-one-time-token";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Consent> localVarReturnType = new GenericType<Consent>() {};

    return apiClient.invokeAPI("ConsentsApi.getConsentBySingleAccessConsent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Consents
   * Used to retrieve all the consents created for each user within an application
   * @param filterApplicationUserId __Optional__. Filter records based on the list of &#x60;applicationUserId&#x60; users provided. (optional)
   * @param filterUserUuid __Optional__. Filter records based on the list of &#x60;userUuid&#x60; users provided. (optional)
   * @param filterInstitution __Optional__. Filter records based on the list of &#x60;Institution&#x60; provided. (optional)
   * @param filterStatus __Optional__. Filter records based on the list of &#x60;Consent&#x60; [statuses](https://docs.yapily.com/api/reference/#operation/getConsents!c&#x3D;200&amp;path&#x3D;data/status&amp;t&#x3D;response). (optional)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional, default to 0)
   * @return ApiListResponseOfConsent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfConsent getConsents(Set<String> filterApplicationUserId, Set<UUID> filterUserUuid, Set<String> filterInstitution, Set<String> filterStatus, String from, String before, Integer limit, Integer offset) throws ApiException {
    return getConsentsWithHttpInfo(filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset).getData();
  }

  /**
   * Get Consents
   * Used to retrieve all the consents created for each user within an application
   * @param filterApplicationUserId __Optional__. Filter records based on the list of &#x60;applicationUserId&#x60; users provided. (optional)
   * @param filterUserUuid __Optional__. Filter records based on the list of &#x60;userUuid&#x60; users provided. (optional)
   * @param filterInstitution __Optional__. Filter records based on the list of &#x60;Institution&#x60; provided. (optional)
   * @param filterStatus __Optional__. Filter records based on the list of &#x60;Consent&#x60; [statuses](https://docs.yapily.com/api/reference/#operation/getConsents!c&#x3D;200&amp;path&#x3D;data/status&amp;t&#x3D;response). (optional)
   * @param from __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  (optional)
   * @param before __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). (optional)
   * @param limit __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. (optional)
   * @param offset __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. (optional, default to 0)
   * @return ApiResponse&lt;ApiListResponseOfConsent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfConsent> getConsentsWithHttpInfo(Set<String> filterApplicationUserId, Set<UUID> filterUserUuid, Set<String> filterInstitution, Set<String> filterStatus, String from, String before, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/consents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[applicationUserId]", filterApplicationUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[userUuid]", filterUserUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[institution]", filterInstitution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfConsent> localVarReturnType = new GenericType<ApiListResponseOfConsent>() {};

    return apiClient.invokeAPI("ConsentsApi.getConsents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
