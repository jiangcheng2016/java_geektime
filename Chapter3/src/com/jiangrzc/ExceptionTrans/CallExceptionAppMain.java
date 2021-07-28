package com.jiangrzc.ExceptionTrans;

import com.jiangrzc.myexception.MyException;

public class CallExceptionAppMain {
//    public static void main(String[] args) throws ClassNotFoundException {
//        callMake();
//    }
//
//    private static void callMake() {
//        // >> TODO 检查异常强制处理，需要明确的throws或者catch
//
//        Caller1 caller1 = new Caller1();
//
//        System.out.println("开始调到");
//        caller1.call2Exception();
//        System.out.println("结束调用");
//    }

    // >> TODO 自定义异常

    // TODO catch 语句是根据异常类型匹配来捕捉相应类型的异常的
    // TODO 如果类型不匹配，catch 语句是不会执行的，异常会继续抛出
    // TODO 也就是说，catch(Throwable) 会捕捉到所有的异常，包括Error,建议最多只捕捉Exception
    // TODO 如果catch 一个其实并没有被抛出的 checked exception，Java程序会报错，因为Java明确的知道这个类型的异常不会发生
    // TODO 如果catch一个unchecked exception，Java程序不会报错
    // TODO 如果 throws 一个其实并没有被抛出的 checked exception 或者 unchecked exception， Java程序不会报错

    public static void main(String[] args) throws MyException {
        // >> TODO 检查异常强制处理，需要明确的throws或者catch

        Caller1 caller1 = new Caller1();

        System.out.println("开始调到");
        caller1.call2Exception();
        System.out.println("结束调用");
    }
}
