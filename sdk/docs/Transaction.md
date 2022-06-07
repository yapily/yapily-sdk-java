

# Transaction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**date** | **OffsetDateTime** |  |  [optional]
**bookingDateTime** | **OffsetDateTime** |  |  [optional]
**valueDateTime** | **OffsetDateTime** |  |  [optional]
**status** | **TransactionStatusEnum** |  |  [optional]
**amount** | **BigDecimal** |  |  [optional]
**currency** | **String** |  |  [optional]
**transactionAmount** | [**Amount**](Amount.md) |  |  [optional]
**grossAmount** | [**Amount**](Amount.md) |  |  [optional]
**currencyExchange** | [**CurrencyExchange**](CurrencyExchange.md) |  |  [optional]
**chargeDetails** | [**TransactionChargeDetails**](TransactionChargeDetails.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**statementReferences** | [**List&lt;StatementReference&gt;**](StatementReference.md) |  |  [optional]
**description** | **String** |  |  [optional]
**transactionInformation** | **List&lt;String&gt;** |  |  [optional]
**addressDetails** | [**AddressDetails**](AddressDetails.md) |  |  [optional]
**isoBankTransactionCode** | [**IsoBankTransactionCode**](IsoBankTransactionCode.md) |  |  [optional]
**proprietaryBankTransactionCode** | [**ProprietaryBankTransactionCode**](ProprietaryBankTransactionCode.md) |  |  [optional]
**balance** | [**TransactionBalance**](TransactionBalance.md) |  |  [optional]
**payeeDetails** | [**Payee**](Payee.md) |  |  [optional]
**payerDetails** | [**Payer**](Payer.md) |  |  [optional]
**merchant** | [**Merchant**](Merchant.md) |  |  [optional]
**enrichment** | [**Enrichment**](Enrichment.md) |  |  [optional]
**supplementaryData** | **Object** |  |  [optional]



