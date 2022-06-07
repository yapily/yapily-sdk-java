

# BeneficiaryPayee

__Mandatory__. The `BeneficiaryPayee` object contains details of the beneficiary [person or business]. You must define this in your payment request along with all of the nested mandatory properties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The account holder name of the beneficiary. |  [optional]
**accountIdentifications** | [**Set&lt;AccountIdentification&gt;**](AccountIdentification.md) | __Mandatory__. The account identifications that identify the &#x60;BeneficiaryPayee&#x60; bank account. | 
**address** | [**Address**](Address.md) |  |  [optional]



