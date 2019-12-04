package com.jerry.restful.exception;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 17:24
 * @Description:
 **/
public enum ErrorCode {
    USER_NOT_FOUND(40401),
    ACCESS_DENEY(40001),
    ;

    private int code;

    public int getCode() {
        return code;
    }

    ErrorCode(int code)
    {
        this.code = code;
    }
}
