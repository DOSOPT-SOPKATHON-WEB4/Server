package org.sopt.server.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum Feel {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E");

    private final String feel;
}
