package com.jerry.restful.mapper;

import com.jerry.restful.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: JerryLiang
 * @Date: 2019/12/4 9:54
 * @Description:
 **/
@Repository
public interface UserMapper {
    List<User> getAllUser();

    void deleteUser(int id);

    User getUser(int id);

    int addUser(@Param("user") User user);

    int updateUser(@Param("id") int id, @Param("user") User user);
}
