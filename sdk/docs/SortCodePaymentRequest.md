
# SortCodePaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**senderAccountId** | **String** |  |  [optional]
**name** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**currency** | **String** |  | 
**reference** | **String** |  | 
**country** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**accountNumber** | **String** |  | 
**sortCode** | **String** |  | 
**merchantInfo** | [**MerchantInfo**](MerchantInfo.md) |  |  [optional]
**readRefundAccount** | **Boolean** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BILL | &quot;BILL&quot;
GOODS | &quot;GOODS&quot;
SERVICES | &quot;SERVICES&quot;
OTHER | &quot;OTHER&quot;
PERSON_TO_PERSON | &quot;PERSON_TO_PERSON&quot;



