
# OverdraftOverdraftFeeChargeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) |  |  [optional]
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) |  |  [optional]
**feeAmount** | **String** |  |  [optional]
**feeRate** | **String** |  |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) |  |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) |  |  [optional]
**incrementalBorrowingAmount** | **String** |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency**](OtherApplicationFrequency.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency**](OtherCalculationFrequency.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType**](OtherFeeRateType.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType**](OtherFeeType.md) |  |  [optional]
**overdraftControlIndicator** | **Boolean** |  |  [optional]
**overdraftFeeApplicableRange** | [**OverdraftFeeApplicableRange**](OverdraftFeeApplicableRange.md) |  |  [optional]


<a name="ApplicationFrequencyEnum"></a>
## Enum: ApplicationFrequencyEnum
Name | Value
---- | -----
ACCOUNTCLOSING | &quot;AccountClosing&quot;
ACCOUNTOPENING | &quot;AccountOpening&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot;
OTHER | &quot;Other&quot;
PERHOUR | &quot;PerHour&quot;
PEROCCURRENCE | &quot;PerOccurrence&quot;
PERSHEET | &quot;PerSheet&quot;
PERTRANSACTION | &quot;PerTransaction&quot;
PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot;
PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot;
QUARTERLY | &quot;Quarterly&quot;
SIXMONTHLY | &quot;SixMonthly&quot;
STATEMENTMONTHLY | &quot;StatementMonthly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="CalculationFrequencyEnum"></a>
## Enum: CalculationFrequencyEnum
Name | Value
---- | -----
ACCOUNTCLOSING | &quot;AccountClosing&quot;
ACCOUNTOPENING | &quot;AccountOpening&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot;
OTHER | &quot;Other&quot;
PERHOUR | &quot;PerHour&quot;
PEROCCURRENCE | &quot;PerOccurrence&quot;
PERSHEET | &quot;PerSheet&quot;
PERTRANSACTION | &quot;PerTransaction&quot;
PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot;
PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot;
QUARTERLY | &quot;Quarterly&quot;
SIXMONTHLY | &quot;SixMonthly&quot;
STATEMENTMONTHLY | &quot;StatementMonthly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="FeeRateTypeEnum"></a>
## Enum: FeeRateTypeEnum
Name | Value
---- | -----
LINKEDBASERATE | &quot;LinkedBaseRate&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;


<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
Name | Value
---- | -----
ARRANGEDOVERDRAFT | &quot;ArrangedOverdraft&quot;
EMERGENCYBORROWING | &quot;EmergencyBorrowing&quot;
BORROWINGITEM | &quot;BorrowingItem&quot;
OVERDRAFTRENEWAL | &quot;OverdraftRenewal&quot;
ANNUALREVIEW | &quot;AnnualReview&quot;
OVERDRAFTSETUP | &quot;OverdraftSetup&quot;
SURCHARGE | &quot;Surcharge&quot;
TEMPOVERDRAFT | &quot;TempOverdraft&quot;
UNAUTHORISEDBORROWING | &quot;UnauthorisedBorrowing&quot;
UNAUTHORISEDPAIDTRANS | &quot;UnauthorisedPaidTrans&quot;
UNAUTHORISEDUNPAIDTRANS | &quot;UnauthorisedUnpaidTrans&quot;



