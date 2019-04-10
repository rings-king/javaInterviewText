/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestStep
 * Author:   kadibeieun
 * Date:     2019/4/10 10:22
 * Description: 求n步台阶一共有几种写法 一次可以上一步或两步
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day06递归和迭代;

/**
 * 〈一句话功能简述〉<br> 
 * 〈求n步台阶一共有几种写法 一次可以上一步或两步〉
 * 递归
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
public class TestStep {

    public static int f(int n){
        if (n<1){
            throw new IllegalArgumentException(n+"n不能小于1");
        }
        if (n==1||n==2){

            return n;
        }else {
            return f(n-2)+f(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(f(10));
    }

}