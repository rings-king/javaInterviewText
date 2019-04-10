package day01自增变量; /**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: day01自增变量.Day01
 * Author:   kadibeieun
 * Date:     2019/4/9 15:51
 * Description: 自增变量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈自增变量〉
 *
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Day01 {
    public static void main(String[] args) {
        int i = 1;
        i= i++;
        System.out.println(i);
        int j = i++;
        int k = i+ ++i * i++;
        System.out.println("i:"+i); // 4
        System.out.println("j:"+j); // 1
        System.out.println("k:"+k); // 11
    }

}