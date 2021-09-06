# Yapily Java SDK
[![GitHub version](https://d25lcipzij17d.cloudfront.net/badge.svg?id=gh&type=6&v=1.64.0&x2=0)](http://badge.fury.io/gh/boennemann%2Fbadges)

This SDK was generated using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen). The SDK can be used as a module in your code and the examples demonstrate how to connect
to financial institutions integrated with Yapily.

## Requirements

To connect to the Yapily API, you will need to register your 
application at [https://dashboard.yapily.com]().

Specify the financial institutions you want to work with and save your application. You will then be prompted to download your application credentials. 
These application credentials can then be used to authorise your requests against the [yapily API](https://docs.yapily.com/#get-started).

## Installation

The SDK is currently available in the Yapily maven repository and 
can be included in your project 
by adding it to your dependencies

#### Maven

Repository:

```xml
<repositories>
   <!-- other repos-->
   <repository>
       <id>yapily-repo</id>
       <name>yapily-repo</name>
       <url>http://maven.yapily.com/</url>
   </repository>
</repositories>
```

Dependency:

```xml
<dependencies>
   <!-- other dependencies -->
   <dependency>
       <groupId>yapily</groupId>
       <artifactId>yapily-sdk</artifactId>
       <version>1.64.0</version>
   </dependency>
</dependencies>
```

#### Gradle

Repository:

```groovy
repositories {
    // other repos
    maven {
        url "http://maven.yapily.com/"
    }
}
```

Dependency:

```groovy
compile group: 'yapily', name: 'yapily-sdk', version: '1.64.0'
```

#### Download JAR

The JAR can also be downloaded from a tagged release, 
or this project can be cloned/downloaded and packaged into a 
library JAR to be included in your project.

## Usage

Sample usages of the SDK can be seen in the `examples` folder.

- Configure the default api client

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure the API authentication
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
// Replace these demo constants with your application credentials
basicAuth.setUsername(APPLICATION_ID);
basicAuth.setPassword(APPLICATION_SECRET);
```

- Or configure a new one for multiple application cases 

```java
ApiClient applicationClient = new ApiClient();
// Configure the API authentication
HttpBasicAuth basicAuth = (HttpBasicAuth) applicationClient.getAuthentication("basicAuth");
// Replace these demo constants with your application credentials
basicAuth.setUsername(APPLICATION_ID);
basicAuth.setPassword(APPLICATION_SECRET);
InstitutionsApi institutionsApi = new InstitutionsApi();
institutionsApi.setApiClient(applicationClient);
```

- Retrieve a list of available financial institutions to connect to

```java
InstitutionsApi institutionsApi = new InstitutionsApi();
List<Institution> institutions = institutionsApi.getInstitutionsUsingGET().getData();
```

- Creating users and retrieving users for your application registered in the Yapily Dashboard
```java
final ApplicationUsersApi applicationUsersApi = new ApplicationUsersApi();
NewApplicationUser exampleUser = new NewApplicationUser();
exampleUser.setApplicationUserId("java-sdk@yapily.com");
applicationUsersApi.addUserUsingPOST(exampleUser);

List<ApplicationUser> users = applicationUsersApi.getUsersUsingGET();
```

- Create an authorization url in order for your users to give consent on accessing their account data. 

```java
final AccountsApi accountsApi = new AccountsApi();
AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest();
accountAuthorisationRequest.setApplicationUserId(applicationUserId);
accountAuthorisationRequest.setInstitutionId(institutionId);
/**
* Use the defaults
*/
accountAuthorisationRequest.setAccountRequest(new AccountRequest());
ApiResponseOfAuthorisationRequestResponse authorizationResponse = accountsApi.initiateAccountRequestUsingPOST(accountAuthorisationRequest, null, null, null);
String directUrl = authorizationResponse.getData().getAuthorisationUrl();
```

- Get the most resent Consent for the configured user and institution. Make sure to check that the Consent is AUTHORIZED otherwise fail the request
```java
Consent consent = consentsApi.getConsentsUsingGET(
        Collections.singletonList(applicationUserId),
        Collections.emptyList(),
        Collections.singletonList(institutionId),
        Collections.emptyList(),
        null,
        null,
        1,
        null).getData().stream()
        .filter(c -> c.getStatus().equals(Consent.StatusEnum.AUTHORIZED))
        .findFirst()
        .orElseThrow(() -> new RuntimeException(String.format("No valid consent token present for application user %s", applicationUserId)));

```
 
- Providing that the user has given consent and you have an AUTHORIZED Consent, obtain the user account details using the consent token

```java
String consentToken = consent.getConsentToken();
ApiListResponseOfAccount accountsResponse = accountsApi.getAccountsUsingGET(consentToken);
List<Account> accounts = accountsResponse.getData();
```

- Return user transaction details, using an account the user has given consent to.

```java
String consentToken = consent.getConsentToken();
ApiListResponseOfTransaction transactionsResponse = transactionsApi.getTransactionsUsingGET(
                                        consentToken, 
                                        accountId, 
                                        Collections.emptyList(),
                                        "1980-01-01T00:00:00.000Z",
                                        "2020-01-01T00:00:00.000Z",
                                        10,
                                        null,
                                        0,
                                        null);
List<Transaction> transactions = transactionsResponse.getData();
```

- Check that the identity feature is provided for this institution.
```java
Institution institution = institutionsApi.getInstitutionUsingGET(institutionId);
Boolean supportsIdentity = institution.getFeatures().stream()
        .anyMatch(featuresEnum -> featuresEnum != null && featuresEnum.equals(Institution.FeaturesEnum.IDENTITY));
```

- If the identity feature is supported return user identity details. This will fail if the identity feature is not supported.
```java
String consentToken = consent.getConsentToken();
IdentityApi identityApi = new IdentityApi();
ApiResponseOfIdentity identityResp = identityApi.getIdentityUsingGET(consentToken); 
Identity identity = identityResp.getData();
```

- Create a new payment request detailing what type of payment you want to issue on behalf of your user e.g. a Domestic 
payment to send £1.00 to another account using an account number and sort code:

```java
PaymentRequest paymentRequest = new PaymentRequest();

Amount amount = new Amount();
amount.setAmount(new BigDecimal(1));
amount.setCurrency("GBP");

Payee payee = new Payee();
payee.setName("John Doe");

List<AccountIdentification> payeeAccountIdentifications = new ArrayList<>();

AccountIdentification accountNumberIdentification = new AccountIdentification();
accountNumberIdentification.setType(AccountIdentification.TypeEnum.ACCOUNT_NUMBER);
accountNumberIdentification.setIdentification("70000005");
payeeAccountIdentifications.add(accountNumberIdentification);

AccountIdentification sortCodeIdentification = new AccountIdentification();
sortCodeIdentification.setType(AccountIdentification.TypeEnum.SORT_CODE);
sortCodeIdentification.setIdentification("700001");
payeeAccountIdentifications.add(sortCodeIdentification);

payee.setAccountIdentifications(payeeAccountIdentifications);

paymentRequest.setAmount(amount);
paymentRequest.setPayee(payee);
paymentRequest.setType(PaymentRequest.TypeEnum.DOMESTIC_PAYMENT);
paymentRequest.setReference("Sending £1.00 to John Doe via. Yapily");
paymentRequest.setPaymentIdempotencyId("anyUniqueStringOver18characters");
```

- Create a new payment authorisation request using the payment request to generate an authorization url that your users can use to authorize the payment:

```java
PaymentsApi paymentsApi = new PaymentsApi();
PaymentAuthorisationRequest paymentAuthorisationRequest = new PaymentAuthorisationRequest();
paymentAuthorisationRequest.setApplicationUserId(applicationUserId);
paymentAuthorisationRequest.setInstitutionId(institutionId);
paymentAuthorisationRequest.setPaymentRequest(paymentRequest);
ApiResponseOfPaymentAuthorisationRequestResponse authorizationResponse = 
                        paymentsApi.createPaymentAuthorisationUsingPOST(paymentAuthorisationRequest, null, null, null);
String url = authorizationResponse.getData().getAuthorisationUrl();
```

- Submit a payment request using the same payment request object in the authorization request and the AUTHORIZED consent given by the user:

```java
String consentToken = consent.getConsentToken();
ApiResponseOfPaymentResponse response = paymentsApi.createPaymentUsingPOST(consentToken, paymentRequest);
```

- Check the payment status:
```java
String consentToken = consent.getConsentToken();
String paymentId =  paymentResponse.getData().getId();
ApiResponseOfPaymentResponse apiResponseOfPaymentResponse = paymentsApi.getPaymentStatusUsingGET(paymentId, consentToken);
```


## Further information

For more information on how to get connected, visit the [Yapily Knowledge Base](https://kb.yapily.com).

###### [Website](https://yapily.com) | [Legal](https://yapily.com/legal-policies) | [Contact Us](mailto:info@yapily.com) 

