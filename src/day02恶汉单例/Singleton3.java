/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Singleton3
 * Author:   kadibeieun
 * Date:     2019/4/9 16:30
 * Description: 静态代码块的单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day02恶汉单例;

/**
 * 〈一句话功能简述〉<br> 
 * 〈静态代码块的单例〉
 *
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Singleton3 {
    public static final Singleton3 SINGLETON_3 ;
    private Singleton3(){}
    static {
        SINGLETON_3 = new Singleton3();
    }

}