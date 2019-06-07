
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Transaction Id returned by the institution if present |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Transaction date as defined by the institution |  [optional]
**bookingDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The actual or expected booking (settled) timestamp |  [optional]
**valueDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Definition varies according to the institution |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the transaction |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Deprecated. Use the amount value in &#x60;transactionAmount&#x60; instead |  [optional]
**currency** | **String** | Deprecated. Use the currency value in &#x60;transactionAmount&#x60; instead |  [optional]
**transactionAmount** | [**Amount**](Amount.md) |  |  [optional]
**currencyExchange** | [**CurrencyExchange**](CurrencyExchange.md) |  |  [optional]
**chargeDetails** | [**ChargeDetails**](ChargeDetails.md) | If present, contains details of any charges applied during this transaction |  [optional]
**reference** | **String** | Transaction reference |  [optional]
**statementReferences** | [**List&lt;StatementReference&gt;**](StatementReference.md) |  |  [optional]
**description** | **String** | Unstructured text containing details of the transaction. Usage varies according to the institution |  [optional]
**transactionInformation** | **List&lt;String&gt;** | Further information related to the transaction. Usage varies according to the institution |  [optional]
**addressDetails** | [**AddressDetails**](AddressDetails.md) |  |  [optional]
**isoBankTransactionCode** | [**IsoBankTransactionCode**](IsoBankTransactionCode.md) |  |  [optional]
**proprietaryBankTransactionCode** | [**ProprietaryBankTransactionCode**](ProprietaryBankTransactionCode.md) |  |  [optional]
**balance** | [**Balance**](Balance.md) | Running account balance after transaction has been applied |  [optional]
**merchant** | [**Merchant**](Merchant.md) | Merchant details |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
BOOKED | &quot;BOOKED&quot;
PENDING | &quot;PENDING&quot;



