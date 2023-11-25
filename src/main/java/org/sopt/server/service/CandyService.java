package org.sopt.server.service;

import lombok.RequiredArgsConstructor;
import org.sopt.server.domain.Candle;
import org.sopt.server.dto.response.CandleResponseDto;
import org.sopt.server.global.exception.CommonException;
import org.sopt.server.global.response.ErrorType;
import org.sopt.server.repository.CakeRepository;
import org.sopt.server.repository.CandleCakeRepository;
import org.sopt.server.repository.CandleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CandyService {

    private final CandleRepository candleRepository;
    private final CakeRepository cakeRepository;
    private final CandleCakeRepository candleCakeRepository;

    public CandleResponseDto findById(Long candleId, String cakeName) {
        Candle candle = candleRepository.findById(candleId)
                .orElseThrow(() -> new CommonException(ErrorType.NOT_FOUND_CANDLE_ERROR));
        return CandleResponseDto.of(candle, cakeName);
    }

    @Transactional
    public void updateDate(Long candleId) {
        Candle candle = candleRepository.findById(candleId)
                .orElseThrow(() -> new CommonException(ErrorType.NOT_FOUND_CANDLE_ERROR));
        candle.updateDate();
    }
}
