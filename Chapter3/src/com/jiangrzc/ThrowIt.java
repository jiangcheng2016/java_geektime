package com.jiangrzc;

public class ThrowIt {

    //TODO 可以使用 throws 关键字，抛出一个异常
    //TODO 抛出的异常类型，可以是实际异常的父类或者本身
    //TODO 可以抛出多种类型的异常，用逗号分开就可以
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException { //抛出实际异常本身
//    public static void main(String[] args) throws Exception{        //抛出实际异常的父类
        //throws ClassNotFoundException
        Class clazz = Class.forName("com.jiangrzc.ThrowIt");
        //throws NoSuchFieldException
        clazz.getField("");
    }
}