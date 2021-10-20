
# UserDeleteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**deleteStatus** | [**DeleteStatusEnum**](#DeleteStatusEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**userConsents** | [**List&lt;ConsentDeleteResponse&gt;**](ConsentDeleteResponse.md) |  |  [optional]


<a name="DeleteStatusEnum"></a>
## Enum: DeleteStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;



