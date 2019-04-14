/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   kadibeieun
 * Date:     2019/4/12 10:38
 * Description: 用户逻辑处理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.afd.service.impl;

import com.afd.dao.UserMapper;
import com.afd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户逻辑处理〉
 *
 * @author kadibeieun
 * @create 2019/4/12
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

}