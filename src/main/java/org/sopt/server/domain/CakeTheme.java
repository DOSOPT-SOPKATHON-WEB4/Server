package org.sopt.server.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CakeTheme {
    YELLOW("Yellow"),
    PURPLE("Purple"),
    PINK("Pink");

    private final String theme;
}
