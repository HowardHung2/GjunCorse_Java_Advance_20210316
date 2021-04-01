package com.ocp.java0316.day08;

public class XOGame {

    public static void main(String[] args) {
        char[][] xo = {{'o', 'x', 'o'}, {' ', 'x', 'x'}, {'o', ' ', ' '}};
        print(xo);
        System.out.println("輸入 xo[1][0] = 'O'");
        xo[1][0] = 'o';
        print(xo);
    }

    public static void print(char[][] xo) {
        for (char[] x : xo) {
            System.out.print(" | ");
            for (char y : x) {
                System.out.print(y + " | ");
            }
            System.out.println();
        }
    }
}
