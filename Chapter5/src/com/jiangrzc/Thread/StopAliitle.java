package com.jiangrzc.Thread;

public class StopAliitle {
    public static void main(String[] args) throws InterruptedException {
        String text = "我欲见你，何惧一两个春秋；还爱你像小溪的水不能喝，像炸好的土豆趁热吃，像清晨的花苞快开放，像好不容易遇见后欲言又止";
        printSlowly(text,300);
    }

    public static void printSlowly(String text, long interval) throws InterruptedException {
        for(char ch:text.toCharArray()){
            System.out.print(ch);
            Thread.sleep(interval);
        }
    }
}
