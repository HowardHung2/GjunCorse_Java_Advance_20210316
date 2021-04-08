
package com.ocp.java0316.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain2 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Howard", 17, 170, 61.7),
            new Person("Mary", 18, 160, 50.6),
            new Person("Jo", 15, 158, 48.5),
            new Person("Jess", 48, 155, 65),
            new Person("Harry", 39, 175, 72),};
        
            // 建立 bmi 的資料計算邏輯，使用Function<T, R>
            // 參考資料: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
            // T代表 傳入參數型別，在這邊指的就是 Person 物件就是 p
            // R代表 回傳資料型別，在這邊指的就是 Double 也就是 bmi的計算結果
            Function<Person, Double> getBmi = p -> p.getWeight() / Math.pow(p.getHeight()/100,2);
            // 正常 bmi 的過濾器 Predicate<Person>
            // 其中Predicate中文為謂詞，即為過去使用fliter時的 p-> 的 p
            // 此外，apply是取得值的一種方式
            Predicate<Person> normalBmi = p -> getBmi.apply(p) > 18 && getBmi.apply(p) <=23;
            // 印出bmi正常的人名
            // 透過Stream.for-each說明得知for-each為一個consumer
            // Consumer 為一個輸入一個類別且沒有回傳值
            Consumer<Person> printName = p -> System.out.println(p.getName()); 
            // 印出bmi正常的人名
            Stream.of(persons).filter(normalBmi).forEach(p -> System.out.println(p.getName()));
    }
}
