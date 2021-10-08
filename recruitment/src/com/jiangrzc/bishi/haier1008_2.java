package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class haier1008_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        int[] data = new int[n];
        for(int i = 0; i < n; i ++)
            data[i] = Integer.parseInt(str[i]);

        int count = 0;
        for(int i = 0; i < n; i ++){
            if(isFullSquare(data[i]))
                count ++;
        }
        System.out.println(count);
    }

    public static boolean isFullSquare(int n)
    {
        double m = Math.sqrt(n);
        int k = (int) m;
        if(m - k == 0)
            return true;
        else
            return false;
    }
}
