
# PaymentAuthorisationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userUuid** | **String** |  |  [optional]
**applicationUserId** | **String** |  |  [optional]
**forwardParameters** | **List&lt;String&gt;** |  |  [optional]
**institutionId** | **String** |  | 
**callback** | **String** |  | 
**oneTimeToken** | **Boolean** |  | 
**paymentRequest** | [**PaymentRequest**](PaymentRequest.md) |  | 
**totalMaxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**totalMaxAmountFrequency** | [**TotalMaxAmountFrequencyEnum**](#TotalMaxAmountFrequencyEnum) |  |  [optional]
**maxAmountPerRequest** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**startsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**allowOverdraft** | **Boolean** |  |  [optional]


<a name="TotalMaxAmountFrequencyEnum"></a>
## Enum: TotalMaxAmountFrequencyEnum
Name | Value
---- | -----
DAILY | &quot;DAILY&quot;
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;
YEARLY | &quot;YEARLY&quot;



