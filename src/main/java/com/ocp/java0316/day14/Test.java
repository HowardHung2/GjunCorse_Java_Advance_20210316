package com.ocp.java0316.day14;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new PG();
        e1.setSalary(20_000);
        Employee e2 = new PG(30000);
        Employee e3 = new Art();
        e3.setSalary(20000);
        Employee e4 = new Art(50000);
        
        // 印出每一個人的工作
        Employee[] employees = {e1, e2, e3, e4};
        Stream.of(employees).forEach(e -> e.job());
        
        // 請求出總薪資與平均薪資
        IntSummaryStatistics stat = Stream.of(employees)
                .mapToInt(Employee::getSalary) // e -> e.getSalary
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}