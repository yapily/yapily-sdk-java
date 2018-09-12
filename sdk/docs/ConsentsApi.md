# ConsentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addConsentUsingPOST**](ConsentsApi.md#addConsentUsingPOST) | **POST** /users/{userUuid}/consents | Post consent
[**deleteUsingDELETE**](ConsentsApi.md#deleteUsingDELETE) | **DELETE** /users/{userUuid}/consents/{consentToken} | Delete consent
[**getUserConsentsUsingGET**](ConsentsApi.md#getUserConsentsUsingGET) | **GET** /users/{userUuid}/consents | Get user consents


<a name="addConsentUsingPOST"></a>
# **addConsentUsingPOST**
> Consent addConsentUsingPOST(userUuid, createConsentApiKey)

Post consent

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ConsentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ConsentsApi apiInstance = new ConsentsApi();
String userUuid = "userUuid_example"; // String | userUuid
CreateConsentApiKey createConsentApiKey = new CreateConsentApiKey(); // CreateConsentApiKey | createConsentApiKey
try {
    Consent result = apiInstance.addConsentUsingPOST(userUuid, createConsentApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#addConsentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| userUuid |
 **createConsentApiKey** | [**CreateConsentApiKey**](CreateConsentApiKey.md)| createConsentApiKey |

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> Object deleteUsingDELETE(userUuid, consentToken)

Delete consent

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ConsentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ConsentsApi apiInstance = new ConsentsApi();
String userUuid = "userUuid_example"; // String | userUuid
String consentToken = "consentToken_example"; // String | consentToken
try {
    Object result = apiInstance.deleteUsingDELETE(userUuid, consentToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| userUuid |
 **consentToken** | **String**| consentToken |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUserConsentsUsingGET"></a>
# **getUserConsentsUsingGET**
> List&lt;Consent&gt; getUserConsentsUsingGET(userUuid, institutionId)

Get user consents

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.ConsentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ConsentsApi apiInstance = new ConsentsApi();
String userUuid = "userUuid_example"; // String | userUuid
String institutionId = "institutionId_example"; // String | institutionId
try {
    List<Consent> result = apiInstance.getUserConsentsUsingGET(userUuid, institutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getUserConsentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| userUuid |
 **institutionId** | **String**| institutionId | [optional]

### Return type

[**List&lt;Consent&gt;**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

