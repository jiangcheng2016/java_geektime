package com.jiangrzc.Thread;

public class ExtendThread extends Thread{



    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "开始执行了......");
        }
    }

    public static void main(String[] args) {

        ExtendThread thread1 = new ExtendThread();
//        ExtendThread thread2 = new ExtendThread();
//        ExtendThread thread3 = new ExtendThread();

        thread1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("这是我的第" + i + "行代码");
        }
    }
}
