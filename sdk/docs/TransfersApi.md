# TransfersApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferUsingPUT**](TransfersApi.md#transferUsingPUT) | **PUT** /accounts/{accountId}/transfer | Transfer money from one account to another account accessible with the same consent


<a name="transferUsingPUT"></a>
# **transferUsingPUT**
> ApiResponseOfTransferResponse transferUsingPUT(consent, accountId, xYapilyApiVersion, transferRequest)

Transfer money from one account to another account accessible with the same consent

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.TransfersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

TransfersApi apiInstance = new TransfersApi();
String consent = "consent_example"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
TransferRequest transferRequest = new TransferRequest(); // TransferRequest | transferRequest
try {
    ApiResponseOfTransferResponse result = apiInstance.transferUsingPUT(consent, accountId, xYapilyApiVersion, transferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransfersApi#transferUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **transferRequest** | [**TransferRequest**](TransferRequest.md)| transferRequest | [optional]

### Return type

[**ApiResponseOfTransferResponse**](ApiResponseOfTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

