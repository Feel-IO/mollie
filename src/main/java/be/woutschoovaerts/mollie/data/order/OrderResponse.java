package be.woutschoovaerts.mollie.data.order;

import be.woutschoovaerts.mollie.data.common.Amount;
import be.woutschoovaerts.mollie.data.common.Locale;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class  OrderResponse {

    private String resource;

    private String id;

    private String profileId;

    private String method;

    private String mode;

    private Amount amount;

    @Builder.Default
    private Optional<Amount> amountCaptured = Optional.empty();

    @Builder.Default
    private Optional<Amount> amountRefunded = Optional.empty();

    private OrderStatus status;

    private boolean isCancelable;

    private OrderAddressResponse billingAddress;

    @Builder.Default
    private Optional<LocalDate> consumerDateOfBirth = Optional.empty();

    private String orderNumber;

    private OrderAddressResponse shippingAddress;

    private Locale locale;

    @Builder.Default
    private Map<String, Object> metadata = new HashMap<>();

    private String redirectUrl;

    @Builder.Default
    private List<OrderLineResponse> lines = new ArrayList<>();

    @Builder.Default
    private Optional<String> webhookUrl = Optional.empty();

    private OffsetDateTime createdAt;

    @Builder.Default
    private Optional<OffsetDateTime> expiresAt = Optional.empty();

    @Builder.Default
    private Optional<OffsetDateTime> expiredAt  = Optional.empty();

    @Builder.Default
    private Optional<OffsetDateTime> paidAt  = Optional.empty();

    @Builder.Default
    private Optional<OffsetDateTime> authorizedAt  = Optional.empty();

    @Builder.Default
    private Optional<OffsetDateTime> canceledAt  = Optional.empty();

    @Builder.Default
    private Optional<OffsetDateTime> completedAt  = Optional.empty();

    @Builder.Default
    @JsonProperty("_embedded")
    private Optional<OrderEmbedded> embedded  = Optional.empty();

    @JsonProperty("_links")
    private OrderLinks links;
}
