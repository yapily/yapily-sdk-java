# BalancesApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountBalancesUsingGET**](BalancesApi.md#getAccountBalancesUsingGET) | **GET** /accounts/{accountId}/balances | Get account balances


<a name="getAccountBalancesUsingGET"></a>
# **getAccountBalancesUsingGET**
> ApiResponseOfBalances getAccountBalancesUsingGET(consent, accountId)

Get account balances

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.BalancesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

BalancesApi apiInstance = new BalancesApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | accountId
try {
    ApiResponseOfBalances result = apiInstance.getAccountBalancesUsingGET(consent, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalancesApi#getAccountBalancesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountId** | **String**| accountId |

### Return type

[**ApiResponseOfBalances**](ApiResponseOfBalances.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

