package com.jiangrzc.safety;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    //ArrayList 是不安全的
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
               list.add(Thread.currentThread().getName());
            },"线程-" + i) .start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
//        for(String x:list)
//            System.out.println(x);
    }
}
