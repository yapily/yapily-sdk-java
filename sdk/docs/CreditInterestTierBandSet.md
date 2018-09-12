
# CreditInterestTierBandSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | [**CalculationMethodEnum**](#CalculationMethodEnum) |  |  [optional]
**creditInterestEligibility** | [**List&lt;CreditInterestCreditInterestEligibility&gt;**](CreditInterestCreditInterestEligibility.md) |  |  [optional]
**destination** | [**DestinationEnum**](#DestinationEnum) |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**tierBand** | [**List&lt;CreditInterestTierBand&gt;**](CreditInterestTierBand.md) |  |  [optional]
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) |  |  [optional]


<a name="CalculationMethodEnum"></a>
## Enum: CalculationMethodEnum
Name | Value
---- | -----
COMPOUND | &quot;Compound&quot;
SIMPLEINTEREST | &quot;SimpleInterest&quot;


<a name="DestinationEnum"></a>
## Enum: DestinationEnum
Name | Value
---- | -----
PAYAWAY | &quot;PayAway&quot;
SELFCREDIT | &quot;SelfCredit&quot;


<a name="TierBandMethodEnum"></a>
## Enum: TierBandMethodEnum
Name | Value
---- | -----
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;



