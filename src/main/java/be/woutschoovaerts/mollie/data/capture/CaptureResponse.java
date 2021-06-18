package be.woutschoovaerts.mollie.data.capture;

import be.woutschoovaerts.mollie.data.common.Amount;
import be.woutschoovaerts.mollie.data.links.CaptureLinks;
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
public class CaptureResponse {

    private String resource;

    private String id;

    private String mode;

    private Amount amount;

    private Amount settlementAmount;

    private String paymentId;

    private Optional<String> shipmentId = Optional.empty();

    private Optional<String> settlementId  = Optional.empty();

    private OffsetDateTime createdAt;

    @JsonProperty("_links")
    private CaptureLinks links;
}
