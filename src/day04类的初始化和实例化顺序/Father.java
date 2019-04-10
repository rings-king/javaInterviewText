/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Father
 * Author:   kadibeieun
 * Date:     2019/4/10 8:58
 * Description: 父类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day04类的初始化和实例化顺序;

/**
 * 〈一句话功能简述〉<br>
 * 〈父类〉
 *
 * 父类初始化 《clinit》
 * (1) 静态类变量显示赋值代码---------- j = method()  5
 * (2) 静态代码块                                   1
 * 谁在上先执行谁 ，初始化方法只执行一次
 *
 *实例初始化《init》
 * （1） 飞静态变量显示赋值代码  i = test();            4
 * （2） 非静态代码块   {System.out.println("(3)"); } 3
 * （3） 构造器方法                                   2
 * new 一次就调用一次 1 2 谁在上先执行谁 构造器方法最后执行；
 *
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
public abstract class Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.println("(1)");
    }

    Father() {
        System.out.println("(2)");
    }

    {
        System.out.println("(3)");
    }


    public  int test() {
        System.out.println("(4)");
        return 1;
    }


    public static int method() {
        System.out.println("(5)");
        return 1;
    }

}

