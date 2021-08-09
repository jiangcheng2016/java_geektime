package com.jiangrzc.Thread;

public class StopAndSeeThread {
    public static void main(String[] args) {
        m1();
    }


    public static void m1(){
        m2();
    }

    public static void m2(){
        m3();
    }

    public static void m3(){
        m4();
    }

    public static void m4(){
        m5();
    }

    public static void m5(){
        m6();
    }

    public static void m6(){
        System.out.println("端点挺住");
    }
}
