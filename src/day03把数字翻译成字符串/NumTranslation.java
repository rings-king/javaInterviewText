/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: NumTranslation
 * Author:   kadibeieun
 * Date:     2019/4/9 16:41
 * Description: 给定一个数字，按照如下规则翻译成字符串：0翻译成“a”，1翻译成“b”…25翻译成“z”。一个数字有多种翻译可能，例如12258一共有5种，分别是bccfi，bwfi，bczi，mcfi，mzi。实现一个函数，用来计算一个数字有多少种不同的翻译方法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day03把数字翻译成字符串;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给定一个数字，按照如下规则翻译成字符串：0翻译成“a”，1翻译成“b”…25翻译成“z”。
 * 一个数字有多种翻译可能，例如12258一共有5种，分别是bccfi，bwfi，bczi，mcfi，mzi。
 * 实现一个函数，用来计算一个数字有多少种不同的翻译方法〉
 *
 *
 *
 * 思路分析
 * 用递归自顶向下分析，用动态规划自低向上求解
 * •定义问题：当最开始的一个或者两个数字被翻译成一个字符后，我们接着翻译后面剩下的数字；
 * •用一个递归式来表示：定义f(i)表示从第i位数字开始的不同翻译的数目，那么f(i) = f(i+1) + g(i,i+1)*f(i+2)；当第i位和第i+1位两位数字拼接起来的数字在10~25的范围内时，函数g(i,i+1)的值为1，否则为0。
 * •该问题使用上面的递归方法会存在很多重复子问题。所以我们使用动态规划的方法，自低向上求解问题，消除重复子问题。
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class NumTranslation {

    public static int getable(String str, int i){
        String tempStr = (str.charAt(i-1) + "") + (str.charAt(i) + "");
        int value = Integer.parseInt(tempStr);
        if (value >= 10 && value <= 25) {
            return 1;
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int num = 12258;
        int n = String.valueOf(num).length();
        int[] f = new int[n + 1];
        f[n] = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (i == n - 1) {
                f[i] = f[i + 1] + getable(num + "", i) * 1;
                continue;
            }
            f[i] = f[i + 1] + getable(num + "", i) * f[i + 2];
        }

        System.out.println(f[1]);
    }


}