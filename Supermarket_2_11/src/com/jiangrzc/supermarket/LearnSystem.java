package com.jiangrzc.supermarket;

public class LearnSystem {
    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();

        int count = 0;
        for(int i = 0; i < 1000;  i ++)
            count ++;

        long endMS = System.currentTimeMillis();
        System.out.println("程序执行了多少毫秒？" + (endMS - startMS));

        long startNS = System.nanoTime();
        count = 0;
        for(int i = 0; i < 1000;  i ++)
            count ++;
        long endNS = System.nanoTime();
        System.out.println("程序执行了多少纳秒?" + (endNS - startNS));
    }
}
