# CategoriesApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoriesUsingGET**](CategoriesApi.md#getCategoriesUsingGET) | **GET** /categories/{country} | Retrieves a list of categories returned by the Yapily Categorisation engine for a given locale


<a name="getCategoriesUsingGET"></a>
# **getCategoriesUsingGET**
> ApiListResponseOfCategory getCategoriesUsingGET(country, xYapilyApiVersion)

Retrieves a list of categories returned by the Yapily Categorisation engine for a given locale

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

CategoriesApi apiInstance = new CategoriesApi();
String country = "country_example"; // String | __Mandatory__. The 2 letter country code e.g. 'GB'.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    ApiListResponseOfCategory result = apiInstance.getCategoriesUsingGET(country, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| __Mandatory__. The 2 letter country code e.g. &#39;GB&#39;. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**ApiListResponseOfCategory**](ApiListResponseOfCategory.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

