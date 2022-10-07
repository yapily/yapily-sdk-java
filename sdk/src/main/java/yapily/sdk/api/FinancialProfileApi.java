package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfFinancialProfile;
import yapily.sdk.models.ApiResponseOfFinancialProfileAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfFinancialProfileBalancePrediction;
import yapily.sdk.models.ApiResponseOfFinancialProfileConsent;
import yapily.sdk.models.ApiResponseOfFinancialProfileConsentRemoveResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
public class FinancialProfileApi {
  private ApiClient apiClient;

  public FinancialProfileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FinancialProfileApi(ApiClient apiClient) {
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
   * Create Profile Consent
   * Used to add a consent to a &#x60;Financial Profile&#x60; for a &#x60;User&#x60;.  The response is asynchronous, returned with pending status, while retrieval of financial data is commenced.  There is a limit of 10,000 transactions for enrichment.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; obtained from the original authorisation. (required)
   * @return ApiResponseOfFinancialProfileAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A successful response, returning a ApiResponseOfFinancialProfileAuthorisationResponse. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfFinancialProfileAuthorisationResponse createProfileConsent(UUID userUuid, String consent) throws ApiException {
    return createProfileConsentWithHttpInfo(userUuid, consent).getData();
  }

  /**
   * Create Profile Consent
   * Used to add a consent to a &#x60;Financial Profile&#x60; for a &#x60;User&#x60;.  The response is asynchronous, returned with pending status, while retrieval of financial data is commenced.  There is a limit of 10,000 transactions for enrichment.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; obtained from the original authorisation. (required)
   * @return ApiResponse&lt;ApiResponseOfFinancialProfileAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A successful response, returning a ApiResponseOfFinancialProfileAuthorisationResponse. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfFinancialProfileAuthorisationResponse> createProfileConsentWithHttpInfo(UUID userUuid, String consent) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling createProfileConsent");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createProfileConsent");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/profile/consents"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfFinancialProfileAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfFinancialProfileAuthorisationResponse>() {};

    return apiClient.invokeAPI("FinancialProfileApi.createProfileConsent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Profile Consent
   * Used to delete a &#x60;ProfileConsent&#x60; for a &#x60;User&#x60;. This will remove the consent and all associated financial data from the &#39;Financial Profile&#39;.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param profileConsentId __Mandatory__. The ID of the ProfileConsent (required)
   * @return ApiResponseOfFinancialProfileConsentRemoveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The ProfileConsent was deleted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid or ProfileConsent is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfFinancialProfileConsentRemoveResponse deleteProfileConsent(UUID userUuid, String profileConsentId) throws ApiException {
    return deleteProfileConsentWithHttpInfo(userUuid, profileConsentId).getData();
  }

  /**
   * Delete Profile Consent
   * Used to delete a &#x60;ProfileConsent&#x60; for a &#x60;User&#x60;. This will remove the consent and all associated financial data from the &#39;Financial Profile&#39;.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param profileConsentId __Mandatory__. The ID of the ProfileConsent (required)
   * @return ApiResponse&lt;ApiResponseOfFinancialProfileConsentRemoveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The ProfileConsent was deleted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid or ProfileConsent is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfFinancialProfileConsentRemoveResponse> deleteProfileConsentWithHttpInfo(UUID userUuid, String profileConsentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling deleteProfileConsent");
    }
    
    // verify the required parameter 'profileConsentId' is set
    if (profileConsentId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileConsentId' when calling deleteProfileConsent");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/profile/consents/{profileConsentId}"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()))
      .replaceAll("\\{" + "profileConsentId" + "\\}", apiClient.escapeString(profileConsentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfFinancialProfileConsentRemoveResponse> localVarReturnType = new GenericType<ApiResponseOfFinancialProfileConsentRemoveResponse>() {};

    return apiClient.invokeAPI("FinancialProfileApi.deleteProfileConsent", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Predicted Balances
   * Used to retrieve a &#x60;Balance Prediction Profile&#x60; for a &#x60;User&#x60;.  Status will be &#x60;PENDING&#x60; until all ProfileConsents are &#x60;COMPLETED&#x60;.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @return ApiResponseOfFinancialProfileBalancePrediction
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful response, returning a Balance Prediction Profile. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;, or data not found for the userUuid. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfFinancialProfileBalancePrediction getBalancePrediction(UUID userUuid) throws ApiException {
    return getBalancePredictionWithHttpInfo(userUuid).getData();
  }

  /**
   * Get Predicted Balances
   * Used to retrieve a &#x60;Balance Prediction Profile&#x60; for a &#x60;User&#x60;.  Status will be &#x60;PENDING&#x60; until all ProfileConsents are &#x60;COMPLETED&#x60;.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @return ApiResponse&lt;ApiResponseOfFinancialProfileBalancePrediction&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful response, returning a Balance Prediction Profile. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;, or data not found for the userUuid. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfFinancialProfileBalancePrediction> getBalancePredictionWithHttpInfo(UUID userUuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling getBalancePrediction");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/profile/predicted-balances"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfFinancialProfileBalancePrediction> localVarReturnType = new GenericType<ApiResponseOfFinancialProfileBalancePrediction>() {};

    return apiClient.invokeAPI("FinancialProfileApi.getBalancePrediction", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Profile Consent
   * Used to retreive a specific ProfileConsent for a User.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param profileConsentId __Mandatory__. The ID of the ProfileConsent (required)
   * @return ApiResponseOfFinancialProfileConsent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful response, returning a ApiResponseOfFinancialProfileConsent. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid or ProfileConsent is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfFinancialProfileConsent getProfileConsent(UUID userUuid, String profileConsentId) throws ApiException {
    return getProfileConsentWithHttpInfo(userUuid, profileConsentId).getData();
  }

  /**
   * Get Profile Consent
   * Used to retreive a specific ProfileConsent for a User.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @param profileConsentId __Mandatory__. The ID of the ProfileConsent (required)
   * @return ApiResponse&lt;ApiResponseOfFinancialProfileConsent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful response, returning a ApiResponseOfFinancialProfileConsent. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid or ProfileConsent is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfFinancialProfileConsent> getProfileConsentWithHttpInfo(UUID userUuid, String profileConsentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling getProfileConsent");
    }
    
    // verify the required parameter 'profileConsentId' is set
    if (profileConsentId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileConsentId' when calling getProfileConsent");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/profile/consents/{profileConsentId}"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()))
      .replaceAll("\\{" + "profileConsentId" + "\\}", apiClient.escapeString(profileConsentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfFinancialProfileConsent> localVarReturnType = new GenericType<ApiResponseOfFinancialProfileConsent>() {};

    return apiClient.invokeAPI("FinancialProfileApi.getProfileConsent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get User Profile
   * Used to retrieve a &#x60;FinancialProfile&#x60; for a &#x60;User&#x60;.  Status will be &#x60;PENDING&#x60; until all ProfileConsents are &#x60;COMPLETED&#x60;.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @return ApiResponseOfFinancialProfile
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful response, returning a ApiResponseOfFinancialProfile. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfFinancialProfile getUserProfile(UUID userUuid) throws ApiException {
    return getUserProfileWithHttpInfo(userUuid).getData();
  }

  /**
   * Get User Profile
   * Used to retrieve a &#x60;FinancialProfile&#x60; for a &#x60;User&#x60;.  Status will be &#x60;PENDING&#x60; until all ProfileConsents are &#x60;COMPLETED&#x60;.
   * @param userUuid __Mandatory__. The Yapily generated UUID for the user. (required)
   * @return ApiResponse&lt;ApiResponseOfFinancialProfile&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful response, returning a ApiResponseOfFinancialProfile. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request.  Returned if the userUuid is not a valid UUID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Either authentication credentials were not supplied, or they were invalid. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfFinancialProfile> getUserProfileWithHttpInfo(UUID userUuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUuid' when calling getUserProfile");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userUuid}/profile"
      .replaceAll("\\{" + "userUuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfFinancialProfile> localVarReturnType = new GenericType<ApiResponseOfFinancialProfile>() {};

    return apiClient.invokeAPI("FinancialProfileApi.getUserProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
