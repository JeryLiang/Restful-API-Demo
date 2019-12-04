package com.jerry.restful.domain;

import lombok.Data;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 10:08
 * @Description:
 **/
@Data
public class User {

    private Integer id;

    private String userName;

    private Integer age;

    private String account;

    private String password;

    public User(){}

}
