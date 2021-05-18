package com.ocp.java0316.day26;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> exam = new LinkedHashMap<>(); // 按照順序排列
        exam.put("國文", 100);  // ("國文", 100) -> 稱為 Entry(含有key/value)
        exam.put("數學", 100);
        exam.put("英文", 90);
        exam.put("英文", 80); // 前面的英文90會被覆蓋，等同於資料修改，以後為主
        System.out.println(exam);
        // 有很多 Entry 我們稱為 EntrySet
        exam.entrySet().forEach(entry -> System.out.println(entry.getKey()));
        exam.entrySet().forEach(entry -> System.out.println(entry.getValue()));
        IntSummaryStatistics stat = exam.entrySet()
                .stream()
                .mapToInt(entry -> entry.getValue())
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}
