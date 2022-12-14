package com.bozhonghulian.service;

import com.bozhonghulian.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/13 19:09
 */
public interface UserService {
    //注册
    boolean register(User user);

    //登录
    User login(User user);

}
