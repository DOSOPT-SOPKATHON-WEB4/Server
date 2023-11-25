package org.sopt.server.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.sopt.server.domain.Feel;

import java.time.LocalDate;

public record CandleRequestDto(
        String title,
        LocalDate date,
        @JsonProperty("cake_title")
        String cakeTitle,
        Feel feel,
        String body
) {
}