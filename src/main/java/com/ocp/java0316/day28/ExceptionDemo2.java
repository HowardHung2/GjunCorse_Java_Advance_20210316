package com.ocp.java0316.day28;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String s = "1234五";
        try {
            int x = Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("錯誤訊息" + e);
            System.out.println("錯誤訊息" + e.getMessage()); // 將錯誤訊息輸出
            System.out.println("請重新輸入");
        }
        
    }
}
