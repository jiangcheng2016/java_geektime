package com.jiangrzc.javase.baseKonwelge;

public class Person {

    public String pname;
    public String page;

    public Person() {
        System.out.println("这是父类的无参构造函数");
    }

    public Person(String pname) {
        this.pname = pname;
        System.out.println("这是父类的pname参数构造函数");
    }

    public Person(String pname, String page) {
        this.pname = pname;
        this.page = page;
        System.out.println("这是父类的pname和page参数构造函数");
    }

    //    public Person(String pname, String page) {
//        this.pname = this.pname;
//        this.page = this.page;
//
//        System.out.println("这是父类的构造函数");
//    }
}
