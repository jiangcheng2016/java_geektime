package com.jiangrzc.bishi;

import com.sun.deploy.panel.AbstractRadioPropertyGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class rongyao0907_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        while(t -- > 0)
        {
            int n = Integer.parseInt(in.readLine());

            int[] mark = new int[n];
            char[] str = new char[n];

            ArrayList<Character> sz = new ArrayList<>();
            ArrayList<Character> zf = new ArrayList<>();

            String in_str = in.readLine();

            str = in_str.toCharArray();

            for(int i = 0 ;i < n; i ++)
            {
                if(str[i] >= 'a' && str[i] <= 'z')
                {
                    mark[i] = 1;
                    sz.add(str[i]);
                }else{
                    mark[i] = 0;
                    zf.add(str[i]);
                }
            }

            Collections.sort(sz, Character::compareTo);
            Collections.sort(zf,Character::compareTo);

            int cru_sz = 0;
            int cur_zf = 0;

            char[] res = new char[n];
            for(int i = 0; i < n; i ++)
            {
                if(mark[i] == 1){
                    res[i] = sz.get(cru_sz ++);
                }else{
                    res[i] = zf.get(cur_zf ++);
                }
            }

            if(t == 0)
                System.out.print(Arrays.toString(res));
            else
                System.out.println(Arrays.toString(res));
        }

    }
}
