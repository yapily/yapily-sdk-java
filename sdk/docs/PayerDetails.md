

# PayerDetails

__Conditional__. The `Payer` object contains details of the benefactor [person or business]. If you define this in your payment request, you mustdefine this along with all of the nested mandatory properties.<ol>     <li>The `Payer` object is mandatory along with its mandatory properties when the account of the benefactor is from an `Institution` in Europe.          See [Berlin Group](https://docs.yapily.com/pages/knowledge/open-banking/berlin_group/) for more information.</li>     <li>The `Payer` should be specified if the `Payer` account is intended to be locked.</li></ol>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountIdentifications** | [**Set&lt;AccountIdentification&gt;**](AccountIdentification.md) | __Mandatory__. The account identifications that identify the &#x60;Payer&#x60; bank account. | 



