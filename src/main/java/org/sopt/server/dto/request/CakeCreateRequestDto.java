package org.sopt.server.dto.request;

import org.sopt.server.domain.CakeTheme;

public record CakeCreateRequestDto(
        String title,
        String theme
) {
}
