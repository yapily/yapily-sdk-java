# ConsentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addConsentUsingPOST**](ConsentsApi.md#addConsentUsingPOST) | **POST** /users/{userUuid}/consents | Post consent
[**createConsentWithCodeUsingPOST**](ConsentsApi.md#createConsentWithCodeUsingPOST) | **POST** /consent-auth-code | Post auth-code and auth-state
[**deleteUsingDELETE**](ConsentsApi.md#deleteUsingDELETE) | **DELETE** /consents/{consentId} | Delete consent
[**getConsentByIdUsingGET**](ConsentsApi.md#getConsentByIdUsingGET) | **GET** /consents/{consentId} | Get consent
[**getConsentBySingleAccessConsentUsingPOST**](ConsentsApi.md#getConsentBySingleAccessConsentUsingPOST) | **POST** /consent-one-time-token | Post one time token
[**getConsentsUsingGET**](ConsentsApi.md#getConsentsUsingGET) | **GET** /consents | Get consents
[**getUserConsentsUsingGET**](ConsentsApi.md#getUserConsentsUsingGET) | **GET** /users/{userUuid}/consents | Get user consents


<a name="addConsentUsingPOST"></a>
# **addConsentUsingPOST**
> Consent addConsentUsingPOST(userUuid, createConsentAccessToken)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
String userUuid = "userUuid_example"; // String | userUuid
CreateConsentAccessToken createConsentAccessToken = new CreateConsentAccessToken(); // CreateConsentAccessToken | createConsentAccessToken
try {
    Consent result = apiInstance.addConsentUsingPOST(userUuid, createConsentAccessToken);
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
 **createConsentAccessToken** | [**CreateConsentAccessToken**](CreateConsentAccessToken.md)| createConsentAccessToken |

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createConsentWithCodeUsingPOST"></a>
# **createConsentWithCodeUsingPOST**
> Consent createConsentWithCodeUsingPOST(consentByAuthCode)

Post auth-code and auth-state

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
ConsentAuthCodeRequest consentByAuthCode = new ConsentAuthCodeRequest(); // ConsentAuthCodeRequest | consentByAuthCode
try {
    Consent result = apiInstance.createConsentWithCodeUsingPOST(consentByAuthCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#createConsentWithCodeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentByAuthCode** | [**ConsentAuthCodeRequest**](ConsentAuthCodeRequest.md)| consentByAuthCode |

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> ApiResponseOfConsentDeleteResponse deleteUsingDELETE(consentId, forceDelete)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
String consentId = "consentId_example"; // String | consentId
Boolean forceDelete = true; // Boolean | forceDelete
try {
    ApiResponseOfConsentDeleteResponse result = apiInstance.deleteUsingDELETE(consentId, forceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| consentId |
 **forceDelete** | **Boolean**| forceDelete | [optional]

### Return type

[**ApiResponseOfConsentDeleteResponse**](ApiResponseOfConsentDeleteResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getConsentByIdUsingGET"></a>
# **getConsentByIdUsingGET**
> ApiResponseOfConsent getConsentByIdUsingGET(consentId)

Get consent

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
String consentId = "consentId_example"; // String | consentId
try {
    ApiResponseOfConsent result = apiInstance.getConsentByIdUsingGET(consentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getConsentByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| consentId |

### Return type

[**ApiResponseOfConsent**](ApiResponseOfConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getConsentBySingleAccessConsentUsingPOST"></a>
# **getConsentBySingleAccessConsentUsingPOST**
> Consent getConsentBySingleAccessConsentUsingPOST(oneTimeToken)

Post one time token

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
OneTimeTokenRequest oneTimeToken = new OneTimeTokenRequest(); // OneTimeTokenRequest | oneTimeToken
try {
    Consent result = apiInstance.getConsentBySingleAccessConsentUsingPOST(oneTimeToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getConsentBySingleAccessConsentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oneTimeToken** | [**OneTimeTokenRequest**](OneTimeTokenRequest.md)| oneTimeToken |

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getConsentsUsingGET"></a>
# **getConsentsUsingGET**
> ApiListResponseOfConsent getConsentsUsingGET(filterApplicationUserId, filterUserUuid, filterInstitution)

Get consents

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
String filterApplicationUserId = "filterApplicationUserId_example"; // String | Filter consents by applicationUserId
String filterUserUuid = "filterUserUuid_example"; // String | Filter consents by userUuid
String filterInstitution = "filterInstitution_example"; // String | Use this parameter to filter consent by institution, using the Yapily institution Id
try {
    ApiListResponseOfConsent result = apiInstance.getConsentsUsingGET(filterApplicationUserId, filterUserUuid, filterInstitution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getConsentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterApplicationUserId** | **String**| Filter consents by applicationUserId | [optional]
 **filterUserUuid** | **String**| Filter consents by userUuid | [optional]
 **filterInstitution** | **String**| Use this parameter to filter consent by institution, using the Yapily institution Id | [optional]

### Return type

[**ApiListResponseOfConsent**](ApiListResponseOfConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUserConsentsUsingGET"></a>
# **getUserConsentsUsingGET**
> List&lt;Consent&gt; getUserConsentsUsingGET(userUuid, filterInstitution)

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

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

ConsentsApi apiInstance = new ConsentsApi();
String userUuid = "userUuid_example"; // String | userUuid
String filterInstitution = "filterInstitution_example"; // String | Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated `institutionId` query param.
try {
    List<Consent> result = apiInstance.getUserConsentsUsingGET(userUuid, filterInstitution);
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
 **filterInstitution** | **String**| Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated &#x60;institutionId&#x60; query param. | [optional]

### Return type

[**List&lt;Consent&gt;**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

