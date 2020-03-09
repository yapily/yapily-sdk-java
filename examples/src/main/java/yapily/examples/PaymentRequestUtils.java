package yapily.examples;

import yapily.sdk.AccountIdentification;
import yapily.sdk.Amount;
import yapily.sdk.Payee;
import yapily.sdk.PaymentRequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
        paymentRequest.setType(PaymentRequest.TypeEnum.DOMESTIC_PAYMENT);

        // Set the reference for the payment to be seen in the payment statement
        paymentRequest.setReference(reference);

        // Set an idempotency id to prevent accidental duplicate payments
        paymentRequest.setPaymentIdempotencyId(idempotencyId);

        // Create a payee object to identify the account to send to
        Payee payee = new Payee();

        // Set the name of the account holder
        payee.setName(recipientName);

        // Define how you would like to identify the recipients account e.g. a sort code and account number
        List<AccountIdentification> payeeAccountIdentifications = new ArrayList<>();
        createNewAccountIdentification(payeeAccountIdentifications, AccountIdentification.TypeEnum.SORT_CODE, sortCode);
        createNewAccountIdentification(payeeAccountIdentifications, AccountIdentification.TypeEnum.ACCOUNT_NUMBER, accountNumber);

        payee.setAccountIdentifications(payeeAccountIdentifications);
        paymentRequest.setPayee(payee);
        return paymentRequest;
    }

    private static void createNewAccountIdentification(
            List<AccountIdentification> payeeAccountIdentifications,
            AccountIdentification.TypeEnum type,
            String value) {
        AccountIdentification payeeAccountIdentification = new AccountIdentification();
        payeeAccountIdentification.setType(type);
        payeeAccountIdentification.setIdentification(value);
        payeeAccountIdentifications.add(payeeAccountIdentification);
    }
}
