/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Exam
 * Author:   kadibeieun
 * Date:     2019/4/10 9:50
 * Description: 方法参数传递实例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day05方法的参数传递机制;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈方法参数传递实例〉
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
public class Exam {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1,2,3,4,5};
        MyData m = new MyData();
        change(i, str, num, arr, m);
        System.out.println("i="+i);
        System.out.println("str="+str);
        System.out.println("num="+num);
        System.out.println("arr="+ Arrays.toString(arr));
        System.out.println("my.a="+m.a);

    }

    public static void change(int j,String s,Integer n,int[]a,MyData m) {

        j+=1;
        s += "world";
        n+=1;
        a[0]+=1;
        m.a+=1;
    }

}

class MyData{
    int a = 10;
}