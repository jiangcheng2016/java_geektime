package com.jiangrzc.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//测试线程池
public class TestThreadPool {

    public static void main(String[] args) {

        //1.创建服务，创建线程池
        // newFixedThreadPool 参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        //2.运行服务
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //3.关闭线程池
        service.shutdownNow();
    }


}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("线程" + Thread.currentThread().getName());
    }
}