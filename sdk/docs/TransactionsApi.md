# TransactionsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionsUsingGET**](TransactionsApi.md#getTransactionsUsingGET) | **GET** /accounts/{accountId}/transactions | Get account transactions


<a name="getTransactionsUsingGET"></a>
# **getTransactionsUsingGET**
> ApiListResponseOfTransaction getTransactionsUsingGET(consent, accountId, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress, with, from, before, limit, sort, offset, cursor)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

TransactionsApi apiInstance = new TransactionsApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | Account Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
List<String> with = Arrays.asList("with_example"); // List<String> | with
String from = "from_example"; // String | from
String before = "before_example"; // String | before
Integer limit = 56; // Integer | limit
String sort = "sort_example"; // String | sort
Integer offset = 56; // Integer | offset
String cursor = "cursor_example"; // String | cursor
try {
    ApiListResponseOfTransaction result = apiInstance.getTransactionsUsingGET(consent, accountId, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress, with, from, before, limit, sort, offset, cursor);
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
 **accountId** | **String**| Account Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]
 **with** | [**List&lt;String&gt;**](String.md)| with | [optional]
 **from** | **String**| from | [optional]
 **before** | **String**| before | [optional]
 **limit** | **Integer**| limit | [optional]
 **sort** | **String**| sort | [optional] [enum: date, -date]
 **offset** | **Integer**| offset | [optional]
 **cursor** | **String**| cursor | [optional]

### Return type

[**ApiListResponseOfTransaction**](ApiListResponseOfTransaction.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

