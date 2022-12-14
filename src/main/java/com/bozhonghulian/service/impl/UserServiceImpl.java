package com.bozhonghulian.service.impl;

import com.bozhonghulian.mappers.UserMapper;
import com.bozhonghulian.pojo.User;
import com.bozhonghulian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/13 19:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean register(User user) {
        return userMapper.login(user) == null && userMapper.register(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
