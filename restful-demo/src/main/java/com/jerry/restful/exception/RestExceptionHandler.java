package com.jerry.restful.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 17:20
 * @Description:
 **/
@ControllerAdvice
public class RestExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResultStatus handleResourceNotFoundException(NotFoundException e){
        logger.error(e.getMessage(), e);
        return new ResultStatus(e.getMessage(), e.getCode());
    }

}
