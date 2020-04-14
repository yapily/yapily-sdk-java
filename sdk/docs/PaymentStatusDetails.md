
# PaymentStatusDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusReason** | **String** |  |  [optional]
**statusReasonDescription** | **String** |  |  [optional]
**statusUpdateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**multiAuthorisationStatus** | [**MultiAuthorisation**](MultiAuthorisation.md) |  |  [optional]


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



