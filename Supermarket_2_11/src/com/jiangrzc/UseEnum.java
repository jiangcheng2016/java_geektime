package com.jiangrzc;

import com.jiangrzc.supermarket.Category;

import java.util.Scanner;

public class UseEnum {
    public static void main(String[] args) {
        //TODO 获取所有枚举，看看枚举有哪些方法
        for (Category category:Category.values())
        {
            System.out.println("--------" + category.getId() + "-----------");
            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }

        //TODO 根据名字获取枚举
        System.out.println();
        System.out.println(Category.valueOf("FOOD"));
        //System.out.println(Category.valueOf("food"));

        //通过用户输入来获取
        Scanner in = new Scanner(System.in);

        System.out.println("请输入枚举的名字：");
        String input_enum = in.next();
        Category cateName1 = Category.valueOf(input_enum.trim().toUpperCase());
        System.out.println("枚举的信息：" + cateName1.toString());

        System.out.println("请输入要比较的枚举名字：");
        String input_enum2 = in.next();
        Category cateName2 = Category.valueOf(input_enum2.trim().toUpperCase());
        System.out.println("要比较枚举的信息：" + cateName2.toString());

        System.out.println(cateName1 == cateName2);

    }
}
