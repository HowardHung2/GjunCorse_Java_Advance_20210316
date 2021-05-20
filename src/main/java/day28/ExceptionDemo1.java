package day28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("請輸入半徑: ");
        Scanner sc = new Scanner(System.in);
        try {
            double r = sc.nextDouble();
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("Area: %.2f\n", area);
        } catch (InputMismatchException e) {
            System.out.println("錯誤被捉到了, 內容: " + e);
            System.out.println("半徑請輸入數字");
        }
        
        
    }
}
