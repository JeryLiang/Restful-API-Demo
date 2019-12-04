package com.jerry.restful.controller;

import com.jerry.restful.domain.User;
import com.jerry.restful.exception.NotFoundException;
import com.jerry.restful.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 9:50
 * @Description:
 **/
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息")
    @GetMapping(value = "/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @ApiOperation(value = "添加用户", notes = "添加用户")
    @PostMapping(value = "/users")
    public Object addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @ApiOperation(value = "获取用户信息", notes = "根据id获取用户信息")
    @GetMapping(value = "/users/{id}")
    public Object getUser(@PathVariable("id") int id) throws NotFoundException {
        return userService.getUser(id);
    }

    @ApiOperation(value = "删除用户", notes = "根据id删除用户")
    @DeleteMapping(value = "/users/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }

    @ApiOperation(value = "更新用户", notes = "根据id来更新指定用户")
    @PatchMapping(value = "/users/{id}")
    public Object updateUser(@PathVariable("id") int id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @ApiOperation(value = "测试")
    @GetMapping(value = "/test")
    public String test(){
        return "All Right!";
    }

}
