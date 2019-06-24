
# OverdraftOverdraftFeeChargeCap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) |  |  [optional]
**feeCapAmount** | **String** |  |  [optional]
**feeCapOccurrence** | **Float** |  |  [optional]
**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) |  |  [optional]
**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherFeeType** | [**List&lt;OverdraftOtherFeeType&gt;**](OverdraftOtherFeeType.md) |  |  [optional]
**overdraftControlIndicator** | **Boolean** |  |  [optional]


<a name="CappingPeriodEnum"></a>
## Enum: CappingPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
YEAR | &quot;Year&quot;


<a name="List<FeeTypeEnum>"></a>
## Enum: List&lt;FeeTypeEnum&gt;
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
OTHER | &quot;Other&quot;
UNAUTHORISEDUNPAIDTRANS | &quot;UnauthorisedUnpaidTrans&quot;


<a name="MinMaxTypeEnum"></a>
## Enum: MinMaxTypeEnum
Name | Value
---- | -----
MINIMUM | &quot;Minimum&quot;
MAXIMUM | &quot;Maximum&quot;



