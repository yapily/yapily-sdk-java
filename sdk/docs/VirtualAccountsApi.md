# VirtualAccountsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVirtualAccount**](VirtualAccountsApi.md#createVirtualAccount) | **POST** /virtual-accounts/accounts | Create Account
[**createVirtualAccountBeneficiary**](VirtualAccountsApi.md#createVirtualAccountBeneficiary) | **POST** /virtual-accounts/beneficiaries | Create Beneficiary
[**createVirtualAccountPayOut**](VirtualAccountsApi.md#createVirtualAccountPayOut) | **POST** /virtual-accounts/payments/pay-outs | Create Pay Out
[**createVirtualAccountTransfer**](VirtualAccountsApi.md#createVirtualAccountTransfer) | **POST** /virtual-accounts/payments/transfers | Create Virtual Account Transfer
[**getPayInDetails**](VirtualAccountsApi.md#getPayInDetails) | **GET** /virtual-accounts/payments/{paymentId}/pay-in-details | Get Pay-In Details
[**getPaymentsById**](VirtualAccountsApi.md#getPaymentsById) | **GET** /virtual-accounts/payments/{id} | Get Payment
[**getVirtualAccountBeneficiaries**](VirtualAccountsApi.md#getVirtualAccountBeneficiaries) | **GET** /virtual-accounts/beneficiaries | Get List Of Beneficiaries
[**getVirtualAccountBeneficiary**](VirtualAccountsApi.md#getVirtualAccountBeneficiary) | **GET** /virtual-accounts/beneficiaries/{beneficiaryId} | Get Beneficiary
[**getVirtualAccountById**](VirtualAccountsApi.md#getVirtualAccountById) | **GET** /virtual-accounts/accounts/{accountId} | Get Account
[**getVirtualAccountPayments**](VirtualAccountsApi.md#getVirtualAccountPayments) | **GET** /virtual-accounts/payments | Get Payments
[**getVirtualAccounts**](VirtualAccountsApi.md#getVirtualAccounts) | **GET** /virtual-accounts/accounts | Get Accounts



## createVirtualAccount

> ApiResponseOfVirtualAccount createVirtualAccount(clientId, virtualAccountRequest)

Create Account

Create a new virtual account

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        VirtualAccountRequest virtualAccountRequest = new VirtualAccountRequest(); // VirtualAccountRequest | 
        try {
            ApiResponseOfVirtualAccount result = apiInstance.createVirtualAccount(clientId, virtualAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#createVirtualAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **virtualAccountRequest** | [**VirtualAccountRequest**](VirtualAccountRequest.md)|  |

### Return type

[**ApiResponseOfVirtualAccount**](ApiResponseOfVirtualAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## createVirtualAccountBeneficiary

> ApiResponseOfVirtualAccountBeneficiary createVirtualAccountBeneficiary(clientId, virtualAccountBeneficiaryRequest)

Create Beneficiary

Create a new beneficiary (individual or business account) to which a Pay Out can be made. The beneficiary can be used from any virtual account that is held

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        VirtualAccountBeneficiaryRequest virtualAccountBeneficiaryRequest = new VirtualAccountBeneficiaryRequest(); // VirtualAccountBeneficiaryRequest | 
        try {
            ApiResponseOfVirtualAccountBeneficiary result = apiInstance.createVirtualAccountBeneficiary(clientId, virtualAccountBeneficiaryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#createVirtualAccountBeneficiary");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **virtualAccountBeneficiaryRequest** | [**VirtualAccountBeneficiaryRequest**](VirtualAccountBeneficiaryRequest.md)|  |

### Return type

[**ApiResponseOfVirtualAccountBeneficiary**](ApiResponseOfVirtualAccountBeneficiary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## createVirtualAccountPayOut

> ApiResponseOfVirtualAccountPayment createVirtualAccountPayOut(idempotencyKey, clientId, virtualAccountPayOutRequest)

Create Pay Out

Initiate a payment from a specified virtual account to a previously added beneficiary using any of the schemes that it supports <br> When subscribed to virtualAccount.payOut.status notifications, further updates on payment processing status will be develivered asynchronously 

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        String idempotencyKey = "a346fe67-1d81-4ccd-8409-bf9d6c07980f"; // String | Uniquely identifies a request, such that requests made with a same value are considered retries <br> We recommend that a v4 UUID is supplied 
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        VirtualAccountPayOutRequest virtualAccountPayOutRequest = new VirtualAccountPayOutRequest(); // VirtualAccountPayOutRequest | 
        try {
            ApiResponseOfVirtualAccountPayment result = apiInstance.createVirtualAccountPayOut(idempotencyKey, clientId, virtualAccountPayOutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#createVirtualAccountPayOut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **String**| Uniquely identifies a request, such that requests made with a same value are considered retries &lt;br&gt; We recommend that a v4 UUID is supplied  |
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **virtualAccountPayOutRequest** | [**VirtualAccountPayOutRequest**](VirtualAccountPayOutRequest.md)|  |

### Return type

[**ApiResponseOfVirtualAccountPayment**](ApiResponseOfVirtualAccountPayment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## createVirtualAccountTransfer

> ApiResponseOfVirtualAccountPayment createVirtualAccountTransfer(idempotencyKey, clientId, virtualAccountTransferRequest)

Create Virtual Account Transfer

Create a transfer between two virtual accounts

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        String idempotencyKey = "a346fe67-1d81-4ccd-8409-bf9d6c07980f"; // String | Uniquely identifies a request, such that requests made with a same value are considered retries <br> We recommend that a v4 UUID is supplied 
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        VirtualAccountTransferRequest virtualAccountTransferRequest = new VirtualAccountTransferRequest(); // VirtualAccountTransferRequest | 
        try {
            ApiResponseOfVirtualAccountPayment result = apiInstance.createVirtualAccountTransfer(idempotencyKey, clientId, virtualAccountTransferRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#createVirtualAccountTransfer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **String**| Uniquely identifies a request, such that requests made with a same value are considered retries &lt;br&gt; We recommend that a v4 UUID is supplied  |
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **virtualAccountTransferRequest** | [**VirtualAccountTransferRequest**](VirtualAccountTransferRequest.md)|  |

### Return type

[**ApiResponseOfVirtualAccountPayment**](ApiResponseOfVirtualAccountPayment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getPayInDetails

> ApiResponseOfVirtualAccountPayInDetails getPayInDetails(paymentId)

Get Pay-In Details

Get the details of a pay-in transaction

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        String paymentId = "8b66abb5-5412-4454-aa7b-4e693ada6321"; // String | Uniquely identifies a transaction
        try {
            ApiResponseOfVirtualAccountPayInDetails result = apiInstance.getPayInDetails(paymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getPayInDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| Uniquely identifies a transaction |

### Return type

[**ApiResponseOfVirtualAccountPayInDetails**](ApiResponseOfVirtualAccountPayInDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **404** | Not Found. Requested beneficiary is not found. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getPaymentsById

> ApiResponseOfVirtualAccountPayment getPaymentsById(id, clientId)

Get Payment

Get the details of a specific payment using its Id

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        String id = "id_example"; // String | __Mandatory__. The id of the payment
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        try {
            ApiResponseOfVirtualAccountPayment result = apiInstance.getPaymentsById(id, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getPaymentsById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| __Mandatory__. The id of the payment |
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |

### Return type

[**ApiResponseOfVirtualAccountPayment**](ApiResponseOfVirtualAccountPayment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **404** | Not Found. Requested payment is not found. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getVirtualAccountBeneficiaries

> ApiListResponseOfVirtualAccountBeneficiary getVirtualAccountBeneficiaries(clientId, cursor)

Get List Of Beneficiaries

Gets the list of beneficiaries (individual or business account) to which a Pay Out can be made.

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        String cursor = "cursor_example"; // String | __Optional__. Data required to provide pagination
        try {
            ApiListResponseOfVirtualAccountBeneficiary result = apiInstance.getVirtualAccountBeneficiaries(clientId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getVirtualAccountBeneficiaries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **cursor** | **String**| __Optional__. Data required to provide pagination | [optional]

### Return type

[**ApiListResponseOfVirtualAccountBeneficiary**](ApiListResponseOfVirtualAccountBeneficiary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getVirtualAccountBeneficiary

> ApiResponseOfVirtualAccountBeneficiary getVirtualAccountBeneficiary(beneficiaryId, clientId)

Get Beneficiary

Get the details of a specific beneficiary (individual or business account) to which a Pay Out can be made from its id.

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        String beneficiaryId = "beneficiaryId_example"; // String | __Mandatory__. The Id of the requested beneficiary.
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        try {
            ApiResponseOfVirtualAccountBeneficiary result = apiInstance.getVirtualAccountBeneficiary(beneficiaryId, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getVirtualAccountBeneficiary");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiaryId** | **String**| __Mandatory__. The Id of the requested beneficiary. |
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |

### Return type

[**ApiResponseOfVirtualAccountBeneficiary**](ApiResponseOfVirtualAccountBeneficiary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **404** | Not Found. Requested beneficiary is not found. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getVirtualAccountById

> ApiResponseOfVirtualAccount getVirtualAccountById(accountId, clientId)

Get Account

Get the details of a specific account using its Id

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The Id of the account.
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        try {
            ApiResponseOfVirtualAccount result = apiInstance.getVirtualAccountById(accountId, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getVirtualAccountById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| __Mandatory__. The Id of the account. |
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |

### Return type

[**ApiResponseOfVirtualAccount**](ApiResponseOfVirtualAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **404** | Not Found. Resource requested is not found. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getVirtualAccountPayments

> ApiListResponseOfVirtualAccountPayment getVirtualAccountPayments(clientId, accountId, createdDateTimeFrom, createdDateTimeTo, status, type, cursor)

Get Payments

Retrieve a list of virtual account payments

### Example

```java
import java.time.OffsetDateTime;
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        String accountId = "eb2ad083-a111-4143-8756-a3a3cef4031c"; // String | __Optional__. Filter payments based on accountId
        OffsetDateTime createdDateTimeFrom = OffsetDateTime.parse("2020-04-24T00:30:19.951Z"); // OffsetDateTime | __Optional__. Filter payments based on the createdDateTime
        OffsetDateTime createdDateTimeTo = OffsetDateTime.parse("2020-04-24T00:30:19.951Z"); // OffsetDateTime | __Optional__. Filter payments based on the createdDateTime
        List<String> status = Arrays.asList(); // List<String> | __Optional__. Filter payments based on the payment status. One of INITIATED, PROCESSING, COMPLETED, FAILED
        List<String> type = Arrays.asList(); // List<String> | __Optional__. Filter payments based on the payment type. One of PAY_IN, PAY_OUT, RETURN_IN, RETURN_OUT
        String cursor = "cursor_example"; // String | __Optional__. Data required to provide pagination
        try {
            ApiListResponseOfVirtualAccountPayment result = apiInstance.getVirtualAccountPayments(clientId, accountId, createdDateTimeFrom, createdDateTimeTo, status, type, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getVirtualAccountPayments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **accountId** | **String**| __Optional__. Filter payments based on accountId | [optional]
 **createdDateTimeFrom** | **OffsetDateTime**| __Optional__. Filter payments based on the createdDateTime | [optional]
 **createdDateTimeTo** | **OffsetDateTime**| __Optional__. Filter payments based on the createdDateTime | [optional]
 **status** | **List&lt;String&gt;**| __Optional__. Filter payments based on the payment status. One of INITIATED, PROCESSING, COMPLETED, FAILED | [optional]
 **type** | **List&lt;String&gt;**| __Optional__. Filter payments based on the payment type. One of PAY_IN, PAY_OUT, RETURN_IN, RETURN_OUT | [optional]
 **cursor** | **String**| __Optional__. Data required to provide pagination | [optional]

### Return type

[**ApiListResponseOfVirtualAccountPayment**](ApiListResponseOfVirtualAccountPayment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |


## getVirtualAccounts

> ApiListResponseOfVirtualAccount getVirtualAccounts(clientId, nickname, currency, status, cursor)

Get Accounts

Retrieve a list of all virtual accounts held

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VirtualAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VirtualAccountsApi apiInstance = new VirtualAccountsApi(defaultClient);
        UUID clientId = UUID.fromString("5a7294ab-6b7d-4681-835a-f9b9775c75db"); // UUID | __Mandatory__. The customer or sub-customer id for which the request will be done
        String nickname = "nickname_example"; // String | __Optional__. Filter accounts based on reference provided in order to help with identification of the account
        String currency = "currency_example"; // String | __Optional__. Filter accounts based on three-letter ISO 4217 currency code
        String status = "status_example"; // String | __Optional__. Filter accounts based on their current state. One of PENDING, ACTIVE, FAILED, SUSPENDED or CLOSED
        String cursor = "cursor_example"; // String | __Optional__. Data required to provide pagination
        try {
            ApiListResponseOfVirtualAccount result = apiInstance.getVirtualAccounts(clientId, nickname, currency, status, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualAccountsApi#getVirtualAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **UUID**| __Mandatory__. The customer or sub-customer id for which the request will be done |
 **nickname** | **String**| __Optional__. Filter accounts based on reference provided in order to help with identification of the account | [optional]
 **currency** | **String**| __Optional__. Filter accounts based on three-letter ISO 4217 currency code | [optional]
 **status** | **String**| __Optional__. Filter accounts based on their current state. One of PENDING, ACTIVE, FAILED, SUSPENDED or CLOSED | [optional]
 **cursor** | **String**| __Optional__. Data required to provide pagination | [optional]

### Return type

[**ApiListResponseOfVirtualAccount**](ApiListResponseOfVirtualAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised. Credentials are missing or invalid |  -  |
| **403** | Forbidden. Permission to access this endpoint is not granted. |  -  |
| **424** | A failure occured during interaction with a third party provider |  -  |
| **500** | Unexpected Error |  -  |

