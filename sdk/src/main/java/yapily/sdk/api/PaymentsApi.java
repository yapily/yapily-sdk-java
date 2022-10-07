package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfPaymentResponse;
import yapily.sdk.models.ApiResponseOfPaymentResponses;
import yapily.sdk.models.BulkPaymentRequest;
import yapily.sdk.models.PaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
public class PaymentsApi {
  private ApiClient apiClient;

  public PaymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsApi(ApiClient apiClient) {
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
   * Create Bulk Payment
   * Used to initiate a bulk payment after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Feature: &#x60;CREATE_BULK_PAYMENT&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param bulkPaymentRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentResponse createBulkPayment(String consent, BulkPaymentRequest bulkPaymentRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return createBulkPaymentWithHttpInfo(consent, bulkPaymentRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Bulk Payment
   * Used to initiate a bulk payment after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Feature: &#x60;CREATE_BULK_PAYMENT&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param bulkPaymentRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentResponse> createBulkPaymentWithHttpInfo(String consent, BulkPaymentRequest bulkPaymentRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = bulkPaymentRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createBulkPayment");
    }
    
    // verify the required parameter 'bulkPaymentRequest' is set
    if (bulkPaymentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkPaymentRequest' when calling createBulkPayment");
    }
    
    // create path and map variables
    String localVarPath = "/bulk-payments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};

    return apiClient.invokeAPI("PaymentsApi.createBulkPayment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Payment
   * Used to initiate a payment after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param paymentRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentResponse createPayment(String consent, PaymentRequest paymentRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return createPaymentWithHttpInfo(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Payment
   * Used to initiate a payment after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param paymentRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentResponse> createPaymentWithHttpInfo(String consent, PaymentRequest paymentRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = paymentRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createPayment");
    }
    
    // verify the required parameter 'paymentRequest' is set
    if (paymentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentRequest' when calling createPayment");
    }
    
    // create path and map variables
    String localVarPath = "/payments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentResponse>() {};

    return apiClient.invokeAPI("PaymentsApi.createPayment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Payment Details
   * Used to get the payment details of a payment. This is most commonly used to check for any updates to the payment status. &lt;br&gt;&lt;br&gt;Feature: &#x60;EXISTING_PAYMENTS_DETAILS&#x60;
   * @param paymentId __Mandatory__. The payment Id of the payment. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentResponses
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentResponses getPayments(String paymentId, String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return getPaymentsWithHttpInfo(paymentId, consent, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Get Payment Details
   * Used to get the payment details of a payment. This is most commonly used to check for any updates to the payment status. &lt;br&gt;&lt;br&gt;Feature: &#x60;EXISTING_PAYMENTS_DETAILS&#x60;
   * @param paymentId __Mandatory__. The payment Id of the payment. (required)
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentResponses&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentResponses> getPaymentsWithHttpInfo(String paymentId, String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getPayments");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getPayments");
    }
    
    // create path and map variables
    String localVarPath = "/payments/{paymentId}/details"
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfPaymentResponses> localVarReturnType = new GenericType<ApiResponseOfPaymentResponses>() {};

    return apiClient.invokeAPI("PaymentsApi.getPayments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
