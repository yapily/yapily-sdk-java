

# AccountAuthorisationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userUuid** | **UUID** | &#x60;User&#x60; for which the authorisation request was created. |  [optional]
**applicationUserId** | **String** | __Conditional__. User-friendly identifier of the &#x60;User&#x60; that provides authorisation. If a &#x60;User&#x60; with the specified &#x60;applicationUserId&#x60; exists, it will be used otherwise, a new &#x60;User&#x60; with the specified &#x60;applicationUserId&#x60; will be created and used. Either the &#x60;userUuid&#x60; or &#x60;applicationUserId&#x60; must be provided. |  [optional]
**forwardParameters** | **List&lt;String&gt;** | Extra parameters the TPP may want to get forwarded in the callback request after the PSU redirect. |  [optional]
**institutionId** | **String** | __Mandatory__. The reference to the &#x60;Institution&#x60; which identifies which institution the authorisation request is sent to. | 
**callback** | **String** | __Optional__. The server to redirect the user to after the user completes the authorisation at the &#x60;Institution&#x60;. &lt;br&gt;&lt;br&gt;See [Using a callback (Optional)](https://docs.yapily.com/pages/knowledge/yapily-concepts/callback_url/#using-a-callback-optional) for more information. |  [optional]
**redirect** | [**RedirectRequest**](RedirectRequest.md) |  |  [optional]
**oneTimeToken** | **Boolean** | __Conditional__. Used to receive a &#x60;oneTimeToken&#x60; rather than a &#x60;consentToken&#x60; at the &#x60;callback&#x60; for additional security. This can only be used when the &#x60;callback&#x60; is set. &lt;br&gt;&lt;br&gt;See [Using a callback with an OTT (Optional)](https://docs.yapily.com/pages/knowledge/yapily-concepts/callback_url/#using-a-callback-with-an-ott-optional) for more information. |  [optional]
**accountRequest** | [**AccountRequest**](AccountRequest.md) |  |  [optional]



