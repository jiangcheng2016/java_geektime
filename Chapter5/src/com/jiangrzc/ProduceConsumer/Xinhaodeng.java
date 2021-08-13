package com.jiangrzc.ProduceConsumer;

// 测试生产者消费者问题2：信号灯法，标志位解决
public class Xinhaodeng {

    public static void main(String[] args) {
        TV tv = new TV();

        new Player(tv).start();
        new Audience(tv).start();
    }
}

//生产者 : 演员
class Player extends Thread{

    TV tv = new TV();
    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2 == 0){
                tv.play("2020奥运会进行中.....");
            }else {
                tv.play("抖音：记录美好生活....");
            }
        }
    }
}

//消费者
class Audience extends Thread{

    TV tv = new TV();
    public Audience(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}

//产品：节目
class TV {

    //节目
    private String voice;
    //标志位
    // flag:true, 演员表演，观众等待
    // flag:false, 演员等待，观众观看
    private boolean flag = true;


    //演员表演节目
    public synchronized void play(String voice){

        //flag为false时，演员等待
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //
        System.out.println("演员表演了:" + voice);
        //通知观众观看
        this.notifyAll();
        this.voice = voice;
        flag = !flag;
    }

    //观众观看节目
    public synchronized void watch(){

        //当flag为FALSE时，观众观看，为true时，观众等待
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //观众观看
        System.out.println("观众观看了：" + voice);
        //通知演员表演节目
        this.notifyAll();
        flag = !flag;

    }

}
