package com.jiangrzc.javase.baseKonwelge.Thread.thread2;

public class DeadLockTest {

    public static void main(String[] args) {

        // StringBuffer 是安全的 ,被 synchronized修饰的
        final StringBuffer s1 = new StringBuffer();
        final StringBuffer s2 = new StringBuffer();

        new Thread(){

            public void run() {
                synchronized (s1){
                    s1.append("a");

                    synchronized (s2){
                        s2.append("b");
                        System.out.println(s1 + ", " + s2);
                    }
                }
            }
        }.start();

        new Thread(){

            public void run() {
                synchronized (s2){
                    s2.append("c");

                    synchronized (s1){
                        s1.append("d");

                        System.out.println(s1 + ", " + s2);
                    }
                }
            }
        }.start();

    }
}


