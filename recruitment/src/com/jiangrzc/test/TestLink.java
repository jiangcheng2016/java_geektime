package com.jiangrzc.test;


//class ListNode{
//    int val;
//    ListNode next;
//    ListNode(){ }
//    ListNode(int val){this.val = val;}
//    ListNode(int val, ListNode next){this.val = val;this.next = next;}
//}

import java.util.Arrays;
import java.util.Comparator;

class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val;this.next = next;}

}

public class TestLink {

    public static void main(String[] args) {
        //l1: 1,2,4
        //k1: 1,3,4
        ListNode l1 = new ListNode(1,null);
        ListNode l2 = new ListNode(2,null);
        l1.next = l2;
        ListNode l3 = new ListNode(4,null);
        l2.next = l3;

        ListNode k1 = new ListNode(1,null);
        ListNode k2 = new ListNode(3,null);
        k1.next = k2;
        ListNode k3 = new ListNode(4,null);
        k2.next = k3;

        print(merger(l1,k1));
//        Arrays.sort(null,(o1,o2)->{
//            return o1[0]-o2[0];
//        });
//        int[][] intervals = new int[2][2];
//        Arrays.sort(intervals,new Comparator<int[]>(){
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });

    }

    public static ListNode merger(ListNode l1, ListNode l2)
    {
        ListNode cur = new ListNode(-1);
        ListNode res = cur;

        while(l1 != null && l2 != null)
        {
            if(l1.val <=  l2.val)
            {
                cur.next = l1;
                l1 = l1.next;
            }
            else
            {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;

        }

        if(l1 != null) cur.next = l1;
        if(l2 != null) cur.next = l2;

        return res.next;
    }

    public static void create(){



    }

    public static void print(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val + ",");
            head = head.next;
        }
        System.out.println();
    }

}
