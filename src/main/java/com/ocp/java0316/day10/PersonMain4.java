package com.ocp.java0316.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain4 {
    public static void main(String[] args) {
        Person[][] persons = {
            { // A 班
                new Person("Howard", 17, 170, 61.7),
                new Person("Mary", 18, 160, 50.6)
            },
            { // B 班
                new Person("Jo", 15, 158, 48.5),
                new Person("Jess", 48, 155, 65),
                new Person("Harry", 39, 175, 72),
            }
        };
        
        //印出所有的bmi資料
        Function<Person, Double> getBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight()/100, 2);
            return Math.round(bmi * 100) / 100.0;  // round 為四捨五入
        };
        Stream.of(persons)  //Stream 表示串流
                .flatMap(p -> Stream.of(p)) // flatMap 僅將最外層陣列攤平，因此還會有原先裡面的兩個陣列，再次透過Stream將兩者串流為一陣列
                .mapToDouble(getBmi :: apply) // p -> getBmi.apply(p)
                .forEach(System.out :: println); //前者放型態，後面放方法 也就是 value -> System.out.println(value);
        
        //請問哪一人bmi最大
        double maxBmi = Stream.of(persons)  
                .flatMap(p -> Stream.of(p)) 
                .mapToDouble(p -> getBmi.apply(p))
                .summaryStatistics()
                .getMax();
        
        Consumer<Person> printPerson = p -> {
            System.out.printf("姓名: %s 年齡: %d 身高: %.1f 體重: %.1f BMI: %.2f\n",
                    p.getName(), p.getAge(), p.getHeight(), p.getWeight(), getBmi.apply(p));
        };
        Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .filter(p -> getBmi.apply(p) == maxBmi)
                .forEach(printPerson);
                
    }
   
}
