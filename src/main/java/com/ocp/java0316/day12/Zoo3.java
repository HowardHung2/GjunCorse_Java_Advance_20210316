package com.ocp.java0316.day12;

public class Zoo3 {
    public static void main(String[] args) {
        Cat cat = new Tiger();
        cat.shout();
        ((Tiger)cat).hunter();
        Cat cat2 = new Cat();
        if(cat2 instanceof Tiger) // instance 表示實作
            ((Tiger)cat2).hunter(); // 貓不能轉型成老虎
        else
            System.out.println("Cat找不到參數");
        
    }
}
