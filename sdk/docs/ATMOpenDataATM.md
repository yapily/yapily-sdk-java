
# ATMOpenDataATM

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access24HoursIndicator** | **Boolean** |  |  [optional]
**accessibility** | [**List&lt;AccessibilityEnum&gt;**](#List&lt;AccessibilityEnum&gt;) |  |  [optional]
**branch** | [**ATMBranch**](ATMBranch.md) |  |  [optional]
**identification** | **String** |  |  [optional]
**location** | [**ATMLocation**](ATMLocation.md) |  |  [optional]
**minimumPossibleAmount** | **String** |  |  [optional]
**note** | **String** |  |  [optional]
**otherATMServices** | [**List&lt;ATMOpenDataOtherATMServices&gt;**](ATMOpenDataOtherATMServices.md) |  |  [optional]
**otherAccessibility** | [**List&lt;ATMOpenDataOtherAccessibility&gt;**](ATMOpenDataOtherAccessibility.md) |  |  [optional]
**services** | [**List&lt;ServicesEnum&gt;**](#List&lt;ServicesEnum&gt;) |  |  [optional]
**supportedCurrencies** | **List&lt;String&gt;** |  |  [optional]
**supportedLanguages** | **List&lt;String&gt;** |  |  [optional]


<a name="List<AccessibilityEnum>"></a>
## Enum: List&lt;AccessibilityEnum&gt;
Name | Value
---- | -----
AUDIOCASHMACHINE | &quot;AudioCashMachine&quot;
AUTOMATICDOORS | &quot;AutomaticDoors&quot;
EXTERNALRAMP | &quot;ExternalRamp&quot;
INDUCTIONLOOP | &quot;InductionLoop&quot;
INTERNALRAMP | &quot;InternalRamp&quot;
LEVELACCESS | &quot;LevelAccess&quot;
LOWERLEVELCOUNTER | &quot;LowerLevelCounter&quot;
OTHER | &quot;Other&quot;
WHEELCHAIRACCESS | &quot;WheelchairAccess&quot;


<a name="List<ServicesEnum>"></a>
## Enum: List&lt;ServicesEnum&gt;
Name | Value
---- | -----
BALANCE | &quot;Balance&quot;
BILLPAYMENTS | &quot;BillPayments&quot;
CASHDEPOSITS | &quot;CashDeposits&quot;
CHARITYDONATION | &quot;CharityDonation&quot;
CHEQUEDEPOSITS | &quot;ChequeDeposits&quot;
CASHWITHDRAWAL | &quot;CashWithdrawal&quot;
ENVELOPEDEPOSIT | &quot;EnvelopeDeposit&quot;
FASTCASH | &quot;FastCash&quot;
MOBILEBANKINGREGISTRATION | &quot;MobileBankingRegistration&quot;
MOBILEPAYMENTREGISTRATION | &quot;MobilePaymentRegistration&quot;
MOBILEPHONETOPUP | &quot;MobilePhoneTopUp&quot;
ORDERSTATEMENT | &quot;OrderStatement&quot;
OTHER | &quot;Other&quot;
PINACTIVATION | &quot;PINActivation&quot;
PINCHANGE | &quot;PINChange&quot;
PINUNBLOCK | &quot;PINUnblock&quot;
MINISTATEMENT | &quot;MiniStatement&quot;



