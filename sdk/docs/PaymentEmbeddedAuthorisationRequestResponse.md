

# PaymentEmbeddedAuthorisationRequestResponse


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
**institutionConsentId** | **String** |  |  [optional]
**charges** | [**List&lt;PaymentChargeDetails&gt;**](PaymentChargeDetails.md) |  |  [optional]
**exchangeRateInformation** | [**ExchangeRateInformationResponse**](ExchangeRateInformationResponse.md) |  |  [optional]
**authorisationUrl** | **String** |  |  [optional]
**qrCodeUrl** | **String** |  |  [optional]
**explanation** | **String** |  |  [optional]
**scaMethods** | [**List&lt;ScaMethod&gt;**](ScaMethod.md) |  |  [optional]
**selectedScaMethod** | [**ScaMethod**](ScaMethod.md) |  |  [optional]



