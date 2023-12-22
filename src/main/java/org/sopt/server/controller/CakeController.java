package org.sopt.server.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.server.dto.request.CakeCreateRequestDto;
import org.sopt.server.dto.response.CakeListResponseDto;
import org.sopt.server.dto.response.CakeResponseDto;
import org.sopt.server.global.response.ApiResponse;
import org.sopt.server.global.response.SuccessType;
import org.sopt.server.service.CakeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cake")
public class CakeController {

    private final CakeService cakeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<?> create(@RequestBody CakeCreateRequestDto request) {
        cakeService.create(request);
        return ApiResponse.success(SuccessType.CAKE_CREATE_SUCCESS);
    }

    @GetMapping("{cakeId}")
    public ApiResponse<CakeResponseDto> getCandleByCakeId(@PathVariable Long cakeId) {
        return ApiResponse.success(SuccessType.GET_CANDLE_LIST_SUCCESS, cakeService.getCandleByCakeId(cakeId));
    }

    @GetMapping
    public ApiResponse<CakeListResponseDto> getCakeList() {
        return ApiResponse.success(SuccessType.GET_CAKE_LIST_SUCCESS, cakeService.getCakeList());
    }

}