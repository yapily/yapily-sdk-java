# UsersApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UsersApi.md#addUser) | **POST** /users | Create User
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{userUuid} | Delete User
[**getUser**](UsersApi.md#getUser) | **GET** /users/{userUuid} | Get User
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get Users



## addUser

> ApplicationUser addUser(newApplicationUser)

Create User

Create a new user in your application

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        NewApplicationUser newApplicationUser = new NewApplicationUser(); // NewApplicationUser | 
        try {
            ApplicationUser result = apiInstance.addUser(newApplicationUser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#addUser");
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
 **newApplicationUser** | [**NewApplicationUser**](NewApplicationUser.md)|  |

### Return type

[**ApplicationUser**](ApplicationUser.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## deleteUser

> ApiResponseOfUserDeleteResponse deleteUser(userUuid)

Delete User

Delete a user from your application along with any sub-resources (including consent resources on institution APIs if they exist)

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        UUID userUuid = UUID.randomUUID(); // UUID | __Mandatory__. The Yapily generated UUID for the user.
        try {
            ApiResponseOfUserDeleteResponse result = apiInstance.deleteUser(userUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
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

[**ApiResponseOfUserDeleteResponse**](ApiResponseOfUserDeleteResponse.md)

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


## getUser

> ApplicationUser getUser(userUuid)

Get User

Get a specific user using the user UUID

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        UUID userUuid = UUID.randomUUID(); // UUID | __Mandatory__. The Yapily generated UUID for the user.
        try {
            ApplicationUser result = apiInstance.getUser(userUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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

[**ApplicationUser**](ApplicationUser.md)

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


## getUsers

> List&lt;ApplicationUser&gt; getUsers(filterApplicationUserId)

Get Users

Get all the users configured in your application

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Set<String> filterApplicationUserId = Arrays.asList(); // Set<String> | __Optional__. Filter records based on the list of `applicationUserId` users provided.
        try {
            List<ApplicationUser> result = apiInstance.getUsers(filterApplicationUserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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

### Return type

[**List&lt;ApplicationUser&gt;**](ApplicationUser.md)

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

