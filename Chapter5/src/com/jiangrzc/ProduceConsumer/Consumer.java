package com.jiangrzc.ProduceConsumer;

import java.util.Queue;

public class Consumer<T> {

    private Queue<T> tasks;

    public Consumer(Queue<T> tasks) {
        this.tasks = tasks;
    }

    public T consume() throws InterruptedException {
        synchronized (tasks){
            //TODO 如果不用while ，用if会怎么样？
            while(tasks.size() == 0){
                System.out.println("消费者线程进入等待：" + Thread.currentThread().getName());
                //TODO wait 方法会释放monitor
                tasks.wait();
            }
            T ret = tasks.poll();
            //TODO 调用notify或者notifyAll方法的时候，必须已经获得对象的monitor，也就是在对象的synchronized块中
            tasks.notifyAll();
            return  ret;
        }
    }
}
