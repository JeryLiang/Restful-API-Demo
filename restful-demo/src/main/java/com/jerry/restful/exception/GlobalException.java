package com.jerry.restful.exception;

import lombok.Data;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 17:16
 * @Description:
 **/
@Data
public class GlobalException extends Exception{
    private int code;

    public GlobalException(String message){
        super(message);
    }

    public GlobalException(String message, int code){
        super(message);
        this.code = code;
    }
}
