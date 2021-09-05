package com.jiangrzc.javase.baseKonwelge.designer;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{

    private static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }
}
