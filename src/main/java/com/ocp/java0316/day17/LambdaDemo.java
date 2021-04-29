package com.ocp.java0316.day17;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        Stream.of(100, 50, 70, 80, 30)
                .peek(x -> System.out.println(x.getClass().getTypeName())) // Consumer
                .forEach(x -> System.out.println(x)); // Consumer
        
        Stream.of(100, 50, 70, 80, 30)
                .filter(x -> x>=60) // Predicate , 輸入值回傳布林
                .forEach((System.out :: println)); // Consumer
        
        Stream.of("Mary", "John", "Bob", "Howard")
                .mapToInt(String :: length) // Function
                .forEach(System.out :: println); // Consumer
    }
}
