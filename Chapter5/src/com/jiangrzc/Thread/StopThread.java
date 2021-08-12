package com.jiangrzc.Thread;

public class StopThread implements Runnable{

    //1.线程中定义线程体使用的标识
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        //2.线程体使用该标识
        while(flag){
            System.out.println(Thread.currentThread().getName()+ "-->" + i ++);
        }
    }

    //3.对外提供方法改变标识
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        //创建线程
        new Thread(stopThread).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if(i == 900){
                stopThread.stop();
                System.out.println("stopThread线程该停止了");
            }
        }
    }

}
