package com.jiangrzc.ExceptionTrans;

import com.jiangrzc.myexception.MyRunTimeException;

public class CallRTExceptionAppMain {

    public static void main(String[] args) throws MyRunTimeException {
        callMake();
    }

    private static void callMake() throws MyRunTimeException {
        // >> TODO RuntimeException，也就是unchecked exception不强制处理，所以冷不丁吃到一个RuntimeException，程序会失败

        Caller1 caller1 = new Caller1();

        System.out.println("开始调到");
        caller1.call2RTException();
        System.out.println("结束调用");
    }

}
