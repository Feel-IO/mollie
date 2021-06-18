package be.woutschoovaerts.mollie.data.payment;

import be.woutschoovaerts.mollie.data.common.Amount;
import be.woutschoovaerts.mollie.data.common.ApplicationFee;
import be.woutschoovaerts.mollie.data.common.Locale;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentResponse {

    private String resource;

    private String id;

    private String mode;

    private OffsetDateTime createdAt;

    private PaymentStatus status;

    private boolean isCancelable;

    private Optional<OffsetDateTime> authorizedAt = Optional.empty();

    private Optional<OffsetDateTime> paidAt = Optional.empty();

    private Optional<OffsetDateTime> canceledAt = Optional.empty();

    private OffsetDateTime expiresAt;

    private Optional<OffsetDateTime> expiredAt = Optional.empty();

    private Optional<OffsetDateTime> failedAt = Optional.empty();

    private Amount amount;

    private Optional<Amount> amountRefunded = Optional.empty();

    private Optional<Amount> amountRemaining = Optional.empty();

    private Optional<Amount> amountCaptured = Optional.empty();

    private String description;

    private String redirectUrl;

    private Optional<String> webhookUrl = Optional.empty();

    private PaymentMethod method;

    private Map<String, Object> metadata;

    private Locale locale;

    private Optional<String> countryCode = Optional.empty();

    private String profileId;

    private Optional<Amount> settlementAmount = Optional.empty();

    private Optional<String> settlementId = Optional.empty();

    private Optional<String> customerId = Optional.empty();

    private SequenceType sequenceType;

    private Optional<String> mandateId = Optional.empty();

    private Optional<String> subscriptionId = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Optional<ApplicationFee> applicationFee = Optional.empty();

    @JsonProperty("_links")
    private PaymentLinks links;

    private PaymentDetailsResponse details;

    @JsonProperty("_embedded")
    private PaymentEmbedded embedded;

    // An extra setter so we can serialize 'isCancelable' (https://github.com/zwaldeck/mollie/issues/45)

    public void setIsCancelable(boolean cancelable) {
        this.isCancelable = cancelable;
    }
}
