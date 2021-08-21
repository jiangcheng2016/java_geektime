package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Wangyi0821_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();

        String[] strSplit = str.split(" ");

        int[] a = new int[strSplit.length];

        for(int i = 0; i < strSplit.length; i ++)
            a[i] = Integer.parseInt(strSplit[i]);

        int m = Integer.parseInt(in.readLine());

        int count = 0;
        for(int i = 0; i < a.length; i ++)
            for(int j = i+1; j < a.length; j ++){
                if(a[i] + a[j] < m ){
                    count ++;
                }
            }

        System.out.println(count);
    }
}
