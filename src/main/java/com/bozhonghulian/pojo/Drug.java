package com.bozhonghulian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 药品信息表
 * @Author:xiaokai
 * @Date 2022/12/13 18:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drug {
    private String did;//药品代码
    private String dname;//药品名称
    private Double price;//价格
    private String mername;//商家名
    private String type;//药品类型
}
