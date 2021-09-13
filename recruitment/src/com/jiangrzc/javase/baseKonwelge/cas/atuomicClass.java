package com.jiangrzc.javase.baseKonwelge.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class atuomicClass {

    private static AtomicInteger race = new AtomicInteger(0);

    private static final int count = 20;

    public static void main(String[] args) {

        Thread[] threads = new Thread[count];

        for (int i = 0; i < count; i++){

            threads[i] = new Thread(new Runnable(){

                @Override
                public void run() {
                    for(int i = 0; i < 10000; i ++)
                        race.incrementAndGet();
                }
            });

            threads[i].start();
        }

        while(Thread.activeCount() > 2)
            Thread.yield();
//        while(Thread.activeCount() <= 2)
//            System.out.println(race.get());

    }
}
