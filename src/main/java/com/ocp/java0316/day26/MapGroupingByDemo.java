package com.ocp.java0316.day26;

// 資料分組
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupingByDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        // apple=3, banana=2, orange=1, papaya=1
        // 分組
        System.out.println(
                names.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Collectors.groupingBy抓取每一個name的資料 ； Function.identity() = name -> name；Collectors.counting() 計算總量
                        // {papaya=1, orange=1, banana=2, apple=3} 的資料型別是 <String, Long> 因為 Collectors.counting()的API
        );
        Map<String, Long> result = names.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

    }
}
