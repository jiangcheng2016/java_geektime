package com.jiangrzc.interviewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ChongFuShu {

    public static void main(String[] args) {

        //输出每一个数字及对应的个数
        int[] arr = new int[]{1,0,9,6,4,9,2,4,0,0,3,5,-4,6,4,3,2};

        Map<Integer,Integer> ans = new TreeMap<>();



        for(int i = 0; i < arr.length; i ++)
            ans.put(arr[i],ans.getOrDefault(arr[i],0) + 1);


        for (Map.Entry<Integer ,Integer> entry:ans.entrySet()) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }

    }
}
