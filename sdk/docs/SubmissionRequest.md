

# SubmissionRequest

__Mandatory__. The payment request object defining the details of the payment for execution under the Variable Recurring Payment consent.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentIdempotencyId** | **String** | __Mandatory__. A unique identifier that you must provide to identify the payment. This can be any alpha-numeric string but is limited to a maximum of 35 characters. | 
**psuAuthenticationMethod** | **String** | __Mandatory__. Chosen authentication method for submission step. Allowed values are [SCA_REQUIRED, SCA_NOT_REQUIRED]. | 
**contextType** | **PaymentContextType** |  |  [optional]
**paymentAmount** | [**Amount**](Amount.md) |  | 



