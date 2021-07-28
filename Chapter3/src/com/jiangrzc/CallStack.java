package com.jiangrzc;

public class CallStack {
    public static void main(String[] args) {
        callStack(9);
    }

   private static void callStack(int num){
        num --;
        if(num == 0)
            return;
        else{
            if(num % 2 == 0)
                m0(num);
            else if(num % 2 == 1)
                m1(num);
        }
    }

    private static void m0(int num){
        System.out.println("m0\t" + num + "开始");
        callStack(num);
        System.out.println("m0\t" + num + "结束");
    }

    private static void m1(int num){
        System.out.println("m1\t" + num + "开始");
        callStack(num);
        System.out.println("m1\t" + num + "结束");
    }
}
