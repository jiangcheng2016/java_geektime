package com.jiangrzc.ProduceConsumer;

import java.util.Queue;

public class Produce<T> {
    private Queue<T> tasks;

    private int maxTaskCount = 0;

    public Produce(Queue<T> tasks, int maxTaskCount) {
        this.tasks = tasks;
        this.maxTaskCount = maxTaskCount;
    }

    public void produce(T task) throws InterruptedException {
        synchronized (tasks){
            //TODO 如果这个检查不在synchronized块里会怎么样呢？
            //TODO 如果不用 while 会怎么样呢？
            while(tasks.size() >= maxTaskCount){
                System.out.println("生产者线程进入等待：" + Thread.currentThread().getName());
                tasks.wait();
            }
            tasks.add(task);
            //TODO 调用notify或者notifyAll 的时候，必须已经获得对象的 monitor， 也就是在对象的 synchronized 块中
            tasks.notifyAll();
        }
    }
}
