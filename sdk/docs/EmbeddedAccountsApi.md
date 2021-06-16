# EmbeddedAccountsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**initiateEmbeddedAccountRequestUsingPOST**](EmbeddedAccountsApi.md#initiateEmbeddedAccountRequestUsingPOST) | **POST** /embedded-account-auth-requests | Initiate a new embedded account request for user to authorize
[**updateEmbeddedAccountRequestUsingPUT**](EmbeddedAccountsApi.md#updateEmbeddedAccountRequestUsingPUT) | **PUT** /embedded-account-auth-requests/{consentId} | Update an embedded account request with SCA info


<a name="initiateEmbeddedAccountRequestUsingPOST"></a>
# **initiateEmbeddedAccountRequestUsingPOST**
> ApiResponseOfAuthorisationEmbeddedRequestResponse initiateEmbeddedAccountRequestUsingPOST(accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Initiate a new embedded account request for user to authorize

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.EmbeddedAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

EmbeddedAccountsApi apiInstance = new EmbeddedAccountsApi();
AccountEmbeddedAuthorisationRequest accountAuthRequest = new AccountEmbeddedAuthorisationRequest(); // AccountEmbeddedAuthorisationRequest | accountAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
try {
    ApiResponseOfAuthorisationEmbeddedRequestResponse result = apiInstance.initiateEmbeddedAccountRequestUsingPOST(accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedAccountsApi#initiateEmbeddedAccountRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAuthRequest** | [**AccountEmbeddedAuthorisationRequest**](AccountEmbeddedAuthorisationRequest.md)| accountAuthRequest |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]

### Return type

[**ApiResponseOfAuthorisationEmbeddedRequestResponse**](ApiResponseOfAuthorisationEmbeddedRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateEmbeddedAccountRequestUsingPUT"></a>
# **updateEmbeddedAccountRequestUsingPUT**
> ApiResponseOfAuthorisationEmbeddedRequestResponse updateEmbeddedAccountRequestUsingPUT(consentId, accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Update an embedded account request with SCA info

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.EmbeddedAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

EmbeddedAccountsApi apiInstance = new EmbeddedAccountsApi();
String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
AccountEmbeddedAuthorisationRequest accountAuthRequest = new AccountEmbeddedAuthorisationRequest(); // AccountEmbeddedAuthorisationRequest | accountAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required.
try {
    ApiResponseOfAuthorisationEmbeddedRequestResponse result = apiInstance.updateEmbeddedAccountRequestUsingPUT(consentId, accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedAccountsApi#updateEmbeddedAccountRequestUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **accountAuthRequest** | [**AccountEmbeddedAuthorisationRequest**](AccountEmbeddedAuthorisationRequest.md)| accountAuthRequest |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/knowledge/psu_identifiers/) to see if this header is required. | [optional]

### Return type

[**ApiResponseOfAuthorisationEmbeddedRequestResponse**](ApiResponseOfAuthorisationEmbeddedRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

