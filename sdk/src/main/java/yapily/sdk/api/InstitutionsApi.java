package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiListResponseOfFeatureDetails;
import yapily.sdk.models.ApiListResponseOfInstitution;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.Institution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:55:38.294Z[Etc/UTC]")
public class InstitutionsApi {
  private ApiClient apiClient;

  public InstitutionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InstitutionsApi(ApiClient apiClient) {
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
   * Get Features
   * Used to retrieve all features available from Yapily. Each &#x60;Institution&#x60; supports a one, many or all of these features and can be seen in the features field of the &#x60;Institution&#x60; object.&lt;br&gt;&lt;br&gt;Note: Every &#x60;Institution&#x60; does not necessarily support every feature. To see which features are available for a particular Institution, use either the [Get Institutions](https://docs.yapily.com/api/reference/#operation/getInstitutions) or [Get Institution](https://docs.yapily.com/api/reference/#operation/getInstitution) endpoint and check the features array within the &#x60;Institution&#x60; payload.
   * @return ApiListResponseOfFeatureDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfFeatureDetails getFeatureDetails() throws ApiException {
    return getFeatureDetailsWithHttpInfo().getData();
  }

  /**
   * Get Features
   * Used to retrieve all features available from Yapily. Each &#x60;Institution&#x60; supports a one, many or all of these features and can be seen in the features field of the &#x60;Institution&#x60; object.&lt;br&gt;&lt;br&gt;Note: Every &#x60;Institution&#x60; does not necessarily support every feature. To see which features are available for a particular Institution, use either the [Get Institutions](https://docs.yapily.com/api/reference/#operation/getInstitutions) or [Get Institution](https://docs.yapily.com/api/reference/#operation/getInstitution) endpoint and check the features array within the &#x60;Institution&#x60; payload.
   * @return ApiResponse&lt;ApiListResponseOfFeatureDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfFeatureDetails> getFeatureDetailsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/features";

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

    GenericType<ApiListResponseOfFeatureDetails> localVarReturnType = new GenericType<ApiListResponseOfFeatureDetails>() {};

    return apiClient.invokeAPI("InstitutionsApi.getFeatureDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Institution
   * Used to retrieves details of a specific &#x60;Institution&#x60; within an application
   * @param institutionId __Mandatory__. The Yapily institution Id for the &#x60;Institution&#x60;. (required)
   * @return Institution
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public Institution getInstitution(String institutionId) throws ApiException {
    return getInstitutionWithHttpInfo(institutionId).getData();
  }

  /**
   * Get Institution
   * Used to retrieves details of a specific &#x60;Institution&#x60; within an application
   * @param institutionId __Mandatory__. The Yapily institution Id for the &#x60;Institution&#x60;. (required)
   * @return ApiResponse&lt;Institution&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Institution> getInstitutionWithHttpInfo(String institutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'institutionId' is set
    if (institutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'institutionId' when calling getInstitution");
    }
    
    // create path and map variables
    String localVarPath = "/institutions/{institutionId}"
      .replaceAll("\\{" + "institutionId" + "\\}", apiClient.escapeString(institutionId.toString()));

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

    GenericType<Institution> localVarReturnType = new GenericType<Institution>() {};

    return apiClient.invokeAPI("InstitutionsApi.getInstitution", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Institutions
   * Used to retrieve all &#x60;Institutions&#x60; within an application
   * @return ApiListResponseOfInstitution
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfInstitution getInstitutions() throws ApiException {
    return getInstitutionsWithHttpInfo().getData();
  }

  /**
   * Get Institutions
   * Used to retrieve all &#x60;Institutions&#x60; within an application
   * @return ApiResponse&lt;ApiListResponseOfInstitution&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfInstitution> getInstitutionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/institutions";

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

    GenericType<ApiListResponseOfInstitution> localVarReturnType = new GenericType<ApiListResponseOfInstitution>() {};

    return apiClient.invokeAPI("InstitutionsApi.getInstitutions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
