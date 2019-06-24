
# CreditInterestTierBand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AER** | **String** |  |  [optional]
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) |  |  [optional]
**bankInterestRate** | **String** |  |  [optional]
**bankInterestRateType** | [**BankInterestRateTypeEnum**](#BankInterestRateTypeEnum) |  |  [optional]
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) |  |  [optional]
**depositInterestAppliedCoverage** | [**DepositInterestAppliedCoverageEnum**](#DepositInterestAppliedCoverageEnum) |  |  [optional]
**fixedVariableInterestRateType** | [**FixedVariableInterestRateTypeEnum**](#FixedVariableInterestRateTypeEnum) |  |  [optional]
**identification** | **String** |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherBankInterestType** | [**OtherBankInterestType**](OtherBankInterestType.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**tierValueMaximum** | **String** |  |  [optional]
**tierValueMinimum** | **String** |  |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
PERACADEMICTERM | &quot;PerAcademicTerm&quot;
DAILY | &quot;Daily&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
PERSTATEMENTDATE | &quot;PerStatementDate&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="BankInterestRateTypeEnum"></a>
## Enum: BankInterestRateTypeEnum
Name | Value
---- | -----
LINKEDBASERATE | &quot;LinkedBaseRate&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
PERACADEMICTERM | &quot;PerAcademicTerm&quot;
DAILY | &quot;Daily&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
PERSTATEMENTDATE | &quot;PerStatementDate&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="DepositInterestAppliedCoverageEnum"></a>
## Enum: DepositInterestAppliedCoverageEnum
Name | Value
---- | -----
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;


<a name="FixedVariableInterestRateTypeEnum"></a>
## Enum: FixedVariableInterestRateTypeEnum
Name | Value
---- | -----
FIXED | &quot;Fixed&quot;
VARIABLE | &quot;Variable&quot;



