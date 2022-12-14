package com.bozhonghulian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 商家信息表
 * @Author:xiaokai
 * @Date 2022/12/13 18:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Merchant {
    private String mername;//商家名称
    private String Merpwd;//密码
}
