/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Singleton1
 * Author:   kadibeieun
 * Date:     2019/4/9 16:49
 * Description: 简单懒汉模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day02懒汉单例;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单懒汉模式〉
 *
 *
 * 1.构造器私有化
 * 2.用一个静态变量来保存这个唯一单例
 * 3.再调用方法时再创建这个单例对象
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1(){}
    public static Singleton1 getInstance()  {

        if (singleton1==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}