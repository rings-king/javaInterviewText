/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Singleton2
 * Author:   kadibeieun
 * Date:     2019/4/9 17:07
 * Description: 线程安全的懒汉单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day02懒汉单例;

/**
 * 〈一句话功能简述〉<br> 
 * 〈线程安全的懒汉单例〉
 *
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static Singleton2 getInstance() {

        if (singleton2 == null) {

            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    singleton2 = new Singleton2();
                }

            }
        }

        return singleton2;
    }

}