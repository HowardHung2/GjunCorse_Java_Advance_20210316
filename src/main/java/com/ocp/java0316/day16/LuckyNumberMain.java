package com.ocp.java0316.day16;

import java.util.Random;


public class LuckyNumberMain {
    public static void main(String[] args) {
        // 利用 Lambda 時做一個可以得到 1~9 的功能
        LuckyNumber num = () -> new Random().nextInt(9) + 1;
        System.out.println(num.get());
        
        // 利用 Lambda 時做一個可以得到 1~49 的功能
        // Lambda 多行方法實作時要透過{}內輸入方法實作，如有回傳值末端需有return
        LuckyNumber num2 = () -> {
            Random r = new Random();
            int n = r.nextInt(49) + 1;
            return n;
        };
        System.out.println(num2.get());
    }
}
