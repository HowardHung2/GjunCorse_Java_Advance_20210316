package com.ocp.java0316.day02;

public class BMIcase1 {
    public static void main(String[] args) {
        String name1 = "小明";
        double height1 = 170;
        double weight1 = 60;
        double BMI1 = weight1 / Math.pow(height1/100, 2);
        String result1 = (BMI1 > 23) ? "過重": (BMI1 < 18) ? "過輕" : "正常" ;
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f BMI:%.2f \n", name1, height1, weight1, BMI1);
        
        String name2 = "小英";
        double height2 = 157;
        double weight2 = 85;
        double BMI2 = weight1 / Math.pow(height1/100, 2);
        String result2 = (BMI2 > 23) ? "過重": (BMI2 < 18) ? "過輕" : "正常" ;
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f BMI:%.2f \n", name2, height2, weight2, BMI2);
    }
    
}
