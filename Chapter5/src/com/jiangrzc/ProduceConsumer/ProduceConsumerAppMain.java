package com.jiangrzc.ProduceConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;


public class ProduceConsumerAppMain {

    public static final Object LOCKER = new Object();

    public static void main(String[] args) {

        Queue<String> urls = new LinkedList<>();
        Consumer<String> consumer = new Consumer<>(urls);
        Produce<String> produce = new Produce<>(urls,1024);

        for(int i = 0; i < 100; i ++){
            Thread consumeThread = new Thread(()->{
                while(true){
                    try {
                        String url = consumer.consume();
                        processURL(url);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"消费者-" + i);
            consumeThread.start();
        }

        for(int i = 0; i < 3; i ++){
            Thread produceThread = new Thread(()->{
                while(true){
                    String url = produceURL();
                    try {
                        produce.produce(url);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"生产者-" + i);
            produceThread.start();
        }

        //TODO 如果想给生产者消费者做一个统计，统计每个生产者消费者所生产/消费的 task 的数量，应该
        //TODO 1)使用哪种数据结构？
        //TODO 2)如何保证线程安全？
        //TODO 3)怎么将统计结果输出到控制台？

    }

    public static String produceURL(){
        StringBuilder ret = new StringBuilder();
        ret.append("www");
        for(int i =0; i< 6; i ++){
            int rand = (int) ((Math.random() * 1000) % 26);
            char ch = (char) (rand + 'a');
            ret.append(ch);
        }
        ret.append(".com");
        return ret.toString();
    }

    public static void processURL(String url) throws InterruptedException {
        System.out.println("开始处理：" + url);
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("处理完成:" + url);

    }
}
