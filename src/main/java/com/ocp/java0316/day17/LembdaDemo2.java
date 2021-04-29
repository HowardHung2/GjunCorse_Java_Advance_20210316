package com.ocp.java0316.day17;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class LembdaDemo2 {
    public static void main(String[] args) {
        // 求此人總分與平均
        DoubleSummaryStatistics stat = Stream.of("國文", 100.0, "英文", 90.5, "數學", 70.5, "座號", 7)
                .filter(x -> x instanceof Double)
                .mapToDouble(x -> (double)x) //物件 double 轉基本 double, 才會變成doublestream, 串流可使用summary來總和或求最大值等 
                .summaryStatistics();
        System.out.println(stat.getSum());
                //.peek(x -> System.out.println(x.getClass().getTypeName()))
                //.forEach(System.out :: println);
    }
}
