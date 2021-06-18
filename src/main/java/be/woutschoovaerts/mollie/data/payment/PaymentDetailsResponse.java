package be.woutschoovaerts.mollie.data.payment;

import be.woutschoovaerts.mollie.data.common.Amount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDetailsResponse {

    // we make everything optional because we cannot now what payment method is used

    private Optional<String> cardNumber = Optional.empty();

    private Optional<String> cardFingerprint = Optional.empty();

    private Optional<String> bankname = Optional.empty();

    private Optional<String> bankAccount = Optional.empty();

    private Optional<String> bankBic = Optional.empty();

    private Optional<String> transferReference = Optional.empty();

    private Optional<String> consumerName = Optional.empty();

    private Optional<String> consumerAccount = Optional.empty();

    private Optional<String> consumerBic = Optional.empty();

    private Optional<String> billingEmail = Optional.empty();

    private Optional<String> bitcoinAddress = Optional.empty();

    private Optional<Amount> bitcoinAmount = Optional.empty();

    private Optional<String> bitcoinUri = Optional.empty();

    private Optional<String> cardHolder = Optional.empty();

    private Optional<String> carNumber = Optional.empty();

    private Optional<String> cardAudience = Optional.empty();

    private Optional<String> cardLabel = Optional.empty();

    private Optional<String> cardCountryCode = Optional.empty();

    private Optional<String> cardSecurity = Optional.empty();

    private Optional<String> feeRegion = Optional.empty();

    private Optional<String> failureReason = Optional.empty();

    private Optional<String> voucherNumber = Optional.empty();

    private List<GiftCardResponse> giftcards;

    private Optional<Amount> remainderAmount = Optional.empty();

    private Optional<String> remainderMethod = Optional.empty();

    private Optional<String> paypalReference = Optional.empty();

    private Optional<String> customerReference = Optional.empty();

    private Optional<String> creditorIdentifier = Optional.empty();

    private Optional<LocalDate> dueDate = Optional.empty();

    private Optional<LocalDate> signatureDate = Optional.empty();

    private Optional<String> bankReasonCode = Optional.empty();

    private Optional<String> bankReason = Optional.empty();

    private Optional<String> endToEndIdentifier = Optional.empty();

    private Optional<String> mandateReference = Optional.empty();

    private Optional<String> batchReference = Optional.empty();

    private Optional<String> fileReference = Optional.empty();

    private Optional<QrCode> qrCode = Optional.empty();

}
