package com.jiangrzc.Thread;

import java.util.Map;

public class CreateThreadAppMain {

    public static final String TEXT = "我欲见你，何惧一两个春秋；还爱你像小溪的水不能喝，像炸好的土豆趁热吃，像清晨的花苞快开放，像好不容易遇见后欲言又止......";

    public static void main(String[] args) {

        //TODO 代码是被线程执行的，任何代码都可以通过 Thread.currentThread() 获取执行当前代码的线程
        System.out.println("程序开始，执行线程的名字叫做：" + Thread.currentThread().getName());

        for(int i = 1; i <= 1; i ++){

            //TODO 学习创建线程的方法
            //TODO Runable 接口里的 run 是线程执行的方法，执行完毕，线程就结束了
            //TODO 理解代码是在线程里被执行的，同样的代码可以被多个线程执行。
            //TODO 可通过debug观察线程的相关信息
            Thread thread = new Thread(new PrintStoryRunable(TEXT,300));

            // 创建好线程之后，如果要启动线程，必须调用 start() 方法，注意不是run方法
            thread.start();
        }
        System.out.println("启动线程，线程名字叫做" + Thread.currentThread().getName());
    }

    static class PrintStoryRunable implements Runnable{

        private String text;
        private long interval;

        public PrintStoryRunable(String text, long interval) {
            this.text = text;
            this.interval = interval;
        }

        @Override
        public void run() {
            double num = Math.random();
            System.out.println("执行这段代码的线程名字叫做" + Thread.currentThread().getName());
            try {
                printSlowly(text,interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行结束");
        }
    }


    public static void printSlowly(String text, long interval) throws InterruptedException {
        for(char ch:text.toCharArray()){
            Thread.sleep(interval);
            System.out.print(ch);
        }
        System.out.println();
    }
}
