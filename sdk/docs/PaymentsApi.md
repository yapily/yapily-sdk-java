# PaymentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkPaymentAuthorisationUsingPOST**](PaymentsApi.md#createBulkPaymentAuthorisationUsingPOST) | **POST** /bulk-payment-auth-requests | Initiate bulk payment for user to authorise
[**createBulkPaymentUsingPOST**](PaymentsApi.md#createBulkPaymentUsingPOST) | **POST** /bulk-payments | Create bulk payment
[**createPaymentAuthorisationUsingPOST**](PaymentsApi.md#createPaymentAuthorisationUsingPOST) | **POST** /payment-auth-requests | Initiate a payment for user to authorise
[**createPaymentAuthorisationWithSortCodeUsingPOST**](PaymentsApi.md#createPaymentAuthorisationWithSortCodeUsingPOST) | **POST** /payment-sortcode-auth-requests | Initiate a new single payment for user to authorise
[**createPaymentUsingPOST**](PaymentsApi.md#createPaymentUsingPOST) | **POST** /payments | Create a payment
[**createPaymentWithSortCodeUsingPOST**](PaymentsApi.md#createPaymentWithSortCodeUsingPOST) | **POST** /payment-sortcode | Create a new single payment
[**getPaymentStatusUsingGET**](PaymentsApi.md#getPaymentStatusUsingGET) | **GET** /payments/{paymentId} | Get status of a payment
[**getPaymentsUsingGET**](PaymentsApi.md#getPaymentsUsingGET) | **GET** /payments/{paymentId}/details | Get payments detail
[**updatePaymentAuthorisationUsingPUT**](PaymentsApi.md#updatePaymentAuthorisationUsingPUT) | **PUT** /payment-auth-requests | Update pre authorize consent for user to authorise payment


<a name="createBulkPaymentAuthorisationUsingPOST"></a>
# **createBulkPaymentAuthorisationUsingPOST**
> ApiResponseOfPaymentAuthorisationRequestResponse createBulkPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Initiate bulk payment for user to authorise

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
BulkPaymentAuthorisationRequest paymentAuthRequest = new BulkPaymentAuthorisationRequest(); // BulkPaymentAuthorisationRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentAuthorisationRequestResponse result = apiInstance.createBulkPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createBulkPaymentAuthorisationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAuthRequest** | [**BulkPaymentAuthorisationRequest**](BulkPaymentAuthorisationRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentAuthorisationRequestResponse**](ApiResponseOfPaymentAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createBulkPaymentUsingPOST"></a>
# **createBulkPaymentUsingPOST**
> ApiResponseOfPaymentResponse createBulkPaymentUsingPOST(consent, paymentRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Create bulk payment

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String consent = "consent_example"; // String | Consent Token
BulkPaymentRequest paymentRequest = new BulkPaymentRequest(); // BulkPaymentRequest | paymentRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentResponse result = apiInstance.createBulkPaymentUsingPOST(consent, paymentRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createBulkPaymentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **paymentRequest** | [**BulkPaymentRequest**](BulkPaymentRequest.md)| paymentRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createPaymentAuthorisationUsingPOST"></a>
# **createPaymentAuthorisationUsingPOST**
> ApiResponseOfPaymentAuthorisationRequestResponse createPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Initiate a payment for user to authorise

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
PaymentAuthorisationRequest paymentAuthRequest = new PaymentAuthorisationRequest(); // PaymentAuthorisationRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentAuthorisationRequestResponse result = apiInstance.createPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentAuthorisationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAuthRequest** | [**PaymentAuthorisationRequest**](PaymentAuthorisationRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentAuthorisationRequestResponse**](ApiResponseOfPaymentAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createPaymentAuthorisationWithSortCodeUsingPOST"></a>
# **createPaymentAuthorisationWithSortCodeUsingPOST**
> ApiResponseOfAuthorisationRequestResponse createPaymentAuthorisationWithSortCodeUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
SortCodePaymentAuthRequest paymentAuthRequest = new SortCodePaymentAuthRequest(); // SortCodePaymentAuthRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.createPaymentAuthorisationWithSortCodeUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentAuthorisationWithSortCodeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAuthRequest** | [**SortCodePaymentAuthRequest**](SortCodePaymentAuthRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createPaymentUsingPOST"></a>
# **createPaymentUsingPOST**
> ApiResponseOfPaymentResponse createPaymentUsingPOST(consent, paymentRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Create a payment

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String consent = "consent_example"; // String | Consent Token
PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | paymentRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentResponse result = apiInstance.createPaymentUsingPOST(consent, paymentRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
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
 **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)| paymentRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createPaymentWithSortCodeUsingPOST"></a>
# **createPaymentWithSortCodeUsingPOST**
> ApiResponseOfPaymentResponse createPaymentWithSortCodeUsingPOST(consent, paymentRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String consent = "consent_example"; // String | Consent Token
SortCodePaymentRequest paymentRequest = new SortCodePaymentRequest(); // SortCodePaymentRequest | paymentRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentResponse result = apiInstance.createPaymentWithSortCodeUsingPOST(consent, paymentRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentWithSortCodeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **paymentRequest** | [**SortCodePaymentRequest**](SortCodePaymentRequest.md)| paymentRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getPaymentStatusUsingGET"></a>
# **getPaymentStatusUsingGET**
> ApiResponseOfPaymentResponse getPaymentStatusUsingGET(paymentId, consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String paymentId = "paymentId_example"; // String | Payment Id
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentResponse result = apiInstance.getPaymentStatusUsingGET(paymentId, consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| Payment Id |
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getPaymentsUsingGET"></a>
# **getPaymentsUsingGET**
> ApiResponseOfPaymentResponses getPaymentsUsingGET(paymentId, consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Get payments detail

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String paymentId = "paymentId_example"; // String | Payment Id
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentResponses result = apiInstance.getPaymentsUsingGET(paymentId, consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| Payment Id |
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentResponses**](ApiResponseOfPaymentResponses.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updatePaymentAuthorisationUsingPUT"></a>
# **updatePaymentAuthorisationUsingPUT**
> ApiResponseOfPaymentAuthorisationRequestResponse updatePaymentAuthorisationUsingPUT(consent, paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Update pre authorize consent for user to authorise payment

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String consent = "consent_example"; // String | Consent Token
PaymentAuthorisationRequest paymentAuthRequest = new PaymentAuthorisationRequest(); // PaymentAuthorisationRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentAuthorisationRequestResponse result = apiInstance.updatePaymentAuthorisationUsingPUT(consent, paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#updatePaymentAuthorisationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **paymentAuthRequest** | [**PaymentAuthorisationRequest**](PaymentAuthorisationRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentAuthorisationRequestResponse**](ApiResponseOfPaymentAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

