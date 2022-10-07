

# EnrichedBalances

Enriched Balance information generated which include historic aggregated balances and predicted balances

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountIds** | **List&lt;String&gt;** | A list of Account Ids used to generate Balance Prediction Profile. |  [optional]
**institutions** | **List&lt;String&gt;** | A list of Institution Ids associated with the accounts used to generate Balance Prediction Profile. |  [optional]
**historic** | [**List&lt;EnrichedHistoricBalance&gt;**](EnrichedHistoricBalance.md) | A list of historic balances. Each balance in the list is an aggregation (sum) of the reported balance for each account within the profile at a point in time. |  [optional]
**predicted** | [**List&lt;EnrichedPredictedBalance&gt;**](EnrichedPredictedBalance.md) | A list of predicted balances. Each balance in the list is a projected balance of the profile at a future point in time. |  [optional]



