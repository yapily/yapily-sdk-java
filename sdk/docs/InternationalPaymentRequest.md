
# InternationalPaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyOfTransfer** | **String** |  | 
**exchangeRateInformation** | [**ExchangeRateInformation**](ExchangeRateInformation.md) |  |  [optional]
**purpose** | **String** |  |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional]
**chargeBearer** | [**ChargeBearerEnum**](#ChargeBearerEnum) |  |  [optional]


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
NORMAL | &quot;NORMAL&quot;
URGENT | &quot;URGENT&quot;


<a name="ChargeBearerEnum"></a>
## Enum: ChargeBearerEnum
Name | Value
---- | -----
DEBT | &quot;DEBT&quot;
CRED | &quot;CRED&quot;
SHAR | &quot;SHAR&quot;
SLEV | &quot;SLEV&quot;



