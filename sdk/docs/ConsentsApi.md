# ConsentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addConsentUsingPOST**](ConsentsApi.md#addConsentUsingPOST) | **POST** /users/{userUuid}/consents | Post consent
[**createConsentWithCodeUsingPOST**](ConsentsApi.md#createConsentWithCodeUsingPOST) | **POST** /consent-auth-code | Post auth-code and auth-state
[**createPreAuthorisationRequestUsingPOST**](ConsentsApi.md#createPreAuthorisationRequestUsingPOST) | **POST** /pre-auth-requests | Initiate request for user to pre authorise
[**deleteUsingDELETE**](ConsentsApi.md#deleteUsingDELETE) | **DELETE** /consents/{consentId} | Delete consent
[**getConsentByIdUsingGET**](ConsentsApi.md#getConsentByIdUsingGET) | **GET** /consents/{consentId} | Get consent
[**getConsentBySingleAccessConsentUsingPOST**](ConsentsApi.md#getConsentBySingleAccessConsentUsingPOST) | **POST** /consent-one-time-token | Post one time token
[**getConsentsUsingGET**](ConsentsApi.md#getConsentsUsingGET) | **GET** /consents | Get consents sorted by creation date
[**getUserConsentsUsingGET**](ConsentsApi.md#getUserConsentsUsingGET) | **GET** /users/{userUuid}/consents | Get latest user consents


<a name="addConsentUsingPOST"></a>
# **addConsentUsingPOST**
> Consent addConsentUsingPOST(userUuid, createConsentAccessToken, xYapilyApiVersion)

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
String userUuid = "userUuid_example"; // String | User uuid
CreateConsentAccessToken createConsentAccessToken = new CreateConsentAccessToken(); // CreateConsentAccessToken | createConsentAccessToken
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    Consent result = apiInstance.addConsentUsingPOST(userUuid, createConsentAccessToken, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#addConsentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| User uuid |
 **createConsentAccessToken** | [**CreateConsentAccessToken**](CreateConsentAccessToken.md)| createConsentAccessToken |
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createConsentWithCodeUsingPOST"></a>
# **createConsentWithCodeUsingPOST**
> Consent createConsentWithCodeUsingPOST(consentByAuthCode, xYapilyApiVersion)

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    Consent result = apiInstance.createConsentWithCodeUsingPOST(consentByAuthCode, xYapilyApiVersion);
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
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPreAuthorisationRequestUsingPOST"></a>
# **createPreAuthorisationRequestUsingPOST**
> ApiResponseOfAuthorisationRequestResponse createPreAuthorisationRequestUsingPOST(preAuthorisationRequest, xYapilyApiVersion)

Initiate request for user to pre authorise

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
PreAuthorisationRequest preAuthorisationRequest = new PreAuthorisationRequest(); // PreAuthorisationRequest | preAuthorisationRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.createPreAuthorisationRequestUsingPOST(preAuthorisationRequest, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#createPreAuthorisationRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preAuthorisationRequest** | [**PreAuthorisationRequest**](PreAuthorisationRequest.md)| preAuthorisationRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> ApiResponseOfConsentDeleteResponse deleteUsingDELETE(consentId, xYapilyApiVersion, forceDelete)

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
String consentId = "consentId_example"; // String | Consent Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
Boolean forceDelete = true; // Boolean | Force delete
try {
    ApiResponseOfConsentDeleteResponse result = apiInstance.deleteUsingDELETE(consentId, xYapilyApiVersion, forceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| Consent Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **forceDelete** | **Boolean**| Force delete | [optional] [default to true]

### Return type

[**ApiResponseOfConsentDeleteResponse**](ApiResponseOfConsentDeleteResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getConsentByIdUsingGET"></a>
# **getConsentByIdUsingGET**
> ApiResponseOfConsent getConsentByIdUsingGET(consentId, xYapilyApiVersion)

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
String consentId = "consentId_example"; // String | Consent Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    ApiResponseOfConsent result = apiInstance.getConsentByIdUsingGET(consentId, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getConsentByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| Consent Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**ApiResponseOfConsent**](ApiResponseOfConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getConsentBySingleAccessConsentUsingPOST"></a>
# **getConsentBySingleAccessConsentUsingPOST**
> Consent getConsentBySingleAccessConsentUsingPOST(oneTimeToken, xYapilyApiVersion)

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    Consent result = apiInstance.getConsentBySingleAccessConsentUsingPOST(oneTimeToken, xYapilyApiVersion);
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
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**Consent**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getConsentsUsingGET"></a>
# **getConsentsUsingGET**
> ApiListResponseOfConsent getConsentsUsingGET(xYapilyApiVersion, filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset)

Get consents sorted by creation date

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
List<String> filterApplicationUserId = Arrays.asList("filterApplicationUserId_example"); // List<String> | Filter consents by your application user Id (applicationUserId)
List<String> filterUserUuid = Arrays.asList("filterUserUuid_example"); // List<String> | Filter consents by Yapily user Id (userUuid)
List<String> filterInstitution = Arrays.asList("filterInstitution_example"); // List<String> | Use this parameter to filter consent by institution, using the Yapily institution Id
List<String> filterStatus = Arrays.asList("filterStatus_example"); // List<String> | Use this parameter to filter consent by status
String from = "from_example"; // String | Use this parameter to filter consents created after the date specified
String before = "before_example"; // String | Use this parameter to filter consents created before the date specified
Integer limit = 56; // Integer | Use this parameter to limit consent results, max limit is 20
Integer offset = 0; // Integer | Use this parameter to specify the offset of the results
try {
    ApiListResponseOfConsent result = apiInstance.getConsentsUsingGET(xYapilyApiVersion, filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getConsentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **filterApplicationUserId** | [**List&lt;String&gt;**](String.md)| Filter consents by your application user Id (applicationUserId) | [optional]
 **filterUserUuid** | [**List&lt;String&gt;**](String.md)| Filter consents by Yapily user Id (userUuid) | [optional]
 **filterInstitution** | [**List&lt;String&gt;**](String.md)| Use this parameter to filter consent by institution, using the Yapily institution Id | [optional]
 **filterStatus** | [**List&lt;String&gt;**](String.md)| Use this parameter to filter consent by status | [optional]
 **from** | **String**| Use this parameter to filter consents created after the date specified | [optional]
 **before** | **String**| Use this parameter to filter consents created before the date specified | [optional]
 **limit** | **Integer**| Use this parameter to limit consent results, max limit is 20 | [optional]
 **offset** | **Integer**| Use this parameter to specify the offset of the results | [optional] [default to 0]

### Return type

[**ApiListResponseOfConsent**](ApiListResponseOfConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUserConsentsUsingGET"></a>
# **getUserConsentsUsingGET**
> List&lt;Consent&gt; getUserConsentsUsingGET(userUuid, xYapilyApiVersion, filterInstitution, limit)

Get latest user consents

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
String userUuid = "userUuid_example"; // String | User uuid
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String filterInstitution = "filterInstitution_example"; // String | Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated `institutionId` query param.
Integer limit = 56; // Integer | Use this parameter to limit consent results, max limit is 20
try {
    List<Consent> result = apiInstance.getUserConsentsUsingGET(userUuid, xYapilyApiVersion, filterInstitution, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getUserConsentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| User uuid |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **filterInstitution** | **String**| Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated &#x60;institutionId&#x60; query param. | [optional]
 **limit** | **Integer**| Use this parameter to limit consent results, max limit is 20 | [optional]

### Return type

[**List&lt;Consent&gt;**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

