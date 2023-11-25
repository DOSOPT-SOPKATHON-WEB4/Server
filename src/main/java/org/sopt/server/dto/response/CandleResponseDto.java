package org.sopt.server.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.sopt.server.domain.Candle;
import org.sopt.server.domain.Feel;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CandleResponseDto(
        String date,
        String lastFire,
        String tag,
        String title,
        Feel feel,
        String body
) {
    public static CandleResponseDto of(Candle candle, String tag) {
        return new CandleResponseDto(candle.getDate().toString(), candle.getDeadLine().minusYears(1).toString(), tag, candle.getTitle(), candle.getFeel(), candle.getBody());
    }
}