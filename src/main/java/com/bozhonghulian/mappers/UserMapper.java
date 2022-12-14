package com.bozhonghulian.mappers;

import com.bozhonghulian.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/13 18:42
 */
@Mapper
@Repository
public interface UserMapper {
    //用户注册
    boolean register(User user);

    //用户登录
    User login(User user);
}
