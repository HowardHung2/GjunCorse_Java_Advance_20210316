package com.ocp.java0316.day16;

public class NumberName {
    public static void main(String[] args) {
        // Lambda 實作 EvenNumber, n = 50 是否為偶數
        EvenNumber 

        // Lambda 實作 PrimeNumber, n = 9973 是否為質數
        PrimeNumber primeNumber = (int n) ->{
            if (n>2) {
                for(int i=1, i < n, i++){
                    if (n%i==0) {
                        return false;
                    }
                    return true;
                }
            }
            else
        };        
        
    }
}
