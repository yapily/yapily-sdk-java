

# SubmissionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**paymentIdempotencyId** | **String** |  |  [optional]
**institutionConsentId** | **String** |  |  [optional]
**status** | **PaymentStatus** |  |  [optional]
**statusDetails** | [**PaymentStatusDetails**](PaymentStatusDetails.md) |  |  [optional]
**initiationDetails** | [**InitiationDetails**](InitiationDetails.md) |  | 
**submissionDetails** | [**SubmissionDetails**](SubmissionDetails.md) |  | 
**payer** | [**Payer**](Payer.md) |  |  [optional]
**refundAccount** | [**RefundAccount**](RefundAccount.md) |  |  [optional]
**expectedExecutionTime** | **OffsetDateTime** |  |  [optional]
**expectedSettlementTime** | **OffsetDateTime** |  |  [optional]



