package com.ocp.java0316.day12;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        //cat.hunter; // 因為Cat裡面沒有hunter
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        // 多型宣告
        Cat cat2 = new Tiger();
        //cat2.hunter(); // 因為Cat裡面沒有hunter，Cat是管能呼叫哪些方法，Tiger執行方法實作
        cat2.shout(); // // 因為Cat裡面沒有hunter，Cat是管能呼叫哪些方法，Tiger執行方法實作
    }
}
