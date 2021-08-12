package com.jiangrzc.ProduceConsumer;

//生产者/消费者 模式
//管程法
public class GCF {

    public static void main(String[] args) {

        SynContainer container = new SynContainer();

        new Producer(container).start();
        new Consume(container).start();
    }
}


//生产者
class Producer extends Thread{

    SynContainer synContainer;

    public Producer(SynContainer synContainer){
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synContainer.push(new Chicken(i));
            System.out.println("生产了" + i + "只鸡");
        }
    }
}


//消费者
class Consume extends Thread{

    SynContainer synContainer;

    public Consume(SynContainer synContainer){
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Chicken pop = synContainer.pop();
            System.out.println("消费了" + pop.id + "只鸡");
        }
    }
}
//产品
class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
//缓冲区
class SynContainer{

    //缓冲区容器有一个大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int count = 0;

    //放入缓冲区方法
    public synchronized void push(Chicken chicken){

        //如果缓冲区没有满，放入缓冲区
        //如果缓冲区满了，生产者等待，通知消费者消费
        if(count == chickens.length){
            try {
                this.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没满，生产者放入缓冲区
        chickens[count] = chicken;
        count ++;
        //通知消费者消费
        this.notifyAll();

    }

    //取出方法
    public synchronized Chicken pop(){

        //如果缓冲区没有了，消费者等待，通知生产者生产
        if(count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果缓冲区有，消费者消费
        count --;
        Chicken chicken = chickens[count];
        //通知生产者
        this.notifyAll();
        return chicken;
    }
}