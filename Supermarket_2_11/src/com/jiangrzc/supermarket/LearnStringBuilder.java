package com.jiangrzc.supermarket;

public class LearnStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        long val = 1239489393;

        stringBuilder.append(true);
        stringBuilder.append(val).append("11").append("abd").append("中国红");

        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());
        System.out.println(stringBuilder.reverse().toString());
        System.out.println(stringBuilder.toString());

        System.out.println(stringBuilder.delete(0,4).toString());
        System.out.println(stringBuilder.insert(4,"LLLLL").toString());
    }
}
