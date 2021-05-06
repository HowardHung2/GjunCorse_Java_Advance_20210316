package com.ocp.java0316.day23;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo7 {
    public static void main(String[] args) {
        // 子集合
        TreeSet<Integer> data = new TreeSet<>();
        data.add(2);
        data.add(4);
        data.add(5);
        data.add(8);
        System.out.println(data);
        
        Set<Integer> sub = data.subSet(2, 8); // SortedSet API 定義 data.subSet(包含, 不包含) 因此輸出為 2, 4, 5
        System.out.println(sub);
        Set<Integer> sub2 = data.subSet(2, false, 8, true); // TreeSet API 定義 data.subSet(起始資料, 布林值表示搜尋是否含起始資料, 搜尋至某資料, 布林值表示搜尋是否含最終資料)
        System.out.println(sub2);

    }
}
