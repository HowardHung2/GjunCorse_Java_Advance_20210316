package com.ocp.java0316.day23;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        // 具有排序性的集合(小->大)
        Set<Integer> nums = new TreeSet<>(); // TreeSet 為樹狀結構(二分搜尋法)，相較於 LinkedHashSet 搜尋速度較快，但新增、刪除及修改資料速度較慢
        // 1~9任意5個
        Random r = new Random();
        while(nums.size() < 7){
            int n = r.nextInt(9)+1;
            System.out.println("n: " + n);
            nums.add(n);
        }
        /*for(int i = 0; i < 7; i++){
            int n = r.nextInt(9)+1;
            System.out.println("n: " + n);
            nums.add(n);
        }*/
        System.out.println(nums);
    }
}
