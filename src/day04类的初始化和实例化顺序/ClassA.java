/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ClassA
 * Author:   kadibeieun
 * Date:     2019/4/10 11:38
 * Description: 多态
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day04类的初始化和实例化顺序;

/**
 * 〈一句话功能简述〉<br>
 * 〈多态〉
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A {
    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

 class Hello {

    public static void main(String[] args) {
      A ab = new B();
        ab = new B();
    }


}