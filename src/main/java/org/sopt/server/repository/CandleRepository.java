package org.sopt.server.repository;

import org.sopt.server.domain.Candle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandleRepository extends JpaRepository<Candle, Long> {
}