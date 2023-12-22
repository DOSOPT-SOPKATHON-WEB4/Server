package org.sopt.server.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.sopt.server.domain.Cake;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CakeDataResponseDto(
        Long cakeId,
        String cakeName,
        int candleCount
) {
    public static CakeDataResponseDto of(Cake cake) {
        return new CakeDataResponseDto(cake.getId(), cake.getTitle(), cake.getCandleList().size());
    }
}
