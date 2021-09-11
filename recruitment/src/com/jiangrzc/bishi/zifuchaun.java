package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zifuchaun {

    public static void main(String[] args) throws IOException {

        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine();

        char[] ss = s.toCharArray();
        int len = ss.length;
        int ans = 0;

        for(int i = 0; i < len; i++)
        {
            for (int j = i; j < len; j ++)
            {
                ans += can22(ss,i,j) ? 1: 0;
            }
        }

        System.out.println(ans);
    }

    public static boolean can22(char[] ss, int i, int j){
        if((ss[j] - '0') % 2 != 0) return false;
        int a = 0;
        int b = 0;

        for(;i <= j; i ++){
            if(i % 2 != 0){
                a += ss[i] - '0';
            }else{
                b += ss[i] - '0';
            }
        }

        int c = Math.abs(a-b);
        return c % 11 == 0;
    }
}
