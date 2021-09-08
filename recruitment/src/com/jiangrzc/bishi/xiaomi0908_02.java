package com.jiangrzc.bishi;

import java.util.Scanner;

public class xiaomi0908_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while(sc.hasNextInt()){
            int temp = sc.nextInt();
            if(temp == 1)
                count1 ++;
            else if(temp == 2)
                count2 ++;
            else if(temp == 3)
                count3 ++;
        }

        for(int i = 0; i < count1; i ++)
            System.out.print(1);
        for(int i = 0; i < count2; i ++)
            System.out.print(2);
        for(int i = 0; i < count3; i ++)
            System.out.print(3);

    }
}
