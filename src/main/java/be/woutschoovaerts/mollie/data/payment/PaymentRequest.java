package be.woutschoovaerts.mollie.data.payment;

import be.woutschoovaerts.mollie.data.common.AddressRequest;
import be.woutschoovaerts.mollie.data.common.Amount;
import be.woutschoovaerts.mollie.data.common.ApplicationFee;
import be.woutschoovaerts.mollie.data.common.Locale;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentRequest {

    private Amount amount;

    private String description;

    private Optional<String> redirectUrl = Optional.empty();

    private Optional<String> webhookUrl = Optional.empty();

    private Optional<Locale> locale = Optional.empty();

    private Optional<List<PaymentMethod>> method = Optional.empty();

    private Map<String, Object> metadata;

    private Optional<SequenceType> sequenceType = Optional.empty();

    private Optional<String> customerId = Optional.empty();

    private Optional<String> mandateId = Optional.empty();

    // payment method specific parameters

    private Optional<String> cardToken = Optional.empty();

    private Optional<String> billingEmail = Optional.empty();

    private Optional<LocalDate> dueDate = Optional.empty();

    private Optional<AddressRequest> billingAddress = Optional.empty();

    private Optional<AddressRequest> shippingAddress = Optional.empty();

    private Optional<String> issuer = Optional.empty();

    private Optional<String> voucherNumber = Optional.empty();

    private Optional<String> voucherPin = Optional.empty();

    private Optional<String> customerReference = Optional.empty();

    private Optional<String> consumerName = Optional.empty();

    private Optional<String> consumerAccount = Optional.empty();

    // OAuth params
    private Optional<String> profileId = Optional.empty();

    private Optional<ApplicationFee> applicationFee = Optional.empty();
}
