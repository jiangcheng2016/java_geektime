package com.jiangrzc.tryCatchFinal;

public class TryFinallAppMain {

    private static int VAL = 0;

    public static void main(String[] args) {
        System.out.println(withFinally());
        System.out.println(VAL);
    }

    private static int withFinally(){
        int len = 0;
        try{
            String str = null;
//            String str = "abc";
            return str.length();

        }finally {
            // >> TODO 可以认为 finally语句会在方法返回后，后面的方法开始前，会在return语句后
            // >> TODO 无论是因为 return 结束还是因为异常结束，finally 语句都会执行

            System.out.println("进入finally中执行finally 语句");

            // >> TODO finally里最好不要有 return 语句, 会打乱exception传递
//            return -1;

            // >> TODO finally里给return 用的变量赋值没有用
//            len = -2;

            VAL = 99;
            System.out.println("finally执行完毕");
        }
    }
}
