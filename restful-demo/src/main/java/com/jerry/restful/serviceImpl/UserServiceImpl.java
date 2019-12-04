package com.jerry.restful.serviceImpl;

import com.jerry.restful.domain.User;
import com.jerry.restful.exception.ErrorCode;
import com.jerry.restful.exception.NotFoundException;
import com.jerry.restful.exception.ResultStatus;
import com.jerry.restful.mapper.UserMapper;
import com.jerry.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 9:53
 * @Description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public Object addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Object getUser(int id) throws NotFoundException{
        User result = userMapper.getUser(id);
        if(result == null){
            throw new NotFoundException("user " + id + " is not exist!", ErrorCode.USER_NOT_FOUND.getCode());
        }
        return result;
    }

    @Override
    public int updateUser(int id, User user) {
        return userMapper.updateUser(id, user);
    }
}
