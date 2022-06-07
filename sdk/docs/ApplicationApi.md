# ApplicationApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationMe**](ApplicationApi.md#getApplicationMe) | **GET** /me | Get Application Self



## getApplicationMe

> Application getApplicationMe()

Get Application Self

Get the information about the institutions configured in your application

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        try {
            Application result = apiInstance.getApplicationMe();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#getApplicationMe");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Application**](Application.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |

