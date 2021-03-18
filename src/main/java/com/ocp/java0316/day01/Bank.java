package com.ocp.java0316.day01;

public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account(); //建立a01帳戶
        Account b02 = new Account(); //建立b02帳戶
        Account c03 = new Account(); //建立c03帳戶
        //各帳戶的第一次存款
        a01.deposit(1000);
        b02.deposit(2000);
        c03.deposit(3000);
        /*a01.balance = -1000;
        b02.balance = 2000;
        c03.balance = 3000;*/
        System.out.printf("a01 帳戶餘額 : $%d\n", a01.getBalance());
        System.out.printf("b02 帳戶餘額 : $%d\n", b02.getBalance());
        System.out.printf("c03 帳戶餘額 : $%d\n", c03.getBalance());
        //存款
        System.out.println("a01 存款$500後...");
        a01.deposit(500);
        System.out.printf("a01 帳戶餘額 : $%d\n", a01.getBalance());
        //提款
        System.out.println("b02 提款$800後...");
        b02.withdraw(800);
        System.out.printf("b02 帳戶餘額 : $%d\n", b02.getBalance());
        //存款
        System.out.println("C03 提款$-1200後...");
        c03.deposit(-1200);
        System.out.printf("c03 帳戶餘額 : $%d\n", c03.getBalance());
        //提款
        System.out.println("C03 提款$5000後...");
        c03.withdraw(5000);
        System.out.printf("c03 帳戶餘額 : $%d\n", c03.getBalance());
    }
    
}
