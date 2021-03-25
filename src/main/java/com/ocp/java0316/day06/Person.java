package com.ocp.java0316.day06;

public class Person {
    String name;
    double h;
    double w;
    double bmi;

    public Person(String name, double h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
        bmi = w / Math.pow(h/100, 2);
    }
}
