package com.ocp.java0316.day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // 考試科目: 國文, 英文, 數學 -> Set<String> 集合
        // 考試成績: 100,  90,  100 -> List<Integer> 集合
        
        Map<String, Integer> exam = new HashMap<>(); // 是按照KEY值得HASH-CODE排列
        exam.put("國文", 100);
        exam.put("英文", 90);
        exam.put("數學", 100);
        System.out.println(exam);
        
        Map<String, Integer> exam2 = new LinkedHashMap<>(); // 按照順序排列
        exam2.put("國文", 100);
        exam2.put("英文", 90);
        exam2.put("數學", 100);
        System.out.println(exam2);
        
        //取得考試科目
        Set<String> subjects = exam2.keySet();
        System.out.println(exam2.keySet());
        // 取得單一考試成績
        System.out.println(exam2.get("國文"));
        // 取得所有考試成績
        Collection<Integer> scores = exam2.values();
        System.out.println(scores);
        List<Integer> scores2 = new ArrayList<>(scores);
        System.out.println(scores2);
    }
}
