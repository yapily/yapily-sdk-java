
# TransferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromAccountId** | **String** |  |  [optional]
**toAccountId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**balance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currency** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
FAILED | &quot;FAILED&quot;
DECLINED | &quot;DECLINED&quot;
COMPLETED | &quot;COMPLETED&quot;
UNKNOWN | &quot;UNKNOWN&quot;



