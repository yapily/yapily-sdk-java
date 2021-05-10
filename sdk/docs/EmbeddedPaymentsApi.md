# EmbeddedPaymentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbeddedPaymentAuthorisationUsingPOST**](EmbeddedPaymentsApi.md#createEmbeddedPaymentAuthorisationUsingPOST) | **POST** /embedded-payment-auth-requests | Initiate an embedded payment for user to authorise
[**updateEmbeddedPaymentAuthorisationUsingPUT**](EmbeddedPaymentsApi.md#updateEmbeddedPaymentAuthorisationUsingPUT) | **PUT** /embedded-payment-auth-requests/{consentId} | Update an embedded payment initiation with SCA info


<a name="createEmbeddedPaymentAuthorisationUsingPOST"></a>
# **createEmbeddedPaymentAuthorisationUsingPOST**
> ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Initiate an embedded payment for user to authorise

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.EmbeddedPaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

EmbeddedPaymentsApi apiInstance = new EmbeddedPaymentsApi();
PaymentEmbeddedAuthorisationRequest paymentAuthRequest = new PaymentEmbeddedAuthorisationRequest(); // PaymentEmbeddedAuthorisationRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse result = apiInstance.createEmbeddedPaymentAuthorisationUsingPOST(paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedPaymentsApi#createEmbeddedPaymentAuthorisationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAuthRequest** | [**PaymentEmbeddedAuthorisationRequest**](PaymentEmbeddedAuthorisationRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateEmbeddedPaymentAuthorisationUsingPUT"></a>
# **updateEmbeddedPaymentAuthorisationUsingPUT**
> ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedPaymentAuthorisationUsingPUT(consentId, paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Update an embedded payment initiation with SCA info

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.EmbeddedPaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

EmbeddedPaymentsApi apiInstance = new EmbeddedPaymentsApi();
String consentId = "consentId_example"; // String | Consent Id
PaymentEmbeddedAuthorisationRequest paymentAuthRequest = new PaymentEmbeddedAuthorisationRequest(); // PaymentEmbeddedAuthorisationRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse result = apiInstance.updateEmbeddedPaymentAuthorisationUsingPUT(consentId, paymentAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedPaymentsApi#updateEmbeddedPaymentAuthorisationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| Consent Id |
 **paymentAuthRequest** | [**PaymentEmbeddedAuthorisationRequest**](PaymentEmbeddedAuthorisationRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

