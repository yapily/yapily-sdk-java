

# AccountInfo

__Conditional__. Used to create a request for the balance of the account specified. Once the user authorises the request, only the balance can be obtained by executing [GET Account Balances](./#get-account-balances).<br><br> This can be specified in conjunction with `accountIdentifiersForTransaction` to generate a `Consent` that can both access the accounts balance and transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | __Mandatory__. Unique identifier of the account. | 
**accountIdentification** | [**AccountIdentification**](AccountIdentification.md) |  | 



