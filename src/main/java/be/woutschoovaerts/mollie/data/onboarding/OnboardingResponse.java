package be.woutschoovaerts.mollie.data.onboarding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OnboardingResponse {

    private String resource;

    private String name;

    private OffsetDateTime signedUpAt;

    private OnboardingStatus status;

    private boolean canReceivePayments;

    private boolean canReceiveSettlements;

    @JsonProperty("_links")
    private OnboardingLinks links;

}
