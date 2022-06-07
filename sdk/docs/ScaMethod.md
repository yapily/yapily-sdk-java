

# ScaMethod

__Conditional__. Used to update the authorisation with the sca method of the user's choice for the `Institution` that uses the embedded authorisation flow. If the user has multiple sca methods configured, the `Institution` will allow the user to select from each of these options. <br><br>When the user has multiple sca methods for the `Institution`, this is the second step required in the embedded authorisation flow to authorise the `Consent`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | __Mandatory__. The id of the sca method provided by the &#x60;Institution&#x60; | 
**type** | **Type** |  |  [optional]
**description** | **String** | __Optional__. A description of the sca method if provided by the &#x60;Institution&#x60; |  [optional]



