# yapily-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>yapily</groupId>
    <artifactId>yapily-sdk</artifactId>
    <version>0.0.74</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "yapily:yapily-sdk:0.0.74"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/yapily-sdk-0.0.74.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import yapily.*;
import yapily.auth.*;
import yapily.sdk.*;
import yapily.sdk.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: tokenAuth
        OAuth tokenAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setAccessToken("YOUR ACCESS TOKEN");

        AccountsApi apiInstance = new AccountsApi();
        String consent = "consent_example"; // String | Consent Token
        String accountId = "accountId_example"; // String | accountId
        try {
            ApiResponseOfAccount result = apiInstance.getAccountUsingGET(consent, accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccountUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.yapily.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getAccountUsingGET**](docs/AccountsApi.md#getAccountUsingGET) | **GET** /accounts/{accountId} | Get account
*AccountsApi* | [**getAccountsUsingGET**](docs/AccountsApi.md#getAccountsUsingGET) | **GET** /accounts | Get accounts
*AccountsApi* | [**initiateAccountRequestUsingPOST**](docs/AccountsApi.md#initiateAccountRequestUsingPOST) | **POST** /account-auth-requests | Initiate a new account request for user to authorize
*ApplicationUsersApi* | [**addUserUsingPOST**](docs/ApplicationUsersApi.md#addUserUsingPOST) | **POST** /users | Add an application user
*ApplicationUsersApi* | [**deleteUserUsingDELETE**](docs/ApplicationUsersApi.md#deleteUserUsingDELETE) | **DELETE** /users/{userUuid} | Delete an application user
*ApplicationUsersApi* | [**getUserUsingGET**](docs/ApplicationUsersApi.md#getUserUsingGET) | **GET** /users/{userUuid} | Get an application user
*ApplicationUsersApi* | [**getUsersUsingGET**](docs/ApplicationUsersApi.md#getUsersUsingGET) | **GET** /users | Get application users
*ApplicationsApi* | [**getApplicationMeUsingGET**](docs/ApplicationsApi.md#getApplicationMeUsingGET) | **GET** /me | Returns the details of the application that owns the request credentials
*ApplicationsApi* | [**getJwksUsingGET**](docs/ApplicationsApi.md#getJwksUsingGET) | **GET** /jwks | JSON Web Key Set (JWKS) for authenticated application
*ApplicationsApi* | [**revokeTokensUsingPOST**](docs/ApplicationsApi.md#revokeTokensUsingPOST) | **POST** /revoke-tokens | Revoke existing access tokens for application, which will also generate a new public key discoverable via /jwks
*ConsentsApi* | [**addConsentUsingPOST**](docs/ConsentsApi.md#addConsentUsingPOST) | **POST** /users/{userUuid}/consents | Post consent
*ConsentsApi* | [**deleteUsingDELETE**](docs/ConsentsApi.md#deleteUsingDELETE) | **DELETE** /consents/{consentId} | Delete consent
*ConsentsApi* | [**getConsentByIdUsingGET**](docs/ConsentsApi.md#getConsentByIdUsingGET) | **GET** /consents/{consentId} | Get consent
*ConsentsApi* | [**getUserConsentsUsingGET**](docs/ConsentsApi.md#getUserConsentsUsingGET) | **GET** /users/{userUuid}/consents | Get user consents
*IdentityApi* | [**getIdentityUsingGET**](docs/IdentityApi.md#getIdentityUsingGET) | **GET** /identity | Get identity
*InstitutionsApi* | [**getFeatureDetailsUsingGET**](docs/InstitutionsApi.md#getFeatureDetailsUsingGET) | **GET** /features | Retrieve details for Yapily&#39;s institution features
*InstitutionsApi* | [**getInstitutionUsingGET**](docs/InstitutionsApi.md#getInstitutionUsingGET) | **GET** /institutions/{institutionId} | Retrieves details of a specific institution available in Yapily
*InstitutionsApi* | [**getInstitutionsUsingGET**](docs/InstitutionsApi.md#getInstitutionsUsingGET) | **GET** /institutions | Retrieves the list of institutions available in Yapily
*InstitutionsOpenDataApi* | [**getATMDataUsingGET**](docs/InstitutionsOpenDataApi.md#getATMDataUsingGET) | **GET** /institutions/{institutionId}/atms | Retrieves data about all ATMs of the selected institution
*InstitutionsOpenDataApi* | [**getPersonalCurrentAccountsUsingGET**](docs/InstitutionsOpenDataApi.md#getPersonalCurrentAccountsUsingGET) | **GET** /institutions/{institutionId}/personal-current-accounts | Retrieves details of personal current accounts for an institution
*OAuthApi* | [**oauthToken**](docs/OAuthApi.md#oauthToken) | **POST** /oauth/token | Retrieve Access Token
*PaymentsApi* | [**createPaymentInitiationUsingPOST**](docs/PaymentsApi.md#createPaymentInitiationUsingPOST) | **POST** /payment-sortcode-auth-requests | Initiate a new single payment for user to authorise
*PaymentsApi* | [**createPaymentUsingPOST**](docs/PaymentsApi.md#createPaymentUsingPOST) | **POST** /payment-sortcode | Create a new single payment
*PaymentsApi* | [**getPaymentStatusUsingGET**](docs/PaymentsApi.md#getPaymentStatusUsingGET) | **GET** /payments/{paymentId} | Get status of a payment
*TransactionsApi* | [**getTransactionsUsingGET**](docs/TransactionsApi.md#getTransactionsUsingGET) | **GET** /accounts/{accountId}/transactions | Get account transactions
*TransfersApi* | [**transferUsingPUT**](docs/TransfersApi.md#transferUsingPUT) | **PUT** /accounts/{accountId}/transfer | Transfer money from one account to another account accessible with the same consent


## Documentation for Models

 - [ATMBranch](docs/ATMBranch.md)
 - [ATMGeoLocation](docs/ATMGeoLocation.md)
 - [ATMGeographicCoordinates](docs/ATMGeographicCoordinates.md)
 - [ATMLocation](docs/ATMLocation.md)
 - [ATMLocationOtherLocationCategory](docs/ATMLocationOtherLocationCategory.md)
 - [ATMMapServiceLinks](docs/ATMMapServiceLinks.md)
 - [ATMOpenData](docs/ATMOpenData.md)
 - [ATMOpenDataATM](docs/ATMOpenDataATM.md)
 - [ATMOpenDataBrand](docs/ATMOpenDataBrand.md)
 - [ATMOpenDataOtherATMServices](docs/ATMOpenDataOtherATMServices.md)
 - [ATMOpenDataOtherAccessibility](docs/ATMOpenDataOtherAccessibility.md)
 - [ATMOpenDataResponse](docs/ATMOpenDataResponse.md)
 - [ATMPostalAddress](docs/ATMPostalAddress.md)
 - [ATMSite](docs/ATMSite.md)
 - [Account](docs/Account.md)
 - [AccountAuthorisationRequest](docs/AccountAuthorisationRequest.md)
 - [AccountRequest](docs/AccountRequest.md)
 - [Address](docs/Address.md)
 - [AgeEligibility](docs/AgeEligibility.md)
 - [ApiListResponseOfAccount](docs/ApiListResponseOfAccount.md)
 - [ApiListResponseOfFeatureDetails](docs/ApiListResponseOfFeatureDetails.md)
 - [ApiListResponseOfInstitution](docs/ApiListResponseOfInstitution.md)
 - [ApiListResponseOfTransaction](docs/ApiListResponseOfTransaction.md)
 - [ApiResponseOfAccount](docs/ApiResponseOfAccount.md)
 - [ApiResponseOfAuthorisationRequestResponse](docs/ApiResponseOfAuthorisationRequestResponse.md)
 - [ApiResponseOfConsent](docs/ApiResponseOfConsent.md)
 - [ApiResponseOfIdentity](docs/ApiResponseOfIdentity.md)
 - [ApiResponseOfListOfATMOpenDataResponse](docs/ApiResponseOfListOfATMOpenDataResponse.md)
 - [ApiResponseOfListOfPersonalCurrentAccountData](docs/ApiResponseOfListOfPersonalCurrentAccountData.md)
 - [ApiResponseOfPaymentResponse](docs/ApiResponseOfPaymentResponse.md)
 - [ApiResponseOfTransferResponse](docs/ApiResponseOfTransferResponse.md)
 - [Application](docs/Application.md)
 - [ApplicationUser](docs/ApplicationUser.md)
 - [AuthorisationRequestResponse](docs/AuthorisationRequestResponse.md)
 - [Consent](docs/Consent.md)
 - [CoreProduct](docs/CoreProduct.md)
 - [Country](docs/Country.md)
 - [CreateConsentAccessToken](docs/CreateConsentAccessToken.md)
 - [CreditCheck](docs/CreditCheck.md)
 - [CreditInterest](docs/CreditInterest.md)
 - [CreditInterestCreditInterestEligibility](docs/CreditInterestCreditInterestEligibility.md)
 - [CreditInterestTierBand](docs/CreditInterestTierBand.md)
 - [CreditInterestTierBandSet](docs/CreditInterestTierBandSet.md)
 - [Duration](docs/Duration.md)
 - [Eligibility](docs/Eligibility.md)
 - [EligibilityOtherEligibility](docs/EligibilityOtherEligibility.md)
 - [FeatureDetails](docs/FeatureDetails.md)
 - [FilterAndSort](docs/FilterAndSort.md)
 - [IDVerificationCheck](docs/IDVerificationCheck.md)
 - [Identity](docs/Identity.md)
 - [IdentityAddress](docs/IdentityAddress.md)
 - [Institution](docs/Institution.md)
 - [InstitutionConsent](docs/InstitutionConsent.md)
 - [Media](docs/Media.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantInfo](docs/MerchantInfo.md)
 - [NewApplicationUser](docs/NewApplicationUser.md)
 - [Next](docs/Next.md)
 - [OtherApplicationFrequency](docs/OtherApplicationFrequency.md)
 - [OtherBankInterestType](docs/OtherBankInterestType.md)
 - [OtherCalculationFrequency](docs/OtherCalculationFrequency.md)
 - [OtherFeeRateType](docs/OtherFeeRateType.md)
 - [OtherFeeType](docs/OtherFeeType.md)
 - [OtherResidencyType](docs/OtherResidencyType.md)
 - [OtherType](docs/OtherType.md)
 - [Overdraft](docs/Overdraft.md)
 - [OverdraftFeeApplicableRange](docs/OverdraftFeeApplicableRange.md)
 - [OverdraftOtherFeeType](docs/OverdraftOtherFeeType.md)
 - [OverdraftOverdraftFeeChargeCap](docs/OverdraftOverdraftFeeChargeCap.md)
 - [OverdraftOverdraftFeeChargeDetail](docs/OverdraftOverdraftFeeChargeDetail.md)
 - [OverdraftOverdraftFeesCharges](docs/OverdraftOverdraftFeesCharges.md)
 - [OverdraftOverdraftFeesCharges1](docs/OverdraftOverdraftFeesCharges1.md)
 - [OverdraftOverdraftTierBand](docs/OverdraftOverdraftTierBand.md)
 - [OverdraftOverdraftTierBandSet](docs/OverdraftOverdraftTierBandSet.md)
 - [Pagination](docs/Pagination.md)
 - [PaymentResponse](docs/PaymentResponse.md)
 - [PersonalCurrentAccountBrand](docs/PersonalCurrentAccountBrand.md)
 - [PersonalCurrentAccountData](docs/PersonalCurrentAccountData.md)
 - [PersonalCurrentAccountPCA](docs/PersonalCurrentAccountPCA.md)
 - [PersonalCurrentAccountPCAMarketingState](docs/PersonalCurrentAccountPCAMarketingState.md)
 - [ResidencyEligibility](docs/ResidencyEligibility.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [ResponseListMeta](docs/ResponseListMeta.md)
 - [ResponseMeta](docs/ResponseMeta.md)
 - [SortCodePaymentAuthRequest](docs/SortCodePaymentAuthRequest.md)
 - [SortCodePaymentRequest](docs/SortCodePaymentRequest.md)
 - [TemporalUnit](docs/TemporalUnit.md)
 - [Transaction](docs/Transaction.md)
 - [TransferRequest](docs/TransferRequest.md)
 - [TransferResponse](docs/TransferResponse.md)
 - [YapilyAccessToken](docs/YapilyAccessToken.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication

### tokenAuth

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



