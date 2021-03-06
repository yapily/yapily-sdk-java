
# AccountEmbeddedAuthorisationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userUuid** | **String** | Uuid of the application user who will authorise access to their data. Either the userUuid or applicationUserId must be provided. |  [optional]
**applicationUserId** | **String** | Descriptive identifier for the application user.Either the userUuid or applicationUserId must be provided. |  [optional]
**forwardParameters** | **List&lt;String&gt;** |  |  [optional]
**institutionId** | **String** |  | 
**callback** | **String** |  | 
**redirect** | [**RedirectRequest**](RedirectRequest.md) |  |  [optional]
**accountRequest** | [**AccountRequest**](AccountRequest.md) |  |  [optional]
**oneTimeToken** | **Boolean** |  | 
**userCredentials** | [**UserCredentials**](UserCredentials.md) |  |  [optional]
**selectedScaMethod** | [**ScaMethod**](ScaMethod.md) |  |  [optional]
**scaCode** | **String** |  |  [optional]



