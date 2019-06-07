
# AccountBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**dateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the last change of the balance amount |  [optional]
**balanceAmount** | [**Amount**](Amount.md) |  |  [optional]
**creditLineIncluded** | **Boolean** | Indicates whether or not the credit line is included in the balance |  [optional]
**creditLines** | [**List&lt;CreditLine&gt;**](CreditLine.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CLOSING_AVAILABLE | &quot;CLOSING_AVAILABLE&quot;
CLOSING_BOOKED | &quot;CLOSING_BOOKED&quot;
CLOSING_CLEARED | &quot;CLOSING_CLEARED&quot;
EXPECTED | &quot;EXPECTED&quot;
FORWARD_AVAILABLE | &quot;FORWARD_AVAILABLE&quot;
INFORMATION | &quot;INFORMATION&quot;
INTERIM_AVAILABLE | &quot;INTERIM_AVAILABLE&quot;
INTERIM_BOOKED | &quot;INTERIM_BOOKED&quot;
INTERIM_CLEARED | &quot;INTERIM_CLEARED&quot;
OPENING_AVAILABLE | &quot;OPENING_AVAILABLE&quot;
OPENING_BOOKED | &quot;OPENING_BOOKED&quot;
OPENING_CLEARED | &quot;OPENING_CLEARED&quot;
PREVIOUSLY_CLOSED_BOOKED | &quot;PREVIOUSLY_CLOSED_BOOKED&quot;
AUTHORISED | &quot;AUTHORISED&quot;
OTHER | &quot;OTHER&quot;
UNKNOWN | &quot;UNKNOWN&quot;



