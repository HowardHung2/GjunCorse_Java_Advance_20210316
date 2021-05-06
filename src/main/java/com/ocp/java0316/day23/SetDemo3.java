package com.ocp.java0316.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        // 泛型<> : 型別限定 預設為Object
        // 國英數的分數是介於0-100之間
        Set<Integer> scores = new LinkedHashSet<>(); //後面的泛型可省略型別，此為java diamond機制
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        System.out.println(scores);
        Iterator<Integer> iter = scores.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum+=next;
        }
        System.out.println(sum);
        // Java 8
        sum = scores.stream()
                .mapToInt(Integer :: intValue) // score -> score.intValue()
                .sum();
        System.out.println(sum);
    }
}
