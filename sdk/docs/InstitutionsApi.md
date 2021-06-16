# InstitutionsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeatureDetailsUsingGET**](InstitutionsApi.md#getFeatureDetailsUsingGET) | **GET** /features | Retrieve details for Yapily&#39;s institution features
[**getInstitutionUsingGET**](InstitutionsApi.md#getInstitutionUsingGET) | **GET** /institutions/{institutionId} | Retrieves details of a specific institution available in Yapily
[**getInstitutionsUsingGET**](InstitutionsApi.md#getInstitutionsUsingGET) | **GET** /institutions | Retrieves the list of institutions available in Yapily


<a name="getFeatureDetailsUsingGET"></a>
# **getFeatureDetailsUsingGET**
> ApiListResponseOfFeatureDetails getFeatureDetailsUsingGET(xYapilyApiVersion)

Retrieve details for Yapily&#39;s institution features

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

InstitutionsApi apiInstance = new InstitutionsApi();
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    ApiListResponseOfFeatureDetails result = apiInstance.getFeatureDetailsUsingGET(xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getFeatureDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**ApiListResponseOfFeatureDetails**](ApiListResponseOfFeatureDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getInstitutionUsingGET"></a>
# **getInstitutionUsingGET**
> Institution getInstitutionUsingGET(institutionId, xYapilyApiVersion)

Retrieves details of a specific institution available in Yapily

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

InstitutionsApi apiInstance = new InstitutionsApi();
String institutionId = "institutionId_example"; // String | __Mandatory__. The Yapily institution Id for the `Institution`.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    Institution result = apiInstance.getInstitutionUsingGET(institutionId, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getInstitutionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionId** | **String**| __Mandatory__. The Yapily institution Id for the &#x60;Institution&#x60;. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**Institution**](Institution.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getInstitutionsUsingGET"></a>
# **getInstitutionsUsingGET**
> ApiListResponseOfInstitution getInstitutionsUsingGET(xYapilyApiVersion)

Retrieves the list of institutions available in Yapily

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

InstitutionsApi apiInstance = new InstitutionsApi();
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    ApiListResponseOfInstitution result = apiInstance.getInstitutionsUsingGET(xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getInstitutionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**ApiListResponseOfInstitution**](ApiListResponseOfInstitution.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

