package com.ocp.java0316.day02;

public class BMIcase2 {
    public static void main(String[] args) {
        BMImethod b1 = new BMImethod();
        b1.name = "小明";
        b1.Height = 158;
        b1.Weight = 52;
        
        BMImethod b2 = new BMImethod();
        b2.name = "小英";
        b2.Height = 169;
        b2.Weight = 60;
        
        b1.print();
        b2.print();
        
    }
}
