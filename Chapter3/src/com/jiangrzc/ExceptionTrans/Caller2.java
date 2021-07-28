package com.jiangrzc.ExceptionTrans;

import com.jiangrzc.myexception.MyException;
import com.jiangrzc.myexception.MyRunTimeException;

public class Caller2 {
    //
    Caller3 caller3 = new Caller3();

    public void call3RTException() throws MyRunTimeException {
        System.out.println("Caller2.call3RTException开始");
        caller3.callThrowRTException();
        System.out.println("Caller2.call3RTException结束");
    }

    public void call3Exception() throws MyException {
        System.out.println("Caller2.call3Exception开始");
        try{
            caller3.callThrowException();
        }catch (ClassNotFoundException ex){
            System.out.println("got exception in Caller2:" + ex.getMessage());
        }

        System.out.println("Caller2.call3Exception结束");
    }

}
