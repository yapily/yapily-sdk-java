# BeneficiariesApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBeneficiariesUsingGET**](BeneficiariesApi.md#getBeneficiariesUsingGET) | **GET** /accounts/{accountId}/beneficiaries | Get beneficiaries


<a name="getBeneficiariesUsingGET"></a>
# **getBeneficiariesUsingGET**
> ApiResponseOfListOfBeneficiary getBeneficiariesUsingGET(accountId, consent, xYapilyApiVersion)

Get beneficiaries

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.BeneficiariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

BeneficiariesApi apiInstance = new BeneficiariesApi();
String accountId = "accountId_example"; // String | Account Id
String consent = "consent_example"; // String | Consent Token
String xYapilyApiVersion = "xYapilyApiVersion_example"; // String | Api Version
try {
    ApiResponseOfListOfBeneficiary result = apiInstance.getBeneficiariesUsingGET(accountId, consent, xYapilyApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeneficiariesApi#getBeneficiariesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id |
 **consent** | **String**| Consent Token |
 **xYapilyApiVersion** | **String**| Api Version | [optional]

### Return type

[**ApiResponseOfListOfBeneficiary**](ApiResponseOfListOfBeneficiary.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

