package com.yhh.usercenterbackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description 通用返回类
 * @author masterYHH Email:15223789730@163.com
 * @version 1.0
 * @date 2022/5/10 13:32
 */
@Data
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 8673372729488707610L;

    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }

}
