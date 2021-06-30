
# PaymentAuthorisationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userUuid** | **String** | Uuid of the application user who will authorise access to their data. Either the userUuid or applicationUserId must be provided. |  [optional]
**applicationUserId** | **String** | Descriptive identifier for the application user.Either the userUuid or applicationUserId must be provided. |  [optional]
**forwardParameters** | **List&lt;String&gt;** |  |  [optional]
**institutionId** | **String** |  | 
**callback** | **String** |  | 
**redirect** | [**RedirectRequest**](RedirectRequest.md) |  |  [optional]
**oneTimeToken** | **Boolean** |  | 
**totalMaxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**totalMaxAmountFrequency** | [**TotalMaxAmountFrequencyEnum**](#TotalMaxAmountFrequencyEnum) |  |  [optional]
**maxAmountPerRequest** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**startsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**allowOverdraft** | **Boolean** |  |  [optional]
**paymentRequest** | [**PaymentRequest**](PaymentRequest.md) |  | 


<a name="TotalMaxAmountFrequencyEnum"></a>
## Enum: TotalMaxAmountFrequencyEnum
Name | Value
---- | -----
DAILY | &quot;DAILY&quot;
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;
YEARLY | &quot;YEARLY&quot;



