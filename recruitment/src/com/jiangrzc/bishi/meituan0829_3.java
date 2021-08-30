package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class meituan0829_3 {

    public static void main(String[] args) {

     Thread t = new Thread(){
         public void run(){
             pong();
         }
     };
    t.run();
    System.out.println("ping");

    int arr[] = {3,4,5};


    }


    static void pong(){
        System.out.println("pong");
    }
}
