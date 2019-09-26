
# PaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**paymentIdempotencyId** | **String** |  |  [optional]
**institutionConsentId** | **String** |  |  [optional]
**paymentLifecycleId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusDetails** | [**PaymentStatusDetails**](PaymentStatusDetails.md) |  |  [optional]
**payeeDetails** | [**Payee**](Payee.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**amountDetails** | [**Amount**](Amount.md) |  |  [optional]
**firstPaymentAmountDetails** | [**Amount**](Amount.md) |  |  [optional]
**firstPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**nextPaymentAmountDetails** | [**Amount**](Amount.md) |  |  [optional]
**nextPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**finalPaymentAmountDetails** | [**Amount**](Amount.md) |  |  [optional]
**finalPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**previousPaymentAmountDetails** | [**Amount**](Amount.md) |  |  [optional]
**previousPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**chargeDetails** | [**List&lt;ChargeDetails&gt;**](ChargeDetails.md) |  |  [optional]
**scheduledPaymentType** | **String** |  |  [optional]
**scheduledPaymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**frequencyDetails** | [**FrequencyResponse**](FrequencyResponse.md) |  |  [optional]
**accountId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
FAILED | &quot;FAILED&quot;
DECLINED | &quot;DECLINED&quot;
COMPLETED | &quot;COMPLETED&quot;
EXPIRED | &quot;EXPIRED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



