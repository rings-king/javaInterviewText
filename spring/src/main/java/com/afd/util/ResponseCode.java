/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ResponseCode
 * Author:   kadibeieun
 * Date:     2019/4/12 20:16
 * Description: 返回数据包装类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.afd.util;

/**
 * 〈一句话功能简述〉<br> 
 * 〈返回数据包装类〉
 *
 * @author kadibeieun
 * @create 2019/4/12
 * @since 1.0.0
 */
public enum  ResponseCode {
    SUCCESS(0, "SUCCESS"),

    ERROR(1, "ERROR"),

    //需要登陆
    NEED_LOGIN(10, "NEED_LOGIN"),

    //非法参数
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;


    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}