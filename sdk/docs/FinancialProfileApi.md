# FinancialProfileApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProfileConsent**](FinancialProfileApi.md#createProfileConsent) | **POST** /users/{userUuid}/profile/consents | Create Profile Consent
[**deleteProfileConsent**](FinancialProfileApi.md#deleteProfileConsent) | **DELETE** /users/{userUuid}/profile/consents/{profileConsentId} | Delete Profile Consent
[**getProfileConsent**](FinancialProfileApi.md#getProfileConsent) | **GET** /users/{userUuid}/profile/consents/{profileConsentId} | Get Profile Consent
[**getUserProfile**](FinancialProfileApi.md#getUserProfile) | **GET** /users/{userUuid}/profile | Get User Profile



## createProfileConsent

> ProfileConsent createProfileConsent(userUuid, consent)

Create Profile Consent

Used to add a consent to a `Financial Profile` for a `User`.  The response is asynchronous, returned with pending status, while retrieval of financial data is commenced.  There is a limit of 10,000 transactions for enrichment.

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialProfileApi apiInstance = new FinancialProfileApi(defaultClient);
        UUID userUuid = UUID.randomUUID(); // UUID | __Mandatory__. The Yapily generated UUID for the user.
        String consent = "consent_example"; // String | __Mandatory__. The `consent-token` obtained from the original authorisation.
        try {
            ProfileConsent result = apiInstance.createProfileConsent(userUuid, consent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialProfileApi#createProfileConsent");
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
 **userUuid** | **UUID**| __Mandatory__. The Yapily generated UUID for the user. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; obtained from the original authorisation. |

### Return type

[**ProfileConsent**](ProfileConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response, returning a ProfileConsent. |  -  |
| **400** | Bad Request.  Returned if the userUuid is not a valid UUID. |  -  |
| **401** | Either authentication credentials were not supplied, or they were invalid. |  -  |
| **404** | Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;. |  -  |


## deleteProfileConsent

> deleteProfileConsent(userUuid, profileConsentId)

Delete Profile Consent

Used to delete a `ProfileConsent` for a `User`. This will remove the consent and all associated financial data from the 'Financial Profile'.

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialProfileApi apiInstance = new FinancialProfileApi(defaultClient);
        UUID userUuid = UUID.randomUUID(); // UUID | __Mandatory__. The Yapily generated UUID for the user.
        String profileConsentId = "profileConsentId_example"; // String | __Mandatory__. The ID of the ProfileConsent
        try {
            apiInstance.deleteProfileConsent(userUuid, profileConsentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialProfileApi#deleteProfileConsent");
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
 **userUuid** | **UUID**| __Mandatory__. The Yapily generated UUID for the user. |
 **profileConsentId** | **String**| __Mandatory__. The ID of the ProfileConsent |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ProfileConsent was deleted. |  -  |
| **400** | Bad Request.  Returned if the userUuid is not a valid UUID. |  -  |
| **401** | Either authentication credentials were not supplied, or they were invalid. |  -  |
| **404** | Not Found.  Returned if the userUuid or ProfileConsent is not found for the &#x60;Application&#x60;. |  -  |


## getProfileConsent

> ProfileConsent getProfileConsent(userUuid, profileConsentId)

Get Profile Consent

Used to retreive a specific ProfileConsent for a User.

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialProfileApi apiInstance = new FinancialProfileApi(defaultClient);
        UUID userUuid = UUID.randomUUID(); // UUID | __Mandatory__. The Yapily generated UUID for the user.
        String profileConsentId = "profileConsentId_example"; // String | __Mandatory__. The ID of the ProfileConsent
        try {
            ProfileConsent result = apiInstance.getProfileConsent(userUuid, profileConsentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialProfileApi#getProfileConsent");
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
 **userUuid** | **UUID**| __Mandatory__. The Yapily generated UUID for the user. |
 **profileConsentId** | **String**| __Mandatory__. The ID of the ProfileConsent |

### Return type

[**ProfileConsent**](ProfileConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response, returning a ProfileConsent. |  -  |
| **400** | Bad Request.  Returned if the userUuid is not a valid UUID. |  -  |
| **401** | Either authentication credentials were not supplied, or they were invalid. |  -  |
| **404** | Not Found.  Returned if the userUuid or ProfileConsent is not found for the &#x60;Application&#x60;. |  -  |


## getUserProfile

> FinancialProfile getUserProfile(userUuid)

Get User Profile

Used to retrieve a `FinancialProfile` for a `User`.  Status will be `PENDING` until all ProfileConsents are `COMPLETED`.

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialProfileApi apiInstance = new FinancialProfileApi(defaultClient);
        UUID userUuid = UUID.randomUUID(); // UUID | __Mandatory__. The Yapily generated UUID for the user.
        try {
            FinancialProfile result = apiInstance.getUserProfile(userUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialProfileApi#getUserProfile");
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
 **userUuid** | **UUID**| __Mandatory__. The Yapily generated UUID for the user. |

### Return type

[**FinancialProfile**](FinancialProfile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response, returning a FinancialProfile. |  -  |
| **400** | Bad Request.  Returned if the userUuid is not a valid UUID. |  -  |
| **401** | Either authentication credentials were not supplied, or they were invalid. |  -  |
| **404** | Not Found.  Returned if the userUuid is not found for the &#x60;Application&#x60;. |  -  |

