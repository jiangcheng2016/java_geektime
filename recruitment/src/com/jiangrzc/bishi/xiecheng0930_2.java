package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class xiecheng0930_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        String str = in.readLine();

        System.out.println(handler(str));

    }

    public static int handler(String str){
        int res = 0;

        int l = 0, r = 0;

       for(int i = 1; i <= str.length(); i ++)
       {
           for(int j = 1; j <= str.length(); j ++)
           {
               if(i >= j) continue;
               String temp = str.substring(i,j);
               String temp1 = reverse(temp);
               if(comp(temp,temp1))
                   res ++;
           }
       }

        return  res -1;
    }

    public static boolean comp(String str1, String str2)
    {
        if(str1.length() != str2.length()) return false;
        for(int i = 0; i < str1.length(); i ++)
        {
            if(str1.charAt(i) == 'T'){
                if(str2.charAt(i) != 'T' && str2.charAt(i) != 'R')
                    return false;
            }

            if(str1.charAt(i) == 'R'){
                if(str2.charAt(i) != 'R' && str2.charAt(i) != 'T')
                    return false;
            }

            if(str1.charAt(i) == 'I'){
                if(str2.charAt(i) != 'I' && str2.charAt(i) != 'P')
                    return false;
            }

            if(str1.charAt(i) == 'P'){
                if(str2.charAt(i) != 'P' && str2.charAt(i) != 'I')
                    return false;
            }


        }

        return true;
    }

    public static String reverse(String str){
        String res = "";
        for(int i = str.length() - 1; i >= 0; i --)
            res += str.charAt(i);

        return res;
    }
}
