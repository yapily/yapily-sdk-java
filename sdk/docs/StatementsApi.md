# StatementsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatementFileUsingGET**](StatementsApi.md#getStatementFileUsingGET) | **GET** /accounts/{accountId}/statements/{statementId}/file | Get account statement file
[**getStatementUsingGET**](StatementsApi.md#getStatementUsingGET) | **GET** /accounts/{accountId}/statements/{statementId} | Get account statement
[**getStatementsUsingGET**](StatementsApi.md#getStatementsUsingGET) | **GET** /accounts/{accountId}/statements | Get account statements


<a name="getStatementFileUsingGET"></a>
# **getStatementFileUsingGET**
> String getStatementFileUsingGET(consent, accountId, statementId, xYapilyApiVersion)

Get account statement file

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.StatementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

StatementsApi apiInstance = new StatementsApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | Account Id
String statementId = "statementId_example"; // String | Statement Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    String result = apiInstance.getStatementFileUsingGET(consent, accountId, statementId, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatementsApi#getStatementFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountId** | **String**| Account Id |
 **statementId** | **String**| Statement Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getStatementUsingGET"></a>
# **getStatementUsingGET**
> ApiResponseOfAccountStatement getStatementUsingGET(consent, accountId, statementId, xYapilyApiVersion)

Get account statement

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.StatementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

StatementsApi apiInstance = new StatementsApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | Account Id
String statementId = "statementId_example"; // String | Statement Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    ApiResponseOfAccountStatement result = apiInstance.getStatementUsingGET(consent, accountId, statementId, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatementsApi#getStatementUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountId** | **String**| Account Id |
 **statementId** | **String**| Statement Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**ApiResponseOfAccountStatement**](ApiResponseOfAccountStatement.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getStatementsUsingGET"></a>
# **getStatementsUsingGET**
> ApiListResponseOfAccountStatement getStatementsUsingGET(consent, accountId, xYapilyApiVersion, from, before, limit, sort, offset)

Get account statements

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.StatementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

StatementsApi apiInstance = new StatementsApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | Account Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String from = "from_example"; // String | from
String before = "before_example"; // String | before
Integer limit = 56; // Integer | limit
String sort = "sort_example"; // String | sort
Integer offset = 56; // Integer | offset
try {
    ApiListResponseOfAccountStatement result = apiInstance.getStatementsUsingGET(consent, accountId, xYapilyApiVersion, from, before, limit, sort, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatementsApi#getStatementsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountId** | **String**| Account Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **from** | **String**| from | [optional]
 **before** | **String**| before | [optional]
 **limit** | **Integer**| limit | [optional]
 **sort** | **String**| sort | [optional] [enum: date, -date]
 **offset** | **Integer**| offset | [optional]

### Return type

[**ApiListResponseOfAccountStatement**](ApiListResponseOfAccountStatement.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

