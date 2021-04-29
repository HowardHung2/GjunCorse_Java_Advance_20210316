package com.ocp.java0316.day18;

public class DataCenter {
    public static Person[] getPeople() {
        Teacher t1 = new Teacher(75000, "Mary", 29);
        Teacher t2 = new Teacher(65000, "Leo", 28);
        Teacher t3 = new Teacher(120000, "Howard", 21);
        Student s1 = new Student(90, t3, "小明", 17);
        Student s2 = new Student(80, t3, "小華", 18);
        Student s3 = new Student(70, t2, "小花", 20);
        Student s4 = new Student(60, t1, "小英", 15);
        Student s5 = new Student(50, t2, "小文", 14);
        Student s6 = new Student(40, t1, "小彭", 16);
        Student s7 = new Student(30, t3, "小雪", 12);
        Person[] people = {t1, t2, t3, s1, s2, s3, s4, s5, s6, s7};
        return people;
    }
}