package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class missNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < str.length; i ++)
            list.add(Integer.parseInt(str[i]));
        int res = missingNumber(list);
        System.out.println(res);

    }

    public static int missingNumber(ArrayList<Integer> nums)
    {
        int data = 0;
        for(int i = 0; i < nums.size(); i ++)
        {
            data ^= i;
            data ^= nums.get(i);
        }
        data ^= nums.size();
        return data;
    }
}
