package com.lab;

import java.util.stream.Stream;

public class Java8Study7 {

    public static void main(String[] args) {
        String[][] names = {{"Jo", "Mary"}, {"John", "Helen"}, {"Bob"}};
        // 求所有字母的總和
        int sum = Stream.of(names)
                .flatMap(s -> Stream.of(s)) //flatMap 將二為陣列轉為一維陣列 flat 稱之為扁平化
                .mapToInt(s -> s.length())
                .sum();
        System.out.printf("所有字母的總和為 %d", sum);

    }
}
