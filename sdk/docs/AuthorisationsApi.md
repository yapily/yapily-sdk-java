# AuthorisationsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkPaymentAuthorisation**](AuthorisationsApi.md#createBulkPaymentAuthorisation) | **POST** /bulk-payment-auth-requests | Create Bulk Payment Authorisation
[**createEmbeddedBulkPaymentAuthorisation**](AuthorisationsApi.md#createEmbeddedBulkPaymentAuthorisation) | **POST** /embedded-bulk-payment-auth-requests | Create Embedded Bulk Payment Authorisation
[**createEmbeddedPaymentAuthorisation**](AuthorisationsApi.md#createEmbeddedPaymentAuthorisation) | **POST** /embedded-payment-auth-requests | Create Embedded Payment Authorisation
[**createPaymentAuthorisation**](AuthorisationsApi.md#createPaymentAuthorisation) | **POST** /payment-auth-requests | Create Payment Authorisation
[**createPaymentPreAuthorisationRequest**](AuthorisationsApi.md#createPaymentPreAuthorisationRequest) | **POST** /payment-pre-auth-requests | Create Payment Pre-authorisation
[**createPreAuthorisationRequest**](AuthorisationsApi.md#createPreAuthorisationRequest) | **POST** /pre-auth-requests | Create Pre-authorisation
[**initiateAccountRequest**](AuthorisationsApi.md#initiateAccountRequest) | **POST** /account-auth-requests | Create Account Authorisation
[**initiateEmbeddedAccountRequest**](AuthorisationsApi.md#initiateEmbeddedAccountRequest) | **POST** /embedded-account-auth-requests | Create Embedded Account Authorisation
[**reAuthoriseAccount**](AuthorisationsApi.md#reAuthoriseAccount) | **PATCH** /account-auth-requests | Re-authorise Account Consent
[**updateEmbeddedAccountRequest**](AuthorisationsApi.md#updateEmbeddedAccountRequest) | **PUT** /embedded-account-auth-requests/{consentId} | Update Embedded Account Authorisation
[**updateEmbeddedBulkPaymentAuthorisation**](AuthorisationsApi.md#updateEmbeddedBulkPaymentAuthorisation) | **PUT** /embedded-bulk-payment-auth-requests/{consentId} | Update Embedded Bulk Payment Authorisation
[**updateEmbeddedPaymentAuthorisation**](AuthorisationsApi.md#updateEmbeddedPaymentAuthorisation) | **PUT** /embedded-payment-auth-requests/{consentId} | Update Embedded Payment Authorisation
[**updatePaymentAuthorisation**](AuthorisationsApi.md#updatePaymentAuthorisation) | **PUT** /payment-auth-requests | Update Payment Pre-authorisation
[**updatePreAuthoriseAccountConsent**](AuthorisationsApi.md#updatePreAuthoriseAccountConsent) | **PUT** /account-auth-requests | Update Account Pre-authorisation



## createBulkPaymentAuthorisation

> ApiResponseOfPaymentAuthorisationRequestResponse createBulkPaymentAuthorisation(bulkPaymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Bulk Payment Authorisation

Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. <br><br>See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.<br><br>Feature: `INITIATE_BULK_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        BulkPaymentAuthorisationRequest bulkPaymentAuthorisationRequest = new BulkPaymentAuthorisationRequest(); // BulkPaymentAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentAuthorisationRequestResponse result = apiInstance.createBulkPaymentAuthorisation(bulkPaymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#createBulkPaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkPaymentAuthorisationRequest** | [**BulkPaymentAuthorisationRequest**](BulkPaymentAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentAuthorisationRequestResponse**](ApiResponseOfPaymentAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## createEmbeddedBulkPaymentAuthorisation

> ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedBulkPaymentAuthorisation(bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Embedded Bulk Payment Authorisation

Used to initiate the embedded authorisation process for an `Institution` that contains the `INITIATE_EMBEDDED_BULK_PAYMENT` feature in order to obtain the the user's authorisation for a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. <br><br> See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.<br><br>Feature: `INITIATE_EMBEDDED_BULK_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest = new BulkPaymentEmbeddedAuthorisationRequest(); // BulkPaymentEmbeddedAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse result = apiInstance.createEmbeddedBulkPaymentAuthorisation(bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#createEmbeddedBulkPaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkPaymentEmbeddedAuthorisationRequest** | [**BulkPaymentEmbeddedAuthorisationRequest**](BulkPaymentEmbeddedAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## createEmbeddedPaymentAuthorisation

> ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedPaymentAuthorisation(paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Embedded Payment Authorisation

Used to initiate the embedded authorisation process for an `Institution` that contains the `INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT` feature in order to obtain the the user's authorisation for a payment.<br><br> See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.<br><br>Feature: `INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest = new PaymentEmbeddedAuthorisationRequest(); // PaymentEmbeddedAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse result = apiInstance.createEmbeddedPaymentAuthorisation(paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#createEmbeddedPaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentEmbeddedAuthorisationRequest** | [**PaymentEmbeddedAuthorisationRequest**](PaymentEmbeddedAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## createPaymentAuthorisation

> ApiResponseOfPaymentAuthorisationRequestResponse createPaymentAuthorisation(paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Payment Authorisation

Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for a payment. This endpoint is used to initiate all the different payment listed below. Based on the type of payment you wish to make, you may be required to provide specific properties in [PaymentRequest](https://docs.yapily.com/api/reference/#operation/createPaymentAuthorisation!path=paymentRequest&t=request). First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/reference/#operation/getInstitution). <br><br>See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow.<br><br>Features:<ul><li>`INITIATE_DOMESTIC_PERIODIC_PAYMENT`</li><li>`INITIATE_DOMESTIC_SCHEDULED_PAYMENT`</li><li>`INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT`</li><li>`INITIATE_DOMESTIC_SINGLE_PAYMENT`</li><li>`INITIATE_INTERNATIONAL_PERIODIC_PAYMENT`</li><li>`INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT`</li><li>`INITIATE_INTERNATIONAL_SINGLE_PAYMENT`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        PaymentAuthorisationRequest paymentAuthorisationRequest = new PaymentAuthorisationRequest(); // PaymentAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentAuthorisationRequestResponse result = apiInstance.createPaymentAuthorisation(paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#createPaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAuthorisationRequest** | [**PaymentAuthorisationRequest**](PaymentAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentAuthorisationRequestResponse**](ApiResponseOfPaymentAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## createPaymentPreAuthorisationRequest

> ApiResponseOfAccountAuthorisationResponse createPaymentPreAuthorisationRequest(paymentPreAuthorisationRequest, raw)

Create Payment Pre-authorisation

Used to initiate the pre-authorisation process for payments for CbiGlobe `Institution` that contains the `INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS` feature to authenticate the user. <br><br>Feature: `INITIATE_ONETIME_PRE_AUTHORISATION_PAYMENTS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        PaymentPreAuthorisationRequest paymentPreAuthorisationRequest = new PaymentPreAuthorisationRequest(); // PaymentPreAuthorisationRequest | 
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccountAuthorisationResponse result = apiInstance.createPaymentPreAuthorisationRequest(paymentPreAuthorisationRequest, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#createPaymentPreAuthorisationRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPreAuthorisationRequest** | [**PaymentPreAuthorisationRequest**](PaymentPreAuthorisationRequest.md)|  |
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccountAuthorisationResponse**](ApiResponseOfAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## createPreAuthorisationRequest

> ApiResponseOfAccountAuthorisationResponse createPreAuthorisationRequest(preAuthorisationRequest, raw)

Create Pre-authorisation

Used to initiate the pre-authorisation process for any `Institution` that contains the `INITIATE_PRE_AUTHORISATION` feature to authenticate the user. <br><br>Feature: `INITIATE_PRE_AUTHORISATION`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        PreAuthorisationRequest preAuthorisationRequest = new PreAuthorisationRequest(); // PreAuthorisationRequest | 
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccountAuthorisationResponse result = apiInstance.createPreAuthorisationRequest(preAuthorisationRequest, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#createPreAuthorisationRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preAuthorisationRequest** | [**PreAuthorisationRequest**](PreAuthorisationRequest.md)|  |
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccountAuthorisationResponse**](ApiResponseOfAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## initiateAccountRequest

> ApiResponseOfAccountAuthorisationResponse initiateAccountRequest(accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Account Authorisation

Used to initiate the authorisation process and direct users to the login screen of their financial institution in order to give consent to access account data.<br><br>See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow.<br><br>Feature: `INITIATE_ACCOUNT_REQUEST`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest(); // AccountAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccountAuthorisationResponse result = apiInstance.initiateAccountRequest(accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#initiateAccountRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAuthorisationRequest** | [**AccountAuthorisationRequest**](AccountAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccountAuthorisationResponse**](ApiResponseOfAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## initiateEmbeddedAccountRequest

> ApiResponseOfEmbeddedAccountAuthorisationResponse initiateEmbeddedAccountRequest(embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Embedded Account Authorisation

Used to initiate the embedded authorisation process for an `Institution` that contains the `INITIATE_EMBEDDED_ACCOUNT_REQUEST` feature in order to obtain the the user's authorisation to access their account information. <br><br>See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.<br><br>Feature: `INITIATE_EMBEDDED_ACCOUNT_REQUEST`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest = new EmbeddedAccountAuthorisationRequest(); // EmbeddedAccountAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfEmbeddedAccountAuthorisationResponse result = apiInstance.initiateEmbeddedAccountRequest(embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#initiateEmbeddedAccountRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embeddedAccountAuthorisationRequest** | [**EmbeddedAccountAuthorisationRequest**](EmbeddedAccountAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfEmbeddedAccountAuthorisationResponse**](ApiResponseOfEmbeddedAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## reAuthoriseAccount

> ApiResponseOfAccountAuthorisationResponse reAuthoriseAccount(consent, psuId, psuCorporateId, psuIpAddress, raw)

Re-authorise Account Consent

Used to prompt the account holder for continued access to their financial data. This endpoint should be used when a `Consent` that was previously `AUTHORIZED` can no longer be used to retrieve data.<br><br>See [Re-Authorisation](https://docs.yapily.com/pages/key-concepts/account-data/account-consents/#re-authorisation) for more information.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccountAuthorisationResponse result = apiInstance.reAuthoriseAccount(consent, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#reAuthoriseAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccountAuthorisationResponse**](ApiResponseOfAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## updateEmbeddedAccountRequest

> ApiResponseOfEmbeddedAccountAuthorisationResponse updateEmbeddedAccountRequest(consentId, embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Update Embedded Account Authorisation

Used to pass the SCA Code received from the `Institution` (and the SCA method selected by the user where multiple SCA methods are supported by the `Institution`) in order to complete the embedded authorisation to access the user's financial data. <br><br>See [Embedded Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/embedded-account-flows/) for more information about this flow.<br><br>Feature: `INITIATE_EMBEDDED_ACCOUNT_REQUEST`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
        EmbeddedAccountAuthorisationRequest embeddedAccountAuthorisationRequest = new EmbeddedAccountAuthorisationRequest(); // EmbeddedAccountAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfEmbeddedAccountAuthorisationResponse result = apiInstance.updateEmbeddedAccountRequest(consentId, embeddedAccountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#updateEmbeddedAccountRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **embeddedAccountAuthorisationRequest** | [**EmbeddedAccountAuthorisationRequest**](EmbeddedAccountAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfEmbeddedAccountAuthorisationResponse**](ApiResponseOfEmbeddedAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  -  |


## updateEmbeddedBulkPaymentAuthorisation

> ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedBulkPaymentAuthorisation(consentId, bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Update Embedded Bulk Payment Authorisation

Used to pass the SCA Code received from the `Institution` (and the SCA method selected by the user where multiple SCA methods are supported by the `Institution`) in order to complete the embedded authorisation to initiate a bulk payment. See [Bulk Payments](https://docs.yapily.com/pages/key-concepts/payments/payment-execution/bulk-payments/) for more information. <br><br>See [Embedded Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/embedded-payment-flows/) for more information about this flow.<br><br>Feature: `INITIATE_EMBEDDED_BULK_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
        BulkPaymentEmbeddedAuthorisationRequest bulkPaymentEmbeddedAuthorisationRequest = new BulkPaymentEmbeddedAuthorisationRequest(); // BulkPaymentEmbeddedAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse result = apiInstance.updateEmbeddedBulkPaymentAuthorisation(consentId, bulkPaymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#updateEmbeddedBulkPaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **bulkPaymentEmbeddedAuthorisationRequest** | [**BulkPaymentEmbeddedAuthorisationRequest**](BulkPaymentEmbeddedAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |


## updateEmbeddedPaymentAuthorisation

> ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedPaymentAuthorisation(consentId, paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Update Embedded Payment Authorisation

Used to pass the SCA Code received from the `Institution` (and the SCA method selected by the user where multiple SCA methods are supported by the `Institution`) in order to complete the embedded authorisation to initiate a payment. <br><br> See [Embedded Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/embedded/) for more information about this flow.<br><br>Feature: `INITIATE_EMBEDDED_DOMESTIC_SINGLE_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        String consentId = "consentId_example"; // String | __Mandatory__. The consent Id of the `Consent` to update.
        PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest = new PaymentEmbeddedAuthorisationRequest(); // PaymentEmbeddedAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse result = apiInstance.updateEmbeddedPaymentAuthorisation(consentId, paymentEmbeddedAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#updateEmbeddedPaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| __Mandatory__. The consent Id of the &#x60;Consent&#x60; to update. |
 **paymentEmbeddedAuthorisationRequest** | [**PaymentEmbeddedAuthorisationRequest**](PaymentEmbeddedAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse**](ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |


## updatePaymentAuthorisation

> ApiResponseOfPaymentAuthorisationRequestResponse updatePaymentAuthorisation(consent, paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Update Payment Pre-authorisation

Used to continue the authorisation process and for any `Institution` that contains the `INITIATE_PRE_AUTHORISATION` feature and direct user to the login screen of their financial institution in order to give consent to initiate a payment. <br><br>See [Redirect Payment Flows](https://docs.yapily.com/pages/key-concepts/payments/payment-authorisation/redirect-payment-flows/) for more information about this flow. <br><br>Feature: `INITIATE_PRE_AUTHORISATION`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        PaymentAuthorisationRequest paymentAuthorisationRequest = new PaymentAuthorisationRequest(); // PaymentAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentAuthorisationRequestResponse result = apiInstance.updatePaymentAuthorisation(consent, paymentAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#updatePaymentAuthorisation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **paymentAuthorisationRequest** | [**PaymentAuthorisationRequest**](PaymentAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentAuthorisationRequestResponse**](ApiResponseOfPaymentAuthorisationRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |


## updatePreAuthoriseAccountConsent

> ApiResponseOfAccountAuthorisationResponse updatePreAuthoriseAccountConsent(consent, accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw)

Update Account Pre-authorisation

Used to continue the authorisation process and for any `Institution` that contains the `INITIATE_PRE_AUTHORISATION` feature and direct user to the login screen of their financial institution in order to give consent to access account data. <br><br>See [Redirect Account Flows](https://docs.yapily.com/pages/key-concepts/account-data/account-authorisation/redirect-account-flows/) for more information about this flow. <br><br>Features: <ul><li>`INITIATE_ACCOUNT_REQUEST`</li><li>`INITIATE_PRE_AUTHORISATION`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.AuthorisationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AuthorisationsApi apiInstance = new AuthorisationsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest(); // AccountAuthorisationRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccountAuthorisationResponse result = apiInstance.updatePreAuthoriseAccountConsent(consent, accountAuthorisationRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorisationsApi#updatePreAuthoriseAccountConsent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **accountAuthorisationRequest** | [**AccountAuthorisationRequest**](AccountAuthorisationRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccountAuthorisationResponse**](ApiResponseOfAccountAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |

