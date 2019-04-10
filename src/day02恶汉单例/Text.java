/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Text
 * Author:   kadibeieun
 * Date:     2019/4/9 16:27
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day02恶汉单例;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Text {
    public static void main(String[] args) {
        Sington2 s = Sington2.INSTANCE;
        Singleton1 s2 = Singleton1.SINGLETON_1;
        System.out.println(s);
    }

}