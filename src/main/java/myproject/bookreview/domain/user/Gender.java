package myproject.bookreview.domain.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
    @JsonProperty("men")
    MEM,
    @JsonProperty("woman")
    WOMAN
}
