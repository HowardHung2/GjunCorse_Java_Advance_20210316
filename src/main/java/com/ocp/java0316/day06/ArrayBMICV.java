package com.ocp.java0316.day06;

import java.security.Permissions;
import java.util.Arrays;

/*********************************************
調查五位學生之身高及體重如下，試比較其分散程度。
            身高：172、168、164、170、176(公分)
            體重：62、57、58、64、64(公斤)
            請問身高及體重哪個較集中 ?
**********************************************/
public class ArrayBMICV {
    public static void main(String[] args) {
        String [] names = {"A", "B", "C", "D", "E"};    
        double [] height = {172, 168, 164, 170, 176};
        double [] weight = {62, 57, 58, 64, 64};
        Person [] people = new Person[5];
        
        for(int i = 0; i < people.length; i++){
            //建立一個Person物件
            Person p = new Person(names[i], height[i], weight[i]);
            //將Person物件p放入到people[i]中
            people[i] = p;
            //將資料people[0]印出
            System.out.println(people[i]);
        }
        //印出bmi值
        for(Person p : people)
            System.out.printf("bmi: %.1f\n",p.bmi);
        //建立一個bmi陣列
        double [] bmis = new double[5];
        for(int i = 0; i < people.length; i++)
            bmis[i] = people[i].bmi;
        //印出bmis的資料
        System.out.println(Arrays.toString(bmis));
        //計算bmi cv
        double bmi_cv = MyMath.cv(bmis);
        System.out.printf("BMI CS 為 %.2f%%\n", bmi_cv*100);
    }
}