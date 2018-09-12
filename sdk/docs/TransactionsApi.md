# TransactionsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionsUsingGET**](TransactionsApi.md#getTransactionsUsingGET) | **GET** /accounts/{accountId}/transactions | Get account transactions


<a name="getTransactionsUsingGET"></a>
# **getTransactionsUsingGET**
> ApiListResponseOfTransaction getTransactionsUsingGET(consent, accountId, with)

Get account transactions

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TransactionsApi apiInstance = new TransactionsApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | accountId
List<String> with = Arrays.asList("with_example"); // List<String> | with
try {
    ApiListResponseOfTransaction result = apiInstance.getTransactionsUsingGET(consent, accountId, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountId** | **String**| accountId |
 **with** | [**List&lt;String&gt;**](String.md)| with | [optional]

### Return type

[**ApiListResponseOfTransaction**](ApiListResponseOfTransaction.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

