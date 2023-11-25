package org.sopt.server.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.server.dto.request.CandleRequestDto;
import org.sopt.server.global.response.ApiResponse;
import org.sopt.server.global.response.SuccessType;
import org.sopt.server.service.CandleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candle")
@RequiredArgsConstructor
public class CandleController {

    private final CandleService candleService;

    @PostMapping
    public ApiResponse<?> createCandle(@RequestBody CandleRequestDto request) {
        candleService.createCandle(request);
        return ApiResponse.success(SuccessType.POST_CANDLE_SUCCESS);
    }
}
