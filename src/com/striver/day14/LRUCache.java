package com.striver.day14;

import java.util.HashMap;
import java.util.LinkedHashMap;

class LRUCache {
    int capacity;
    HashMap<Integer,Integer> hm = null;
    public LRUCache(int capacity) 
    {
        this.capacity = capacity;
        hm = new LinkedHashMap<Integer,Integer>(capacity);
    }
    
    public int get(int key) 
    {
        if(hm.containsKey(key))
        {
            int value = hm.get(key);
            hm.remove(key);
            hm.put(key,value);
            return hm.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) 
    {
        if(hm.containsKey(key))
        {
            hm.remove(key);
            hm.put(key,value);
            return;
        }
        if(hm.size() == capacity)
        {
           int keyDelete =  hm.entrySet().stream().findFirst().orElse(null).getKey();
           hm.remove(keyDelete);
        }
        hm.put(key, value);
    }
}
