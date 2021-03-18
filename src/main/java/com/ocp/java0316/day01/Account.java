package com.ocp.java0316.day01;

public class Account {
    private int balance;
    //提款方法
    void withdraw(int money){ 
        //驗證money是符合存款的條件
        if(money <= 0 ){
            System.out.println("提款金額不符!");
            return; //提款方法到此結束
        }
        //驗證money是否大於balance?
        if(money > balance){
            System.out.println("帳戶餘額不足!");
            return; //提款方法到此結束
        }
        balance -= money;
    }
    //存款方法
    void deposit(int money){ 
        //驗證money是符合存款的條件
        if(money <= 0 ){
            System.out.println("存款金額不符!");
            return; //存款方法到此結束
        }
        balance += money;
    }
    //查詢帳戶餘額
    int getBalance(){ 
        return balance; //方法停止並回傳餘額
    }
}
