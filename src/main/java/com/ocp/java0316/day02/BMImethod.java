package com.ocp.java0316.day02;

//設計計算BMI應有資源及方法
public class BMImethod {
    /*屬性定義區*/
    String name;
    double Height;
    double Weight;
    
    /*建構子設計區*/
    BMImethod() {
    }
    
    BMImethod(String n, double h, double w) {
        name = n;
        Height = h;
        Weight = w;
    }
    
    /*方法實作區*/
    //取得計算後的BMI值
    double getBMIvalue(){
         double BMIvalue = Weight / Math.pow(Height/100, 2); //計算
         return BMIvalue; //回傳BMIvalue(要回傳與方法簽章一樣的型態也就是double)
    }
    //取得計算後的分析結果
    String getResultValue(){
        double BMIvalue = getBMIvalue(); //直接取得BMIvalue的計算結果
        String resultValue = (BMIvalue > 23) ? "過重" : (BMIvalue < 18) ? "過輕" : "正常";
        return resultValue;
    }
    //列印資料
    void print(){
        double BMIvalue = getBMIvalue();
        String ResultValue = getResultValue();
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f BMI:%.2f 結果:%s\n", name, Height, Weight, BMIvalue, ResultValue);
    }
}
