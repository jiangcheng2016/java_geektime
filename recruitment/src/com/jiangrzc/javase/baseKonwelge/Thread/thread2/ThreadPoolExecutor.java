package com.jiangrzc.javase.baseKonwelge.Thread.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {

    public static void main(String[] args) {

//        ExecutorService threadPool = Executors.newSingleThreadExecutor();   //单个线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);//创建一个固定大小的线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();//可伸缩的，可根据线程的多少变化

        try{
            for(int i = 0; i < 10; i ++)
            {
                //使用了线程池之后，使用线程池来创建线程
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + "threadpool");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //线程池用完要关闭
            threadPool.shutdown();
        }

    }
}
