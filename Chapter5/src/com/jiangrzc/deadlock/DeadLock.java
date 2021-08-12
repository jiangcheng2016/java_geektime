package com.jiangrzc.deadlock;


public class DeadLock {

    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"白雪公主");
        Makeup g2 = new Makeup(1,"灰姑娘");

        g1.start();
        g2.start();
    }
}

//化妆
class Makeup extends Thread{

    //需要的资源只有一份
    static LipStick lipStick = new LipStick();
    static Mirror mirror = new Mirror();

    //化妆的人选择什么
    private int choice;
    private String name;

    Makeup(int choice, String name){
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //化妆，各自互相抱着对方的锁
    private void makeup() throws InterruptedException {
        if(choice == 0){
            synchronized (lipStick){
                System.out.println(name + "获得了口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                System.out.println(name + "获得了镜子的锁");
            }
        }else {
            synchronized (mirror){
                System.out.println(name + "获得了镜子的锁");
                Thread.sleep(1000);
            }
            synchronized (lipStick){
                System.out.println(name + "获得了口红的锁");
            }
        }
    }
}


//口红
class LipStick{

}

//镜子
class Mirror{

}



