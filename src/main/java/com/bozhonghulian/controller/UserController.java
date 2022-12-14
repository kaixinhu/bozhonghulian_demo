package com.bozhonghulian.controller;

import com.bozhonghulian.pojo.User;
import com.bozhonghulian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/13 18:38
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    //登录
    @GetMapping("/login")
    public ModelAndView login(User user){
        User login = userService.login(user);

        ModelAndView modelAndView = new ModelAndView();
        if(login == null){
            modelAndView.setViewName("index");
            modelAndView.addObject("msg", "登录失败，请检测账号密码！");
            return modelAndView;
        }

        modelAndView.setViewName("redirect:/drug/allDrug");
        modelAndView.addObject("msg", user.getAccount());
        return modelAndView;
    }

    //注册
    @GetMapping("/register")
    public ModelAndView register(User user){
        boolean regis = userService.register(user);

        ModelAndView modelAndView = new ModelAndView();
        if (regis){
            modelAndView.setViewName("index");
            return modelAndView;
        }
        modelAndView.setViewName("index");
        modelAndView.addObject("msg", "注册失败,该账号已有人使用！");
        return modelAndView;
    }

}
