package com.ocp.java0316.day32_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
    public static void main(String[] args) {
        int parties = 2;
        Runnable r = () -> System.out.println("一起吃午餐");
        CyclicBarrier cb = new CyclicBarrier(parties, r); //(幾個執行緒接到了, 到了後要執行的東西)
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start(); // 由於兩兩執行緒一組 出一個則會持續等到下個執行緒 否則程式不會結束, 解決方法 -> 在awake()內輸入最多等待時間
    }
}
