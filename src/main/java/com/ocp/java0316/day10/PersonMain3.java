package com.ocp.java0316.day10;

import java.util.DoubleSummaryStatistics;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain3 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Howard", 17, 170, 61.7),
            new Person("Mary", 18, 160, 50.6),
            new Person("Jo", 15, 158, 48.5),
            new Person("Jess", 48, 155, 65),
            new Person("Harry", 39, 175, 72),
        };
        
        // 計算 bmi 的平均值，最大值及最小值為多少
        Function<Person, Double> getBmi = p -> p.getWeight() / Math.pow(p.getHeight()/100, 2);
        DoubleSummaryStatistics stat = Stream.of(persons)
                .mapToDouble(getBmi :: apply) // 相當於 p -> getBmi.apply(p)
                .summaryStatistics();
        System.out.printf("平均:%.2f  最大:%.2f  最小:%.2f "
                , stat.getAverage(), stat.getMax(), stat.getMin());
    }
}
