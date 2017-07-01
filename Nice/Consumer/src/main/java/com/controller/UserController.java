package com.controller;

import com.entity.User;
import com.service.UserService;
import com.viewobject.UserVO;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/20.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("detail")
    public UserVO detail(int id) {
        User user = userService.detail(id);
        return new DozerBeanMapper().map(user, UserVO.class);
    }
}
