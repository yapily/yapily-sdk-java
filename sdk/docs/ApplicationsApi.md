# ApplicationsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationMeUsingGET**](ApplicationsApi.md#getApplicationMeUsingGET) | **GET** /me | Returns the details of the application that owns the request credentials


<a name="getApplicationMeUsingGET"></a>
# **getApplicationMeUsingGET**
> Application getApplicationMeUsingGET()

Returns the details of the application that owns the request credentials

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationsApi apiInstance = new ApplicationsApi();
try {
    Application result = apiInstance.getApplicationMeUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationsApi#getApplicationMeUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Application**](Application.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

