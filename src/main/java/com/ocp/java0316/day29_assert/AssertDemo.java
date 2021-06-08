package com.ocp.java0316.day29_assert;

public class AssertDemo {
    public static void main(String[] args) {
        int score = 400;
        // 1. 設定 main class(專案右鍵 properties -> run)
        // 2. 加上 -ea
        // 3. 找出問題後要把 assert 拔除
        // assert(score >= 0 && score <= 100): "分數錯誤: " + score;
        if(score >= 0 && score <= 100)
            System.out.println( score >= 60 ? "Pass":"Fail");
        else
            System.out.println("分數錯誤");
    }
}
