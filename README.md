# Yapily Java SDK
[![GitHub version](https://d25lcipzij17d.cloudfront.net/badge.svg?id=gh&type=6&v=0.0.143&x2=0)](http://badge.fury.io/gh/boennemann%2Fbadges)

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
       <version>0.0.143</version>
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
compile group: 'yapily', name: 'yapily-sdk', version: '0.0.143'
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
final ApplicationUsersApi usersApi = new ApplicationUsersApi();
NewApplicationUser user = new NewApplicationUser();
user.setReferenceId("Bojack");
usersApi.addUserUsingPOST(user);

List<ApplicationUser> users = usersApi.listUsers();
```

- Create an authorization url in order for your users to give consent on accessing their account data. 

```java
final AccountsApi accountsApi = new AccountsApi();
AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest();
accountAuthorisationRequest.setUserUuid(userUuid);
accountAuthorisationRequest.setInstitutionId(institutionId);
/**
* Use the defaults
*/
accountAuthorisationRequest.setAccountRequest(new AccountRequest());
ApiResponseOfAuthorisationRequestResponse authorizationResponse = accountsApi.initiateAccountRequestUsingPOST(accountAuthorisationRequest);
String directUrl = authorizationResponse.getData().getAuthorisationUrl();
```

- Receive consents issued by your user by authorizing to a specific institution
```java
// Get user consents
final ConsentsApi consentsApi = new ConsentsApi();
List<Consent> consents = consentsApi.getUserConsentsUsingGET(userUuid, institutionId);

```
 
- Return user account details using the consent the user has given

```java
String consentToken = consent.getConsentToken();
ApiListResponseOfAccount accountsResponse = accountsApi.getAccountsUsingGET(consentToken);
List<Account> accounts = accountsResponse.getData();
```

- Return user transaction details, using an account the user has given consent to.

```java
String consentToken = consent.getConsentToken();
ApiListResponseOfTransaction transactionsResponse = transactionsApi.getTransactionsUsingGET(consentToken, accountId, new ArrayList<>());
List<Transaction> transactions = transactionsResponse.getData();
```

- Return user identity details
```java
String consentToken = consent.getConsentToken();
IdentityApi identityApi = new IdentityApi();
ApiResponseOfIdentity identityResp = identityApi.getIdentityUsingGET(consentToken); 
Identity identity = identityResp.getData();
```

- Create an authorization url in order for your users to give consent on executing a payment. 

```java
SortCodePaymentRequest sortCodePaymentRequest = new SortCodePaymentRequest();
sortCodePaymentRequest.setName("name");
sortCodePaymentRequest.setAmount(new BigDecimal("2.9"));
sortCodePaymentRequest.setReference("Up to 35 characters");
sortCodePaymentRequest.setCountry("GB");
sortCodePaymentRequest.setCurrency("GBP");
sortCodePaymentRequest.setAccountNumber("accountNumber");
sortCodePaymentRequest.setSortCode("123456");

SortCodePaymentAuthRequest authRequest = new SortCodePaymentAuthRequest();
sortCodePaymentAuthRequest.setInstitutionId(institutionId);
sortCodePaymentAuthRequest.setUserUuid(userUUID);
sortCodePaymentAuthRequest.setPaymentRequest(sortCodePaymentRequest);

PaymentsApi paymentsApi = new PaymentsApi();
ApiResponseOfAuthorisationRequestResponse authorizationResponse = paymentsApi.createPaymentInitiationUsingPOST(authRequest);
String url = authorizationResponse.getData().getAuthorisationUrl();

```

- Submit a payment request using the consent given by the user

```java
String consentToken = consent.getConsentToken();
ApiResponseOfPaymentResponse response = paymentsApi.createPaymentUsingPOST(consentToken,sortCodePaymentRequest);
```

- Check the payment status;
```java
String consentToken = consent.getConsentToken();
String paymentId =  paymentResponse.getData().getId();
ApiResponseOfPaymentResponse apiResponseOfPaymentResponse = paymentsApi.getPaymentStatusUsingGET(paymentId, consentToken);
```


## Further information

For more information on how to get connected, visit the
[Yapily developer resources](https://github.com/yapily/developer-resources) repo.

###### [Website](https://yapily.com) | [Legal](https://yapily.com/legal-policies) | [Contact Us](mailto:info@yapily.com) 

