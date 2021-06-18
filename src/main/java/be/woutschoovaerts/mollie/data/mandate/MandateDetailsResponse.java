package be.woutschoovaerts.mollie.data.mandate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MandateDetailsResponse {

    private Optional<String> consumerName = Optional.empty();

    private Optional<String> consumerAccount = Optional.empty();

    private Optional<String> consumerBic = Optional.empty();

    private Optional<String> cardHolder = Optional.empty();

    private Optional<String> cardNumber = Optional.empty();

    private Optional<String> cardLabel = Optional.empty();

    private Optional<String> cardFingerprint = Optional.empty();

    private Optional<LocalDate> cardExpiryDate = Optional.empty();

}
