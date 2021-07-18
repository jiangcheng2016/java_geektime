package com.jiangrzc.supermarket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//
//        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BigInteger a = scanner.nextBigInteger();
//        BigInteger b = scanner.nextBigInteger();
//
//        System.out.println(a.add(b));

        String content = "0123456789ABCDefgh";

        //String 的 length() 是个方法不是属性
        System.out.println(content.length());

        //字母转成大写
        System.out.println(content.toUpperCase());
        //字母转成小写
        System.out.println(content.toLowerCase());

        //content 指向对象的内容并没有变化
        System.out.println(content);

        //获取某个位置的值
        System.out.println(content.charAt(1));

        //截取:从第几个位置开始截，一直到最后
        System.out.println(content.substring(5));

        //截取：从第几个位置到第几个位置截取一段
        System.out.println(content.substring(1,5));

        String str = "  abd  ";
        System.out.println(str);
        System.out.println(str.trim());

    }
}
