/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Exam2
 * Author:   kadibeieun
 * Date:     2019/4/10 10:55
 * Description: 分析成员变量与局部变量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day07成员变量与局部变量;

/**
 * 〈一句话功能简述〉<br>
 * 〈分析成员变量与局部变量〉
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
public class Exam2 {

    //成员变量
    static int s; //类变量
    int i; // 实例变量
    int j; // 实例变量

    {//局部变量 代码块
        //根据就近原则 28 行的i++表示27 的i
        int i = 1;
        i++;           // i=2
        j++;
        s++;

        //该代码块中的变量作用域只在{}内
    }

    public void test(int j) {//局部变量 j
        //此刻的38 的j 表示 传递过来的j
        j++;
        i++;  // 39的i 表示 23 的i   i=1；
        s++;
    }

    public static void main(String[] args) { //局部变量  args
        //局部变量  obj1 obj2
        Exam2 obj1 = new Exam2();
        Exam2 obj2 = new Exam2();
        obj1.test(10);
        obj1.test(20);
        obj2.test(10);
        System.out.println(obj1.i + "," + obj1.j + "," + obj1.s);   //2,1,5
        System.out.println(obj2.i + "," + obj2.j + "," + obj2.s);   //1,1,5
    }

}