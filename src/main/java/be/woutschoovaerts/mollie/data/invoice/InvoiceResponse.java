package be.woutschoovaerts.mollie.data.invoice;

import be.woutschoovaerts.mollie.data.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceResponse {

    private String resource;

    private String id;

    private String reference;

    private String vatNumber;

    private InvoiceStatus status;

    private LocalDate issuedAt;

    private LocalDate paidAt;

    private LocalDate dueAt;

    private Amount netAmount;

    private Amount vatAmount;

    private Amount grossAmount;

    private List<InvoiceLine> lines;

    @JsonProperty("_links")
    private InvoiceLinks links;

}
