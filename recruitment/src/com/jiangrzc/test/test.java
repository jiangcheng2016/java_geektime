package com.jiangrzc.test;

import java.util.*;

public class test {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {

        String str = "adkh";
        System.out.println(str.indexOf('a'));


        List<Integer> list = new ArrayList<>();

        LinkedList<Integer> link = new LinkedList<>();

        link.add(1);
        ArrayList<Integer> a = new ArrayList<>();
        link.removeLast();

        Map<Character,Integer> map = new HashMap<>();
        map.put('c',map.getOrDefault('c',0)+1);

//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuffer stringBuffer = new StringBuffer();


//        int x = 121;
//
//        String str_x = String.valueOf(x);
//
//        StringBuilder str = new StringBuilder(str_x);
//
//        String str_new = str.reverse().toString();
//
//
//        System.out.println(str_x.equals(str_new));



//        int n = 9;
//        //printNumbers(n);
//
//        int[] res = printNumbers(n);
//
//        System.out.println(res[9999998]);
//
    }
//
//    public static int[] printNumbers(int n) {
//        int num = (int) Math.pow(10,n) - 1;
//        // System.out.println(num);
//
//        int[] res = new int[num];
//
//        for(int i = 1;i <= num ; i ++ )
//        {
//            //sb.append(String.valueOf(i));
//            res[i - 1] = i;
//        }
//
//        return res;
//
//    }

}
