package com.ocp.java0316.day02;

public class Student {
    /*屬性*/
    String name;
    int age;
    BMImethod bmi;
    ScoreSystemMethod score;
    
    /*設計建構子*/
    Student(String name, int age, double Height, double Weight) {
        this.name = name;
        this.age = age;
        this.bmi = new BMImethod(name, Height, Weight);
    }
    Student(String name, int age, double Height, double Weight, int chinese, int math) {
        this.name = name;
        this.age = age;
        this.bmi = new BMImethod(name, Height, Weight);
        this.score = new ScoreSystemMethod(name, chinese, math);
    }
    
    /*設計方法*/
    void print(){
        System.out.printf("姓名:%s 年齡:%d\n", name, age);
        bmi.print();
        if(score == null)
            System.out.println("此學生無成績");
        else
            System.out.print(score.getScoreData());
    }
}
