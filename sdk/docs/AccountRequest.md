
# AccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transactionTo** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**featureScope** | [**List&lt;FeatureScopeEnum&gt;**](#List&lt;FeatureScopeEnum&gt;) |  |  [optional]


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



