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
String consent = "consent_example"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
String statementId = "statementId_example"; // String | __Mandatory__. The statement Id of the statement file.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **statementId** | **String**| __Mandatory__. The statement Id of the statement file. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String consent = "consent_example"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
String statementId = "statementId_example"; // String | __Mandatory__. The statement Id of the statement file.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **statementId** | **String**| __Mandatory__. The statement Id of the statement file. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String consent = "consent_example"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
String from = "from_example"; // String | __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ). 
String before = "before_example"; // String | __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ).
Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
String sort = "sort_example"; // String | __Optional__. Sort transaction records by date ascending with 'date' or descending with '-date'. The default sort order is descending
Integer offset = 56; // Integer | __Optional__. The number of transaction records to be skipped. Used primarily with paginated results.
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
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **from** | **String**| __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  | [optional]
 **before** | **String**| __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). | [optional]
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **sort** | **String**| __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending | [optional] [enum: date, -date]
 **offset** | **Integer**| __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. | [optional]

### Return type

[**ApiListResponseOfAccountStatement**](ApiListResponseOfAccountStatement.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

