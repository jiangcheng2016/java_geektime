package com.jiangrzc.myexception;

public class MyRunTimeException extends Exception{
    public MyRunTimeException() {
    }

    public MyRunTimeException(String message) {
        super(message);
    }

    public MyRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyRunTimeException(Throwable cause) {
        super(cause);
    }
}
