package com.bozhonghulian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/14 17:43
 */
@Controller
public class Demo {
    @RequestMapping("/goto")
    public String go(){
        return "/drug/allDrug";
    }
}
