

# PayeeDetails

__Mandatory__. The `PayeeDetails` object contains details of the beneficiary [person or business]. You must define this in your payment request alongwith all of the nested mandatory properties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | __Mandatory__. The account holder name of the beneficiary. | 
**accountIdentifications** | [**Set&lt;AccountIdentification&gt;**](AccountIdentification.md) | __Mandatory__. The account identifications that identify the &#x60;Payee&#x60; bank account. | 
**country** | **String** | __Conditional__. The 2-letter country code for the address. &lt;br&gt;&lt;br&gt;An &#x60;Institution&#x60; may require you to specify the &#x60;country&#x60; when used in the context of the &#x60;Payee&#x60; to be able to make a payment | 



