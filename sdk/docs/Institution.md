
# Institution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countries** | [**List&lt;Country&gt;**](Country.md) |  |  [optional]
**credentialsType** | [**CredentialsTypeEnum**](#CredentialsTypeEnum) |  |  [optional]
**environmentType** | [**EnvironmentTypeEnum**](#EnvironmentTypeEnum) |  |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) |  |  [optional]
**fullName** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**media** | [**List&lt;Media&gt;**](Media.md) |  |  [optional]
**name** | **String** |  |  [optional]


<a name="CredentialsTypeEnum"></a>
## Enum: CredentialsTypeEnum
Name | Value
---- | -----
OAUTH1 | &quot;OAUTH1&quot;
OAUTH2 | &quot;OAUTH2&quot;
OAUTH2_NOSECRET | &quot;OAUTH2_NOSECRET&quot;
OPEN_BANKING | &quot;OPEN_BANKING&quot;
OPEN_BANKING_SANDBOX | &quot;OPEN_BANKING_SANDBOX&quot;
OPEN_BANKING_IBM | &quot;OPEN_BANKING_IBM&quot;
OPEN_BANKING_KEY_SECRET_SANDBOX | &quot;OPEN_BANKING_KEY_SECRET_SANDBOX&quot;
API_KEY | &quot;API_KEY&quot;


<a name="EnvironmentTypeEnum"></a>
## Enum: EnvironmentTypeEnum
Name | Value
---- | -----
SANDBOX | &quot;SANDBOX&quot;
MOCK | &quot;MOCK&quot;
LIVE | &quot;LIVE&quot;


<a name="List<FeaturesEnum>"></a>
## Enum: List&lt;FeaturesEnum&gt;
Name | Value
---- | -----
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



