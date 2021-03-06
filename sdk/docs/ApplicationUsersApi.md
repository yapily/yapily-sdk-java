# ApplicationUsersApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserUsingPOST**](ApplicationUsersApi.md#addUserUsingPOST) | **POST** /users | Add an application user
[**deleteUserUsingDELETE**](ApplicationUsersApi.md#deleteUserUsingDELETE) | **DELETE** /users/{userUuid} | Delete an application user and sub-resources (including consent resources on institution APIs if they exist)
[**getDeleteUsersJobUsingGET**](ApplicationUsersApi.md#getDeleteUsersJobUsingGET) | **GET** /delete-users/{job-id} | Get details of a user deletion job
[**getDeleteUsersJobsUsingGET**](ApplicationUsersApi.md#getDeleteUsersJobsUsingGET) | **GET** /delete-users | Get details of all user deletion jobs
[**getUserUsingGET**](ApplicationUsersApi.md#getUserUsingGET) | **GET** /users/{userUuid} | Get an application user
[**getUsersUsingGET**](ApplicationUsersApi.md#getUsersUsingGET) | **GET** /users | Get application users
[**startDeleteUsersJobUsingPOST**](ApplicationUsersApi.md#startDeleteUsersJobUsingPOST) | **POST** /delete-users | Start a job to delete application users by specifying their identifiers


<a name="addUserUsingPOST"></a>
# **addUserUsingPOST**
> ApplicationUser addUserUsingPOST(newApplicationUser, xYapilyApiVersion)

Add an application user

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
NewApplicationUser newApplicationUser = new NewApplicationUser(); // NewApplicationUser | newApplicationUser
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    ApplicationUser result = apiInstance.addUserUsingPOST(newApplicationUser, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#addUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newApplicationUser** | [**NewApplicationUser**](NewApplicationUser.md)| newApplicationUser |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**ApplicationUser**](ApplicationUser.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUserUsingDELETE"></a>
# **deleteUserUsingDELETE**
> ApiResponseOfUserDeleteResponse deleteUserUsingDELETE(userUuid, xYapilyApiVersion)

Delete an application user and sub-resources (including consent resources on institution APIs if they exist)

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
String userUuid = "userUuid_example"; // String | __Mandatory__. The Yapily generated UUID for the user.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    ApiResponseOfUserDeleteResponse result = apiInstance.deleteUserUsingDELETE(userUuid, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#deleteUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| __Mandatory__. The Yapily generated UUID for the user. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**ApiResponseOfUserDeleteResponse**](ApiResponseOfUserDeleteResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getDeleteUsersJobUsingGET"></a>
# **getDeleteUsersJobUsingGET**
> ApiResponseOfBulkUserDeleteDetails getDeleteUsersJobUsingGET(jobId)

Get details of a user deletion job

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
String jobId = "jobId_example"; // String | job-id
try {
    ApiResponseOfBulkUserDeleteDetails result = apiInstance.getDeleteUsersJobUsingGET(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#getDeleteUsersJobUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| job-id |

### Return type

[**ApiResponseOfBulkUserDeleteDetails**](ApiResponseOfBulkUserDeleteDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getDeleteUsersJobsUsingGET"></a>
# **getDeleteUsersJobsUsingGET**
> ApiListResponseOfBulkUserDelete getDeleteUsersJobsUsingGET()

Get details of all user deletion jobs

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
try {
    ApiListResponseOfBulkUserDelete result = apiInstance.getDeleteUsersJobsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#getDeleteUsersJobsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiListResponseOfBulkUserDelete**](ApiListResponseOfBulkUserDelete.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> ApplicationUser getUserUsingGET(userUuid, xYapilyApiVersion)

Get an application user

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
String userUuid = "userUuid_example"; // String | __Mandatory__. The Yapily generated UUID for the user.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
try {
    ApplicationUser result = apiInstance.getUserUsingGET(userUuid, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| __Mandatory__. The Yapily generated UUID for the user. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

### Return type

[**ApplicationUser**](ApplicationUser.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> List&lt;ApplicationUser&gt; getUsersUsingGET(xYapilyApiVersion, filterApplicationUserId)

Get application users

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
List<String> filterApplicationUserId = Arrays.asList("filterApplicationUserId_example"); // List<String> | __Optional__. Filter records based on the list of `applicationUserId` users provided.
try {
    List<ApplicationUser> result = apiInstance.getUsersUsingGET(xYapilyApiVersion, filterApplicationUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **filterApplicationUserId** | [**List&lt;String&gt;**](String.md)| __Optional__. Filter records based on the list of &#x60;applicationUserId&#x60; users provided. | [optional]

### Return type

[**List&lt;ApplicationUser&gt;**](ApplicationUser.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="startDeleteUsersJobUsingPOST"></a>
# **startDeleteUsersJobUsingPOST**
> ApiResponseOfBulkUserDeleteDetails startDeleteUsersJobUsingPOST(userDeleteRequest)

Start a job to delete application users by specifying their identifiers

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ApplicationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ApplicationUsersApi apiInstance = new ApplicationUsersApi();
UserDeleteRequest userDeleteRequest = new UserDeleteRequest(); // UserDeleteRequest | userDeleteRequest
try {
    ApiResponseOfBulkUserDeleteDetails result = apiInstance.startDeleteUsersJobUsingPOST(userDeleteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUsersApi#startDeleteUsersJobUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDeleteRequest** | [**UserDeleteRequest**](UserDeleteRequest.md)| userDeleteRequest |

### Return type

[**ApiResponseOfBulkUserDeleteDetails**](ApiResponseOfBulkUserDeleteDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

