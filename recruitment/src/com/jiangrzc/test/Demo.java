package com.jiangrzc.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    static  Demo demo = new Demo();

    static int a;
    static int b = 1;

    Demo(){
        a ++;
        b ++;
    }

    static Demo getInstance()
    {
        return demo;
    }

    public static void main(String[] args) {
        Demo demo = Demo.getInstance();
        System.out.println(a+ " " + b);

        List<String> s = new ArrayList<String >(1);
        for (int i = 0; i < 2; i++) {
            s.add("i" +i);
        }
    }
}
