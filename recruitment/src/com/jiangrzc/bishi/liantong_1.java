package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class liantong_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int count = 0;
        for(int i = 2; i <= n; i ++)
        {
            if(check(i))
                count ++;
        }
        System.out.println(count);
    }

    public static boolean check(int num){

        int count = 1;
        for(int i = 2; i <= num/2; i ++)
            if(num % i == 0){
                count += i;
            }

        if(count == num) return true;

        return false;
    }
}
