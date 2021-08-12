package com.jiangrzc.Thread;

public class ThreadState {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            //执行操作
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("循环延时结束:///");
        });

        //观察初识状态-
        Thread.State state = thread.getState();
        System.out.println("初始状态：" + state);

        //观察启动后
        thread.start();
        state = thread.getState();
        System.out.println("启动后" + state);

        //运行
        //只要线程不终止，就一直输出状态
        while (state != Thread.State.TERMINATED) {
            Thread.sleep(100);
            System.out.println("运行时：" + state);
            state = thread.getState();//更新线程状态
        }

    }
}









