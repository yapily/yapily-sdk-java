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
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | Account Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
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
 **consent** | **String**| Consent Token |
 **accountId** | **String**| Account Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **transferRequest** | [**TransferRequest**](TransferRequest.md)| transferRequest | [optional]

### Return type

[**ApiResponseOfTransferResponse**](ApiResponseOfTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

