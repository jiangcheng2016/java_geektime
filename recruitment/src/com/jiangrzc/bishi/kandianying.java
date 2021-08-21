package com.jiangrzc.bishi;


import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kandianying {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        List<Pair<Float,Float>> vals = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            String str = in.readLine();
            String[] strSplit = str.split(":");
            String[] strmid = strSplit[1].split("-");

            int begin_h = Integer.parseInt(strSplit[0]);
            float begin_m = (float) (Integer.parseInt(strmid[0]) / 60.0);
            float begin = (float) (begin_h + begin_m * 0.1);

            int end_h = Integer.parseInt(strmid[1]);
            float end_m = (float) (Integer.parseInt(strSplit[strSplit.length - 1]) / 60.0);
            float end  = (float) (end_h + end_m);

            Pair<Float,Float> pair = new Pair<Float, Float>(begin,end);

            vals.add(pair);

        }

        //排序
        Collections.sort(vals,new Comparator<Pair<Float,Float>>(){
            @Override
            public int compare(Pair<Float, Float> o1, Pair<Float, Float> o2) {
                if(o1.getValue() == o2.getValue()) return (int) (o1.getKey() - o2.getKey());
                return (int) (o1.getValue() - o2.getValue());
            }
        });

        float[] dp = new float[n + 1];

        float ans = 0;
        for(int i =0; i < vals.size(); i ++)
        {
            float nmax = 0;
            for(int j = 0; j < i; j ++){
                if((vals.get(i).getKey() >= vals.get(j).getValue()) && (dp[j] > nmax)){
                    nmax = dp[j];
                }
            }

            dp[i] = vals.get(i).getValue() - vals.get(i).getKey() + nmax;
            ans = ans > dp[i] ? ans:dp[i];
        }

        System.out.println(ans);

        int anss = (int) (ans * 60);

        System.out.println(anss);
    }
//
//    public static boolean cmp(Pair<Float,Float> x, Pair<Float,Float> y){
//        if(x.getValue() == y.getValue()) return x.getKey() < y.getKey();
//
//        return x.getValue() < y.getValue();
//    }


}
