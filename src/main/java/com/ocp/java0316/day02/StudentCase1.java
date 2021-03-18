package com.ocp.java0316.day02;

public class StudentCase1 {
    public static void main(String[] args) {
        //未加入成績
        Student s1 = new Student("小明", 14,168,65,50,60);
        s1.print();
        System.out.println("\n");
        
        //加入成績後
        Student s2 = new Student("小花", 15, 178, 52);
        s2.score = new ScoreSystemMethod(s2.name, 100, 90);
        s2.print();
        System.out.println("\n");
        
        //請單獨印出BMI資料
        System.out.println(s1.bmi.getBMIvalue());
        System.out.println(s2.bmi.getBMIvalue());
        System.out.println("\n");
        
        //單獨印出平均分數
        System.out.println(s1.score.getAvg());
        System.out.println(s2.score.getAvg());
        System.out.println("\n");
        
        //修改s1數學分數 = 75分
        s1.score.mathScore = 75;
        s1.print();
    }
}
