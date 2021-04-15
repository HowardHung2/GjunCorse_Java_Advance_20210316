package com.ocp.java0316.day12;

class Father{
    Father() {
        System.out.println("Father");
    }
    Father(int x) {
        this();
        System.out.println("Father: " + x);
    }
}

class Son extends Father{
    Son() {
        this(100); // super()與this()一定要在建構子函式的第一行
        System.out.println("Son");
    }
    Son(int x){
        super(x);
        System.out.println("Son: " + x);
    }
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
