
# OverdraftOverdraftTierBandSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorisedIndicator** | **Boolean** |  |  [optional]
**bufferAmount** | **String** |  |  [optional]
**identification** | **String** |  |  [optional]
**minimumArrangedOverdraftAmount** | **String** |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**overdraftFeesCharges** | [**List&lt;OverdraftOverdraftFeesCharges1&gt;**](OverdraftOverdraftFeesCharges1.md) |  |  [optional]
**overdraftTierBand** | [**List&lt;OverdraftOverdraftTierBand&gt;**](OverdraftOverdraftTierBand.md) |  |  [optional]
**overdraftType** | [**OverdraftTypeEnum**](#OverdraftTypeEnum) |  |  [optional]
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) |  |  [optional]


<a name="OverdraftTypeEnum"></a>
## Enum: OverdraftTypeEnum
Name | Value
---- | -----
COMMITTED | &quot;Committed&quot;
ONDEMAND | &quot;OnDemand&quot;
OTHER | &quot;Other&quot;


<a name="TierBandMethodEnum"></a>
## Enum: TierBandMethodEnum
Name | Value
---- | -----
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;



