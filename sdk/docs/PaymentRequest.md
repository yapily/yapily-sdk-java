
# PaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentIdempotencyId** | **String** |  | 
**payerAccountIdentifications** | [**List&lt;AccountIdentification&gt;**](AccountIdentification.md) |  |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**paymentDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**payee** | [**Payee**](Payee.md) |  | 
**periodicPayments** | [**PeriodicPaymentRequest**](PeriodicPaymentRequest.md) |  |  [optional]


<a name="ContextTypeEnum"></a>
## Enum: ContextTypeEnum
Name | Value
---- | -----
BILL | &quot;BILL&quot;
GOODS | &quot;GOODS&quot;
SERVICES | &quot;SERVICES&quot;
OTHER | &quot;OTHER&quot;
PERSON_TO_PERSON | &quot;PERSON_TO_PERSON&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYMENT | &quot;DOMESTIC_PAYMENT&quot;
VARIABLE_RECURRING_PAYMENT | &quot;DOMESTIC_VARIABLE_RECURRING_PAYMENT&quot;
SCHEDULED_PAYMENT | &quot;DOMESTIC_SCHEDULED_PAYMENT&quot;
PERIODIC_PAYMENT | &quot;DOMESTIC_PERIODIC_PAYMENT&quot;



