
# ExchangeRateInformationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exchangeRateExpiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**foreignExchangeContractReference** | **String** |  |  [optional]
**rate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**rateType** | [**RateTypeEnum**](#RateTypeEnum) |  |  [optional]
**unitCurrency** | **String** |  |  [optional]


<a name="RateTypeEnum"></a>
## Enum: RateTypeEnum
Name | Value
---- | -----
ACTUAL | &quot;ACTUAL&quot;
AGREED | &quot;AGREED&quot;
INDICATIVE | &quot;INDICATIVE&quot;



