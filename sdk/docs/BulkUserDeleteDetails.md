
# BulkUserDeleteDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**invalidApplicationUserIds** | **List&lt;String&gt;** |  |  [optional]
**invalidUserUuids** | **List&lt;String&gt;** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**users** | [**List&lt;UserDeleteResponse&gt;**](UserDeleteResponse.md) |  |  [optional]
**links** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
COMPLETED | &quot;COMPLETED&quot;
FAILED | &quot;FAILED&quot;



