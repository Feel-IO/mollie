package be.woutschoovaerts.mollie.data.shipment;

import be.woutschoovaerts.mollie.data.order.OrderLineResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShipmentResponse {

    private String resource;

    private String id;

    private String orderId;

    private OffsetDateTime createdAt;

    private ShipmentTrackingResponse tracking;

    private List<OrderLineResponse> lines;

    @JsonProperty("_links")
    private ShipmentLinks links;
}
