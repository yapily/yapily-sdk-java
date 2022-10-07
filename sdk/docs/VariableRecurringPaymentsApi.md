# VariableRecurringPaymentsApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNonSweepingAuthorisation**](VariableRecurringPaymentsApi.md#createNonSweepingAuthorisation) | **POST** /variable-recurring-payments/non-sweeping/consents | Create Non-Sweeping Variable Recurring Payment Authorisation
[**createSweepingAuthorisation**](VariableRecurringPaymentsApi.md#createSweepingAuthorisation) | **POST** /variable-recurring-payments/sweeping/consents | Create Sweeping Variable Recurring Payment Authorisation
[**createVrpFundsConfirmation**](VariableRecurringPaymentsApi.md#createVrpFundsConfirmation) | **POST** /variable-recurring-payments/funds-confirmation | Confirm Funds for Variable Recurring Payment
[**createVrpPayment**](VariableRecurringPaymentsApi.md#createVrpPayment) | **POST** /variable-recurring-payments/payments | Create Variable Recurring Payment
[**getSweepingVrpConsentById**](VariableRecurringPaymentsApi.md#getSweepingVrpConsentById) | **GET** /variable-recurring-payments/sweeping/consents/{consentId} | Get Sweeping Variable Recurring Payment Consent Details
[**getVrpPaymentDetails**](VariableRecurringPaymentsApi.md#getVrpPaymentDetails) | **GET** /variable-recurring-payments/payments/{paymentId}/details | Get Variable Recurring Payment Details
[**getpNonSweepingVrpConsentById**](VariableRecurringPaymentsApi.md#getpNonSweepingVrpConsentById) | **GET** /variable-recurring-payments/non-sweeping/consents/{consentId} | Get Non-Sweeping Variable Recurring Payment Consent Details



## createNonSweepingAuthorisation

> ApiResponseOfNonSweepingAuthorisationResponse createNonSweepingAuthorisation(nonSweepingAuthorisationRequest)

Create Non-Sweeping Variable Recurring Payment Authorisation

Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Non-Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). <br><br>See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.<br><br>Features:<ul><li>`INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        NonSweepingAuthorisationRequest nonSweepingAuthorisationRequest = new NonSweepingAuthorisationRequest(); // NonSweepingAuthorisationRequest | 
        try {
            ApiResponseOfNonSweepingAuthorisationResponse result = apiInstance.createNonSweepingAuthorisation(nonSweepingAuthorisationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#createNonSweepingAuthorisation");
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
 **nonSweepingAuthorisationRequest** | [**NonSweepingAuthorisationRequest**](NonSweepingAuthorisationRequest.md)|  |

### Return type

[**ApiResponseOfNonSweepingAuthorisationResponse**](ApiResponseOfNonSweepingAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |


## createSweepingAuthorisation

> ApiResponseOfSweepingAuthorisationResponse createSweepingAuthorisation(sweepingAuthorisationRequest)

Create Sweeping Variable Recurring Payment Authorisation

Used to initiate the authorisation process and direct users to the login screen of their financial Institution in order to give their consent for Sweeping Variable Recurring Payments. The request would return an Authorization URL and an Identifier for the consent created at the Institution. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). <br><br>See [Redirect Payment Flows](https://docs.yapily.com/guides/payments/payment-authorisation-flows/redirect/) for more information about this flow.<br><br>Features:<ul><li>`INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        SweepingAuthorisationRequest sweepingAuthorisationRequest = new SweepingAuthorisationRequest(); // SweepingAuthorisationRequest | 
        try {
            ApiResponseOfSweepingAuthorisationResponse result = apiInstance.createSweepingAuthorisation(sweepingAuthorisationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#createSweepingAuthorisation");
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
 **sweepingAuthorisationRequest** | [**SweepingAuthorisationRequest**](SweepingAuthorisationRequest.md)|  |

### Return type

[**ApiResponseOfSweepingAuthorisationResponse**](ApiResponseOfSweepingAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |


## createVrpFundsConfirmation

> ApiResponseOfFundsConfirmationResponse createVrpFundsConfirmation(consent, fundsConfirmationRequest)

Confirm Funds for Variable Recurring Payment

Used to confirm funds on the Payer account to execute Variable Recurring Payments after obtaining the user's authorisation. <br><br>Features:<ul><li>`VARIABLE_RECURRING_PAYMENT_FUNDS_CONFIRMATION`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        FundsConfirmationRequest fundsConfirmationRequest = new FundsConfirmationRequest(); // FundsConfirmationRequest | 
        try {
            ApiResponseOfFundsConfirmationResponse result = apiInstance.createVrpFundsConfirmation(consent, fundsConfirmationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#createVrpFundsConfirmation");
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
 **fundsConfirmationRequest** | [**FundsConfirmationRequest**](FundsConfirmationRequest.md)|  |

### Return type

[**ApiResponseOfFundsConfirmationResponse**](ApiResponseOfFundsConfirmationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |


## createVrpPayment

> ApiResponseOfSubmissionResponse createVrpPayment(consent, submissionRequest)

Create Variable Recurring Payment

Used to submit a Variable Recurring Payments transaction after obtaining the user's authorisation. First make sure that the payment feature you wish to execute is supported by the bank by checking the features array in [GET Institution](https://docs.yapily.com/api/#get-institution). <br><br>Features:<ul><li>`CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_SWEEPING`</li><li>`CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT_NONSWEEPING`</li></ul>

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        SubmissionRequest submissionRequest = new SubmissionRequest(); // SubmissionRequest | 
        try {
            ApiResponseOfSubmissionResponse result = apiInstance.createVrpPayment(consent, submissionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#createVrpPayment");
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
 **submissionRequest** | [**SubmissionRequest**](SubmissionRequest.md)|  |

### Return type

[**ApiResponseOfSubmissionResponse**](ApiResponseOfSubmissionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |


## getSweepingVrpConsentById

> ApiResponseOfSweepingAuthorisationResponse getSweepingVrpConsentById(consentId)

Get Sweeping Variable Recurring Payment Consent Details

Get Sweeping Variable Recurring Payments consent details using the consent Id

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        UUID consentId = UUID.randomUUID(); // UUID | __Mandatory__. The consent Id of the `Variable Recurring Payments Consent` to retrieve.
        try {
            ApiResponseOfSweepingAuthorisationResponse result = apiInstance.getSweepingVrpConsentById(consentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#getSweepingVrpConsentById");
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
 **consentId** | **UUID**| __Mandatory__. The consent Id of the &#x60;Variable Recurring Payments Consent&#x60; to retrieve. |

### Return type

[**ApiResponseOfSweepingAuthorisationResponse**](ApiResponseOfSweepingAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |


## getVrpPaymentDetails

> ApiResponseOfSubmissionResponse getVrpPaymentDetails(paymentId, consent)

Get Variable Recurring Payment Details

Get Variable Recurring Payment details using the Payment Id

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        String paymentId = "paymentId_example"; // String | __Mandatory__. The Payment Id of the `Variable Recurring Payments` to retrieve.
        String consent = "consent_example"; // String | __Mandatory__. The consent token containing the user's authorisation to make the `Variable Recurring Payments` request.
        try {
            ApiResponseOfSubmissionResponse result = apiInstance.getVrpPaymentDetails(paymentId, consent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#getVrpPaymentDetails");
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
 **paymentId** | **String**| __Mandatory__. The Payment Id of the &#x60;Variable Recurring Payments&#x60; to retrieve. |
 **consent** | **String**| __Mandatory__. The consent token containing the user&#39;s authorisation to make the &#x60;Variable Recurring Payments&#x60; request. |

### Return type

[**ApiResponseOfSubmissionResponse**](ApiResponseOfSubmissionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |


## getpNonSweepingVrpConsentById

> ApiResponseOfNonSweepingAuthorisationResponse getpNonSweepingVrpConsentById(consentId)

Get Non-Sweeping Variable Recurring Payment Consent Details

Get Non-Sweeping Variable Recurring Payments consent details using the consent Id

### Example

```java
import java.util.UUID;
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.VariableRecurringPaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        VariableRecurringPaymentsApi apiInstance = new VariableRecurringPaymentsApi(defaultClient);
        UUID consentId = UUID.randomUUID(); // UUID | __Mandatory__. The consent Id of the `Variable Recurring Payments Consent` to retrieve.
        try {
            ApiResponseOfNonSweepingAuthorisationResponse result = apiInstance.getpNonSweepingVrpConsentById(consentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableRecurringPaymentsApi#getpNonSweepingVrpConsentById");
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
 **consentId** | **UUID**| __Mandatory__. The consent Id of the &#x60;Variable Recurring Payments Consent&#x60; to retrieve. |

### Return type

[**ApiResponseOfNonSweepingAuthorisationResponse**](ApiResponseOfNonSweepingAuthorisationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Error Response |  -  |
| **0** | Error Response |  -  |

