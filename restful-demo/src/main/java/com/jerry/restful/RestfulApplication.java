package com.jerry.restful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 9:33
 * @Description:
 **/
@MapperScan(basePackages = "com.jerry.restful.mapper")
@SpringBootApplication
public class RestfulApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestfulApplication.class, args);
    }
}
