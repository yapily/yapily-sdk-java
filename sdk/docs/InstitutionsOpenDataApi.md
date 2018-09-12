# InstitutionsOpenDataApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getATMDataUsingGET**](InstitutionsOpenDataApi.md#getATMDataUsingGET) | **GET** /institutions/{institutionId}/atms | Retrieves data about all ATMs of the selected institution
[**getPersonalCurrentAccountsUsingGET**](InstitutionsOpenDataApi.md#getPersonalCurrentAccountsUsingGET) | **GET** /institutions/{institutionId}/personal-current-accounts | Retrieves details of personal current accounts for an institution


<a name="getATMDataUsingGET"></a>
# **getATMDataUsingGET**
> ApiResponseOfListOfATMOpenDataResponse getATMDataUsingGET(institutionId)

Retrieves data about all ATMs of the selected institution

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.InstitutionsOpenDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InstitutionsOpenDataApi apiInstance = new InstitutionsOpenDataApi();
String institutionId = "institutionId_example"; // String | institutionId
try {
    ApiResponseOfListOfATMOpenDataResponse result = apiInstance.getATMDataUsingGET(institutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsOpenDataApi#getATMDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionId** | **String**| institutionId |

### Return type

[**ApiResponseOfListOfATMOpenDataResponse**](ApiResponseOfListOfATMOpenDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getPersonalCurrentAccountsUsingGET"></a>
# **getPersonalCurrentAccountsUsingGET**
> ApiResponseOfListOfPersonalCurrentAccountData getPersonalCurrentAccountsUsingGET(institutionId)

Retrieves details of personal current accounts for an institution

### Example
```java
// Import classes:
//import yapily.ApiClient;
//import yapily.ApiException;
//import yapily.Configuration;
//import yapily.auth.*;
//import yapily.sdk.InstitutionsOpenDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InstitutionsOpenDataApi apiInstance = new InstitutionsOpenDataApi();
String institutionId = "institutionId_example"; // String | institutionId
try {
    ApiResponseOfListOfPersonalCurrentAccountData result = apiInstance.getPersonalCurrentAccountsUsingGET(institutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsOpenDataApi#getPersonalCurrentAccountsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionId** | **String**| institutionId |

### Return type

[**ApiResponseOfListOfPersonalCurrentAccountData**](ApiResponseOfListOfPersonalCurrentAccountData.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

