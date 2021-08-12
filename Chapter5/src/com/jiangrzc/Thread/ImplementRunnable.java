package com.jiangrzc.Thread;

public class ImplementRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "开始执行了......");
        }
    }

    public static void main(String[] args) {

        ImplementRunnable thread1 = new ImplementRunnable();

        new Thread(thread1).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("这是我的第" + i + "行代码");
        }
    }

}
