package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfPaymentResponse;
import yapily.sdk.SortCodePaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-12T17:29:25.799Z")
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
   * @param institution institution (required)
   * @param paymentRequest paymentRequest (optional)
   * @param userUuid user-uuid (optional)
   * @param paramCallback callback (optional)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentResponse createPaymentInitiationUsingPOST(String institution, SortCodePaymentRequest paymentRequest, String userUuid, String paramCallback) throws ApiException {
    Object localVarPostBody = paymentRequest;
    
    // verify the required parameter 'institution' is set
    if (institution == null) {
      throw new ApiException(400, "Missing the required parameter 'institution' when calling createPaymentInitiationUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/initiate-payment-sortcode";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (institution != null)
      localVarHeaderParams.put("institution", apiClient.parameterToString(institution));
if (userUuid != null)
      localVarHeaderParams.put("user-uuid", apiClient.parameterToString(userUuid));
if (paramCallback != null)
      localVarHeaderParams.put("callback", apiClient.parameterToString(paramCallback));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new single payment
   * 
   * @param consent Consent Token (required)
   * @param paymentRequest paymentRequest (optional)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentResponse createPaymentUsingPOST(String consent, SortCodePaymentRequest paymentRequest) throws ApiException {
    Object localVarPostBody = paymentRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createPaymentUsingPOST");
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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get status of a payment initiation
   * 
   * @param institution institution (required)
   * @param paymentId paymentId (required)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentResponse getPaymentInitiationStatusUsingGET(String institution, String paymentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'institution' is set
    if (institution == null) {
      throw new ApiException(400, "Missing the required parameter 'institution' when calling getPaymentInitiationStatusUsingGET");
    }
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getPaymentInitiationStatusUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/payment-initiations/{paymentId}"
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (institution != null)
      localVarHeaderParams.put("institution", apiClient.parameterToString(institution));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
