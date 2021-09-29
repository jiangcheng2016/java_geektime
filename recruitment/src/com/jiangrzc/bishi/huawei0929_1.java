package com.jiangrzc.bishi;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class huawei0929_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] str = in.readLine().split(":");

        System.out.println(handler(str));

    }

    public static String handler(String[] str)
    {
        String[] res = new String[str.length];

        int[] flag = new int[str.length];

        int count = 0;

        for(int i = 0; i < str.length; i ++)
        {
            String current = str[i];

            if(current.length() != 4) return "error";

            while(current.charAt(0) == '0' && current.charAt(current.length()-1) != '0'){
                current = current.substring(1);
            }

            if(current.charAt(0) == '0' && current.charAt(1) == '0' && current.charAt(2) == '0' && current.charAt(3) == '0')
            {
                current = "0";
                flag[i] = 1;
                count ++;
            }

            res[i] = current;

        }

        if(count == 8)
        {
            return "::";
        }


        int n = str.length;
        if(count > 1){
            for(int i = 0; i < n-1; i ++)
            {
                if(flag[i] == 1 && flag[i + 1] == 1)
                {
                    res[i] = "";
                    flag[i] = 0;
                    res[i+1] = "";
                }else
                    continue;;
            }
        }

        String strRes = "";
        for(int i = 0; i < res.length; i ++)
        {
            if(res[i].equals(""))
            {
                strRes += ":";
                i = i + 1;
            }
            else
                strRes += res[i] + ":";
        }


        while(strRes.charAt(strRes.length()-1) == ':') strRes = strRes.substring(0,strRes.length()-1);

        return strRes.substring(0,strRes.length());

    }

}
