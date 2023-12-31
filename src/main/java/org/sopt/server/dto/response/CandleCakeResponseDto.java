package org.sopt.server.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.sopt.server.domain.Candle;
import org.sopt.server.domain.Feel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CandleCakeResponseDto(
        Long id,
        Feel feel,
        Long dday,
        LocalDate deadLine
) {
    public static CandleCakeResponseDto of(Candle candle, String tag) {
        return new CandleCakeResponseDto(
                candle.getId(),
                candle.getFeel(),
                ChronoUnit.DAYS.between(candle.getDate(), LocalDate.now()),
                candle.getDeadLine());
    }
}


