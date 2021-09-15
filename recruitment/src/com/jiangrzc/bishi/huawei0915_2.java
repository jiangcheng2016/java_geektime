package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class huawei0915_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] str = in.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int ave = Integer.parseInt(str[1]);

        String[] daStr = in.readLine().split(" ");

        int[] q = new int[n*2];

        for(int i = 0; i < 2 * n; i ++)
            q[i] = Integer.parseInt(daStr[i]);

        System.out.println(canArrange(q,ave));

    }

    public static boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int item : arr){
            int remainder = item % k;
            if(map.getOrDefault(0 - remainder, 0) > 0){
                map.put(0 - remainder, map.get(0 - remainder) - 1);
            }else if(map.getOrDefault(k - remainder, 0) > 0){
                map.put(k - remainder, map.get(k - remainder) - 1);
            }else if(map.getOrDefault(-k - remainder, 0) > 0){
                map.put(-k - remainder, map.get(-k - remainder) - 1);
            }else{
                map.put(remainder, map.getOrDefault(remainder, 0) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 0){
                return false;
            }
        }
        return true;
    }
}
