package yapily.sdk.api;

import yapily.sdk.ApiException;
import yapily.sdk.ApiClient;
import yapily.sdk.ApiResponse;
import yapily.sdk.Configuration;
import yapily.sdk.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.models.ApiErrorResponse;
import yapily.sdk.models.ApiListResponseOfVirtualAccount;
import yapily.sdk.models.ApiListResponseOfVirtualAccountBeneficiary;
import yapily.sdk.models.ApiListResponseOfVirtualAccountClient;
import yapily.sdk.models.ApiListResponseOfVirtualAccountPayment;
import yapily.sdk.models.ApiResponseOfVirtualAccount;
import yapily.sdk.models.ApiResponseOfVirtualAccountBeneficiary;
import yapily.sdk.models.ApiResponseOfVirtualAccountClient;
import yapily.sdk.models.ApiResponseOfVirtualAccountPayInDetails;
import yapily.sdk.models.ApiResponseOfVirtualAccountPayment;
import java.time.OffsetDateTime;
import java.util.UUID;
import yapily.sdk.models.UpdateVirtualAccountRequest;
import yapily.sdk.models.VirtualAccountBeneficiaryRequest;
import yapily.sdk.models.VirtualAccountClientRequest;
import yapily.sdk.models.VirtualAccountPayOutRequest;
import yapily.sdk.models.VirtualAccountRequest;
import yapily.sdk.models.VirtualAccountTransferRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T11:29:02.836Z[Etc/UTC]")
public class VirtualAccountsApi {
  private ApiClient apiClient;

  public VirtualAccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VirtualAccountsApi(ApiClient apiClient) {
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
   * Create Account
   * Create a new virtual account
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountRequest  (required)
   * @return ApiResponseOfVirtualAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccount createVirtualAccount(UUID clientId, VirtualAccountRequest virtualAccountRequest) throws ApiException {
    return createVirtualAccountWithHttpInfo(clientId, virtualAccountRequest).getData();
  }

  /**
   * Create Account
   * Create a new virtual account
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccount> createVirtualAccountWithHttpInfo(UUID clientId, VirtualAccountRequest virtualAccountRequest) throws ApiException {
    Object localVarPostBody = virtualAccountRequest;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createVirtualAccount");
    }
    
    // verify the required parameter 'virtualAccountRequest' is set
    if (virtualAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualAccountRequest' when calling createVirtualAccount");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccount> localVarReturnType = new GenericType<ApiResponseOfVirtualAccount>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.createVirtualAccount", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Beneficiary
   * Create a new beneficiary (individual or business account) to which a Pay Out can be made. The beneficiary can be used from any virtual account that is held
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountBeneficiaryRequest  (required)
   * @return ApiResponseOfVirtualAccountBeneficiary
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountBeneficiary createVirtualAccountBeneficiary(UUID clientId, VirtualAccountBeneficiaryRequest virtualAccountBeneficiaryRequest) throws ApiException {
    return createVirtualAccountBeneficiaryWithHttpInfo(clientId, virtualAccountBeneficiaryRequest).getData();
  }

  /**
   * Create Beneficiary
   * Create a new beneficiary (individual or business account) to which a Pay Out can be made. The beneficiary can be used from any virtual account that is held
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountBeneficiaryRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountBeneficiary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountBeneficiary> createVirtualAccountBeneficiaryWithHttpInfo(UUID clientId, VirtualAccountBeneficiaryRequest virtualAccountBeneficiaryRequest) throws ApiException {
    Object localVarPostBody = virtualAccountBeneficiaryRequest;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createVirtualAccountBeneficiary");
    }
    
    // verify the required parameter 'virtualAccountBeneficiaryRequest' is set
    if (virtualAccountBeneficiaryRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualAccountBeneficiaryRequest' when calling createVirtualAccountBeneficiary");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/beneficiaries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccountBeneficiary> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountBeneficiary>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.createVirtualAccountBeneficiary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Virtual Account Client
   * Create a new virtual account client (individual or business client). Available for clients who have direct onboarding permissions only. Please contact your CSM to enquire about access
   * @param clientId __Mandatory__. This must be your master / parent client-id (and not one associated with one of your clients) (required)
   * @param virtualAccountClientRequest  (required)
   * @return ApiResponseOfVirtualAccountClient
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountClient createVirtualAccountClient(UUID clientId, VirtualAccountClientRequest virtualAccountClientRequest) throws ApiException {
    return createVirtualAccountClientWithHttpInfo(clientId, virtualAccountClientRequest).getData();
  }

  /**
   * Create Virtual Account Client
   * Create a new virtual account client (individual or business client). Available for clients who have direct onboarding permissions only. Please contact your CSM to enquire about access
   * @param clientId __Mandatory__. This must be your master / parent client-id (and not one associated with one of your clients) (required)
   * @param virtualAccountClientRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountClient&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountClient> createVirtualAccountClientWithHttpInfo(UUID clientId, VirtualAccountClientRequest virtualAccountClientRequest) throws ApiException {
    Object localVarPostBody = virtualAccountClientRequest;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createVirtualAccountClient");
    }
    
    // verify the required parameter 'virtualAccountClientRequest' is set
    if (virtualAccountClientRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualAccountClientRequest' when calling createVirtualAccountClient");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/clients";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccountClient> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountClient>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.createVirtualAccountClient", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Pay Out
   * Initiate a payment from a specified virtual account to a previously added beneficiary using any of the schemes that it supports &lt;br&gt; When subscribed to virtualAccount.payOut.status notifications, further updates on payment processing status will be develivered asynchronously 
   * @param idempotencyKey Uniquely identifies a request, such that requests made with a same value are considered retries &lt;br&gt; We recommend that a v4 UUID is supplied  (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountPayOutRequest  (required)
   * @return ApiResponseOfVirtualAccountPayment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountPayment createVirtualAccountPayOut(String idempotencyKey, UUID clientId, VirtualAccountPayOutRequest virtualAccountPayOutRequest) throws ApiException {
    return createVirtualAccountPayOutWithHttpInfo(idempotencyKey, clientId, virtualAccountPayOutRequest).getData();
  }

  /**
   * Create Pay Out
   * Initiate a payment from a specified virtual account to a previously added beneficiary using any of the schemes that it supports &lt;br&gt; When subscribed to virtualAccount.payOut.status notifications, further updates on payment processing status will be develivered asynchronously 
   * @param idempotencyKey Uniquely identifies a request, such that requests made with a same value are considered retries &lt;br&gt; We recommend that a v4 UUID is supplied  (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountPayOutRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountPayment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountPayment> createVirtualAccountPayOutWithHttpInfo(String idempotencyKey, UUID clientId, VirtualAccountPayOutRequest virtualAccountPayOutRequest) throws ApiException {
    Object localVarPostBody = virtualAccountPayOutRequest;
    
    // verify the required parameter 'idempotencyKey' is set
    if (idempotencyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'idempotencyKey' when calling createVirtualAccountPayOut");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createVirtualAccountPayOut");
    }
    
    // verify the required parameter 'virtualAccountPayOutRequest' is set
    if (virtualAccountPayOutRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualAccountPayOutRequest' when calling createVirtualAccountPayOut");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/payments/pay-outs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (idempotencyKey != null)
      localVarHeaderParams.put("idempotency-key", apiClient.parameterToString(idempotencyKey));
if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccountPayment> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountPayment>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.createVirtualAccountPayOut", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Virtual Account Transfer
   * Create a transfer between two virtual accounts
   * @param idempotencyKey Uniquely identifies a request, such that requests made with a same value are considered retries &lt;br&gt; We recommend that a v4 UUID is supplied  (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountTransferRequest  (required)
   * @return ApiResponseOfVirtualAccountPayment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountPayment createVirtualAccountTransfer(String idempotencyKey, UUID clientId, VirtualAccountTransferRequest virtualAccountTransferRequest) throws ApiException {
    return createVirtualAccountTransferWithHttpInfo(idempotencyKey, clientId, virtualAccountTransferRequest).getData();
  }

  /**
   * Create Virtual Account Transfer
   * Create a transfer between two virtual accounts
   * @param idempotencyKey Uniquely identifies a request, such that requests made with a same value are considered retries &lt;br&gt; We recommend that a v4 UUID is supplied  (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param virtualAccountTransferRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountPayment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountPayment> createVirtualAccountTransferWithHttpInfo(String idempotencyKey, UUID clientId, VirtualAccountTransferRequest virtualAccountTransferRequest) throws ApiException {
    Object localVarPostBody = virtualAccountTransferRequest;
    
    // verify the required parameter 'idempotencyKey' is set
    if (idempotencyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'idempotencyKey' when calling createVirtualAccountTransfer");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createVirtualAccountTransfer");
    }
    
    // verify the required parameter 'virtualAccountTransferRequest' is set
    if (virtualAccountTransferRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualAccountTransferRequest' when calling createVirtualAccountTransfer");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/payments/transfers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (idempotencyKey != null)
      localVarHeaderParams.put("idempotency-key", apiClient.parameterToString(idempotencyKey));
if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccountPayment> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountPayment>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.createVirtualAccountTransfer", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Pay-In Details
   * Get the details of a pay-in transaction
   * @param paymentId Uniquely identifies a transaction (required)
   * @return ApiResponseOfVirtualAccountPayInDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Requested beneficiary is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountPayInDetails getPayInDetails(String paymentId) throws ApiException {
    return getPayInDetailsWithHttpInfo(paymentId).getData();
  }

  /**
   * Get Pay-In Details
   * Get the details of a pay-in transaction
   * @param paymentId Uniquely identifies a transaction (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountPayInDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Requested beneficiary is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountPayInDetails> getPayInDetailsWithHttpInfo(String paymentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling getPayInDetails");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/payments/{paymentId}/pay-in-details"
      .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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

    GenericType<ApiResponseOfVirtualAccountPayInDetails> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountPayInDetails>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getPayInDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Payment
   * Get the details of a specific payment using its Id
   * @param id __Mandatory__. The id of the payment (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @return ApiResponseOfVirtualAccountPayment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Requested payment is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountPayment getPaymentsById(String id, UUID clientId) throws ApiException {
    return getPaymentsByIdWithHttpInfo(id, clientId).getData();
  }

  /**
   * Get Payment
   * Get the details of a specific payment using its Id
   * @param id __Mandatory__. The id of the payment (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountPayment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Requested payment is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountPayment> getPaymentsByIdWithHttpInfo(String id, UUID clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentsById");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getPaymentsById");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/payments/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccountPayment> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountPayment>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getPaymentsById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get List Of Beneficiaries
   * Gets the list of beneficiaries (individual or business account) to which a Pay Out can be made.
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiListResponseOfVirtualAccountBeneficiary
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfVirtualAccountBeneficiary getVirtualAccountBeneficiaries(UUID clientId, String cursor) throws ApiException {
    return getVirtualAccountBeneficiariesWithHttpInfo(clientId, cursor).getData();
  }

  /**
   * Get List Of Beneficiaries
   * Gets the list of beneficiaries (individual or business account) to which a Pay Out can be made.
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiResponse&lt;ApiListResponseOfVirtualAccountBeneficiary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfVirtualAccountBeneficiary> getVirtualAccountBeneficiariesWithHttpInfo(UUID clientId, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getVirtualAccountBeneficiaries");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/beneficiaries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfVirtualAccountBeneficiary> localVarReturnType = new GenericType<ApiListResponseOfVirtualAccountBeneficiary>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getVirtualAccountBeneficiaries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Beneficiary
   * Get the details of a specific beneficiary (individual or business account) to which a Pay Out can be made from its id.
   * @param beneficiaryId __Mandatory__. The Id of the requested beneficiary. (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @return ApiResponseOfVirtualAccountBeneficiary
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Requested beneficiary is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccountBeneficiary getVirtualAccountBeneficiary(String beneficiaryId, UUID clientId) throws ApiException {
    return getVirtualAccountBeneficiaryWithHttpInfo(beneficiaryId, clientId).getData();
  }

  /**
   * Get Beneficiary
   * Get the details of a specific beneficiary (individual or business account) to which a Pay Out can be made from its id.
   * @param beneficiaryId __Mandatory__. The Id of the requested beneficiary. (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccountBeneficiary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Requested beneficiary is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccountBeneficiary> getVirtualAccountBeneficiaryWithHttpInfo(String beneficiaryId, UUID clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'beneficiaryId' is set
    if (beneficiaryId == null) {
      throw new ApiException(400, "Missing the required parameter 'beneficiaryId' when calling getVirtualAccountBeneficiary");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getVirtualAccountBeneficiary");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/beneficiaries/{beneficiaryId}"
      .replaceAll("\\{" + "beneficiaryId" + "\\}", apiClient.escapeString(beneficiaryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccountBeneficiary> localVarReturnType = new GenericType<ApiResponseOfVirtualAccountBeneficiary>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getVirtualAccountBeneficiary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Account
   * Get the details of a specific account using its Id
   * @param accountId __Mandatory__. The Id of the account. (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @return ApiResponseOfVirtualAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Resource requested is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccount getVirtualAccountById(String accountId, UUID clientId) throws ApiException {
    return getVirtualAccountByIdWithHttpInfo(accountId, clientId).getData();
  }

  /**
   * Get Account
   * Get the details of a specific account using its Id
   * @param accountId __Mandatory__. The Id of the account. (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Resource requested is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccount> getVirtualAccountByIdWithHttpInfo(String accountId, UUID clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getVirtualAccountById");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getVirtualAccountById");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccount> localVarReturnType = new GenericType<ApiResponseOfVirtualAccount>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getVirtualAccountById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get List of Virtual Account Clients
   * Get Virtual Account Clients (individual or business client).
   * @param clientId __Mandatory__. This must be your master / parent client-id (and not one associated with one of your clients) (required)
   * @param type __Optional__.  Filter clients based on client type. One of BUSINESS or INDIVIDUAL (optional)
   * @param status __Optional__.  Filter clients based on client status. One of ACTIVE, PENDING or SUSPENDED (optional)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiListResponseOfVirtualAccountClient
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfVirtualAccountClient getVirtualAccountClients(UUID clientId, String type, String status, String cursor) throws ApiException {
    return getVirtualAccountClientsWithHttpInfo(clientId, type, status, cursor).getData();
  }

  /**
   * Get List of Virtual Account Clients
   * Get Virtual Account Clients (individual or business client).
   * @param clientId __Mandatory__. This must be your master / parent client-id (and not one associated with one of your clients) (required)
   * @param type __Optional__.  Filter clients based on client type. One of BUSINESS or INDIVIDUAL (optional)
   * @param status __Optional__.  Filter clients based on client status. One of ACTIVE, PENDING or SUSPENDED (optional)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiResponse&lt;ApiListResponseOfVirtualAccountClient&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfVirtualAccountClient> getVirtualAccountClientsWithHttpInfo(UUID clientId, String type, String status, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getVirtualAccountClients");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/clients";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfVirtualAccountClient> localVarReturnType = new GenericType<ApiListResponseOfVirtualAccountClient>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getVirtualAccountClients", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Payments
   * Retrieve a list of virtual account payments
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param accountId __Optional__. Filter payments based on accountId (optional)
   * @param createdDateTimeFrom __Optional__. Filter payments based on the createdDateTime (optional)
   * @param createdDateTimeTo __Optional__. Filter payments based on the createdDateTime (optional)
   * @param status __Optional__. Filter payments based on the payment status. One of INITIATED, PROCESSING, COMPLETED, FAILED (optional)
   * @param type __Optional__. Filter payments based on the payment type. One of PAY_IN, PAY_OUT, RETURN_IN, RETURN_OUT (optional)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiListResponseOfVirtualAccountPayment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfVirtualAccountPayment getVirtualAccountPayments(UUID clientId, String accountId, OffsetDateTime createdDateTimeFrom, OffsetDateTime createdDateTimeTo, List<String> status, List<String> type, String cursor) throws ApiException {
    return getVirtualAccountPaymentsWithHttpInfo(clientId, accountId, createdDateTimeFrom, createdDateTimeTo, status, type, cursor).getData();
  }

  /**
   * Get Payments
   * Retrieve a list of virtual account payments
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param accountId __Optional__. Filter payments based on accountId (optional)
   * @param createdDateTimeFrom __Optional__. Filter payments based on the createdDateTime (optional)
   * @param createdDateTimeTo __Optional__. Filter payments based on the createdDateTime (optional)
   * @param status __Optional__. Filter payments based on the payment status. One of INITIATED, PROCESSING, COMPLETED, FAILED (optional)
   * @param type __Optional__. Filter payments based on the payment type. One of PAY_IN, PAY_OUT, RETURN_IN, RETURN_OUT (optional)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiResponse&lt;ApiListResponseOfVirtualAccountPayment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfVirtualAccountPayment> getVirtualAccountPaymentsWithHttpInfo(UUID clientId, String accountId, OffsetDateTime createdDateTimeFrom, OffsetDateTime createdDateTimeTo, List<String> status, List<String> type, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getVirtualAccountPayments");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/payments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTimeFrom", createdDateTimeFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTimeTo", createdDateTimeTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfVirtualAccountPayment> localVarReturnType = new GenericType<ApiListResponseOfVirtualAccountPayment>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getVirtualAccountPayments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Accounts
   * Retrieve a list of all virtual accounts held
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param nickname __Optional__. Filter accounts based on reference provided in order to help with identification of the account (optional)
   * @param currency __Optional__. Filter accounts based on three-letter ISO 4217 currency code (optional)
   * @param status __Optional__. Filter accounts based on their current state. One of PENDING, ACTIVE, FAILED, SUSPENDED or CLOSED (optional)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiListResponseOfVirtualAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiListResponseOfVirtualAccount getVirtualAccounts(UUID clientId, String nickname, String currency, String status, String cursor) throws ApiException {
    return getVirtualAccountsWithHttpInfo(clientId, nickname, currency, status, cursor).getData();
  }

  /**
   * Get Accounts
   * Retrieve a list of all virtual accounts held
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param nickname __Optional__. Filter accounts based on reference provided in order to help with identification of the account (optional)
   * @param currency __Optional__. Filter accounts based on three-letter ISO 4217 currency code (optional)
   * @param status __Optional__. Filter accounts based on their current state. One of PENDING, ACTIVE, FAILED, SUSPENDED or CLOSED (optional)
   * @param cursor __Optional__. Data required to provide pagination (optional)
   * @return ApiResponse&lt;ApiListResponseOfVirtualAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiListResponseOfVirtualAccount> getVirtualAccountsWithHttpInfo(UUID clientId, String nickname, String currency, String status, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getVirtualAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname", nickname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiListResponseOfVirtualAccount> localVarReturnType = new GenericType<ApiListResponseOfVirtualAccount>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.getVirtualAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Account
   * Update the details of a specific account using its Id
   * @param accountId __Mandatory__. The Id of the account. (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param updateVirtualAccountRequest  (required)
   * @return ApiResponseOfVirtualAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Resource requested is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponseOfVirtualAccount updateVirtualAccountById(String accountId, UUID clientId, UpdateVirtualAccountRequest updateVirtualAccountRequest) throws ApiException {
    return updateVirtualAccountByIdWithHttpInfo(accountId, clientId, updateVirtualAccountRequest).getData();
  }

  /**
   * Update Account
   * Update the details of a specific account using its Id
   * @param accountId __Mandatory__. The Id of the account. (required)
   * @param clientId __Mandatory__. The customer or sub-customer id for which the request will be done (required)
   * @param updateVirtualAccountRequest  (required)
   * @return ApiResponse&lt;ApiResponseOfVirtualAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorised. Credentials are missing or invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. Permission to access this endpoint is not granted. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found. Resource requested is not found. </td><td>  -  </td></tr>
       <tr><td> 424 </td><td> A failure occured during interaction with a third party provider </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApiResponseOfVirtualAccount> updateVirtualAccountByIdWithHttpInfo(String accountId, UUID clientId, UpdateVirtualAccountRequest updateVirtualAccountRequest) throws ApiException {
    Object localVarPostBody = updateVirtualAccountRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateVirtualAccountById");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling updateVirtualAccountById");
    }
    
    // verify the required parameter 'updateVirtualAccountRequest' is set
    if (updateVirtualAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateVirtualAccountRequest' when calling updateVirtualAccountById");
    }
    
    // create path and map variables
    String localVarPath = "/virtual-accounts/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (clientId != null)
      localVarHeaderParams.put("client-id", apiClient.parameterToString(clientId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApiResponseOfVirtualAccount> localVarReturnType = new GenericType<ApiResponseOfVirtualAccount>() {};

    return apiClient.invokeAPI("VirtualAccountsApi.updateVirtualAccountById", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
