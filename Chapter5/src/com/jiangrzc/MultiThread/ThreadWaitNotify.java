package com.jiangrzc.MultiThread;

import java.util.concurrent.TimeUnit;

public class ThreadWaitNotify {

    public static void main(String[] args) {

        Object locker = new Object();

        int workSec = 2;
        int threadCount = 5;
        for(int i = 0; i < threadCount; i ++)
            new Thread(()->{
                        System.out.println(getName() + "线程开始工作......");
                        try {
                            synchronized (locker){
                                sleepSec(workSec);
                                System.out.println(getName() + ":进入等待......");
                                //TODO wait方法必须在进入相对应对象的 synchronized 块中才能调用
                                //TODO 执行wait 方法之后，自动失去对象的monitor，也就是说别的线程可以进入这个对象的 synchronized 代码块了
                                locker.wait();
                                // TODO 被唤醒的线程，就相当于执行过了 wait 方法，开始向下执行
                                // TODO 如果wait不是 synchronized  块中的最后一行，那么第一件事就是“排队”获取之前失去的 monitor
                                // TODO 排队加引号是因为 synchronized 是非公平的，也就是说，不是谁先等待谁就能先获得
                                System.out.println(getName() + "：线程继续......");
                                sleepSec(2);
                                System.out.println(getName() + "：线程结束......");
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    },"工作线程" + i).start();

        // TODO 如果 notify / notifyAll 在wait之前，会怎么样？
        System.out.println("................唤醒线程开始 sleep .............");
        // TODO 人工划重点：如果执行notify的时候，线程还没有进入wait状态，那么notify是没有效果的
        // TODO 人工划重点：先notify，后进入wait，就是所谓的 lost notification 问题，可能造成线程无法执行
        // TODO 人工划重点：如果让唤醒的线程 sleep 比 worker短（sleep时间 +1 变 -1，或者干脆不sleep），也就是先进行notify，那么就可能会造成这个问题
        // TODO 人工划重点：为什么说可能呢？因为 synchronized 还是阻碍了 notify 的执行，但是 notify 有机会在wait前执行了
        sleepSec(workSec + 1);
        System.out.println("---------------------唤醒线程sleep结束------------");
        synchronized (locker){
            //TODO notify / notifyAll 方法必须在进入相应对象的synchronized 块中才能调用
            System.out.println("----------------------开始唤醒所有 --------------");
            locker.notifyAll();

//            for(int i = 0; i < threadCount; i ++){
//                System.out.println("------------------开始逐个唤醒---------------");
//                locker.notify();
//            }
        }


    }


    public static String getName(){
        return Thread.currentThread().getName();
    }

    public static void sleepSec(int workSec){
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(workSec));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
