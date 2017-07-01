package com.dao;

import com.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/6/20.
 */
public interface UserMapper {

    List<User> selectIf();

    int update(User user);

    int getEnum();

    User detail(User user);
}
