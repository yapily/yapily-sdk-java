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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
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
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]

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
String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
PaymentEmbeddedAuthorisationRequest paymentAuthRequest = new PaymentEmbeddedAuthorisationRequest(); // PaymentEmbeddedAuthorisationRequest | paymentAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
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
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **paymentAuthRequest** | [**PaymentEmbeddedAuthorisationRequest**](PaymentEmbeddedAuthorisationRequest.md)| paymentAuthRequest |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

