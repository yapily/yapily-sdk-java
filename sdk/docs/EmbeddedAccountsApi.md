# EmbeddedAccountsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**initiateEmbeddedAccountRequestUsingPOST**](EmbeddedAccountsApi.md#initiateEmbeddedAccountRequestUsingPOST) | **POST** /embedded-account-auth-requests | Initiate a new embedded account request for user to authorize
[**updateEmbeddedAccountRequestUsingPUT**](EmbeddedAccountsApi.md#updateEmbeddedAccountRequestUsingPUT) | **PUT** /embedded-account-auth-requests/{consentId} | Update an embedded account request with SCA info


<a name="initiateEmbeddedAccountRequestUsingPOST"></a>
# **initiateEmbeddedAccountRequestUsingPOST**
> ApiResponseOfAuthorisationEmbeddedRequestResponse initiateEmbeddedAccountRequestUsingPOST(accountAuthRequest, psuId, psuCorporateId, psuIpAddress)

Initiate a new embedded account request for user to authorize

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.EmbeddedAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

EmbeddedAccountsApi apiInstance = new EmbeddedAccountsApi();
AccountEmbeddedAuthorisationRequest accountAuthRequest = new AccountEmbeddedAuthorisationRequest(); // AccountEmbeddedAuthorisationRequest | accountAuthRequest
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAuthorisationEmbeddedRequestResponse result = apiInstance.initiateEmbeddedAccountRequestUsingPOST(accountAuthRequest, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedAccountsApi#initiateEmbeddedAccountRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAuthRequest** | [**AccountEmbeddedAuthorisationRequest**](AccountEmbeddedAuthorisationRequest.md)| accountAuthRequest |
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAuthorisationEmbeddedRequestResponse**](ApiResponseOfAuthorisationEmbeddedRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateEmbeddedAccountRequestUsingPUT"></a>
# **updateEmbeddedAccountRequestUsingPUT**
> ApiResponseOfAuthorisationEmbeddedRequestResponse updateEmbeddedAccountRequestUsingPUT(consentId, accountAuthRequest, psuId, psuCorporateId, psuIpAddress)

Update an embedded account request with SCA info

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.EmbeddedAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

EmbeddedAccountsApi apiInstance = new EmbeddedAccountsApi();
String consentId = "consentId_example"; // String | consentId
AccountEmbeddedAuthorisationRequest accountAuthRequest = new AccountEmbeddedAuthorisationRequest(); // AccountEmbeddedAuthorisationRequest | accountAuthRequest
String psuId = "psuId_example"; // String | PSU ID
String psuCorporateId = "psuCorporateId_example"; // String | PSU ID CORPORATE
String psuIpAddress = "psuIpAddress_example"; // String | PSU IP ADDRESS
try {
    ApiResponseOfAuthorisationEmbeddedRequestResponse result = apiInstance.updateEmbeddedAccountRequestUsingPUT(consentId, accountAuthRequest, psuId, psuCorporateId, psuIpAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedAccountsApi#updateEmbeddedAccountRequestUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| consentId |
 **accountAuthRequest** | [**AccountEmbeddedAuthorisationRequest**](AccountEmbeddedAuthorisationRequest.md)| accountAuthRequest |
 **psuId** | **String**| PSU ID | [optional]
 **psuCorporateId** | **String**| PSU ID CORPORATE | [optional]
 **psuIpAddress** | **String**| PSU IP ADDRESS | [optional]

### Return type

[**ApiResponseOfAuthorisationEmbeddedRequestResponse**](ApiResponseOfAuthorisationEmbeddedRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

