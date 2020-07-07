# PreAuthConsentControllerApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPreAuthorisationUsingPOST**](PreAuthConsentControllerApi.md#createPreAuthorisationUsingPOST) | **POST** /pre-auth-requests | Initiate request for user to pre authorise


<a name="createPreAuthorisationUsingPOST"></a>
# **createPreAuthorisationUsingPOST**
> ApiResponseOfAuthorisationRequestResponse createPreAuthorisationUsingPOST(preAuthorisationRequest)

Initiate request for user to pre authorise

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.PreAuthConsentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: tokenAuth
OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

PreAuthConsentControllerApi apiInstance = new PreAuthConsentControllerApi();
PreAuthorisationRequest preAuthorisationRequest = new PreAuthorisationRequest(); // PreAuthorisationRequest | preAuthorisationRequest
try {
    ApiResponseOfAuthorisationRequestResponse result = apiInstance.createPreAuthorisationUsingPOST(preAuthorisationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreAuthConsentControllerApi#createPreAuthorisationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preAuthorisationRequest** | [**PreAuthorisationRequest**](PreAuthorisationRequest.md)| preAuthorisationRequest |

### Return type

[**ApiResponseOfAuthorisationRequestResponse**](ApiResponseOfAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

