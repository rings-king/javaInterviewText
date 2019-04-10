/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Sinfleton6
 * Author:   kadibeieun
 * Date:     2019/4/9 17:16
 * Description: 简单的安全线程单例写法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day02懒汉单例;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单的安全线程单例写法 静态内部类方式〉
 *
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Sinfleton6
{
    private Sinfleton6 (){
    }
    private static class inner{
        /**
         * 再内部加载时才创建对象
         * 静态内部类不会随着外部类的加载和初始化而初始化 ，而是要单独加载和初始化的
         */
        private static final Sinfleton6 sinfleton6 = new Sinfleton6();
    }

    public static Sinfleton6 getInstance(){
        return inner.sinfleton6;
    }

}