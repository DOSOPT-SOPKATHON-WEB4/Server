package org.sopt.server.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.server.global.response.ApiResponse;
import org.sopt.server.global.response.SuccessType;
import org.sopt.server.service.CandyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/candle")
public class CandyController {

    private final CandyService candyService;

    @GetMapping
    public ApiResponse<?> findById(@RequestParam Long candleId,
                                   @RequestParam String cakeName) {
        return ApiResponse.success(SuccessType.GET_CANDLE_SUCCESS, candyService.findById(candleId, cakeName));
    }

    @PatchMapping
    public ApiResponse<?> updateDate(@RequestParam Long candleId) {
        candyService.updateDate(candleId);
        return ApiResponse.success(SuccessType.UPDATE_CANDLE_DATE_SUCCESS);
    }
}
