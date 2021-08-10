package com.jiangrzc.MultiThread;

public class DataHolder {

    Object block = new Object();

    private long number = 0;
    private static long numberStatic = 0;

    //synchronized 修饰
    public synchronized void  change(long delta){
        number += delta;
    }

    //代码块
    public void changeSynchBlock(long delta){
        synchronized (block){
            number += delta;
        }
    }

    //synchronized 修饰
    public synchronized static void  changeStatic(long delta){
        numberStatic += delta;
    }


    public void print(){
        System.out.println("number=" + number);
    }

    public static void printStatic(){
        System.out.println("numberStatic=" + numberStatic);
    }
}
