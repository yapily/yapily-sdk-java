
# PaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**institutionConsentId** | **String** |  |  [optional]
**paymentIdempotencyId** | **String** |  |  [optional]
**paymentLifecycleId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusDetails** | [**PaymentStatusDetails**](PaymentStatusDetails.md) |  |  [optional]
**payer** | [**Payer**](Payer.md) |  |  [optional]
**payeeDetails** | [**Payee**](Payee.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**amountDetails** | [**Amount**](Amount.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**firstPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**firstPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**nextPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**nextPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**finalPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**finalPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**numberOfPayments** | **Integer** |  |  [optional]
**previousPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**previousPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**chargeDetails** | [**List&lt;ChargeDetails&gt;**](ChargeDetails.md) |  |  [optional]
**scheduledPaymentType** | **String** |  |  [optional]
**scheduledPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**frequency** | [**FrequencyResponse**](FrequencyResponse.md) |  |  [optional]
**currencyOfTransfer** | **String** |  |  [optional]
**purpose** | **String** |  |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional]
**exchangeRate** | [**ExchangeRateInformationResponse**](ExchangeRateInformationResponse.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
FAILED | &quot;FAILED&quot;
DECLINED | &quot;DECLINED&quot;
COMPLETED | &quot;COMPLETED&quot;
COMPLETED_SETTLEMENT_IN_PROCESS | &quot;COMPLETED_SETTLEMENT_IN_PROCESS&quot;
EXPIRED | &quot;EXPIRED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
NORMAL | &quot;NORMAL&quot;
URGENT | &quot;URGENT&quot;



