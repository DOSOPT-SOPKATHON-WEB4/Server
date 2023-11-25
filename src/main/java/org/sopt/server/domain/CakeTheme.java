package org.sopt.server.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CakeTheme {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private final String theme;
}
