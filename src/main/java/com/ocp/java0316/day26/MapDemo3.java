package com.ocp.java0316.day26;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> student = new TreeMap<>();
        student.put(3, "Mary");
        student.put(1, "John");
        student.put(2, "Helen");
        System.out.println(student);
    }
}
