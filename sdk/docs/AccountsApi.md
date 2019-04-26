# AccountsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountUsingGET**](AccountsApi.md#getAccountUsingGET) | **GET** /accounts/{accountId} | Get account
[**getAccountsUsingGET**](AccountsApi.md#getAccountsUsingGET) | **GET** /accounts | Get accounts
[**initiateAccountRequestUsingPOST**](AccountsApi.md#initiateAccountRequestUsingPOST) | **POST** /account-auth-requests | Initiate a new account request for user to authorize


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
> ClientBasedApiListResponseOfAccount getAccountsUsingGET(consent)

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
    ClientBasedApiListResponseOfAccount result = apiInstance.getAccountsUsingGET(consent);
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

[**ClientBasedApiListResponseOfAccount**](ClientBasedApiListResponseOfAccount.md)

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

