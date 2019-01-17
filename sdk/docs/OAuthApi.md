# OAuthApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OAuthApi.md#oauthToken) | **POST** /oauth/token | Retrieve Access Token


<a name="oauthToken"></a>
# **oauthToken**
> YapilyAccessToken oauthToken(grantType)

Retrieve Access Token

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OAuthApi apiInstance = new OAuthApi();
Object grantType = client_credentials; // Object | Grant type
try {
    YapilyAccessToken result = apiInstance.oauthToken(grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**Object**](.md)| Grant type | [default to client_credentials]

### Return type

[**YapilyAccessToken**](YapilyAccessToken.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

