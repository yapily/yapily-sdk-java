# NotificationsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventSubscription**](NotificationsApi.md#createEventSubscription) | **POST** /notifications/event-subscriptions | Create Event Subscription
[**deleteEventSubscriptionById**](NotificationsApi.md#deleteEventSubscriptionById) | **DELETE** /notifications/event-subscriptions/{eventTypeId} | Delete Event Subscription
[**getEventSubscriptionById**](NotificationsApi.md#getEventSubscriptionById) | **GET** /notifications/event-subscriptions/{eventTypeId} | Get Event Subscription
[**getEventSubscriptions**](NotificationsApi.md#getEventSubscriptions) | **GET** /notifications/event-subscriptions | Get Event Subscriptions



## createEventSubscription

> ApiResponseOfEventSubscriptionResponse createEventSubscription(eventSubscriptionRequest)

Create Event Subscription

Used to subscribe to notifications relating to a specified event type.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        EventSubscriptionRequest eventSubscriptionRequest = new EventSubscriptionRequest(); // EventSubscriptionRequest | 
        try {
            ApiResponseOfEventSubscriptionResponse result = apiInstance.createEventSubscription(eventSubscriptionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createEventSubscription");
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
 **eventSubscriptionRequest** | [**EventSubscriptionRequest**](EventSubscriptionRequest.md)|  |

### Return type

[**ApiResponseOfEventSubscriptionResponse**](ApiResponseOfEventSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Event subscription created successfully |  -  |
| **400** | Bad request for missing required properties |  -  |
| **401** | Unauthorized |  -  |
| **409** | Event subscription already exist for the application |  -  |


## deleteEventSubscriptionById

> ApiResponseOfEventSubscriptionDeleteResponse deleteEventSubscriptionById(eventTypeId)

Delete Event Subscription

Used to unsubscribe to notifications relating to a specified event type.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        String eventTypeId = "eventTypeId_example"; // String | Unique identifier of the event type (for which notifications will be sent)
        try {
            ApiResponseOfEventSubscriptionDeleteResponse result = apiInstance.deleteEventSubscriptionById(eventTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteEventSubscriptionById");
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
 **eventTypeId** | **String**| Unique identifier of the event type (for which notifications will be sent) |

### Return type

[**ApiResponseOfEventSubscriptionDeleteResponse**](ApiResponseOfEventSubscriptionDeleteResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event subscription deleted successfully |  -  |
| **401** | Unauthorized |  -  |
| **404** | Event subscription not found |  -  |


## getEventSubscriptionById

> ApiResponseOfEventSubscriptionResponse getEventSubscriptionById(eventTypeId)

Get Event Subscription

Used to get details of your subscription to a specified event type.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        String eventTypeId = "eventTypeId_example"; // String | Unique identifier of the event type (for which notifications will be sent)
        try {
            ApiResponseOfEventSubscriptionResponse result = apiInstance.getEventSubscriptionById(eventTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#getEventSubscriptionById");
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
 **eventTypeId** | **String**| Unique identifier of the event type (for which notifications will be sent) |

### Return type

[**ApiResponseOfEventSubscriptionResponse**](ApiResponseOfEventSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event subscription data found |  -  |
| **401** | Unauthorized |  -  |
| **404** | Event subscription not found |  -  |


## getEventSubscriptions

> ApiListResponseOfEventSubscriptionResponse getEventSubscriptions()

Get Event Subscriptions

Get all event subscriptions that your application is subscribed to

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        try {
            ApiListResponseOfEventSubscriptionResponse result = apiInstance.getEventSubscriptions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#getEventSubscriptions");
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

[**ApiListResponseOfEventSubscriptionResponse**](ApiListResponseOfEventSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event subscriptions for the application |  -  |
| **401** | Unauthorized |  -  |

