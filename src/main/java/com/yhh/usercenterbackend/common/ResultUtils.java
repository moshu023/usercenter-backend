package com.yhh.usercenterbackend.common;

/**
  * @Description 返回工具类
  * @author masterYHH Email:15223789730@163.com
  * @date 2022/5/10
  */
public class ResultUtils {
    /**
     * @Description 成功
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "success");
    }

    /**
     * @Description 失败
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @param description
     * @return
     */
    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse(code, null, message, description);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse(errorCode.getCode(), null, message, description);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse(errorCode.getCode(), errorCode.getMessage(), description);
    }
}
