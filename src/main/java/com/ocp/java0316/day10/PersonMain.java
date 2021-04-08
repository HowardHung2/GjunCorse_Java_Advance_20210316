package com.ocp.java0316.day10;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("Howard", 17, 170, 61.7),
            new Person("Mary", 18, 160, 50.6),
            new Person("Jo", 15, 158, 48.5),
            new Person("Jess", 48, 155, 65),
            new Person("Harry", 39, 175, 72),};

        //請印出未成年的人名
        System.out.println("請印出未成年的人名");
        Stream.of(persons)
                .filter(p -> p.getAge() < 18) // 過濾(filter 輸出 boolean值)
                .forEach(p -> System.out.println(p.getName()));
        //請印出bmi正常的人名(18<bmi<=23)
        System.out.println("請印出bmi正常的人名(18<bmi<=23) 方法一");
        // 方法一
        Stream.of(persons)
                .filter(p -> {  // 當驗證多行，則需使用{}
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 18 && bmi <= 23) {
                        return true;
                    }
                    return false;

                })
                .forEach(p -> System.out.println(p.getName()));
        // 方法二 將bmi正常的過濾邏輯(fliter)先拆出來
        System.out.println("請印出bmi正常的人名(18<bmi<=23) 方法二");
        Predicate<Person> normalBmi = p -> {  
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 18 && bmi <= 23) {
                return true;
            }
            return false;
        };
        Predicate<Person> ThinBmi = p -> {  
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi < 18) {
                return true;
            }
            return false;
        };
        Predicate<Person> FatBmi = p -> {  
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi < 23) {
                return true;
            }
            return false;
        };
        Stream.of(persons)
                .filter(normalBmi)
                .forEach(p -> System.out.println(p.getName()));
    }
}
