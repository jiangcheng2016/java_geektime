package com.jiangrzc.javase.baseKonwelge;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Student extends Person{

    public String sClass;

    public Student(String sClass) {
        this.sClass = sClass;
        System.out.println("这是子类的sclass构造函数:");
    }

    public Student() {
        System.out.println("这是子类的无参构造函数");
    }

    public Student(String pname, String sClass) {

        this.sClass = sClass;
        System.out.println("这是子类的pname,sclass构造函数");
    }

    public Student(String pname, String page, String sClass) {

        this.sClass = sClass;
        System.out.println("这是子类的三参数构造函数");
    }
}
