# PaymentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentInitiationUsingPOST**](PaymentsApi.md#createPaymentInitiationUsingPOST) | **POST** /initiate-payment-sortcode | Initiate a new single payment for user to authorise
[**createPaymentUsingPOST**](PaymentsApi.md#createPaymentUsingPOST) | **POST** /payment-sortcode | Create a new single payment
[**getPaymentInitiationStatusUsingGET**](PaymentsApi.md#getPaymentInitiationStatusUsingGET) | **GET** /payment-initiations/{paymentId} | Get status of a payment initiation
[**getPaymentStatusUsingGET**](PaymentsApi.md#getPaymentStatusUsingGET) | **GET** /payments/{paymentId} | Get status of a payment


<a name="createPaymentInitiationUsingPOST"></a>
# **createPaymentInitiationUsingPOST**
> ApiResponseOfPaymentResponse createPaymentInitiationUsingPOST(institution, paymentRequest, userUuid, paramCallback)

Initiate a new single payment for user to authorise

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PaymentsApi apiInstance = new PaymentsApi();
String institution = "institution_example"; // String | institution
SortCodePaymentRequest paymentRequest = new SortCodePaymentRequest(); // SortCodePaymentRequest | paymentRequest
String userUuid = "userUuid_example"; // String | user-uuid
String paramCallback = "paramCallback_example"; // String | callback
try {
    ApiResponseOfPaymentResponse result = apiInstance.createPaymentInitiationUsingPOST(institution, paymentRequest, userUuid, paramCallback);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentInitiationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institution** | **String**| institution |
 **paymentRequest** | [**SortCodePaymentRequest**](SortCodePaymentRequest.md)| paymentRequest | [optional]
 **userUuid** | **String**| user-uuid | [optional]
 **paramCallback** | **String**| callback | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createPaymentUsingPOST"></a>
# **createPaymentUsingPOST**
> ApiResponseOfPaymentResponse createPaymentUsingPOST(consent, paymentRequest)

Create a new single payment

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PaymentsApi apiInstance = new PaymentsApi();
String consent = "consent_example"; // String | Consent Token
SortCodePaymentRequest paymentRequest = new SortCodePaymentRequest(); // SortCodePaymentRequest | paymentRequest
try {
    ApiResponseOfPaymentResponse result = apiInstance.createPaymentUsingPOST(consent, paymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **paymentRequest** | [**SortCodePaymentRequest**](SortCodePaymentRequest.md)| paymentRequest | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getPaymentInitiationStatusUsingGET"></a>
# **getPaymentInitiationStatusUsingGET**
> ApiResponseOfPaymentResponse getPaymentInitiationStatusUsingGET(institution, paymentId)

Get status of a payment initiation

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PaymentsApi apiInstance = new PaymentsApi();
String institution = "institution_example"; // String | institution
String paymentId = "paymentId_example"; // String | paymentId
try {
    ApiResponseOfPaymentResponse result = apiInstance.getPaymentInitiationStatusUsingGET(institution, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentInitiationStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institution** | **String**| institution |
 **paymentId** | **String**| paymentId |

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getPaymentStatusUsingGET"></a>
# **getPaymentStatusUsingGET**
> ApiResponseOfPaymentResponse getPaymentStatusUsingGET(paymentId, consent)

Get status of a payment

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PaymentsApi apiInstance = new PaymentsApi();
String paymentId = "paymentId_example"; // String | paymentId
String consent = "consent_example"; // String | Consent Token
try {
    ApiResponseOfPaymentResponse result = apiInstance.getPaymentStatusUsingGET(paymentId, consent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| paymentId |
 **consent** | **String**| Consent Token |

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

