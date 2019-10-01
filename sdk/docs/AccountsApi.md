# AccountsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountDirectDebitsUsingGET**](AccountsApi.md#getAccountDirectDebitsUsingGET) | **GET** /accounts/{accountId}/direct-debits | Get account direct debits
[**getAccountPeriodicPaymentOrderUsingGET**](AccountsApi.md#getAccountPeriodicPaymentOrderUsingGET) | **GET** /accounts/{accountId}/periodic-payment-orders | Get account payments detail
[**getAccountScheduledPaymentsUsingGET**](AccountsApi.md#getAccountScheduledPaymentsUsingGET) | **GET** /accounts/{accountId}/scheduled-payments | Get account scheduled payments
[**getAccountUsingGET**](AccountsApi.md#getAccountUsingGET) | **GET** /accounts/{accountId} | Get account
[**getAccountsUsingGET**](AccountsApi.md#getAccountsUsingGET) | **GET** /accounts | Get accounts
[**initiateAccountRequestUsingPOST**](AccountsApi.md#initiateAccountRequestUsingPOST) | **POST** /account-auth-requests | Initiate a new account request for user to authorize
[**reAuthoriseAccountUsingPATCH**](AccountsApi.md#reAuthoriseAccountUsingPATCH) | **PATCH** /account-auth-requests | Re-authorize account request


<a name="getAccountDirectDebitsUsingGET"></a>
# **getAccountDirectDebitsUsingGET**
> ApiListResponseOfPaymentResponse getAccountDirectDebitsUsingGET(accountId, consent, limit)

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
String accountId = "accountId_example"; // String | accountId
String consent = "consent_example"; // String | Consent Token
Integer limit = 56; // Integer | Use this parameter to limit account's direct debit results
try {
    ApiListResponseOfPaymentResponse result = apiInstance.getAccountDirectDebitsUsingGET(accountId, consent, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountDirectDebitsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| accountId |
 **consent** | **String**| Consent Token |
 **limit** | **Integer**| Use this parameter to limit account&#39;s direct debit results | [optional]

### Return type

[**ApiListResponseOfPaymentResponse**](ApiListResponseOfPaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getAccountPeriodicPaymentOrderUsingGET"></a>
# **getAccountPeriodicPaymentOrderUsingGET**
> ApiListResponseOfPaymentResponse getAccountPeriodicPaymentOrderUsingGET(accountId, consent, limit)

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
String accountId = "accountId_example"; // String | accountId
String consent = "consent_example"; // String | Consent Token
Integer limit = 56; // Integer | Use this parameter to limit account's periodic payment order results
try {
    ApiListResponseOfPaymentResponse result = apiInstance.getAccountPeriodicPaymentOrderUsingGET(accountId, consent, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountPeriodicPaymentOrderUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| accountId |
 **consent** | **String**| Consent Token |
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
> ApiListResponseOfPaymentResponse getAccountScheduledPaymentsUsingGET(accountId, consent, limit)

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
String accountId = "accountId_example"; // String | accountId
String consent = "consent_example"; // String | Consent Token
Integer limit = 56; // Integer | Use this parameter to limit account's scheduled payment results
try {
    ApiListResponseOfPaymentResponse result = apiInstance.getAccountScheduledPaymentsUsingGET(accountId, consent, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountScheduledPaymentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| accountId |
 **consent** | **String**| Consent Token |
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
> ApiResponseOfAccount getAccountUsingGET(consent, accountId)

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
String accountId = "accountId_example"; // String | accountId
try {
    ApiResponseOfAccount result = apiInstance.getAccountUsingGET(consent, accountId);
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
 **accountId** | **String**| accountId |

### Return type

[**ApiResponseOfAccount**](ApiResponseOfAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getAccountsUsingGET"></a>
# **getAccountsUsingGET**
> ApiListResponseOfAccount getAccountsUsingGET(consent)

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
try {
    ApiListResponseOfAccount result = apiInstance.getAccountsUsingGET(consent);
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

### Return type

[**ApiListResponseOfAccount**](ApiListResponseOfAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="initiateAccountRequestUsingPOST"></a>
# **initiateAccountRequestUsingPOST**
> ApiResponseOfAuthorisationRequestResponse initiateAccountRequestUsingPOST(accountAuthRequest)

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
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.initiateAccountRequestUsingPOST(accountAuthRequest);
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

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="reAuthoriseAccountUsingPATCH"></a>
# **reAuthoriseAccountUsingPATCH**
> ApiResponseOfAuthorisationRequestResponse reAuthoriseAccountUsingPATCH(consent)

Re-authorize account request

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
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.reAuthoriseAccountUsingPATCH(consent);
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

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

