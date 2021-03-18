package com.ocp.java0316.day02;

public class ScoreSystemMethod {
    String name;
    int chineseScore;
    int mathScore;

    /*設計建構子*/
    public ScoreSystemMethod(String name, int chineseScore, int mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }
    
    
    /*設計方法*/
    int getSum(){
        /*int sum = chineseScore + mathScore;
        return sum;*/
        return chineseScore + mathScore;
    }
    
    double getAvg(){
        /*int sum = getSum();
        double avg = sum/2;
        return avg;*/
        return getSum()/2.0;
    }
    
    String getScoreData(){
        return String.format("姓名:%s 國文:%d 數學:%d 總分:%d 平均:%.1f", name, chineseScore, mathScore, getSum(),getAvg());
    }
    
}
