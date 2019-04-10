/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Son
 * Author:   kadibeieun
 * Date:     2019/4/10 9:03
 * Description:
 * 子类初始化 《clinit》
 *  (1) 静态类变量显示赋值代码---------- j = method()     (10)
 *  (2) 静态代码块                                      (6)
 *  谁在上先执行谁 ，初始化方法只执行一次
 * 先初始化父类再初始化子类 (5)--> (1) --> (10) --> (6)
 *实例初始化《init》 子类构造其中一定会调用父类的 super（）/// 代表父类的实例化方法 (9) --> (3） --->（2）
 * 重写时调用子类自己的方法 (this 方法 )
 * 静态方法不能被重写 final 修饰也不能被重写
 * （1） 飞静态变量显示赋值代码  i = test();               9
 * （2） 非静态代码块   {System.out.println("(3)"); }    8
 * （3） 构造器方法                                     7
 *

 *
 *
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day04类的初始化和实例化顺序;

public class Son extends Father{
    private int i = test();
    private static int j = method();

    static {
        System.out.println("(6)");
    }

    Son() {
        System.out.println("(7)");
    }

    {
        System.out.println("(8)");
    }

    @Override
    public  int test(){
        System.out.println("(9)");
        return 1;
    }


    public static int method() {
        System.out.println("(10)");
        return 1;
    }


    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();

    }
}