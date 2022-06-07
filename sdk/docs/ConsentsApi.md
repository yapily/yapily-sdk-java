# ConsentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsentWithCode**](ConsentsApi.md#createConsentWithCode) | **POST** /consent-auth-code | Exchange OAuth2 Code
[**delete**](ConsentsApi.md#delete) | **DELETE** /consents/{consentId} | Delete Consent
[**getConsentById**](ConsentsApi.md#getConsentById) | **GET** /consents/{consentId} | Get Consent
[**getConsentBySingleAccessConsent**](ConsentsApi.md#getConsentBySingleAccessConsent) | **POST** /consent-one-time-token | Exchange One Time Token
[**getConsents**](ConsentsApi.md#getConsents) | **GET** /consents | Get Consents



## createConsentWithCode

> Consent createConsentWithCode(consentAuthCodeRequest)

Exchange OAuth2 Code

Used to obtain a Yapily Consent object containing the `consentToken` once the user has authenticated and you have an OAuth2 authorisation code `auth-code` and state `auth-state`.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.ConsentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConsentsApi apiInstance = new ConsentsApi(defaultClient);
        ConsentAuthCodeRequest consentAuthCodeRequest = new ConsentAuthCodeRequest(); // ConsentAuthCodeRequest | 
        try {
            Consent result = apiInstance.createConsentWithCode(consentAuthCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsentsApi#createConsentWithCode");
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
 **consentAuthCodeRequest** | [**ConsentAuthCodeRequest**](ConsentAuthCodeRequest.md)|  |

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## delete

> ApiResponseOfConsentDeleteResponse delete(consentId, forceDelete)

Delete Consent

Delete a consent using the consent Id

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.ConsentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConsentsApi apiInstance = new ConsentsApi(defaultClient);
        UUID consentId = UUID.randomUUID(); // UUID | __Mandatory__. The consent Id of the `Consent` to update.
        Boolean forceDelete = true; // Boolean | __Optional__. Whether to force the deletion.
        try {
            ApiResponseOfConsentDeleteResponse result = apiInstance.delete(consentId, forceDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsentsApi#delete");
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
 **consentId** | **UUID**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **forceDelete** | **Boolean**| __Optional__. Whether to force the deletion. | [optional] [default to true]

### Return type

[**ApiResponseOfConsentDeleteResponse**](ApiResponseOfConsentDeleteResponse.md)

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


## getConsentById

> ApiResponseOfConsent getConsentById(consentId)

Get Consent

Get consent using the consent Id

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.ConsentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConsentsApi apiInstance = new ConsentsApi(defaultClient);
        UUID consentId = UUID.randomUUID(); // UUID | __Mandatory__. The consent Id of the `Consent` to update.
        try {
            ApiResponseOfConsent result = apiInstance.getConsentById(consentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsentsApi#getConsentById");
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
 **consentId** | **UUID**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |

### Return type

[**ApiResponseOfConsent**](ApiResponseOfConsent.md)

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


## getConsentBySingleAccessConsent

> Consent getConsentBySingleAccessConsent(oneTimeTokenRequest)

Exchange One Time Token

Exchange a One-time-token for the consent token

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.ConsentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConsentsApi apiInstance = new ConsentsApi(defaultClient);
        OneTimeTokenRequest oneTimeTokenRequest = new OneTimeTokenRequest(); // OneTimeTokenRequest | 
        try {
            Consent result = apiInstance.getConsentBySingleAccessConsent(oneTimeTokenRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsentsApi#getConsentBySingleAccessConsent");
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
 **oneTimeTokenRequest** | [**OneTimeTokenRequest**](OneTimeTokenRequest.md)|  |

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## getConsents

> ApiListResponseOfConsent getConsents(filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset)

Get Consents

Used to retrieve all the consents created for each user within an application

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.ConsentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ConsentsApi apiInstance = new ConsentsApi(defaultClient);
        Set<String> filterApplicationUserId = Arrays.asList(); // Set<String> | __Optional__. Filter records based on the list of `applicationUserId` users provided.
        Set<UUID> filterUserUuid = Arrays.asList(); // Set<UUID> | __Optional__. Filter records based on the list of `userUuid` users provided.
        Set<String> filterInstitution = Arrays.asList(); // Set<String> | __Optional__. Filter records based on the list of `Institution` provided.
        Set<String> filterStatus = Arrays.asList(); // Set<String> | __Optional__. Filter records based on the list of `Consent` [statuses](https://docs.yapily.com/api/reference/#operation/getConsents!c=200&path=data/status&t=response).
        String from = "from_example"; // String | __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ). 
        String before = "before_example"; // String | __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ).
        Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
        Integer offset = 0; // Integer | __Optional__. The number of transaction records to be skipped. Used primarily with paginated results.
        try {
            ApiListResponseOfConsent result = apiInstance.getConsents(filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsentsApi#getConsents");
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
 **filterApplicationUserId** | **List&lt;String&gt;**| __Optional__. Filter records based on the list of &#x60;applicationUserId&#x60; users provided. | [optional]
 **filterUserUuid** | **List&lt;UUID&gt;**| __Optional__. Filter records based on the list of &#x60;userUuid&#x60; users provided. | [optional]
 **filterInstitution** | **List&lt;String&gt;**| __Optional__. Filter records based on the list of &#x60;Institution&#x60; provided. | [optional]
 **filterStatus** | **List&lt;String&gt;**| __Optional__. Filter records based on the list of &#x60;Consent&#x60; [statuses](https://docs.yapily.com/api/reference/#operation/getConsents!c&#x3D;200&amp;path&#x3D;data/status&amp;t&#x3D;response). | [optional]
 **from** | **String**| __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  | [optional]
 **before** | **String**| __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). | [optional]
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **offset** | **Integer**| __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. | [optional] [default to 0]

### Return type

[**ApiListResponseOfConsent**](ApiListResponseOfConsent.md)

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

