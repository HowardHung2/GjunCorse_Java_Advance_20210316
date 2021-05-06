package com.ocp.java0316.day23;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo6 {
    public static void main(String[] args) {
        Set<Integer> data = new HashSet<>(); // HashSet 依照 HashCode 排序
        data.add(100);
        data.add(80);
        data.add(90);
        System.out.println(data);
        // 利用 TreeSet 查詢資料
        // 將 HashSet 轉 TreeSet
        data = new TreeSet<>(data);
        System.out.println(data);
        
    }
}
