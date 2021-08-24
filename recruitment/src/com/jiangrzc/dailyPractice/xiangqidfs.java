package com.jiangrzc.dailyPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class xiangqidfs {
    /*
        5 * 9
        0 0 1 0 0 0 0 0 0
        0 0 0 1 0 0 0 0 0
        0 1 0 0 0 0 0 0 0
        0 0 1 1 0 0 0 0 0
        0 0 1 0 0 0 0 0 0
     */

    static int n, m;
    static boolean[][]  st;
    static Map<Integer,Integer> map;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(in.readLine());
        m = Integer.parseInt(in.readLine());
        System.out.println("n:" + n + ",m:" +m);
        st = new boolean[n][m];
        map = new HashMap();

        dfs(0,n - 1,0);

    }

    public static void dfs(int u,int x, int y)
    {
        if(st[0][m-1])
        {
            for(Map.Entry entry:map.entrySet()){
                System.out.print("[x:" + entry.getKey() + ",y:" + entry.getValue()+"] , ");
            }
            System.out.println();
            map.clear();
            return ;
        }

        int[] dx = new int[]{2,1,-1,-2};
        int[] dy = new int[]{1,2,2,1};
        map.put(x,y);
        for(int i = 0; i < 4; i ++) {
           int a = x + dx[i];
           int b = y + dy[i];
           if(a >= 0 && a < n && b >= 0 && b < m && !st[a][b]) {
                st[a][b] = true;
                map.put(a,b);
                dfs(u + 1, a, b);
                st[a][b] = false;
            }
        }


    }



}
