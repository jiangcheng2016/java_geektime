package com.jiangrzc.ExceptionTrans;

import com.jiangrzc.myexception.MyException;
import com.jiangrzc.myexception.MyRunTimeException;

public class Caller1 {
    //
    Caller2 caller2 = new Caller2();

    public void call2RTException() throws MyRunTimeException {
        System.out.println("Caller1.call2RTException开始");
        caller2.call3RTException();
        System.out.println("Caller1.call2RTException结束");
    }

    //TODO 我们可以在调用链的任何一个地方，catch异常，阻止异常的传递
    public void call2Exception() throws MyException {
        System.out.println("Caller1.call2Exception开始");
//        try{
//            caller2.call3Exception();
//        }catch (ClassNotFoundException ex){
//            System.out.println("got exception in Caller1:" + ex.getMessage());
//        }
        caller2.call3Exception();
        System.out.println("Caller1.call2Exception结束");
    }
}
