package com.jerry.restful.service;


import com.jerry.restful.domain.User;
import com.jerry.restful.exception.NotFoundException;

import java.util.List;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 9:52
 * @Description:
 **/
public interface UserService{
    List<User> getAllUser();

    void deleteUser(int id);

    Object addUser(User user);

    Object getUser(int id) throws NotFoundException;

    int updateUser(int id, User user);
}
