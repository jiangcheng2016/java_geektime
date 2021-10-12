package com.jiangrzc.bishi;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.ArrayList;
import java.util.List;

public class tongcheng1012_1 {

    boolean[] visited = new boolean[10];

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> cars = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        cars.add(temp);

        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.add(3);
        temp2.add(4);
        temp2.add(5);
        cars.add(temp2);

        ArrayList<Integer> temp3 = new ArrayList<>();
        temp3.add(4);
        temp3.add(5);
        temp3.add(6);
        cars.add(temp3);

        ArrayList<Integer> temp4 = new ArrayList<>();
        temp4.add(7);
        temp4.add(8);
        temp4.add(9);
        cars.add(temp4);

        ArrayList<Integer> temp5 = new ArrayList<>();
        temp5.add(8);
        temp5.add(9);
        cars.add(temp5);
//
//        for(int i = 0; i < cars.size(); i ++)
//        {
//            for(int j = 0; j < cars.get(i).size(); j ++){
////                System.out.print("i:"+ i + ",j:" + j + " ;");
//                System.out.print(cars.get(i).get(j));
//            }
//            System.out.println();
//        }

        ArrayList<Integer> ans = selected_car(cars);
        for(int i = 0; i < ans.size(); i ++)
            System.out.println(ans.get(i));
    }

    public static ArrayList<Integer> selected_car (ArrayList<ArrayList<Integer>> pre_selected_cars) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();

        boolean[] visited = new boolean[10];
        boolean[] selected = new boolean[pre_selected_cars.size()];

        for(int i = 0; i < pre_selected_cars.size(); i ++)
        {
            for(int j = 0; j < pre_selected_cars.get(i).size(); j ++){
                if(!visited[pre_selected_cars.get(i).get(j)] && !selected[i] )
                {
                    res.add(pre_selected_cars.get(i).get(j));
                    visited[pre_selected_cars.get(i).get(j)] = true;
                    selected[i] = true;
                }
            }
        }

        return res;
    }
}

class Handler implements Runnable{

    @Override
    public void run() {

    }
}