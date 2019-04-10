package day02恶汉单例; /**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: day02恶汉单例.Singleton1
 * Author:   kadibeieun
 * Date:     2019/4/9 16:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 恶汉式单例
 * 1.构造方法私有化
 * 2.不管是否需要都先创造对象
 * 3.向外提供这个实例
 */
public class Singleton1{
    public static final Singleton1 SINGLETON_1 = new Singleton1();
    private Singleton1(){
    }
    public static Singleton1 getSingleton1(){
        return SINGLETON_1;
    }

}