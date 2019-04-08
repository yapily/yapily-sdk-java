
# Consent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**userUuid** | **String** |  |  [optional]
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
**consentToken** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AWAITING_AUTHORIZATION | &quot;AWAITING_AUTHORIZATION&quot;
AWAITING_RE_AUTHORIZATION | &quot;AWAITING_RE_AUTHORIZATION&quot;
AUTHORIZED | &quot;AUTHORIZED&quot;
REJECTED | &quot;REJECTED&quot;
REVOKED | &quot;REVOKED&quot;
FAILED | &quot;FAILED&quot;
EXPIRED | &quot;EXPIRED&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="List<FeatureScopeEnum>"></a>
## Enum: List&lt;FeatureScopeEnum&gt;
Name | Value
---- | -----
INITIATE_ACCOUNT_REQUEST | &quot;INITIATE_ACCOUNT_REQUEST&quot;
ACCOUNT_REQUEST_DETAILS | &quot;ACCOUNT_REQUEST_DETAILS&quot;
ACCOUNTS | &quot;ACCOUNTS&quot;
ACCOUNT | &quot;ACCOUNT&quot;
ACCOUNT_TRANSACTIONS | &quot;ACCOUNT_TRANSACTIONS&quot;
ACCOUNT_TRANSACTIONS_WITH_MERCHANT | &quot;ACCOUNT_TRANSACTIONS_WITH_MERCHANT&quot;
IDENTITY | &quot;IDENTITY&quot;
INITIATE_SINGLE_PAYMENT_SORTCODE | &quot;INITIATE_SINGLE_PAYMENT_SORTCODE&quot;
EXISTING_PAYMENT_INITIATION_DETAILS | &quot;EXISTING_PAYMENT_INITIATION_DETAILS&quot;
CREATE_SINGLE_PAYMENT_SORTCODE | &quot;CREATE_SINGLE_PAYMENT_SORTCODE&quot;
EXISTING_PAYMENTS_DETAILS | &quot;EXISTING_PAYMENTS_DETAILS&quot;
TRANSFER | &quot;TRANSFER&quot;
OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS | &quot;OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS&quot;
OPEN_DATA_ATMS | &quot;OPEN_DATA_ATMS&quot;



