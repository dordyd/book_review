package myproject.bookreview.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
    @JsonProperty("men")
    MEM,
    @JsonProperty("woman")
    WOMAN
}
