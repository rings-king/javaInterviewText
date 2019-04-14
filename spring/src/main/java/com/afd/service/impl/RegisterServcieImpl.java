/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RegisterServcieImpl
 * Author:   kadibeieun
 * Date:     2019/4/12 20:27
 * Description: 优用户注册
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.afd.service.impl;


import com.afd.dao.TbUserMapper;
import com.afd.service.RegisterServcie;
import com.afd.util.ServerResponse;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈优用户注册〉
 *
 * @author kadibeieun
 * @create 2019/4/12
 * @since 1.0.0
 */
@Service("registerServcie")
public class RegisterServcieImpl implements RegisterServcie {

    private TbUserMapper tbUserMapper;


    @Override
    public ServerResponse checkData(String param, int type) {

        return null;
    }
}