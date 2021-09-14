package com.jiangrzc.interviewer;

public class QuickSort {

    public static void main(String[] args) {

        int[] q = new int[]{1,3,2,6,4,5,9,8,7};

        quick_sort(q,0,q.length-1);

        for(int x:q){
            System.out.print(x+" ");
        }

    }

    public static void quick_sort(int[] q, int l, int r){

        if(l >= r) return ;
        int i = l - 1, j = r + 1;
        int x = q[l + r >> 1];
        while(i < j){
            do ++i; while(q[i] < x);
            do --j; while(q[j] > x);
            if(i < j){
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quick_sort(q,l,j);
        quick_sort(q,j+1,r);
    }
}
