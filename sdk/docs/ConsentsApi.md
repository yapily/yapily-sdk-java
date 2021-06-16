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
String userUuid = "userUuid_example"; // String | __Mandatory__. The Yapily generated UUID for the user.
CreateConsentAccessToken createConsentAccessToken = new CreateConsentAccessToken(); // CreateConsentAccessToken | createConsentAccessToken
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **userUuid** | **String**| __Mandatory__. The Yapily generated UUID for the user. |
 **createConsentAccessToken** | [**CreateConsentAccessToken**](CreateConsentAccessToken.md)| createConsentAccessToken |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
Boolean forceDelete = true; // Boolean | __Optional__. Whether to force the deletion.
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
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **forceDelete** | **Boolean**| __Optional__. Whether to force the deletion. | [optional] [default to true]

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
String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
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
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]

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
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
List<String> filterApplicationUserId = Arrays.asList("filterApplicationUserId_example"); // List<String> | __Optional__. Filter records based on the list of `applicationUserId` users provided.
List<String> filterUserUuid = Arrays.asList("filterUserUuid_example"); // List<String> | __Optional__. Filter records based on the list of `userUuid` users provided.
List<String> filterInstitution = Arrays.asList("filterInstitution_example"); // List<String> | __Optional__. Filter records based on the list of `Institution` provided.
List<String> filterStatus = Arrays.asList("filterStatus_example"); // List<String> | __Optional__. Filter records based on the list of `Consent` [statuses](https://docs.yapily.com/api/#tocS_AuthorisationStatus).
String from = "from_example"; // String | __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ). 
String before = "before_example"; // String | __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ).
Integer limit = 56; // Integer | Use this parameter to limit consent results, max limit is 20
Integer offset = 0; // Integer | __Optional__. The number of transaction records to be skipped. Used primarily with paginated results.
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
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **filterApplicationUserId** | [**List&lt;String&gt;**](String.md)| __Optional__. Filter records based on the list of &#x60;applicationUserId&#x60; users provided. | [optional]
 **filterUserUuid** | [**List&lt;String&gt;**](String.md)| __Optional__. Filter records based on the list of &#x60;userUuid&#x60; users provided. | [optional]
 **filterInstitution** | [**List&lt;String&gt;**](String.md)| __Optional__. Filter records based on the list of &#x60;Institution&#x60; provided. | [optional]
 **filterStatus** | [**List&lt;String&gt;**](String.md)| __Optional__. Filter records based on the list of &#x60;Consent&#x60; [statuses](https://docs.yapily.com/api/#tocS_AuthorisationStatus). | [optional]
 **from** | **String**| __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  | [optional]
 **before** | **String**| __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). | [optional]
 **limit** | **Integer**| Use this parameter to limit consent results, max limit is 20 | [optional]
 **offset** | **Integer**| __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. | [optional] [default to 0]

### Return type

[**ApiListResponseOfConsent**](ApiListResponseOfConsent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUserConsentsUsingGET"></a>
# **getUserConsentsUsingGET**
> List&lt;Consent&gt; getUserConsentsUsingGET(userUuid, xYapilyApiVersion, institutionId, limit)

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
String userUuid = "userUuid_example"; // String | __Mandatory__. The Yapily generated UUID for the user.
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | __Optional__. Determines the API version to use. Valid values are `1.0` or `2.0-ALPHA`. Defaults to `1.0`
String institutionId = "institutionId_example"; // String | Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated `institutionId` query param.
Integer limit = 56; // Integer | Use this parameter to limit consent results, max limit is 20
try {
    List<Consent> result = apiInstance.getUserConsentsUsingGET(userUuid, xYapilyApiVersion, institutionId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentsApi#getUserConsentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**| __Mandatory__. The Yapily generated UUID for the user. |
 **xYapilyApiVersion** | **String**| __Optional__. Determines the API version to use. Valid values are &#x60;1.0&#x60; or &#x60;2.0-ALPHA&#x60;. Defaults to &#x60;1.0&#x60; | [optional]
 **institutionId** | **String**| Use this parameter to filter consent by institution, using the Yapily institution Id. This replaces the deprecated &#x60;institutionId&#x60; query param. | [optional]
 **limit** | **Integer**| Use this parameter to limit consent results, max limit is 20 | [optional]

### Return type

[**List&lt;Consent&gt;**](Consent.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

