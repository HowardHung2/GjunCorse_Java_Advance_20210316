package com.ocp.java0316.day28;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        int[] x = null;
        try {
            int avg = 10/x[0];
            System.out.println(avg);
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace(System.out); // 印出詳細錯誤資料 -> 會顯示出stack的錯誤狀態
            return;
        }finally{ // 不論如何都要執行的區段
            System.out.println("程式結束: 這是一定要執行的");
        }
        
        
        
        
    }
}
