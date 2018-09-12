
# PaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**authUrl** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
FAILED | &quot;FAILED&quot;
DECLINED | &quot;DECLINED&quot;
COMPLETED | &quot;COMPLETED&quot;
UNKNOWN | &quot;UNKNOWN&quot;



