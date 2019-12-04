package com.jerry.restful.exception;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 17:19
 * @Description:
 **/
public class NotFoundException extends GlobalException {
    public NotFoundException(String message, int code){
        super(message, code);
    }
}
