package com.jiangrzc.javase.baseKonwelge.Thread.thread1;

public class Thread_trick {

    public static void main(String[] args) {

        Trick trick = new Trick();

        new Thread(trick,"T1窗口").start();
        new Thread(trick,"T2窗口").start();
        new Thread(trick,"T3窗口").start();


    }

}

class Trick implements Runnable{

    private int trick = 10;

    @Override
    public void run() {
        while(true)
        {
            if(trick > 0)
            {
                synchronized (this){
                    System.out.println(Thread.currentThread().getName() + "售出车票，车票号为:" + trick --);
                }
//                //1.尝试利用sleep解决
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

            }
        }
    }
}
