/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test04
 * Author:   kadibeieun
 * Date:     2019/4/9 16:54
 * Description: 测试懒汉单例的线程安全
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package day02懒汉单例;

import java.util.concurrent.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试懒汉单例的线程安全〉
 * @author kadibeieun
 * @create 2019/4/9
 * @since 1.0.0
 */
public class Test05
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Callable<Singleton2> c = new Callable<Singleton2>() {
            @Override
            public Singleton2 call() throws Exception {
                return Singleton2.getInstance();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton2> s1 = executorService.submit(c);
        Future<Singleton2> s2 = executorService.submit(c);

        Singleton2 f1 = s1.get();
        Singleton2 f2 = s2.get();

        System.out.println(f1==f2);
        executorService.shutdown();
    }
}