/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyUtil2
 * Author:   kadibeieun
 * Date:     2019/4/10 11:57
 * Description: 写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day08流;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 〈一句话功能简述〉<br> 
 * 〈写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数〉
 *
 * @author kadibeieun
 * @create 2019/4/10
 * @since 1.0.0
 */
public class MyUtil2 {
    // 工具类中的方法都是静态方式访问的因此将构造器私有不允许创建对象(绝对好习惯)
    private MyUtil2() {
        throw new AssertionError();
    }

    /**
     * 统计给定文件中给定字符串的出现次数
     *
     * @param filename  文件名
     * @param word 字符串
     * @return 字符串在文件中出现的次数
     */
    public static int countWordInFile(String filename, String word) {
        int counter = 0;
        try (FileReader fr = new FileReader(filename)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return counter;
    }


}