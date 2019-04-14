/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RegisterController
 * Author:   kadibeieun
 * Date:     2019/4/12 20:05
 * Description: 用户注册
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.afd.controller;

import com.afd.util.ServerResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户注册〉
 *
 * @author kadibeieun
 * @create 2019/4/12
 * @since 1.0.0
 */
@RestController
public class RegisterController {

    public ServerResponse checkData(@PathVariable String param, @PathVariable Integer type){
        return null;
    }



}