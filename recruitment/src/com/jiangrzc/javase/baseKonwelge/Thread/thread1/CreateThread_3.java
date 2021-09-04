package com.jiangrzc.javase.baseKonwelge.Thread.thread1;

import java.awt.print.Book;
import java.util.concurrent.*;

public class CreateThread_3 implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {

        for(int i = 0; i < 100; i ++)
            System.out.println("call线程执行了第" + i + "次");

        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //提交执行
        Future<Boolean> res =  executorService.submit(new CreateThread_3());

        //获取结果
        Boolean result = res.get();

        System.out.println(result);

        //关闭服务
        executorService.shutdownNow();

        for (int i = 0; i < 100; i ++)
            System.out.println("主线程执行第" + i + "次");



    }
}
