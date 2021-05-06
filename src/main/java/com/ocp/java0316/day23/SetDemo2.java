package com.ocp.java0316.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 國英數的分數是介於0-100之間
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);
        System.out.println(scores);
        Iterator iter = scores.iterator();
        
        // 列印出合法成績 方法一
        System.out.println("= = = = 方法一 = = = =");
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Integer) {
                int score = (Integer)next;
                if (!(score <= 100 && score >= 0)) { // ! 表示相反
                    iter.remove();
                }
            }
            else{
                iter.remove();
            }
        }
        System.out.println(scores);
        
        // 列印出合法成績 方法二(自己寫的)
        System.out.println("= = = = 方法二 = = = =");
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Double || next instanceof Boolean) {
                iter.remove();
                continue;
            }
            if ((Integer)next > 100 || (Integer)next < 0) {
                iter.remove();
            }
        }
        System.out.println(scores);
        
        System.out.println("= = = = 求總分 = = = =");
        // 求總分
        int sum = 0;
        iter = scores.iterator(); // 重新取得走訪器
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer){
                sum += (Integer)next;
            }
        }
        System.out.println("總分為" + sum);
    }
}