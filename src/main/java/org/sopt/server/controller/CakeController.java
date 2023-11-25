package org.sopt.server.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.server.dto.request.CakeCreateRequestDto;
import org.sopt.server.global.response.ApiResponse;
import org.sopt.server.global.response.SuccessType;
import org.sopt.server.service.CakeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cake")
public class CakeController {

    private final CakeService cakeService;

    @PostMapping
    public ApiResponse<?> create(@RequestBody CakeCreateRequestDto request) {
        cakeService.create(request);
        return ApiResponse.success(SuccessType.CAKE_CREATE_SUCCESS);
    }
}