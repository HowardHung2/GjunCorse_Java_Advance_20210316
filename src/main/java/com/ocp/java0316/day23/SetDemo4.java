package com.ocp.java0316.day23;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SetDemo4 {
    public static void main(String[] args) {
        // 國英數的分數是介於0-100之間
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(90);
        scores.add(80);
        scores.add(-150);
        System.out.println(scores);
        // 用 Java 8 計算國, 英, 數 的總分
        Predicate<Integer> p = score -> (score>=0 && score<=100);
        int sum = scores.stream()
                .filter(p)// score -> score>=0 && score<=100 為簡化主程式的驗證機制，額外寫一個Score的類別去驗證是否為分數
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
