# FinancialDataApi

All URIs are relative to *https://api.yapily.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](FinancialDataApi.md#getAccount) | **GET** /accounts/{accountId} | Get Account
[**getAccountBalances**](FinancialDataApi.md#getAccountBalances) | **GET** /accounts/{accountId}/balances | Get Account Balances
[**getAccountDirectDebits**](FinancialDataApi.md#getAccountDirectDebits) | **GET** /accounts/{accountId}/direct-debits | Get Account Direct Debits
[**getAccountPeriodicPayments**](FinancialDataApi.md#getAccountPeriodicPayments) | **GET** /accounts/{accountId}/periodic-payments | Get Account Periodic Payments
[**getAccountScheduledPayments**](FinancialDataApi.md#getAccountScheduledPayments) | **GET** /accounts/{accountId}/scheduled-payments | Get Account Scheduled Payments
[**getAccounts**](FinancialDataApi.md#getAccounts) | **GET** /accounts | Get Accounts
[**getBeneficiaries**](FinancialDataApi.md#getBeneficiaries) | **GET** /accounts/{accountId}/beneficiaries | Get Account Beneficiaries
[**getCategories**](FinancialDataApi.md#getCategories) | **GET** /categories/{country} | Get Categories
[**getIdentity**](FinancialDataApi.md#getIdentity) | **GET** /identity | Get Identity
[**getStatement**](FinancialDataApi.md#getStatement) | **GET** /accounts/{accountId}/statements/{statementId} | Get Account Statement
[**getStatementFile**](FinancialDataApi.md#getStatementFile) | **GET** /accounts/{accountId}/statements/{statementId}/file | Get Account Statement File
[**getStatements**](FinancialDataApi.md#getStatements) | **GET** /accounts/{accountId}/statements | Get Account Statements
[**getTransactions**](FinancialDataApi.md#getTransactions) | **GET** /accounts/{accountId}/transactions | Get Account Transactions



## getAccount

> ApiResponseOfAccount getAccount(accountId, consent, psuId, psuCorporateId, psuIpAddress, raw)

Get Account

Used to return the account and balance information for the end user associated with the presented consent token.<br><br>Feature: `ACCOUNTS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccount result = apiInstance.getAccount(accountId, consent, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getAccount");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccount**](ApiResponseOfAccount.md)

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


## getAccountBalances

> ApiResponseOfBalances getAccountBalances(accountId, consent, psuId, psuCorporateId, psuIpAddress, raw)

Get Account Balances

Used to return the balance for the end user associated with the presented consent token.<br><br>
__Note__: This endpoint is only for obtaining the balance information of an account belonging to an `Institution` that exposes their APIs through the [CBI Globe Gateway](https://docs.yapily.com/pages/knowledge/open-banking/cbi_globe//). If the `Institution` you wish to obtain balance data is not in the CBI Globe, use [Get Account](https://docs.yapily.com/api/reference/#operation/getAccount) or [Get Accounts](https://docs.yapily.com/api/reference/#operation/getAccounts) to get balance data. <br><br>Feature: `ACCOUNT_BALANCES` 

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfBalances result = apiInstance.getAccountBalances(accountId, consent, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getAccountBalances");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfBalances**](ApiResponseOfBalances.md)

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


## getAccountDirectDebits

> ApiListResponseOfDirectDebitResponse getAccountDirectDebits(accountId, consent, limit, raw)

Get Account Direct Debits

Used to get the list of direct debits for an account.<br><br>Feature: `ACCOUNT_DIRECT_DEBIT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiListResponseOfDirectDebitResponse result = apiInstance.getAccountDirectDebits(accountId, consent, limit, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getAccountDirectDebits");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiListResponseOfDirectDebitResponse**](ApiListResponseOfDirectDebitResponse.md)

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


## getAccountPeriodicPayments

> ApiListResponseOfPaymentResponse getAccountPeriodicPayments(accountId, consent, limit, raw)

Get Account Periodic Payments

Used to get the list of periodic payments (standing orders in the UK) for an account.<br><br>Feature: `ACCOUNT_PERIODIC_PAYMENTS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiListResponseOfPaymentResponse result = apiInstance.getAccountPeriodicPayments(accountId, consent, limit, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getAccountPeriodicPayments");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiListResponseOfPaymentResponse**](ApiListResponseOfPaymentResponse.md)

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


## getAccountScheduledPayments

> ApiListResponseOfPaymentResponse getAccountScheduledPayments(accountId, consent, limit, raw)

Get Account Scheduled Payments

Used to get the list of scheduled payments for an account.<br><br>Feature: `ACCOUNT_SCHEDULED_PAYMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiListResponseOfPaymentResponse result = apiInstance.getAccountScheduledPayments(accountId, consent, limit, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getAccountScheduledPayments");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiListResponseOfPaymentResponse**](ApiListResponseOfPaymentResponse.md)

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


## getAccounts

> AccountApiListResponse getAccounts(consent, psuId, psuCorporateId, psuIpAddress, raw)

Get Accounts

Used to return all accounts and balances for the end user associated with the presented consent token.<br><br>Feature: `ACCOUNTS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            AccountApiListResponse result = apiInstance.getAccounts(consent, psuId, psuCorporateId, psuIpAddress, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getAccounts");
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

[**AccountApiListResponse**](AccountApiListResponse.md)

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


## getBeneficiaries

> ApiListResponseOfBeneficiary getBeneficiaries(accountId, consent, raw)

Get Account Beneficiaries

Used to get all the beneficiaries of a user's account<br><br>Feature: `ACCOUNT_BENEFICIARIES`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiListResponseOfBeneficiary result = apiInstance.getBeneficiaries(accountId, consent, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getBeneficiaries");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiListResponseOfBeneficiary**](ApiListResponseOfBeneficiary.md)

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


## getCategories

> ApiListResponseOfCategory getCategories(country)

Get Categories

Used to retrieve the list of categories returned by the Yapily Categorisation engine for a given locale. <br><br>See [Data Enrichment](https://docs.yapily.com/pages/key-concepts/account-data/data-enrichment/intro-to-data-enrichment/) for more information.

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String country = "country_example"; // String | __Mandatory__. The 2 letter country code e.g. 'GB'.
        try {
            ApiListResponseOfCategory result = apiInstance.getCategories(country);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getCategories");
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
 **country** | **String**| __Mandatory__. The 2 letter country code e.g. &#39;GB&#39;. |

### Return type

[**ApiListResponseOfCategory**](ApiListResponseOfCategory.md)

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


## getIdentity

> ApiResponseOfIdentity getIdentity(consent, raw)

Get Identity

Used to get the identity information for an account.<br><br>Feature: `IDENTITY`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfIdentity result = apiInstance.getIdentity(consent, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getIdentity");
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
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfIdentity**](ApiResponseOfIdentity.md)

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


## getStatement

> ApiResponseOfAccountStatement getStatement(consent, accountId, statementId, raw)

Get Account Statement

Used to get a statement for an account.<br><br>Feature: `ACCOUNT_STATEMENT`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String consent = "consent_example"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String statementId = "statementId_example"; // String | __Mandatory__. The statement Id of the statement file.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiResponseOfAccountStatement result = apiInstance.getStatement(consent, accountId, statementId, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getStatement");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **statementId** | **String**| __Mandatory__. The statement Id of the statement file. |
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiResponseOfAccountStatement**](ApiResponseOfAccountStatement.md)

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


## getStatementFile

> File getStatementFile(consent, accountId, statementId, raw)

Get Account Statement File

Used to get the statement file for an account.<br><br>Feature: `ACCOUNT_STATEMENT_FILE`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String statementId = "statementId_example"; // String | __Mandatory__. The statement Id of the statement file.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            File result = apiInstance.getStatementFile(consent, accountId, statementId, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getStatementFile");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **statementId** | **String**| __Mandatory__. The statement Id of the statement file. |
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error Response |  -  |


## getStatements

> ApiListResponseOfAccountStatement getStatements(consent, accountId, from, before, limit, sort, offset, raw)

Get Account Statements

Used to get the list of statements for an account.<br><br>Feature: `ACCOUNT_STATEMENTS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String from = "from_example"; // String | __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ). 
        String before = "before_example"; // String | __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ).
        Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
        SortEnum sort = SortEnum.fromValue("date"); // SortEnum | __Optional__. Sort transaction records by date ascending with 'date' or descending with '-date'. The default sort order is descending
        Integer offset = 56; // Integer | __Optional__. The number of transaction records to be skipped. Used primarily with paginated results.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiListResponseOfAccountStatement result = apiInstance.getStatements(consent, accountId, from, before, limit, sort, offset, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getStatements");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **from** | **String**| __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  | [optional]
 **before** | **String**| __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). | [optional]
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **sort** | **SortEnum**| __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending | [optional] [enum: date, -date]
 **offset** | **Integer**| __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiListResponseOfAccountStatement**](ApiListResponseOfAccountStatement.md)

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


## getTransactions

> ApiListResponseOfTransaction getTransactions(accountId, consent, psuId, psuCorporateId, psuIpAddress, with, from, before, limit, sort, offset, cursor, raw)

Get Account Transactions

Used to get the account transactions for an account<br><br>Feature: `ACCOUNT_TRANSACTIONS`

### Example

```java
// Import classes:
import yapily.sdk.ApiClient;
import yapily.sdk.ApiException;
import yapily.sdk.Configuration;
import yapily.sdk.auth.*;
import yapily.sdk.model.*;
import yapily.sdk.api.FinancialDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.yapily.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        FinancialDataApi apiInstance = new FinancialDataApi(defaultClient);
        String accountId = "accountId_example"; // String | __Mandatory__. The account Id of the user's bank account.
        String consent = "{consentToken}"; // String | __Mandatory__. The `consent-token` containing the user's authorisation to make the request.
        String psuId = "psuId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a personal account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuCorporateId = "psuCorporateId_example"; // String | __Conditional__. Represents the user's login ID for the `Institution` to a business account. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        String psuIpAddress = "psuIpAddress_example"; // String | __Conditional__. The IP address of the PSU. <br><br>See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required.
        List<String> with = Arrays.asList(); // List<String> | __Optional__. Can be `categories` or `merchant`. When set, will include enrichment data in the transactions returned. <br><br>Enrichment data is optional, e.g. when 'merchant' enrichment data is requested, the enrichment response will include merchant data only if it can be evaluated from the transaction.
        String from = "from_example"; // String | __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ). 
        String before = "before_example"; // String | __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd'T'HH:mm:ss.SSSZ).
        Integer limit = 56; // Integer | __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000.
        SortEnum sort = SortEnum.fromValue("date"); // SortEnum | __Optional__. Sort transaction records by date ascending with 'date' or descending with '-date'. The default sort order is descending
        Integer offset = 56; // Integer | __Optional__. The number of transaction records to be skipped. Used primarily with paginated results.
        String cursor = "cursor_example"; // String | __Optional__. This property is not currently in use.
        Boolean raw = true; // Boolean | __Optional__. Used to obtain the raw request and response to and from the <code>Institution</code>.
        try {
            ApiListResponseOfTransaction result = apiInstance.getTransactions(accountId, consent, psuId, psuCorporateId, psuIpAddress, with, from, before, limit, sort, offset, cursor, raw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialDataApi#getTransactions");
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
 **accountId** | **String**| __Mandatory__. The account Id of the user&#39;s bank account. |
 **consent** | **String**| __Mandatory__. The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the request. |
 **psuId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a personal account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuCorporateId** | **String**| __Conditional__. Represents the user&#39;s login ID for the &#x60;Institution&#x60; to a business account. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **psuIpAddress** | **String**| __Conditional__. The IP address of the PSU. &lt;br&gt;&lt;br&gt;See [PSU identifiers](https://docs.yapily.com/pages/knowledge/open-banking/psu_identifiers/) to see if this header is required. | [optional]
 **with** | **List&lt;String&gt;**| __Optional__. Can be &#x60;categories&#x60; or &#x60;merchant&#x60;. When set, will include enrichment data in the transactions returned. &lt;br&gt;&lt;br&gt;Enrichment data is optional, e.g. when &#39;merchant&#39; enrichment data is requested, the enrichment response will include merchant data only if it can be evaluated from the transaction. | [optional]
 **from** | **String**| __Optional__. Returned transactions will be on or after this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ).  | [optional]
 **before** | **String**| __Optional__. Returned transactions will be on or before this date (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ). | [optional]
 **limit** | **Integer**| __Optional__. The maximum number of transaction records to be returned. Must be between 0 and 1000. | [optional]
 **sort** | **SortEnum**| __Optional__. Sort transaction records by date ascending with &#39;date&#39; or descending with &#39;-date&#39;. The default sort order is descending | [optional] [enum: date, -date]
 **offset** | **Integer**| __Optional__. The number of transaction records to be skipped. Used primarily with paginated results. | [optional]
 **cursor** | **String**| __Optional__. This property is not currently in use. | [optional]
 **raw** | **Boolean**| __Optional__. Used to obtain the raw request and response to and from the &lt;code&gt;Institution&lt;/code&gt;. | [optional]

### Return type

[**ApiListResponseOfTransaction**](ApiListResponseOfTransaction.md)

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

