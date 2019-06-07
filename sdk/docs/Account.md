
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Account Id returned by the institution if present |  [optional]
**type** | **String** |  |  [optional]
**description** | **String** | Product name as defined by the financial institution for this account |  [optional]
**balance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currency** | **String** | ISO 4217 currency code |  [optional]
**usageType** | [**UsageTypeEnum**](#UsageTypeEnum) |  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional]
**nickname** | **String** | Name of the account as defined by the financial institution or the end user |  [optional]
**details** | **String** | Specifications that might be provided by the institution - characteristics of the account - characteristics of the relevant card |  [optional]
**accountNames** | [**List&lt;AccountName&gt;**](AccountName.md) |  |  [optional]
**accountIdentifications** | [**List&lt;AccountIdentification&gt;**](AccountIdentification.md) |  |  [optional]
**accountBalances** | [**List&lt;AccountBalance&gt;**](AccountBalance.md) |  |  [optional]


<a name="UsageTypeEnum"></a>
## Enum: UsageTypeEnum
Name | Value
---- | -----
PERSONAL | &quot;PERSONAL&quot;
BUSINESS | &quot;BUSINESS&quot;
OTHER | &quot;OTHER&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
CASH_TRADING | &quot;CASH_TRADING&quot;
CASH_INCOME | &quot;CASH_INCOME&quot;
CASH_PAYMENT | &quot;CASH_PAYMENT&quot;
CHARGE_CARD | &quot;CHARGE_CARD&quot;
CHARGES | &quot;CHARGES&quot;
COMMISSION | &quot;COMMISSION&quot;
CREDIT_CARD | &quot;CREDIT_CARD&quot;
CURRENT | &quot;CURRENT&quot;
E_MONEY | &quot;E_MONEY&quot;
LIMITED_LIQUIDITY_SAVINGS_ACCOUNT | &quot;LIMITED_LIQUIDITY_SAVINGS_ACCOUNT&quot;
LOAN | &quot;LOAN&quot;
MARGINAL_LENDING | &quot;MARGINAL_LENDING&quot;
MONEY_MARKET | &quot;MONEY_MARKET&quot;
MORTGAGE | &quot;MORTGAGE&quot;
NON_RESIDENT_EXTERNAL | &quot;NON_RESIDENT_EXTERNAL&quot;
OTHER | &quot;OTHER&quot;
OVERDRAFT | &quot;OVERDRAFT&quot;
OVERNIGHT_DEPOSIT | &quot;OVERNIGHT_DEPOSIT&quot;
PREPAID_CARD | &quot;PREPAID_CARD&quot;
SALARY | &quot;SALARY&quot;
SAVINGS | &quot;SAVINGS&quot;
SETTLEMENT | &quot;SETTLEMENT&quot;
TAX | &quot;TAX&quot;
UNKNOWN | &quot;UNKNOWN&quot;



