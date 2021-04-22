package com.ocp.java0316.day16;

public class TransactionMain {
    public static void main(String[] args) {
        // amount=10, price=35
        Transaction t = (int amount, int price) -> System.out.println(amount * price);
        t.print(10, 35);
    }
}
