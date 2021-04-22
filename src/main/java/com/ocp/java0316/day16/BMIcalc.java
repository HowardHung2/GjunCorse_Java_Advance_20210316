package com.ocp.java0316.day16;

public class BMIcalc {
    public static void main(String[] args) {
        BMI b = (double w, double h) -> w / Math.pow(h/100, 2);
        System.out.println(b.getResult(60, 168));
    }
}
