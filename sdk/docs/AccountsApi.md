# AccountsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountDirectDebitsUsingGET**](AccountsApi.md#getAccountDirectDebitsUsingGET) | **GET** /accounts/{accountId}/direct-debits | Get account direct debits
[**getAccountPeriodicPaymentsUsingGET**](AccountsApi.md#getAccountPeriodicPaymentsUsingGET) | **GET** /accounts/{accountId}/periodic-payments | Get account payments detail
[**getAccountScheduledPaymentsUsingGET**](AccountsApi.md#getAccountScheduledPaymentsUsingGET) | **GET** /accounts/{accountId}/scheduled-payments | Get account scheduled payments
[**getAccountUsingGET**](AccountsApi.md#getAccountUsingGET) | **GET** /accounts/{accountId} | Get account
[**getAccountsUsingGET**](AccountsApi.md#getAccountsUsingGET) | **GET** /accounts | Get accounts
[**initiateAccountRequestUsingPOST**](AccountsApi.md#initiateAccountRequestUsingPOST) | **POST** /account-auth-requests | Initiate a new account request for user to authorize
[**reAuthoriseAccountUsingPATCH**](AccountsApi.md#reAuthoriseAccountUsingPATCH) | **PATCH** /account-auth-requests | Re-authorise account request
[**updatePreAuthoriseAccountConsentUsingPUT**](AccountsApi.md#updatePreAuthoriseAccountConsentUsingPUT) | **PUT** /account-auth-requests | Update pre authorize consent for user to authorise account


<a name="getAccountDirectDebitsUsingGET"></a>
# **getAccountDirectDebitsUsingGET**
> ApiListResponseOfPaymentResponse getAccountDirectDebitsUsingGET(accountId, consent, xYapilyApiVersion, limit)

Get account direct debits

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | Account Id
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
Integer limit = 56; // Integer | Use this parameter to limit account's direct debit results
try {
    ApiListResponseOfPaymentResponse result = apiInstance.getAccountDirectDebitsUsingGET(accountId, consent, xYapilyApiVersion, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountDirectDebitsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id |
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **limit** | **Integer**| Use this parameter to limit account&#39;s direct debit results | [optional]

### Return type

[**ApiListResponseOfPaymentResponse**](ApiListResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getAccountPeriodicPaymentsUsingGET"></a>
# **getAccountPeriodicPaymentsUsingGET**
> ApiListResponseOfPaymentResponse getAccountPeriodicPaymentsUsingGET(accountId, consent, xYapilyApiVersion, limit)

Get account payments detail

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | Account Id
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
Integer limit = 56; // Integer | Use this parameter to limit account's periodic payment order results
try {
    ApiListResponseOfPaymentResponse result = apiInstance.getAccountPeriodicPaymentsUsingGET(accountId, consent, xYapilyApiVersion, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountPeriodicPaymentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id |
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **limit** | **Integer**| Use this parameter to limit account&#39;s periodic payment order results | [optional]

### Return type

[**ApiListResponseOfPaymentResponse**](ApiListResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getAccountScheduledPaymentsUsingGET"></a>
# **getAccountScheduledPaymentsUsingGET**
> ApiListResponseOfPaymentResponse getAccountScheduledPaymentsUsingGET(accountId, consent, xYapilyApiVersion, limit)

Get account scheduled payments

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | Account Id
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
Integer limit = 56; // Integer | Use this parameter to limit account's scheduled payment results
try {
    ApiListResponseOfPaymentResponse result = apiInstance.getAccountScheduledPaymentsUsingGET(accountId, consent, xYapilyApiVersion, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountScheduledPaymentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id |
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **limit** | **Integer**| Use this parameter to limit account&#39;s scheduled payment results | [optional]

### Return type

[**ApiListResponseOfPaymentResponse**](ApiListResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getAccountUsingGET"></a>
# **getAccountUsingGET**
> ApiResponseOfAccount getAccountUsingGET(consent, accountId, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Get account

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String consent = "consent_example"; // String | Consent Token
String accountId = "accountId_example"; // String | Account Id
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAccount result = apiInstance.getAccountUsingGET(consent, accountId, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountId** | **String**| Account Id |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAccount**](ApiResponseOfAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getAccountsUsingGET"></a>
# **getAccountsUsingGET**
> ApiListResponseOfAccount getAccountsUsingGET(consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Get accounts

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiListResponseOfAccount result = apiInstance.getAccountsUsingGET(consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiListResponseOfAccount**](ApiListResponseOfAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="initiateAccountRequestUsingPOST"></a>
# **initiateAccountRequestUsingPOST**
> ApiResponseOfAuthorisationRequestResponse initiateAccountRequestUsingPOST(accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Initiate a new account request for user to authorize

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
AccountAuthorisationRequest accountAuthRequest = new AccountAuthorisationRequest(); // AccountAuthorisationRequest | accountAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.initiateAccountRequestUsingPOST(accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#initiateAccountRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAuthRequest** | [**AccountAuthorisationRequest**](AccountAuthorisationRequest.md)| accountAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="reAuthoriseAccountUsingPATCH"></a>
# **reAuthoriseAccountUsingPATCH**
> ApiResponseOfAuthorisationRequestResponse reAuthoriseAccountUsingPATCH(consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Re-authorise account request

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.reAuthoriseAccountUsingPATCH(consent, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#reAuthoriseAccountUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updatePreAuthoriseAccountConsentUsingPUT"></a>
# **updatePreAuthoriseAccountConsentUsingPUT**
> ApiResponseOfAuthorisationRequestResponse updatePreAuthoriseAccountConsentUsingPUT(consent, accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress)

Update pre authorize consent for user to authorise account

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String consent = "consent_example"; // String | Consent Token
AccountAuthorisationRequest accountAuthRequest = new AccountAuthorisationRequest(); // AccountAuthorisationRequest | accountAuthRequest
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.updatePreAuthoriseAccountConsentUsingPUT(consent, accountAuthRequest, xYapilyApiVersion, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updatePreAuthoriseAccountConsentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| Consent Token |
 **accountAuthRequest** | [**AccountAuthorisationRequest**](AccountAuthorisationRequest.md)| accountAuthRequest |
 **xYapilyApiVersion** | **String**| Api Version | [optional]
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

