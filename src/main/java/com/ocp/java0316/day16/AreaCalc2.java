package com.ocp.java0316.day16;

public class AreaCalc2 {
    public static void main(String[] args) {
        // 利用匿名內部類別實作
        CircleArea ca = new CircleArea() {
            @Override
            public double getArea(double r) {
                return Math.pow(r, 2) * Math.PI;
            }
        };
        
        // 利用 Lambda 語法來實作
        // Lambda 表示 (輸入方法參數列) -> 輸入方法實作；多行方法實作時要透過{}內輸入方法實作，如有回傳值末端需有return
        CircleArea ca2 = (double r) -> Math.pow(r, 2) * Math.PI; // 由於介面裡面只有一種方法，故無需顧及方法名稱，直接使用Lambda來實作
        CircleArea ca3 = (r) -> Math.pow(r, 3) * Math.PI * 4.0 / 3;
        System.out.println(ca2.getArea(15));
        System.out.println(ca3.getArea(15));
    }
}
