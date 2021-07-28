package com.jiangrzc.ExceptionTrans;

import com.jiangrzc.myexception.MyException;
import com.jiangrzc.myexception.MyRunTimeException;

public class Caller3 {
//    public void callThrowRTException(){
//        System.out.println("Caller3.callThrowRTException开始");
//
//        String str = null;
//        str.toUpperCase();  //或者 str.toString() 也可以，只要是能触发异常
//
//        System.out.println("Caller3.callThrowRTException结束");
//
//    }
//
//    public void callThrowException() throws ClassNotFoundException {
//        System.out.println("Caller3.callThrowException开始");
//
//        //checked exception
//        Class.forName("com.neverland.Rabbit");
//
//        System.out.println("Caller3.callThrowException结束");
//    }


    // >>TODO 自定义异常相关代码

    // >> TODO 可以将 checked exception 包装成 unchecked exception 或者 checked exception。反之也可以
    public void callThrowRTException() throws MyRunTimeException {
        // >> TODO 可以在这里 catch 异常，然后封装成自己的异常，并增加相应的异常描述
        System.out.println("Caller3.callThrowRTException开始");

        try {
            String str = null;
            str.toUpperCase();  //或者 str.toString() 也可以，只要是能触发异常
        }catch (Exception ex){
            throw new MyRunTimeException("执行callThrowRTException出错",ex);
        }
        System.out.println("Caller3.callThrowRTException结束");

    }

    public void callThrowException() throws ClassNotFoundException, MyException {
        // >> TODO 可以在这里 catch 异常，然后封装成自己的异常，并增加相应的异常描述

        System.out.println("Caller3.callThrowException开始");

        try {
            //checked exception
            Class.forName("com.neverland.Rabbit");
        }catch (ClassNotFoundException ex){
            throw new MyException("",ex);
        }
        System.out.println("Caller3.callThrowException结束");
    }
}
