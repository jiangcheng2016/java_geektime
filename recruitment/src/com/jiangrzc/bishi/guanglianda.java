package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class guanglianda {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] s = in.readLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int b1 = Integer.parseInt(s[1]);
        s = in.readLine().split(" ");
        int a2 = Integer.parseInt(s[0]);
        int b2 = Integer.parseInt(s[1]);
        double ans = 0;
        int e1 = 0, e2 = 0;
        for(int i = 0; i <= n; i++){
            int a = i * a1 + (n-i)*a2;
            int b = i * b1 + (n-i) * b2;
            if(ans < Math.sqrt(a*a + b*b)){
                e1 = i; e2 = n - i;
                ans = Math.sqrt(a*a + b*b);
            }
            if(ans == Math.sqrt(a*a + b*b)){
                e1 = e1 < i ? e1 : i;
                e2 = n - e1;
            }
        }
        System.out.println(e1 + " " + e2);
    }
}
//
//public class Main{
//    public  static void main(String[] args) throws IOException{
//
//    }
//}