
# UserDeleteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**deleteStatus** | [**DeleteStatusEnum**](#DeleteStatusEnum) |  |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**userConsents** | [**List&lt;ConsentDeleteResponse&gt;**](ConsentDeleteResponse.md) |  |  [optional]


<a name="DeleteStatusEnum"></a>
## Enum: DeleteStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;



