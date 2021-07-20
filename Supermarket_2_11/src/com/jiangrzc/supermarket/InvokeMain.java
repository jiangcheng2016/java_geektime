package com.jiangrzc.supermarket;

public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了InvokeMain() 方法");
        LearnMain.main(args);
        System.out.println("执行了InvokeMain方法");
    }
}
