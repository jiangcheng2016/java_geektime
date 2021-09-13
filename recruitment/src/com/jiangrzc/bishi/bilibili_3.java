package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class bilibili_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashMap<Integer,Integer> map_x = new HashMap<>();
        HashMap<Integer,Integer> map_y = new HashMap<>();
        while(n -- > 0){
            String[] str = in.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[0]);
            map_x.put(x,map_x.getOrDefault(x,0) + 1);
            map_y.put(y,map_y.getOrDefault(y,0) + 1);
        }
        int max_x = 0;
        int max_y = 0;
        for(Map.Entry<Integer,Integer> entry:map_x.entrySet()){
            if(entry.getValue() > max_x)
                max_x = entry.getValue();
        }
        for(Map.Entry<Integer,Integer> entry:map_y.entrySet()){
            if(entry.getValue() > max_y)
                max_y = entry.getValue();
        }
        System.out.println(max_x > max_y? max_x:max_y);
    }
}
