

# SweepingControlParameters

Define the restrictions and limits for payment orders as part of Sweeping VRP consent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**psuAuthenticationMethods** | **List&lt;String&gt;** | __Mandatory__. Defines the authentication method(s) allowed in payment submission step. Allowed values are [SCA_REQUIRED, SCA_NOT_REQUIRED]. | 
**periodicLimits** | [**List&lt;SweepingPeriodicLimits&gt;**](SweepingPeriodicLimits.md) |  | 
**maxAmountPerPayment** | [**Amount**](Amount.md) | __Mandatory__. Max amount that can be submitted per payment. | 
**validFrom** | **OffsetDateTime** | __Optional__. Start date when the consent becomes valid. |  [optional]
**validTo** | **OffsetDateTime** | __Optional__. End date when the consent expires and becomes invalid. |  [optional]



