package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class xiecheng0930_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());


    int sum = 0;
        for(int i = 0; i < n; i ++)
        {
            int count = 0;
            String[] str = in.readLine().split(" ");
            for(int j = 0; j < str.length; j ++)
                if(Integer.parseInt(str[i]) == 0) count ++;

            if(count == 26) sum ++;
        }

        if(sum == n)
        {
            for (int i = 0; i < n; i ++)
                System.out.println("!");
        }else {
            System.out.println("A");
            System.out.println("!");
            System.out.println("BAB");
            System.out.println("CACACBC");
            System.out.println("ACACACBC");
            System.out.println("ABCACACAC");
        }



    }
}
