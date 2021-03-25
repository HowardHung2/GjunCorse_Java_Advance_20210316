package com.ocp.java0316.day06;

/********************************************
某公司有18位員工，
其中10位在去年投資股票，一年的獲利率如下(單位：%)：
7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
另外8位員工投資買公債一年內獲利率如下(單位：%)
6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
試分別求此公司的員工投資股票與公債的獲利率變異係數
以及哪一種投資的獲利較穩健(較集中) ?
*********************************************/

public class ArrayCV4 {
    public static void main(String[] args) {
        double [] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double [] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        double s = MyMath.sd(stocks);
        double b = MyMath.sd(bonds);
        /*double stockOfMax = MyMath.max(stocks);
        double stockOfMin = MyMath.min(stocks);
        double bondsOfMax = MyMath.max(stocks);
        double bondsOfMin = MyMath.min(stocks);*/
        String result = (s > b) ? "公債較穩健" : "股票較穩健";
        System.out.printf("%s\n股票變異係數為%.1f\n公債變異係數為%.1f",result, s, b);
        System.out.printf("\n\n股票最大獲利率為%.1f\t股票最小獲利率為%.1f",MyMath.max(stocks), MyMath.min(stocks));
        System.out.printf("公債最大獲利率為%.1f\t公債最小獲利率為%.1f",MyMath.max(bonds), MyMath.min(bonds));
    }
}