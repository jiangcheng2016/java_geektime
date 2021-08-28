package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rongyao0828_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String strmn = null;

        while((strmn = in.readLine()) != null &&strmn.length() >0){
            String[] strSplit = strmn.split(" ");
            int m = Integer.parseInt(strSplit[0]);
            int n = Integer.parseInt(strSplit[1]);

            ArrayList<Integer> time = new ArrayList<>();

            String timeString = in.readLine();

            String[] timeSplit = timeString.split(" ");

            for(int i = 0; i < n; i++){
                time.add(Integer.parseInt(timeSplit[i]));
            }

            Collections.sort(time);

            int length = time.size();

            int index = length % m - 1;

            int res = 0;
            for(int i = index; i < length; i = i + 3)
                res += time.get(i);


            System.out.println(res);
        }


    }
}
