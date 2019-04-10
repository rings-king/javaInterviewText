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
    static int s;
    int i;
    int j;
    {
        int i =1;
        i++;
        j++;
        s++;
    }
    public void test(int j){
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        Exam2 obj1 = new Exam2();
        Exam2 obj2 = new Exam2();
        obj1.test(10);
        obj1.test(20);
        obj2.test(10);
        System.out.println(obj1.i+","+obj1.j+","+obj1.s);
        System.out.println(obj2.i+","+obj2.j+","+obj2.s);
    }

}