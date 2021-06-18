package be.woutschoovaerts.mollie.data.subscription;

import be.woutschoovaerts.mollie.data.common.Amount;
import be.woutschoovaerts.mollie.data.common.ApplicationFee;
import be.woutschoovaerts.mollie.data.links.SubscriptionLinks;
import be.woutschoovaerts.mollie.data.mandate.MandatePaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionResponse {

    private String resource;

    private String id;

    private String mode;

    private OffsetDateTime createdAt;

    private SubscriptionStatus status;

    private Amount amount;

    private int times;

    private int timesRemaining;

    private String interval;

    private LocalDate startDate;

    private Optional<LocalDate> nextPaymentDate = Optional.empty();

    private String description;

    private MandatePaymentMethod method;

    private Optional<String> mandateId = Optional.empty();

    private OffsetDateTime canceledAt;

    private String webhookUrl;

    private Map<String, Object> metadata;

    private ApplicationFee applicationFee;

    @JsonProperty("_links")
    private SubscriptionLinks links;
}
