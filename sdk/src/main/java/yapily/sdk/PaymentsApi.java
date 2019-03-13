package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentResponse;
import yapily.sdk.SortCodePaymentAuthRequest;
import yapily.sdk.SortCodePaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-13T10:14:17.059Z")
public class PaymentsApi {
  private ApiClient apiClient;

  public PaymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate a new single payment for user to authorise
   * 
   * @param paymentAuthRequest paymentAuthRequest (required)
   * @return ApiResponseOfAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfAuthorisationRequestResponse createPaymentInitiationUsingPOST(SortCodePaymentAuthRequest paymentAuthRequest) throws ApiException {
    Object localVarPostBody = paymentAuthRequest;
    
    // verify the required parameter 'paymentAuthRequest' is set
    if (paymentAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthRequest' when calling createPaymentInitiationUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/payment-sortcode-auth-requests";

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
  /**
   * Create a new single payment
   * 
   * @param consent Consent Token (required)
   * @param paymentRequest paymentRequest (required)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentResponse createPaymentUsingPOST(String consent, SortCodePaymentRequest paymentRequest) throws ApiException {
    Object localVarPostBody = paymentRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createPaymentUsingPOST");
    }
    
    // verify the required parameter 'paymentRequest' is set
    if (paymentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentRequest' when calling createPaymentUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/payment-sortcode";

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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get status of a payment
   * 
   * @param paymentId paymentId (required)
   * @param consent Consent Token (required)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentResponse getPaymentStatusUsingGET(String paymentId, String consent) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getPaymentStatusUsingGET");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getPaymentStatusUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/payments/{paymentId}"
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
