

# Consent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**userUuid** | **UUID** |  |  [optional]
**applicationUserId** | **String** |  |  [optional]
**referenceId** | **String** |  |  [optional]
**institutionId** | **String** |  |  [optional]
**status** | **AuthorisationStatus** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**transactionFrom** | **OffsetDateTime** |  |  [optional]
**transactionTo** | **OffsetDateTime** |  |  [optional]
**expiresAt** | **OffsetDateTime** |  |  [optional]
**timeToExpireInMillis** | **Long** |  |  [optional]
**timeToExpire** | **String** |  |  [optional]
**featureScope** | **Set&lt;FeatureEnum&gt;** |  |  [optional]
**consentToken** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**authorizedAt** | **OffsetDateTime** |  |  [optional]
**lastConfirmedAt** | **OffsetDateTime** | The time that the PSU last confirmed access to their account information, either through full authentication with the institution, or through reconfirmation with the TPP. |  [optional]
**reconfirmBy** | **OffsetDateTime** | The time by which the consent should be reconfirmed to ensure continued access to the account information. |  [optional]
**institutionConsentId** | **String** |  |  [optional]



