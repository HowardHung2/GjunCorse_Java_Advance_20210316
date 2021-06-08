package com.ocp.java0316.day27;

public class Exam {
    private String name;
    private int score;

    public Exam(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Exam{" + "name=" + name + ", score=" + score + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
