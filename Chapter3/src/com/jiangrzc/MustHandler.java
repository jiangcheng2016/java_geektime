package com.jiangrzc;

public class MustHandler {
    public static void main(String[] args) throws ClassNotFoundException {

//        try {
            Class clazz = Class.forName("com.jiangrzc.MustHandler");
            System.out.println(clazz.getName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
