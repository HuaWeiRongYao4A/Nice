package com.serviceimpl;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User detail(int id) {
        return userMapper.detail(new User(id));
    }
}
