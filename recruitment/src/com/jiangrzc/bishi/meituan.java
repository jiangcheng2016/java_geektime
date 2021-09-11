package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class meituan {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] s = in.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int q = Integer.parseInt(s[2]);

        HashMap<Integer,Integer> map = new HashMap<>();

        while(m -- > 0)
        {
            s = in.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            map.put(a,map.getOrDefault(a,0) + 1);
            map.put(b,map.getOrDefault(b,0) +1);

        }

        while(q -- > 0)
        {
            s = in.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int t = map.get(a);

            map.put(a,map.get(b));
            map.put(b,t);
        }

        for(int i = 1; i <= n; i ++)
        {
            System.out.print(map.getOrDefault(i,0) + " ");
        }

    }
}
