package com.jiangrzc.bishi;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class xiecheng0930_1 {

    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] str = in.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        str = in.readLine().split(" ");
        int[] w = new int[n];
        for(int i = 0; i < n; i++)
        {
            w[i] = Integer.parseInt(str[i]);
        }

        str = in.readLine().split(" ");
        int l = Integer.parseInt(str[0]);
        int r = Integer.parseInt(str[1]);

        boolean[] visited = new boolean[n];

        Arrays.sort(w);
        dfs(w,visited,m,l,r,0,0,0);
        System.out.println(res);
    }


    public static void dfs(int[] w, boolean[] visited,int m, int l , int r, int begin, int len, int sum){
        if(len == m){
            if(sum >= l && sum <= r){
                res ++;
            }
        }

        for(int i = begin; i < w.length; i ++)
        {
            if(!visited[i]){
                sum += w[i];
                len ++;
                visited[i] = true;
                dfs(w,visited,m,l,r,i+1,len,sum);
                visited[i] = false;
                len --;
                sum -= w[i];
            }
        }

    }

    public static int handler(int[] w, int m, int l, int r)
    {
        int res = 0;
        Arrays.sort(w);

        int i = 0;
        int j = w.length - 1;

        int sum = 0;
        int count = 0;
        while(i < j){
            sum = w[i] + w[j];
            count += 2;
            if(sum >= l && sum <= r){
                if(count == m)
                {
                    res ++;
                }
                j --;

            }else if(sum <= r){
                i ++;
            }else
                j --;
        }

        return res;
    }

}
