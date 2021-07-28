package com.jiangrzc;

public class ExceptionFirstExpression {
    public static void main(String[] args) {
        //TODO try 语句中如果发生了异常(Exception)，那么程序会跳转到catch语句。
        //TODO Java会将异常信息封装在一个异常类的实例中，ex是指向这个异常实例的引用。
        //TODO “处理” 最简单的方法，就是调用 printStackTrace() 将异常信息输出到控制台
        //TODO catch 语句执行完毕，程序会继续向下顺序执行
        int[] a = new int[1];
        //try catch
        try {
            a[0] = 999;
            a[1] = 34;
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        for(int i = 0; i < a.length; i ++)
            System.out.println(a[i]);


        String str = "";
        //
        try {
            str.substring(4,5);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
