/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestStep2
 * Author:   kadibeieun
 * Date:     2019/4/10 10:44
 * Description: 迭代
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day06递归和迭代;

/**
 * 〈一句话功能简述〉<br> 
 * 〈迭代〉
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
public class TestStep2 {
    public static int loop(int n){
        if (n==1||n==2){
            return n ;
        }
        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one+two;
            two = one;
            one = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(loop(10));
    }
}