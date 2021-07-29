package com.jiangrzc.tryCatchFinal;

import java.io.IOException;

public class CatchMultiException {
    public static void main(String[] args) {
        catchMultiOld();
        catchMultNew();
    }

    private static void catchMultiOld(){
        try {
            throwMultiException(0);
            // >> TODO 如果一个方法抛出多种异常，可以针对多个类型有多种 catch 语句
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void catchMultiTypeMultiMacth(){
        try {
            throwMultiException(0);
            // >> TODO catch 的类型不能有多种匹配可能，否则会出错
//        }catch (Exception e){
//            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void catchMultNew(){
        try {
            throwMultiException(0);
            // >> TODO 如果捕捉了不同类型的异常，但是处理方式一样，可以用简化模式
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void throwMultiException(int i) throws IOException, ClassNotFoundException {
        switch (i){
            case 1:
                throw new NullPointerException("demo");     //unchecked exception
            case 2:
                throw new ClassNotFoundException("demo");   //checked exception
            case 3:
                throw new IOException("demo");              //checked exception
        }
    }
}
