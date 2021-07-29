package com.jiangrzc.autoRecycling;

public class TryWithResource{
    public static void main(String[] args) {
        try(MyAutoCloseableResource res1 = new MyAutoCloseableResource("res1");
             MyAutoCloseableResource res2 = new MyAutoCloseableResource("res2")) {
            while(true){
                System.out.println(res1.read());
                System.out.println(res2.read());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
