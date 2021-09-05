package com.jiangrzc.javase.baseKonwelge.Thread.thread2;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    public static void main(String[] args) {

       Account account = new Account();

       new Thread(account,"线程1").start();
       new Thread(account,"线程2").start();
    }
}

//账户
class Account implements Runnable{

    private int money = 0;
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        try {
            addMoney();
            Thread.sleep(100);
            addMoney();
            Thread.sleep(100);
            addMoney();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        for(int i = 0; i < 3; i ++)
//        {
//            addMoney();
//        }
    }

    public void addMoney(){

        lock.lock();
        try{
            money += 1000;
            System.out.println(Thread.currentThread().getName()+"当前账户余额:" + money);
        }finally {
            lock.unlock();
        }

    }


}