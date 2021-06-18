package be.woutschoovaerts.mollie.data.customer;

import be.woutschoovaerts.mollie.data.links.CustomerLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Locale;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponse {

    private String resource;

    private String id;

    private String mode;

    private String name;

    private String email;

    private Locale locale;

    private Map<String, Object> metadata;

    private OffsetDateTime createdAt;

    @JsonProperty("_links")
    private CustomerLinks links;
}
