package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.PreAuthorisationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-03T14:10:42.883Z")
public class PreAuthConsentControllerApi {
  private ApiClient apiClient;

  public PreAuthConsentControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PreAuthConsentControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate request for user to pre authorise
   * 
   * @param preAuthorisationRequest preAuthorisationRequest (required)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse createPreAuthorisationUsingPOST(PreAuthorisationRequest preAuthorisationRequest) throws ApiException {
    Object localVarPostBody = preAuthorisationRequest;
    
    // verify the required parameter 'preAuthorisationRequest' is set
    if (preAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'preAuthorisationRequest' when calling createPreAuthorisationUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/pre-auth-requests";

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
