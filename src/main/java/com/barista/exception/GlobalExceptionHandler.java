package com.barista.exception;

import com.barista.result.Result;
import com.barista.result.ResultCode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @ClassName GlobalExceptionHandler
 * @Author zhaoth
 * @Date 2019/9/2 11:51
 * @Version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = DuplicateKeyException.class)
    public Result duplicateKeyException(DuplicateKeyException e) {
        logger.debug(e.getMostSpecificCause().toString());
        return Result.fail(ResultCode.DUPLICATE_INDEX);
    }


}
