package org.sopt.server.global.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access =  AccessLevel.PRIVATE)
public enum SuccessType {

    /**
     * 200 OK
     */
    GET_CANDLE_SUCCESS(HttpStatus.OK, "캔들 조회에 성공했습니다."),
    CAKE_CREATE_SUCCESS(HttpStatus.OK, "케이크 생성에 성공했습니다."),

    /**
     * 201 CREATED
     */
    POST_CANDLE_SUCCESS(HttpStatus.CREATED,"춧불 생성에 성공했습니다.");

    /**
     * 204 NO CONTENT
     */

    UPDATE_CANDLE_DATE_SUCCESS(HttpStatus.NO_CONTENT, "캔들 수명 연장에 성공했습니다.");


    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
