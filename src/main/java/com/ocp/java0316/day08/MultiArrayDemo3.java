package com.ocp.java0316.day08;

public class MultiArrayDemo3 {                 // Multi中文 = 多
    public static void main(String[] args) {
        //3人的身高與體重如下:
        double [][] hw = { {170, 60},{169, 62},{180, 90}};
        //求3人的BMI
        /*自己做錯了TT
        for(int i = 0; i < hw.length; i++){
            for(int k = 0; k < hw[i].length-1; k++){
                double hight = hw[i][k];
                double wight = hw[i][k+1];
                double BMI = wight/Math.pow(hight/100, 2);
                System.out.printf("第 %d 位BMI為%.1f\n",i+1,BMI );
            }
        }*/
        for(double[] x : hw){
            double h = x[0];
            double w = x[1];
            double BMI = w / Math.pow(h/100, 1);
            System.out.printf("%.2f\n", BMI);
        }
    }
}
