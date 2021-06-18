package be.woutschoovaerts.mollie.data.mandate;

import be.woutschoovaerts.mollie.data.links.MandateLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MandateResponse {

    private String resource;

    private String id;

    private MandateStatus status;

    private MandatePaymentMethod method;

    private MandateDetailsResponse details;

    private String mandateReference;

    private LocalDate signatureDate;

    private OffsetDateTime createdAt;

    @JsonProperty("_links")
    private MandateLinks links;
}
