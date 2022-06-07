# PaymentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkPayment**](PaymentsApi.md#createBulkPayment) | **POST** /bulk-payments | Create Bulk Payment
[**createPayment**](PaymentsApi.md#createPayment) | **POST** /payments | Create Payment
[**getPayments**](PaymentsApi.md#getPayments) | **GET** /payments/{paymentId}/details | Get Payment Details



## createBulkPayment

> ApiResponseOfPaymentResponse createBulkPayment(consent, bulkPaymentRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Bulk Payment

Used to initiate a bulk payment after obtaining the user's authorisation. <br><br>Feature: `CREATE_BULK_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        BulkPaymentRequest bulkPaymentRequest = new BulkPaymentRequest(); // BulkPaymentRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentResponse result = apiInstance.createBulkPayment(consent, bulkPaymentRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createBulkPayment");
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
 **bulkPaymentRequest** | [**BulkPaymentRequest**](BulkPaymentRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

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


## createPayment

> ApiResponseOfPaymentResponse createPayment(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress, raw)

Create Payment

Used to initiate a payment after obtaining the user's authorisation. <br><br>Features:<ul><li>`INITIATE_DOMESTIC_PERIODIC_PAYMENT`</li><li>`INITIATE_DOMESTIC_SCHEDULED_PAYMENT`</li><li>`INITIATE_DOMESTIC_SINGLE_INSTANT_PAYMENT`</li><li>`INITIATE_DOMESTIC_SINGLE_PAYMENT`</li><li>`INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT`</li><li>`INITIATE_INTERNATIONAL_PERIODIC_PAYMENT`</li><li>`INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT`</li><li>`INITIATE_INTERNATIONAL_SINGLE_PAYMENT`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | 
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentResponse result = apiInstance.createPayment(consent, paymentRequest, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createPayment");
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
 **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)|  |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentResponse**](ApiResponseOfPaymentResponse.md)

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


## getPayments

> ApiResponseOfPaymentResponses getPayments(paymentId, consent, psuId, psuCorporateId, psuIpAddress, raw)

Get Payment Details

Used to get the payment details of a payment. This is most commonly used to check for any updates to the payment status. <br><br>Feature: `EXISTING_PAYMENTS_DETAILS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String paymentId = "paymentId_example"; // String | __Mandatory__. The payment Id of the payment.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfPaymentResponses result = apiInstance.getPayments(paymentId, consent, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#getPayments");
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
 **paymentId** | **String**| __Mandatory__. The payment Id of the payment. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfPaymentResponses**](ApiResponseOfPaymentResponses.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |

