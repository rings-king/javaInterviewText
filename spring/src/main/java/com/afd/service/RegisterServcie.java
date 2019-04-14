/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RegisterServcie
 * Author:   kadibeieun
 * Date:     2019/4/12 20:26
 * Description: 用户注册
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.afd.service;

import com.afd.util.ServerResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户注册〉
 *
 * @author kadibeieun
 * @create 2019/4/12
 * @since 1.0.0
 */
public interface RegisterServcie {

    ServerResponse checkData(String param, int type);

}