package org.sopt.server.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Candle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalDate deadLine;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Feel feel;

    @Column(nullable = false)
    private String body;

    @OneToMany(mappedBy = "candle")
    private List<CandleCake> cakeList = new ArrayList<>();

    public void updateDate() {
        this.deadLine = LocalDate.now();
    }
    @Builder
    public Candle(String title, LocalDate date, LocalDate deadLine, Feel feel, String body) {
        this.title = title;
        this.date = date;
        this.deadLine = deadLine;
        this.feel = feel;
        this.body = body;
    }
}
