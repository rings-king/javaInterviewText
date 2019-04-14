/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserController
 * Author:   kadibeieun
 * Date:     2019/4/11 11:03
 * Description: 用户模块
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.afd.controller;

import com.afd.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户模块〉
 *
 * @author kadibeieun
 * @create 2019/4/11
 * @since 1.0.0
 */
@RestController
public class UserController {

    @RequestMapping("/register")
    public Object test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @RequestMapping("user/register")
    public void register(User user){


    }





    @RequestMapping(value = {"/login"},method = {RequestMethod.GET})
    public ModelAndView LoginGet(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }




}