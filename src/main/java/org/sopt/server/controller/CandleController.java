package org.sopt.server.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.server.dto.request.CandleRequestDto;
import org.sopt.server.global.response.ApiResponse;
import org.sopt.server.global.response.SuccessType;
import org.sopt.server.service.CandleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candle")
@RequiredArgsConstructor
public class CandleController {

    private final CandleService candleService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<?> createCandle(@RequestBody CandleRequestDto request) {
        candleService.createCandle(request);
        return ApiResponse.success(SuccessType.POST_CANDLE_SUCCESS);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<?> findById(@RequestParam Long candleId,
                                   @RequestParam String cakeName) {
        return ApiResponse.success(SuccessType.GET_CANDLE_SUCCESS, candleService.findById(candleId, cakeName));
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ApiResponse<?> updateDate(@RequestParam Long candleId) {
        candleService.updateDate(candleId);
        return ApiResponse.success(SuccessType.UPDATE_CANDLE_DATE_SUCCESS);
    }
}
