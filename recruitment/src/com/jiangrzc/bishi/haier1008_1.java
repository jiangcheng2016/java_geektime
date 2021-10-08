package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class haier1008_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();

        System.out.println(findId(num));
    }

    public static long findId(long num){
        if(num == 0) return 0;
        long res = -1;
        long cur = num;
        List<Long> list = new ArrayList<>();
        while (cur != 0){
            long temp = cur % 10;
            list.add(temp);
            cur /= 10;
        }
        for(int i = 0; i < list.size(); i ++)
            if(res < list.get(i))
                res = list.get(i);

        return res;

    }
}
