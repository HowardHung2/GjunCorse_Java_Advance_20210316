package com.ocp.java0316.day07_off;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java course");
        System.out.println("sb: "+sb);
        // 刪除全部資料
        sb.delete(0, sb.length()); // (0,11)從0開始到<11的資料全部刪除
        System.out.println("sb: "+sb);
    }
}
