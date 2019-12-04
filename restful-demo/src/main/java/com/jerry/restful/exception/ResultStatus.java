package com.jerry.restful.exception;

import lombok.Data;


/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 17:22
 * @Description:
 **/
@Data
public class ResultStatus {
    private String error;
    private int code;
    public ResultStatus(String error, int code){
        this.error = error;
        this.code = code;
    }
}
