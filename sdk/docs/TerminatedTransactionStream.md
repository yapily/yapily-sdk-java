

# TerminatedTransactionStream

Terminated transaction stream generated as part of the financial profile for a User.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the TransactionStream |  [optional]
**transactions** | [**List&lt;EnrichedTransaction&gt;**](EnrichedTransaction.md) | A list of Transactions from the transaction stream. |  [optional]
**transactionSchedule** | [**TransactionSchedule**](TransactionSchedule.md) |  |  [optional]
**scheduleConsistencyScore** | **BigDecimal** | The consistency of the transaction.  This is a number between 0 and 1 with 1 being the most consistent schedule. |  [optional]
**nextExpectedTransactionDate** | **LocalDate** | When is the transaction expected to occur next. |  [optional]
**earliestTransactionDate** | **LocalDate** | When is the first recorded transaction date |  [optional]
**mostRecentTransactionDate** | **LocalDate** | When is the most recent transaction date |  [optional]
**amountConsistencyScore** | **BigDecimal** | The consistency of the amount of the transaction.  This is a number between 0 and 1 with 1 being the most consistent amount. |  [optional]
**averageAmount** | **BigDecimal** | The average amount of the transaction stream |  [optional]
**missedTransactions** | **Integer** | Missed transactions of transaction stream |  [optional]



