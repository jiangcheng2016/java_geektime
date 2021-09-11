package com.jiangrzc.bishi;

public class haikangweishi0910_2 {



    public static void main(String[] args) {

        int[] arr = new int[]{2,3,4,5,7,8,9,10,100,250,291};

        System.out.println( isexist(arr,100));

    }

    public static int isexist(int[] arr,int target){

        int l = 0;
        int r = arr.length - 1;

        if(l >= r) return -1;


        while(l < r)
        {
            int mid = l + r  >> 1;
            if(arr[mid] == target) return mid;

            if(arr[mid] > target) r = mid;
            else l = mid +1;
        }

        if(arr[l] == target) return l;

        return -1;
    }

}
