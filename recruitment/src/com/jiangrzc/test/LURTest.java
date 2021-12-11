package com.jiangrzc;

public class LURTest {

    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(5);

        lruCache.put(1,"卫星1号");
        lruCache.put(2,"卫星2号");
        lruCache.put(3,"卫星3号");

        System.out.println(lruCache.toString());

        lruCache.put(1,"卫星1-1号");
        lruCache.put(4,"卫星4号");
        lruCache.put(5,"卫星5号");

        System.out.println(lruCache.toString());

        lruCache.put(2,"卫星2-1号");
        lruCache.put(6,"卫星6号");
        lruCache.put(7,"卫星7号");

        System.out.println(lruCache.toString());

        lruCache.put(3,"卫星3-1号");
        lruCache.put(8,"卫星8号");
        lruCache.put(9,"卫星9号");

        System.out.println(lruCache.toString());

        lruCache.put(4,"卫星4-1号");
        lruCache.put(10,"卫星10号");
        lruCache.put(5,"卫星5-1号");

        System.out.println(lruCache.toString());

        lruCache.put(1,"卫星1-2号");
        lruCache.put(2,"卫星2-2号");
        lruCache.put(5,"卫星5-1号");

        System.out.println(lruCache.toString());

    }
}
