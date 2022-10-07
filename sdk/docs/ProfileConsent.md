

# ProfileConsent

Object returned when creating a User Profile.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The id of the ProfileConsent |  [optional]
**status** | **String** | The status, can be PENDING, COMPLETED or ERROR. |  [optional]
**userId** | **UUID** | The userUuid. |  [optional]
**referenceConsentId** | **UUID** | The referenceConsentId. |  [optional]
**institutionId** | **String** | The id of the Institution. |  [optional]
**createdAt** | **OffsetDateTime** | When a profile consent is created. |  [optional]
**expiresAt** | **OffsetDateTime** | When a profile consent is expired after created + X. |  [optional]
**dataInsertedAt** | **OffsetDateTime** | After data retrieval from aggregated profile consent is completed. |  [optional]



