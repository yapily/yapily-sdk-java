package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.AccountAuthorisationRequest;
import yapily.sdk.models.ApiResponseError;
import yapily.sdk.models.ApiResponseOfAccountAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfEmbeddedAccountAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfPaymentAuthorisationRequestResponse;
import yapily.sdk.models.ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse;
import yapily.sdk.models.BulkPaymentAuthorisationRequest;
import yapily.sdk.models.BulkPaymentEmbeddedAuthorisationRequest;
import yapily.sdk.models.EmbeddedAccountAuthorisationRequest;
import yapily.sdk.models.PaymentAuthorisationRequest;
import yapily.sdk.models.PaymentEmbeddedAuthorisationRequest;
import yapily.sdk.models.PaymentPreAuthorisationRequest;
import yapily.sdk.models.PreAuthorisationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T11:34:20.056Z[Etc/UTC]")
public class AuthorisationsApi {
  private ApiClient apiClient;

  public AuthorisationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorisationsApi(ApiClient apiClient) {
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
   * Create Bulk Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_BULK_PAYMENT&#x60;
   * @param bulkPaymentAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentAuthorisationRequestResponse createBulkPaymentAuthorisation(BulkPaymentAuthorisationRequest bulkPaymentAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return createBulkPaymentAuthorisationWithHttpInfo(bulkPaymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Bulk Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_BULK_PAYMENT&#x60;
   * @param bulkPaymentAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentAuthorisationRequestResponse> createBulkPaymentAuthorisationWithHttpInfo(BulkPaymentAuthorisationRequest bulkPaymentAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = bulkPaymentAuthorisationRequest;
    
    // verify the required parameter 'bulkPaymentAuthorisationRequest' is set
    if (bulkPaymentAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkPaymentAuthorisationRequest' when calling createBulkPaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/bulk-payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfPaymentAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.createBulkPaymentAuthorisation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Embedded Bulk Payment Authorisation
   * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60; feature in order to obtain the the user&#39;s authorisation for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60;
   * @param bulkPaymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedBulkPaymentAuthorisation(BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return createEmbeddedBulkPaymentAuthorisationWithHttpInfo(bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Embedded Bulk Payment Authorisation
   * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60; feature in order to obtain the the user&#39;s authorisation for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60;
   * @param bulkPaymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> createEmbeddedBulkPaymentAuthorisationWithHttpInfo(BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = bulkPaymentEmbeddedAuthorisationRequest;
    
    // verify the required parameter 'bulkPaymentEmbeddedAuthorisationRequest' is set
    if (bulkPaymentEmbeddedAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkPaymentEmbeddedAuthorisationRequest' when calling createEmbeddedBulkPaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-bulk-payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.createEmbeddedBulkPaymentAuthorisation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Embedded Payment Authorisation
   * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60; feature in order to obtain the the user&#39;s authorisation for a payment.&lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60;
   * @param paymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedPaymentAuthorisation(PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return createEmbeddedPaymentAuthorisationWithHttpInfo(paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Embedded Payment Authorisation
   * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60; feature in order to obtain the the user&#39;s authorisation for a payment.&lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60;
   * @param paymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> createEmbeddedPaymentAuthorisationWithHttpInfo(PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = paymentEmbeddedAuthorisationRequest;
    
    // verify the required parameter 'paymentEmbeddedAuthorisationRequest' is set
    if (paymentEmbeddedAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentEmbeddedAuthorisationRequest' when calling createEmbeddedPaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.createEmbeddedPaymentAuthorisation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a payment. This endpoint is used to initiate all the different payment listed below. Based on the type of payment you wish to make, you may be required to provide specific properties in [PaymentRequest](https://docs.yapily.com/api/reference/#operation/createPaymentAuthorisation!path&#x3D;paymentRequest&amp;t&#x3D;request). First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/reference/#operation/getInstitution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param paymentAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentAuthorisationRequestResponse createPaymentAuthorisation(PaymentAuthorisationRequest paymentAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return createPaymentAuthorisationWithHttpInfo(paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a payment. This endpoint is used to initiate all the different payment listed below. Based on the type of payment you wish to make, you may be required to provide specific properties in [PaymentRequest](https://docs.yapily.com/api/reference/#operation/createPaymentAuthorisation!path&#x3D;paymentRequest&amp;t&#x3D;request). First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/reference/#operation/getInstitution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_INTERNATIONAL_SINGLE_PAYMENT&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param paymentAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentAuthorisationRequestResponse> createPaymentAuthorisationWithHttpInfo(PaymentAuthorisationRequest paymentAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = paymentAuthorisationRequest;
    
    // verify the required parameter 'paymentAuthorisationRequest' is set
    if (paymentAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthorisationRequest' when calling createPaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfPaymentAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.createPaymentAuthorisation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Payment Pre-authorisation
   * Used to initiate the pre-authorisation process for payments for CbiGlobe &#x60;Institution&#x60; that contains the &#x60;INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS&#x60; feature to authenticate the user. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS&#x60;
   * @param paymentPreAuthorisationRequest  (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccountAuthorisationResponse createPaymentPreAuthorisationRequest(PaymentPreAuthorisationRequest paymentPreAuthorisationRequest, Boolean raw) throws ApiException {
    return createPaymentPreAuthorisationRequestWithHttpInfo(paymentPreAuthorisationRequest, raw).getData();
  }

  /**
   * Create Payment Pre-authorisation
   * Used to initiate the pre-authorisation process for payments for CbiGlobe &#x60;Institution&#x60; that contains the &#x60;INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS&#x60; feature to authenticate the user. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS&#x60;
   * @param paymentPreAuthorisationRequest  (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccountAuthorisationResponse> createPaymentPreAuthorisationRequestWithHttpInfo(PaymentPreAuthorisationRequest paymentPreAuthorisationRequest, Boolean raw) throws ApiException {
    Object localVarPostBody = paymentPreAuthorisationRequest;
    
    // verify the required parameter 'paymentPreAuthorisationRequest' is set
    if (paymentPreAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentPreAuthorisationRequest' when calling createPaymentPreAuthorisationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/payment-pre-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.createPaymentPreAuthorisationRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Pre-authorisation
   * Used to initiate the pre-authorisation process for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature to authenticate the user. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_PRE_AUTHORISATION&#x60;
   * @param preAuthorisationRequest  (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccountAuthorisationResponse createPreAuthorisationRequest(PreAuthorisationRequest preAuthorisationRequest, Boolean raw) throws ApiException {
    return createPreAuthorisationRequestWithHttpInfo(preAuthorisationRequest, raw).getData();
  }

  /**
   * Create Pre-authorisation
   * Used to initiate the pre-authorisation process for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature to authenticate the user. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_PRE_AUTHORISATION&#x60;
   * @param preAuthorisationRequest  (required)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccountAuthorisationResponse> createPreAuthorisationRequestWithHttpInfo(PreAuthorisationRequest preAuthorisationRequest, Boolean raw) throws ApiException {
    Object localVarPostBody = preAuthorisationRequest;
    
    // verify the required parameter 'preAuthorisationRequest' is set
    if (preAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'preAuthorisationRequest' when calling createPreAuthorisationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/pre-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.createPreAuthorisationRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Account Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial institution in order to give consent to access account data.&lt;br&gt;&lt;br&gt;See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_ACCOUNT_REQUEST&#x60;
   * @param accountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccountAuthorisationResponse initiateAccountRequest(AccountAuthorisationRequest accountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return initiateAccountRequestWithHttpInfo(accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Account Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial institution in order to give consent to access account data.&lt;br&gt;&lt;br&gt;See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_ACCOUNT_REQUEST&#x60;
   * @param accountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccountAuthorisationResponse> initiateAccountRequestWithHttpInfo(AccountAuthorisationRequest accountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = accountAuthorisationRequest;
    
    // verify the required parameter 'accountAuthorisationRequest' is set
    if (accountAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountAuthorisationRequest' when calling initiateAccountRequest");
    }
    
    // create path and map variables
    String localVarPath = "/account-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.initiateAccountRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Embedded Account Authorisation
   * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60; feature in order to obtain the the user&#39;s authorisation to access their account information. &lt;br&gt;&lt;br&gt;See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60;
   * @param embeddedAccountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfEmbeddedAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfEmbeddedAccountAuthorisationResponse initiateEmbeddedAccountRequest(EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return initiateEmbeddedAccountRequestWithHttpInfo(embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Create Embedded Account Authorisation
   * Used to initiate the embedded authorisation process for an &#x60;Institution&#x60; that contains the &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60; feature in order to obtain the the user&#39;s authorisation to access their account information. &lt;br&gt;&lt;br&gt;See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60;
   * @param embeddedAccountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfEmbeddedAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfEmbeddedAccountAuthorisationResponse> initiateEmbeddedAccountRequestWithHttpInfo(EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = embeddedAccountAuthorisationRequest;
    
    // verify the required parameter 'embeddedAccountAuthorisationRequest' is set
    if (embeddedAccountAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'embeddedAccountAuthorisationRequest' when calling initiateEmbeddedAccountRequest");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-account-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfEmbeddedAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfEmbeddedAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.initiateEmbeddedAccountRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Re-authorise Account Consent
   * Used to prompt the account holder for continued access to their financial data. This endpoint should be used when a &#x60;Consent&#x60; that was previously &#x60;AUTHORIZED&#x60; can no longer be used to retrieve data.&lt;br&gt;&lt;br&gt;See [Re-Authorisation](https://docs.yapily.com/pages/key-concepts/account-data/account-consents/#re-authorisation) for more information.
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccountAuthorisationResponse reAuthoriseAccount(String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return reAuthoriseAccountWithHttpInfo(consent, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Re-authorise Account Consent
   * Used to prompt the account holder for continued access to their financial data. This endpoint should be used when a &#x60;Consent&#x60; that was previously &#x60;AUTHORIZED&#x60; can no longer be used to retrieve data.&lt;br&gt;&lt;br&gt;See [Re-Authorisation](https://docs.yapily.com/pages/key-concepts/account-data/account-consents/#re-authorisation) for more information.
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccountAuthorisationResponse> reAuthoriseAccountWithHttpInfo(String consent, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling reAuthoriseAccount");
    }
    
    // create path and map variables
    String localVarPath = "/account-auth-requests";

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

    GenericType<ApiResponseOfAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.reAuthoriseAccount", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Embedded Account Authorisation
   * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to access the user&#39;s financial data. &lt;br&gt;&lt;br&gt;See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60;
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param embeddedAccountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfEmbeddedAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfEmbeddedAccountAuthorisationResponse updateEmbeddedAccountRequest(String consentId, EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return updateEmbeddedAccountRequestWithHttpInfo(consentId, embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Update Embedded Account Authorisation
   * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to access the user&#39;s financial data. &lt;br&gt;&lt;br&gt;See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_ACCOUNT_REQUEST&#x60;
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param embeddedAccountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfEmbeddedAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfEmbeddedAccountAuthorisationResponse> updateEmbeddedAccountRequestWithHttpInfo(String consentId, EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = embeddedAccountAuthorisationRequest;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling updateEmbeddedAccountRequest");
    }
    
    // verify the required parameter 'embeddedAccountAuthorisationRequest' is set
    if (embeddedAccountAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'embeddedAccountAuthorisationRequest' when calling updateEmbeddedAccountRequest");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-account-auth-requests/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfEmbeddedAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfEmbeddedAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.updateEmbeddedAccountRequest", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Embedded Bulk Payment Authorisation
   * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to initiate a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt;See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60;
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param bulkPaymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedBulkPaymentAuthorisation(String consentId, BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return updateEmbeddedBulkPaymentAuthorisationWithHttpInfo(consentId, bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Update Embedded Bulk Payment Authorisation
   * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to initiate a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. &lt;br&gt;&lt;br&gt;See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_BULK_PAYMENT&#x60;
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param bulkPaymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> updateEmbeddedBulkPaymentAuthorisationWithHttpInfo(String consentId, BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = bulkPaymentEmbeddedAuthorisationRequest;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling updateEmbeddedBulkPaymentAuthorisation");
    }
    
    // verify the required parameter 'bulkPaymentEmbeddedAuthorisationRequest' is set
    if (bulkPaymentEmbeddedAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkPaymentEmbeddedAuthorisationRequest' when calling updateEmbeddedBulkPaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-bulk-payment-auth-requests/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.updateEmbeddedBulkPaymentAuthorisation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Embedded Payment Authorisation
   * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to initiate a payment. &lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/embedded/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60;
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param paymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedPaymentAuthorisation(String consentId, PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return updateEmbeddedPaymentAuthorisationWithHttpInfo(consentId, paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Update Embedded Payment Authorisation
   * Used to pass the SCA Code received from the &#x60;Institution&#x60; (and the SCA method selected by the user where multiple SCA methods are supported by the &#x60;Institution&#x60;) in order to complete the embedded authorisation to initiate a payment. &lt;br&gt;&lt;br&gt; See [Embedded Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/embedded/) for more information about this flow.&lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT&#x60;
   * @param consentId __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. (required)
   * @param paymentEmbeddedAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> updateEmbeddedPaymentAuthorisationWithHttpInfo(String consentId, PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = paymentEmbeddedAuthorisationRequest;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling updateEmbeddedPaymentAuthorisation");
    }
    
    // verify the required parameter 'paymentEmbeddedAuthorisationRequest' is set
    if (paymentEmbeddedAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentEmbeddedAuthorisationRequest' when calling updateEmbeddedPaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-payment-auth-requests/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

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

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.updateEmbeddedPaymentAuthorisation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Payment Pre-authorisation
   * Used to continue the authorisation process and for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature and direct user to the login screen of their financial institution in order to give consent to initiate a payment. &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_PRE_AUTHORISATION&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param paymentAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfPaymentAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfPaymentAuthorisationRequestResponse updatePaymentAuthorisation(String consent, PaymentAuthorisationRequest paymentAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return updatePaymentAuthorisationWithHttpInfo(consent, paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Update Payment Pre-authorisation
   * Used to continue the authorisation process and for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature and direct user to the login screen of their financial institution in order to give consent to initiate a payment. &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow. &lt;br&gt;&lt;br&gt;Feature: &#x60;INITIATE_PRE_AUTHORISATION&#x60;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param paymentAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfPaymentAuthorisationRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfPaymentAuthorisationRequestResponse> updatePaymentAuthorisationWithHttpInfo(String consent, PaymentAuthorisationRequest paymentAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = paymentAuthorisationRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling updatePaymentAuthorisation");
    }
    
    // verify the required parameter 'paymentAuthorisationRequest' is set
    if (paymentAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthorisationRequest' when calling updatePaymentAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raw", raw));

    if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));
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

    GenericType<ApiResponseOfPaymentAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentAuthorisationRequestResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.updatePaymentAuthorisation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Account Pre-authorisation
   * Used to continue the authorisation process and for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature and direct user to the login screen of their financial institution in order to give consent to access account data. &lt;br&gt;&lt;br&gt;See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow. &lt;br&gt;&lt;br&gt;Features: &lt;ul&gt;&lt;li&gt;&#x60;INITIATE_ACCOUNT_REQUEST&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_PRE_AUTHORISATION&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponseOfAccountAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfAccountAuthorisationResponse updatePreAuthoriseAccountConsent(String consent, AccountAuthorisationRequest accountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    return updatePreAuthoriseAccountConsentWithHttpInfo(consent, accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw).getData();
  }

  /**
   * Update Account Pre-authorisation
   * Used to continue the authorisation process and for any &#x60;Institution&#x60; that contains the &#x60;INITIATE_PRE_AUTHORISATION&#x60; feature and direct user to the login screen of their financial institution in order to give consent to access account data. &lt;br&gt;&lt;br&gt;See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow. &lt;br&gt;&lt;br&gt;Features: &lt;ul&gt;&lt;li&gt;&#x60;INITIATE_ACCOUNT_REQUEST&#x60;&lt;/li&gt;&lt;li&gt;&#x60;INITIATE_PRE_AUTHORISATION&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param accountAuthorisationRequest  (required)
   * @param psuId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuCorporateId __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param psuIpAddress __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. (optional)
   * @param raw __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. (optional)
   * @return ApiResponse&lt;ApiResponseOfAccountAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfAccountAuthorisationResponse> updatePreAuthoriseAccountConsentWithHttpInfo(String consent, AccountAuthorisationRequest accountAuthorisationRequest, String psuId, String psuCorporateId, String psuIpAddress, Boolean raw) throws ApiException {
    Object localVarPostBody = accountAuthorisationRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling updatePreAuthoriseAccountConsent");
    }
    
    // verify the required parameter 'accountAuthorisationRequest' is set
    if (accountAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountAuthorisationRequest' when calling updatePreAuthoriseAccountConsent");
    }
    
    // create path and map variables
    String localVarPath = "/account-auth-requests";

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

    GenericType<ApiResponseOfAccountAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfAccountAuthorisationResponse>() {};

    return apiClient.invokeAPI("AuthorisationsApi.updatePreAuthoriseAccountConsent", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
