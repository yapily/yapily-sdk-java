package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiErrorResponse;
import yapily.sdk.models.ApiResponseOfFundsConfirmationResponse;
import yapily.sdk.models.ApiResponseOfNonSweepingAuthorisationResponse;
import yapily.sdk.models.ApiResponseOfSubmissionResponse;
import yapily.sdk.models.ApiResponseOfSweepingAuthorisationResponse;
import yapily.sdk.models.FundsConfirmationRequest;
import yapily.sdk.models.NonSweepingAuthorisationRequest;
import yapily.sdk.models.SubmissionRequest;
import yapily.sdk.models.SweepingAuthorisationRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
public class VariableRecurringPaymentsApi {
  private ApiClient apiClient;

  public VariableRecurringPaymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VariableRecurringPaymentsApi(ApiClient apiClient) {
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
   * Create Non-Sweeping Variable Recurring Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Non-Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param nonSweepingAuthorisationRequest  (required)
   * @return ApiResponseOfNonSweepingAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfNonSweepingAuthorisationResponse createNonSweepingAuthorisation(NonSweepingAuthorisationRequest nonSweepingAuthorisationRequest) throws ApiException {
    return createNonSweepingAuthorisationWithHttpInfo(nonSweepingAuthorisationRequest).getData();
  }

  /**
   * Create Non-Sweeping Variable Recurring Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Non-Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param nonSweepingAuthorisationRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfNonSweepingAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfNonSweepingAuthorisationResponse> createNonSweepingAuthorisationWithHttpInfo(NonSweepingAuthorisationRequest nonSweepingAuthorisationRequest) throws ApiException {
    Object localVarPostBody = nonSweepingAuthorisationRequest;
    
    // verify the required parameter 'nonSweepingAuthorisationRequest' is set
    if (nonSweepingAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'nonSweepingAuthorisationRequest' when calling createNonSweepingAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/non-sweeping/consents";

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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfNonSweepingAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfNonSweepingAuthorisationResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.createNonSweepingAuthorisation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Sweeping Variable Recurring Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param sweepingAuthorisationRequest  (required)
   * @return ApiResponseOfSweepingAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfSweepingAuthorisationResponse createSweepingAuthorisation(SweepingAuthorisationRequest sweepingAuthorisationRequest) throws ApiException {
    return createSweepingAuthorisationWithHttpInfo(sweepingAuthorisationRequest).getData();
  }

  /**
   * Create Sweeping Variable Recurring Payment Authorisation
   * Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.&lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param sweepingAuthorisationRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfSweepingAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfSweepingAuthorisationResponse> createSweepingAuthorisationWithHttpInfo(SweepingAuthorisationRequest sweepingAuthorisationRequest) throws ApiException {
    Object localVarPostBody = sweepingAuthorisationRequest;
    
    // verify the required parameter 'sweepingAuthorisationRequest' is set
    if (sweepingAuthorisationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sweepingAuthorisationRequest' when calling createSweepingAuthorisation");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/sweeping/consents";

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
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfSweepingAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfSweepingAuthorisationResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.createSweepingAuthorisation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Confirm Funds for Variable Recurring Payment
   * Used to confirm funds on the Payer account to execute Variable Recurring Payments after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;VARIABLE_RECURRING_PAYMENT_FUNDS_CONFIRMATION&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param fundsConfirmationRequest  (required)
   * @return ApiResponseOfFundsConfirmationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfFundsConfirmationResponse createVrpFundsConfirmation(String consent, FundsConfirmationRequest fundsConfirmationRequest) throws ApiException {
    return createVrpFundsConfirmationWithHttpInfo(consent, fundsConfirmationRequest).getData();
  }

  /**
   * Confirm Funds for Variable Recurring Payment
   * Used to confirm funds on the Payer account to execute Variable Recurring Payments after obtaining the user&#39;s authorisation. &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;VARIABLE_RECURRING_PAYMENT_FUNDS_CONFIRMATION&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param fundsConfirmationRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfFundsConfirmationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfFundsConfirmationResponse> createVrpFundsConfirmationWithHttpInfo(String consent, FundsConfirmationRequest fundsConfirmationRequest) throws ApiException {
    Object localVarPostBody = fundsConfirmationRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createVrpFundsConfirmation");
    }
    
    // verify the required parameter 'fundsConfirmationRequest' is set
    if (fundsConfirmationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundsConfirmationRequest' when calling createVrpFundsConfirmation");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/funds-confirmation";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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

    GenericType<ApiResponseOfFundsConfirmationResponse> localVarReturnType = new GenericType<ApiResponseOfFundsConfirmationResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.createVrpFundsConfirmation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Variable Recurring Payment
   * Used to submit a Variable Recurring Payments transaction after obtaining the user&#39;s authorisation. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING&#x60;&lt;/li&gt;&lt;li&gt;&#x60;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param submissionRequest  (required)
   * @return ApiResponseOfSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfSubmissionResponse createVrpPayment(String consent, SubmissionRequest submissionRequest) throws ApiException {
    return createVrpPaymentWithHttpInfo(consent, submissionRequest).getData();
  }

  /**
   * Create Variable Recurring Payment
   * Used to submit a Variable Recurring Payments transaction after obtaining the user&#39;s authorisation. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). &lt;br&gt;&lt;br&gt;Features:&lt;ul&gt;&lt;li&gt;&#x60;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING&#x60;&lt;/li&gt;&lt;li&gt;&#x60;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING&#x60;&lt;/li&gt;&lt;/ul&gt;
   * @param consent __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. (required)
   * @param submissionRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfSubmissionResponse> createVrpPaymentWithHttpInfo(String consent, SubmissionRequest submissionRequest) throws ApiException {
    Object localVarPostBody = submissionRequest;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling createVrpPayment");
    }
    
    // verify the required parameter 'submissionRequest' is set
    if (submissionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'submissionRequest' when calling createVrpPayment");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/payments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
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

    GenericType<ApiResponseOfSubmissionResponse> localVarReturnType = new GenericType<ApiResponseOfSubmissionResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.createVrpPayment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Sweeping Variable Recurring Payment Consent Details
   * Get Sweeping Variable Recurring Payments consent details using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Variable Recurring Payments Consent&#x60; to retrieve. (required)
   * @return ApiResponseOfSweepingAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfSweepingAuthorisationResponse getSweepingVrpConsentById(UUID consentId) throws ApiException {
    return getSweepingVrpConsentByIdWithHttpInfo(consentId).getData();
  }

  /**
   * Get Sweeping Variable Recurring Payment Consent Details
   * Get Sweeping Variable Recurring Payments consent details using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Variable Recurring Payments Consent&#x60; to retrieve. (required)
   * @return ApiResponse&lt;ApiResponseOfSweepingAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfSweepingAuthorisationResponse> getSweepingVrpConsentByIdWithHttpInfo(UUID consentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling getSweepingVrpConsentById");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/sweeping/consents/{consentId}"
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

    GenericType<ApiResponseOfSweepingAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfSweepingAuthorisationResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.getSweepingVrpConsentById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Variable Recurring Payment Details
   * Get Variable Recurring Payment details using the Payment Id
   * @param paymentId __Mandatory__. The Payment Id of the &#x60;Variable Recurring Payments&#x60; to retrieve. (required)
   * @param consent __Mandatory__. The consent token containing the user&#39;s authorisation to make the &#x60;Variable Recurring Payments&#x60; request. (required)
   * @return ApiResponseOfSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfSubmissionResponse getVrpPaymentDetails(String paymentId, String consent) throws ApiException {
    return getVrpPaymentDetailsWithHttpInfo(paymentId, consent).getData();
  }

  /**
   * Get Variable Recurring Payment Details
   * Get Variable Recurring Payment details using the Payment Id
   * @param paymentId __Mandatory__. The Payment Id of the &#x60;Variable Recurring Payments&#x60; to retrieve. (required)
   * @param consent __Mandatory__. The consent token containing the user&#39;s authorisation to make the &#x60;Variable Recurring Payments&#x60; request. (required)
   * @return ApiResponse&lt;ApiResponseOfSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfSubmissionResponse> getVrpPaymentDetailsWithHttpInfo(String paymentId, String consent) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getVrpPaymentDetails");
    }
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling getVrpPaymentDetails");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/payments/{paymentId}/details"
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (consent != null)
      localVarHeaderParams.put("consent", apiClient.parameterToString(consent));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfSubmissionResponse> localVarReturnType = new GenericType<ApiResponseOfSubmissionResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.getVrpPaymentDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Non-Sweeping Variable Recurring Payment Consent Details
   * Get Non-Sweeping Variable Recurring Payments consent details using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Variable Recurring Payments Consent&#x60; to retrieve. (required)
   * @return ApiResponseOfNonSweepingAuthorisationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfNonSweepingAuthorisationResponse getpNonSweepingVrpConsentById(UUID consentId) throws ApiException {
    return getpNonSweepingVrpConsentByIdWithHttpInfo(consentId).getData();
  }

  /**
   * Get Non-Sweeping Variable Recurring Payment Consent Details
   * Get Non-Sweeping Variable Recurring Payments consent details using the consent Id
   * @param consentId __Mandatory__. The consent Id of the &#x60;Variable Recurring Payments Consent&#x60; to retrieve. (required)
   * @return ApiResponse&lt;ApiResponseOfNonSweepingAuthorisationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Error Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfNonSweepingAuthorisationResponse> getpNonSweepingVrpConsentByIdWithHttpInfo(UUID consentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling getpNonSweepingVrpConsentById");
    }
    
    // create path and map variables
    String localVarPath = "/variable-recurring-payments/non-sweeping/consents/{consentId}"
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

    GenericType<ApiResponseOfNonSweepingAuthorisationResponse> localVarReturnType = new GenericType<ApiResponseOfNonSweepingAuthorisationResponse>() {};

    return apiClient.invokeAPI("VariableRecurringPaymentsApi.getpNonSweepingVrpConsentById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
