package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class huawei0929_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        String[] str = in.readLine().split(" ");

        int[] data = new int[n];

        for(int i = 0; i < n; i ++)
            data[i] = Integer.parseInt(str[i]);

//        for(int i = 0; i < n; i ++)
//            System.out.print(data[i]);
        System.out.println(sumH(data,n));

    }

    public static long sumH(int[] arr,int n){
        long sum = 0;

        ArrayList<Long> maxre = new ArrayList<>();
        ArrayList<Long> minre = new ArrayList<>();

        for(int i = 0; i < n; i ++)
        {
            long maxs = arr[i];
            long mins = arr[i];

            for(int k = i+1; k < n; k ++)
            {
                if(arr[k] > maxs) maxs = arr[k];
                if(arr[k] < mins) mins = arr[k];
                maxre.add(k,maxs);
                minre.add(k,mins);
//                maxre.add(maxs);
//                minre.add(mins);
            }

            for(int j = i +1; j < n; j ++)
            {
                sum = (sum + (maxre.get(j) - minre.get(j)) * (j - i + 1)) % 1000000007;
            }

            maxre.clear();
            minre.clear();
        }


        return sum;
    }
}
