package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class xingye0929 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] str = in.readLine().split(" ");


        Arrays.sort(str);

        for(int i = 0; i < str.length; i ++)
            System.out.print(str[i] + " ");

    }
}
