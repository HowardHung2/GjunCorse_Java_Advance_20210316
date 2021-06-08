package com.ocp.java0316.day27;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args){
        Map map1 = new Hashtable();
        // Hashtable() 多執行緒會比較安全 // LinkedHashMap() 按照輸入順序排序
        // TreeMap() key值做自然排序 // HashMap() 按hash code排序
        map1.put("B", 100);
        map1.put("C", 80);
        map1.put("E", 80);
        map1.put("D", 80);
        map1.put("A", 90);
        
    }
}
