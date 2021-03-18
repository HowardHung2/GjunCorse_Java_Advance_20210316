package com.ocp.java0316.day02;

public class ScoreSystemMethod {
    String name;
    int chineseScore;
    int mathScore;
    
    
    
    int getSum(){
        int sum = chineseScore + mathScore;
        return sum;
    }
    
    double getAvg(){
        int sum = getSum();
        double avg = sum/2;
        return avg;
    }
    
    String getScoreData(){
        String result = "姓名:" + name + " 國文分數:" + chineseScore + " 數學分數:" + mathScore ; 
        return;
    }
    
}
