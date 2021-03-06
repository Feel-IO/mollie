package be.woutschoovaerts.mollie.data.profile;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProfileStatus {

    UNVERIFIED,
    VERIFIED,
    BLOCKED;

    @JsonValue
    public String getJsonValue() {
        return name().toLowerCase().replace('_', '-');
    }
}
