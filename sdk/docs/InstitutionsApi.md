# InstitutionsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeatureDetails**](InstitutionsApi.md#getFeatureDetails) | **GET** /features | Get Features
[**getInstitution**](InstitutionsApi.md#getInstitution) | **GET** /institutions/{institutionId} | Get Institution
[**getInstitutions**](InstitutionsApi.md#getInstitutions) | **GET** /institutions | Get Institutions



## getFeatureDetails

> ApiListResponseOfFeatureDetails getFeatureDetails()

Get Features

Used to retrieve all features available from Yapily. Each `Institution` supports a one, many or all of these features and can be seen in the features field of the `Institution` object.<br><br>Note: Every `Institution` does not necessarily support every feature. To see which features are available for a particular Institution, use either the [Get Institutions](https://docs.yapily.com/api/reference/#operation/getInstitutions) or [Get Institution](https://docs.yapily.com/api/reference/#operation/getInstitution) endpoint and check the features array within the `Institution` payload.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        try {
            ApiListResponseOfFeatureDetails result = apiInstance.getFeatureDetails();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getFeatureDetails");
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

[**ApiListResponseOfFeatureDetails**](ApiListResponseOfFeatureDetails.md)

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


## getInstitution

> Institution getInstitution(institutionId)

Get Institution

Used to retrieves details of a specific `Institution` within an application

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        String institutionId = "institutionId_example"; // String | __Mandatory__. The Yapily institution Id for the `Institution`.
        try {
            Institution result = apiInstance.getInstitution(institutionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getInstitution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionId** | **String**| __Mandatory__. The Yapily institution Id for the &#x60;Institution&#x60;. |

### Return type

[**Institution**](Institution.md)

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


## getInstitutions

> ApiListResponseOfInstitution getInstitutions()

Get Institutions

Used to retrieve all `Institutions` within an application

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        try {
            ApiListResponseOfInstitution result = apiInstance.getInstitutions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getInstitutions");
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

[**ApiListResponseOfInstitution**](ApiListResponseOfInstitution.md)

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

