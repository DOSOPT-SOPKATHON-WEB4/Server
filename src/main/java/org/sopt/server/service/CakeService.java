package org.sopt.server.service;

import lombok.RequiredArgsConstructor;
import org.sopt.server.domain.Cake;
import org.sopt.server.domain.CakeTheme;
import org.sopt.server.domain.CandleCake;
import org.sopt.server.dto.request.CakeCreateRequestDto;
import org.sopt.server.dto.response.CakeCandleResponseDto;
import org.sopt.server.dto.response.CakeResponseDto;
import org.sopt.server.global.exception.CommonException;
import org.sopt.server.global.response.ErrorType;
import org.sopt.server.repository.CakeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CakeService {

    private final CakeRepository cakeRepository;

    @Transactional
    public void create(CakeCreateRequestDto request) {
        if (cakeRepository.existsCakeByTitle(request.title())) throw new CommonException(ErrorType.DUPLICATE_CAKE_NAME_ERROR);

        cakeRepository.save(
                Cake.builder()
                .title(request.title())
                .theme(CakeTheme.valueOf(request.theme()))
                .build());
    }

    public CakeResponseDto getCandleByCakeId(Long cakeId) {
        Cake cake = cakeRepository.findById(cakeId).orElseThrow(() -> new CommonException(ErrorType.NOT_FOUND_CAKE_ERROR));
        List<CandleCake> candleList = cake.getCandleList();
        List<CakeCandleResponseDto> cakeCandleResponseDtos = candleList.stream().map(cc -> CakeCandleResponseDto.of(cc.getCandle(), cake.getTitle())).toList();
        return CakeResponseDto.of(cake, cakeCandleResponseDtos);
    }
}
