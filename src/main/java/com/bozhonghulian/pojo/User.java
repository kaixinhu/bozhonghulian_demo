package com.bozhonghulian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 消费者账号信息类
 * @Author:xiaokai
 * @Date 2022/12/13 18:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String account;//账号
    private String pwd;//密码
}
