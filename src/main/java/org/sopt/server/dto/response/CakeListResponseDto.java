package org.sopt.server.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CakeListResponseDto(
        List<CakeDataResponseDto> cakeList
) {
    public static CakeListResponseDto of(List<CakeDataResponseDto> dto) {
        return new CakeListResponseDto(dto);
    }
}
