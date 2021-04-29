package com.ocp.java0316.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class School {

    public static void main(String[] args) {
        Arrays.stream(DataCenter.getPeople())
                .peek(e -> System.err.println(e.getClass().getTypeName()))
                .forEach(System.out::println);
        
        System.out.println("= = = = = = = = = = = = =");

        // 請問考試的總分與平均 = ?
        IntSummaryStatistics stat = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                // .map(x -> (Student)x)
                .mapToInt(x -> ((Student) x).getScore()) //原本是person陣列，所以產成person物件，需轉型為student型別
                .summaryStatistics();
        //.forEach(System.out :: print);
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
        
        System.out.println("= = = = = = = = = = = = =");

        // 請問老師薪資總和與平均 = ?
        IntSummaryStatistics stat2 = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Teacher)
                .map(x -> (Teacher) x)
                .mapToInt(x -> x.getSalary())
                .summaryStatistics();
        System.out.println(stat2.getSum());
        System.out.println(stat2.getAverage());
        
        System.out.println("= = = = = = = = = = = = =");

        // 印出不及格的學生姓名與分數及老師姓名以及不及格的總平均
        Consumer<Student> p = x -> System.out.printf("學生: %s,分數: %d, 老師:%s\n", x.getName(), x.getScore(), x.getTeacher().getName());
        double avg = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student) x)
                .filter(x -> x.getScore() < 60)
                .peek(p) //peek 操作接收的是一個 Consumer 函數。顧名思義 peek 操作會按照 Consumer 函數提供的邏輯去消費流中的每一個元素，同時有可能改變元素內部的一些屬性
                .mapToInt(x -> x.getScore())
                .average().getAsDouble();
        System.out.println("不及格平均: " + avg);
        
    }
}
