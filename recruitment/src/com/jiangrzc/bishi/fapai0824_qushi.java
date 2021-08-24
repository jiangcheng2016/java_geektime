package com.jiangrzc.bishi;

import com.sun.deploy.panel.ITreeNode;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class fapai0824_qushi {

    public static void main(String[] args) {

        String[] cards = new String[52];

        String type = "";
        for(int i = 0; i < 13; i++)
        {

            for(int j = 0; j < 4; j ++)
            {
                if(j == 0) type = "红桃";
                else if(j == 1) type = "黑桃";
                else if(j == 2) type = "梅花";
                else if(j == 3) type = "方片";
                cards[13 * j + i] = type + Integer.toString(i + 1);
            }

        }
        for(String x:cards)
            System.out.print(x + ",");

        System.out.println();

        //随机发牌
        ArrayList<Integer> list = getDiffNum(52);

        int count = 0;
        int person = 0;

        String[][] res = new String[4][13];

        for(int i = 0; i < list.size(); i++)
        {
            int k = i;
            if(k % 13 == 0 && k > 0) {
                person++;
            }
            k -= (person * 13);
            res[person][k] = cards[list.get(i)];
        }

        for (int i = 0; i < res.length; i ++)
        {
            System.out.print("第" + (i + 1) + "个人的牌为:");
            for(int j = 0;j < res[0].length; j ++)
                System.out.print(res[i][j] + ",");
            System.out.println();

        }

    }



    //生成不重复随机数
    public static ArrayList<Integer> getDiffNum(int n){
        ArrayList<Integer> list = new ArrayList<>();

        boolean[] isNum = new boolean[n];

        Random rand = new Random();

        int num = 0;
        for(int i = 0; i < n; i ++)
        {
            do{
                num = rand.nextInt(n);
            }while(isNum[num]);

            list.add(num);
            isNum[num] = true;
        }

        return list;

    }

}

