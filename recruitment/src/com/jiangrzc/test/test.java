package com.jiangrzc.test;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int n = 9;
        //printNumbers(n);

        int[] res = printNumbers(n);

        System.out.println(res[9999998]);

    }

    public static int[] printNumbers(int n) {
        int num = (int) Math.pow(10,n) - 1;
        // System.out.println(num);

        int[] res = new int[num];

        for(int i = 1;i <= num ; i ++ )
        {
            //sb.append(String.valueOf(i));
            res[i - 1] = i;
        }

        return res;

    }
}
