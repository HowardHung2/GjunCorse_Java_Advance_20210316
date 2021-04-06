package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study6 {
    public static void main(String[] args) {
        String[] names = {"banana", "watermelon", "apple", "orange", "mango"};
        // 請求出name長度是偶數的總和
        // 方法一
        IntSummaryStatistics stat = Stream.of(names)
                                            .mapToInt(s -> s.length())
                                            .filter(s -> s%2==0)  // filter輸出結果為boolean值
                                            .summaryStatistics();
        System.out.printf("name長度是偶數的總和為 %d", stat.getSum());
        //方法二
        Stream.of(names)
                .mapToInt(s -> s.length())  // (String::length) -> :: 表示方法參考 兩者執行效率相同
                .filter(s -> s%2==0)  // filter輸出結果為boolean值
                .summaryStatistics();
        System.out.printf("name長度是偶數的總和為 %d", stat.getSum());
    }
}