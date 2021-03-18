package com.ocp.java0316.day02;

public class ScoreSystem {
    public static void main(String[] args) {
        ScoreSystemMethod student1 = new ScoreSystemMethod("小明", 95, 98);
        ScoreSystemMethod student2 = new ScoreSystemMethod("小花", 55, 78);
        System.out.println(student1.getScoreData()); //print快捷:sout
        System.out.println(student2.getScoreData());
    }
}
