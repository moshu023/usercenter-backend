package com.yhh.usercenterbackend.exception;

import com.yhh.usercenterbackend.common.BaseResponse;
import com.yhh.usercenterbackend.common.ErrorCode;
import com.yhh.usercenterbackend.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *  全局异常处理器
 * @author masterYHH Email:15223789730@163.com
 * @version 1.0
 * @date 2022/5/10 14:47
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 该注解就代表只捕获该异常
     */
    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException e) {
        log.error("runtimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }

}
