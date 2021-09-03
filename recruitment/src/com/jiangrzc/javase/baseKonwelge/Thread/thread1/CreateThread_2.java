package com.jiangrzc.javase.baseKonwelge.Thread.thread1;

public class CreateThread_2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++)
            System.out.println("线程执行第" + i + "次");
    }
    public static void main(String[] args) {
        CreateThread_2 thread_2 = new CreateThread_2();

        new Thread(thread_2).start();

        for(int i = 0; i < 100; i ++)
            System.out.println("主线程执行第" + i + "次");
    }
}
