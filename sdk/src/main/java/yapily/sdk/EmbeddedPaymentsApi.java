package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse;
import yapily.sdk.PaymentEmbeddedAuthorisationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-08T16:14:50.042Z")
public class EmbeddedPaymentsApi {
  private ApiClient apiClient;

  public EmbeddedPaymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmbeddedPaymentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate an embedded payment for user to authorise
   * 
   * @param paymentAuthRequest paymentAuthRequest (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedPaymentAuthorisationUsingPOST(PaymentEmbeddedAuthorisationRequest paymentAuthRequest, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = paymentAuthRequest;
    
    // verify the required parameter 'paymentAuthRequest' is set
    if (paymentAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthRequest' when calling createEmbeddedPaymentAuthorisationUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an embedded payment initiation with SCA info
   * 
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param paymentAuthRequest paymentAuthRequest (required)
   * @param xYapilyApiVersion __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; (optional)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedPaymentAuthorisationUsingPUT(String consentId, PaymentEmbeddedAuthorisationRequest paymentAuthRequest, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = paymentAuthRequest;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling updateEmbeddedPaymentAuthorisationUsingPUT");
    }
    
    // verify the required parameter 'paymentAuthRequest' is set
    if (paymentAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthRequest' when calling updateEmbeddedPaymentAuthorisationUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-payment-auth-requests/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
