package com.jiangrzc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestString {

    public static void main(String[] args) {

//        int a = 2;
//        int b = 2;
//
////        System.out.println(a.equals(b));
//
//        String c = "2";
//        String d = new String("2");
//
//        System.out.println(c == d)
//

        String s = new String("hello");
        String t = new String("hello");

        System.out.println(s == t);
        System.out.println(s.equals(t));

        System.out.println(s.equals(new String("hello")));



        Map<String,String> map = new HashMap<>();

        map.put("a","1");
        map.put("a","2");
        map.put("b","3");

        for (Map.Entry<String,String> m: map.entrySet()) {
            System.out.println(m.getValue());
            System.out.println(m.getKey());
        }



    }
}
