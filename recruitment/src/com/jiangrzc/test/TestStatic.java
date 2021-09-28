package com.jiangrzc.test;

import java.util.Vector;

public class TestStatic {


    private static int i = 10;

    private  String abc;

    static void run(){
        System.out.println("this is void run");
    }

    public static void main(String[] args) {

        TestStatic.run();

    }

    public void test(){
//        this.abc;
    }
}
