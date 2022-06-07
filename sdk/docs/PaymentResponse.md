

# PaymentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**institutionConsentId** | **String** |  |  [optional]
**paymentIdempotencyId** | **String** |  |  [optional]
**paymentLifecycleId** | **String** |  |  [optional]
**status** | **PaymentStatus** |  |  [optional]
**statusDetails** | [**PaymentStatusDetails**](PaymentStatusDetails.md) |  |  [optional]
**payer** | [**Payer**](Payer.md) |  |  [optional]
**payeeDetails** | [**Payee**](Payee.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**amount** | **BigDecimal** |  |  [optional]
**currency** | **String** |  |  [optional]
**amountDetails** | [**Amount**](Amount.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**firstPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**firstPaymentDateTime** | **OffsetDateTime** |  |  [optional]
**nextPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**nextPaymentDateTime** | **OffsetDateTime** |  |  [optional]
**finalPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**finalPaymentDateTime** | **OffsetDateTime** |  |  [optional]
**numberOfPayments** | **Integer** |  |  [optional]
**previousPaymentAmount** | [**Amount**](Amount.md) |  |  [optional]
**previousPaymentDateTime** | **OffsetDateTime** |  |  [optional]
**chargeDetails** | [**List&lt;PaymentChargeDetails&gt;**](PaymentChargeDetails.md) |  |  [optional]
**scheduledPaymentType** | **String** |  |  [optional]
**scheduledPaymentDateTime** | **OffsetDateTime** |  |  [optional]
**frequency** | [**FrequencyResponse**](FrequencyResponse.md) |  |  [optional]
**currencyOfTransfer** | **String** |  |  [optional]
**purpose** | **String** |  |  [optional]
**priority** | **PriorityCodeEnum** |  |  [optional]
**exchangeRate** | [**ExchangeRateInformationResponse**](ExchangeRateInformationResponse.md) |  |  [optional]
**refundAccount** | [**RefundAccount**](RefundAccount.md) |  |  [optional]
**bulkAmountSum** | **BigDecimal** |  |  [optional]



