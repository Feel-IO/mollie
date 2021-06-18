package be.woutschoovaerts.mollie.data.order;

import be.woutschoovaerts.mollie.data.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineResponse {

    private String resource;

    private String id;

    private OrderLineType type;

    private String name;

    private OrderStatus status;

    private boolean isCancelable;

    private int quantity;

    private int quantityShipped;

    private Amount amountShipped;

    private int quantityRefunded;

    private Amount amountRefunded;

    private int quantityCanceled;

    private Amount amountCanceled;

    private int shippableQuantity;

    private int refundableQuantity;

    private int cancelableQuantity;

    private Amount unitPrice;

    @Builder.Default
    private Optional<Amount> discountAmount = Optional.empty();

    private Amount totalAmount;

    private String vatRate;

    private Amount vatAmount;

    @Builder.Default
    private Optional<String> sku = Optional.empty();

    private OffsetDateTime createdAt;

    @JsonProperty("_links")
    private OrderLineLinks links;

}
