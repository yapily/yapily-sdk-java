
# InlineResponse2001ATM

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**atMServices** | [**List&lt;AtMServicesEnum&gt;**](#List&lt;AtMServicesEnum&gt;) |  |  [optional]
**access24HoursIndicator** | **Boolean** |  |  [optional]
**accessibility** | [**List&lt;AccessibilityEnum&gt;**](#List&lt;AccessibilityEnum&gt;) |  |  [optional]
**branch** | [**Branch**](Branch.md) |  |  [optional]
**identification** | **String** |  |  [optional]
**location** | [**Location**](Location.md) |  |  [optional]
**minimumPossibleAmount** | **String** |  |  [optional]
**note** | **List&lt;String&gt;** |  |  [optional]
**otherATMServices** | [**List&lt;InlineResponse2001OtherATMServices&gt;**](InlineResponse2001OtherATMServices.md) |  |  [optional]
**otherAccessibility** | [**List&lt;InlineResponse2001OtherAccessibility&gt;**](InlineResponse2001OtherAccessibility.md) |  |  [optional]
**supportedCurrencies** | **List&lt;String&gt;** |  |  [optional]
**supportedLanguages** | **List&lt;String&gt;** |  |  [optional]


<a name="List<AtMServicesEnum>"></a>
## Enum: List&lt;AtMServicesEnum&gt;
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



