package com.jiangrzc;

import java.util.LinkedHashMap;

public class LRUCache {

    int cap;
    LinkedHashMap<Integer,String> cache = new LinkedHashMap<>();

    public LRUCache(int capacity){
        this.cap = capacity;
    }

    public String get(int key){
        if(!cache.containsKey(key))
            return "null";
        //如果有，设置为最近使用
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, String value){
        //如果有，就赋值，设置最近使用
        if(cache.containsKey(key))
        {
            cache.put(key,value);
            makeRecently(key);
            return;
        }
        //如果没有，先判断容量，再操作
        if(cache.size() >= cap){
            int oldKey = cache.keySet().iterator().next();
            cache.remove(oldKey);
        }

        cache.put(key,value);
    }

    public void makeRecently(int key){
        String val = cache.get(key);
        cache.remove(key);
        cache.put(key,val);
    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "cap=" + cap +
                ", cache=" + cache +
                '}';
    }
}
