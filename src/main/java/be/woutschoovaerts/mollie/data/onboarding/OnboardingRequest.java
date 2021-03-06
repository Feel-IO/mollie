package be.woutschoovaerts.mollie.data.onboarding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OnboardingRequest {

    @Builder.Default
    private Optional<OnboardingOrganizationRequest> organization = Optional.empty();

    @Builder.Default
    private Optional<OnboardingProfileRequest> profile = Optional.empty();
}
