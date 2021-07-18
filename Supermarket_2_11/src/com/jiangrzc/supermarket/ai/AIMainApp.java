package com.jiangrzc.supermarket.ai;

import java.util.Scanner;

public class AIMainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要问的问题：");
        AI ai = new AI();
        while(true) {
            String question = scanner.nextLine();
            if(question.equals("exit"))
            {
                System.out.println("再见!");
                break;
            }
            String answer = ai.answer(question);
            System.out.println(answer);
        }
    }
}
