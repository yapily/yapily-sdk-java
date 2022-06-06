package yapily.examples;

import yapily.sdk.models.AccountIdentification;
import yapily.sdk.models.AccountIdentificationType;
import yapily.sdk.models.Amount;
import yapily.sdk.models.Payee;
import yapily.sdk.models.PaymentRequest;
import yapily.sdk.models.PaymentType;

import java.math.BigDecimal;
import java.util.Set;

public class PaymentRequestUtils {

    public static PaymentRequest createNewDomesticPaymentRequestWithSortCodeAndAccountNumber(
            BigDecimal amountToSend,
            String currencyToSend,
            String reference,
            String idempotencyId,
            String recipientName,
            String sortCode,
            String accountNumber
    ) {
        // Create the payment request to attach to the authorisation request
        PaymentRequest paymentRequest = new PaymentRequest();

        // Set the amount to send
        Amount amount = new Amount();
        amount.setAmount(amountToSend);
        amount.setCurrency(currencyToSend);
        paymentRequest.setAmount(amount);

        // Set the type to domestic to indicate we're sending from one UK account to another UK account
        paymentRequest.setType(PaymentType.DOMESTIC_PAYMENT);

        // Set the reference for the payment to be seen in the payment statement
        paymentRequest.setReference(reference);

        // Set an idempotency id to prevent accidental duplicate payments
        paymentRequest.setPaymentIdempotencyId(idempotencyId);

        // Create a payee object to identify the account to send to
        Payee payee = new Payee();

        // Set the name of the account holder
        payee.setName(recipientName);

        // Define how you would like to identify the recipients account e.g. a sort code and account number
        Set<AccountIdentification> payeeAccountIdentifications = Set.of(
                createNewAccountIdentification(AccountIdentificationType.SORT_CODE, sortCode),
                createNewAccountIdentification(AccountIdentificationType.ACCOUNT_NUMBER, accountNumber));

        payee.setAccountIdentifications(payeeAccountIdentifications);
        paymentRequest.setPayee(payee);
        return paymentRequest;
    }

    private static AccountIdentification createNewAccountIdentification(
            AccountIdentificationType type,
            String value) {
        AccountIdentification payeeAccountIdentification = new AccountIdentification();
        payeeAccountIdentification.setType(type);
        payeeAccountIdentification.setIdentification(value);
        return payeeAccountIdentification;
    }
}
