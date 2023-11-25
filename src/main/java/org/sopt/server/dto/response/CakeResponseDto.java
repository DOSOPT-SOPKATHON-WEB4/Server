package org.sopt.server.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.sopt.server.domain.Cake;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CakeResponseDto(
        Long cakeId,
        String cakeTitle,
        List<CandleCakeResponseDto> candleList
) {
    public static CakeResponseDto of(Cake cake, List<CandleCakeResponseDto> dto) {
        return new CakeResponseDto(
                cake.getId(),
                cake.getTitle(),
                dto
        );
    }
}

