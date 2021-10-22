package com.jiangrzc.test;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class test2 {
    public static void main(String[] args) {

        int[] nums = new int[]{4,3,2,3,5,2,1};

        System.out.println("sort before:");

        for(int i = 0; i < nums.length; i ++)
            System.out.print(nums[i]);

//        Arrays.sort(nums);

//        Arrays.sort(nums,new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2)
//            {
//                return o2 - o1;
//            }
//        });

        System.out.println();
        System.out.println("sort after:");

        for(int i = 0; i < nums.length; i ++)
            System.out.print(nums[i]);

        PriorityQueue<Integer> que = new PriorityQueue<>(
                (o1,o2)->{
                    return o1 - o2;
                }
        );




    }
}
