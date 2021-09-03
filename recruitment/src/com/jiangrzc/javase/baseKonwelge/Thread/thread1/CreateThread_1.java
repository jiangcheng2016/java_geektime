package com.jiangrzc.javase.baseKonwelge.Thread.thread1;

public class CreateThread_1 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 100; i ++)
            System.out.println("线程执行第" + i + "次");
    }

    public static void main(String[] args) {

        CreateThread_1 thread_1 = new CreateThread_1();
        thread_1.start();

        for(int i = 0; i < 100; i ++)
            System.out.println("主函数执行第" + i + "次");
    }
}
