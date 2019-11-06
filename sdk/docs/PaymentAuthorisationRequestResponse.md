
# PaymentAuthorisationRequestResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**userUuid** | **String** |  |  [optional]
**applicationUserId** | **String** |  |  [optional]
**referenceId** | **String** |  |  [optional]
**institutionId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transactionFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transactionTo** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**timeToExpireInMillis** | **Long** | Deprecated. Use &#x60;timeToExpire&#x60; instead. |  [optional]
**timeToExpire** | **String** | ISO 8601 duration |  [optional]
**featureScope** | [**List&lt;FeatureScopeEnum&gt;**](#List&lt;FeatureScopeEnum&gt;) |  |  [optional]
**startsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**totalMaxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxAmountPerRequest** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**allowOverdraft** | **Boolean** |  |  [optional]
**consentToken** | **String** |  |  [optional]
**authorisationUrl** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AWAITING_AUTHORIZATION | &quot;AWAITING_AUTHORIZATION&quot;
AWAITING_FURTHER_AUTHORIZATION | &quot;AWAITING_FURTHER_AUTHORIZATION&quot;
AWAITING_RE_AUTHORIZATION | &quot;AWAITING_RE_AUTHORIZATION&quot;
AUTHORIZED | &quot;AUTHORIZED&quot;
CONSUMED | &quot;CONSUMED&quot;
REJECTED | &quot;REJECTED&quot;
REVOKED | &quot;REVOKED&quot;
FAILED | &quot;FAILED&quot;
EXPIRED | &quot;EXPIRED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
INVALID | &quot;INVALID&quot;


<a name="List<FeatureScopeEnum>"></a>
## Enum: List&lt;FeatureScopeEnum&gt;
Name | Value
---- | -----
INITIATE_ACCOUNT_REQUEST | &quot;INITIATE_ACCOUNT_REQUEST&quot;
ACCOUNT_REQUEST_DETAILS | &quot;ACCOUNT_REQUEST_DETAILS&quot;
ACCOUNTS | &quot;ACCOUNTS&quot;
ACCOUNT | &quot;ACCOUNT&quot;
ACCOUNT_TRANSACTIONS | &quot;ACCOUNT_TRANSACTIONS&quot;
ACCOUNT_STATEMENTS | &quot;ACCOUNT_STATEMENTS&quot;
ACCOUNT_STATEMENT | &quot;ACCOUNT_STATEMENT&quot;
ACCOUNT_STATEMENT_FILE | &quot;ACCOUNT_STATEMENT_FILE&quot;
ACCOUNT_SCHEDULED_PAYMENTS | &quot;ACCOUNT_SCHEDULED_PAYMENTS&quot;
ACCOUNT_DIRECT_DEBITS | &quot;ACCOUNT_DIRECT_DEBITS&quot;
ACCOUNT_PERIODIC_PAYMENTS | &quot;ACCOUNT_PERIODIC_PAYMENTS&quot;
ACCOUNT_TRANSACTIONS_WITH_MERCHANT | &quot;ACCOUNT_TRANSACTIONS_WITH_MERCHANT&quot;
IDENTITY | &quot;IDENTITY&quot;
INITIATE_SINGLE_PAYMENT_SORTCODE | &quot;INITIATE_SINGLE_PAYMENT_SORTCODE&quot;
EXISTING_PAYMENT_INITIATION_DETAILS | &quot;EXISTING_PAYMENT_INITIATION_DETAILS&quot;
CREATE_SINGLE_PAYMENT_SORTCODE | &quot;CREATE_SINGLE_PAYMENT_SORTCODE&quot;
EXISTING_PAYMENTS_DETAILS | &quot;EXISTING_PAYMENTS_DETAILS&quot;
INITIATE_PAYMENT | &quot;INITIATE_PAYMENT&quot;
CREATE_PAYMENT | &quot;CREATE_PAYMENT&quot;
INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT | &quot;INITIATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT&quot;
CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT | &quot;CREATE_DOMESTIC_VARIABLE_RECURRING_PAYMENT&quot;
INITIATE_DOMESTIC_SCHEDULED_PAYMENT | &quot;INITIATE_DOMESTIC_SCHEDULED_PAYMENT&quot;
CREATE_DOMESTIC_SCHEDULED_PAYMENT | &quot;CREATE_DOMESTIC_SCHEDULED_PAYMENT&quot;
INITIATE_DOMESTIC_PERIODIC_PAYMENT | &quot;INITIATE_DOMESTIC_PERIODIC_PAYMENT&quot;
CREATE_DOMESTIC_PERIODIC_PAYMENT | &quot;CREATE_DOMESTIC_PERIODIC_PAYMENT&quot;
PERIODIC_PAYMENT_FREQUENCY_EXTENDED | &quot;PERIODIC_PAYMENT_FREQUENCY_EXTENDED&quot;
INITIATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT | &quot;INITIATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT&quot;
CREATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT | &quot;CREATE_INTERNATIONAL_VARIABLE_RECURRING_PAYMENT&quot;
INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT | &quot;INITIATE_INTERNATIONAL_SCHEDULED_PAYMENT&quot;
CREATE_INTERNATIONAL_SCHEDULED_PAYMENT | &quot;CREATE_INTERNATIONAL_SCHEDULED_PAYMENT&quot;
INITIATE_INTERNATIONAL_PERIODIC_PAYMENT_ORDER | &quot;INITIATE_INTERNATIONAL_PERIODIC_PAYMENT_ORDER&quot;
CREATE_INTERNATIONAL_PERIODIC_PAYMENT_ORDER | &quot;CREATE_INTERNATIONAL_PERIODIC_PAYMENT_ORDER&quot;
INITIATE_INTERNATIONAL_PAYMENT | &quot;INITIATE_INTERNATIONAL_PAYMENT&quot;
CREATE_INTERNATIONAL_PAYMENT | &quot;CREATE_INTERNATIONAL_PAYMENT&quot;
TRANSFER | &quot;TRANSFER&quot;
OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS | &quot;OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS&quot;
OPEN_DATA_ATMS | &quot;OPEN_DATA_ATMS&quot;


