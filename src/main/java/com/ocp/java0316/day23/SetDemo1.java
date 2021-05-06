package com.ocp.java0316.day23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set subjects1 = new HashSet(); // 無序，透過此法會自動轉為物件(將基本型別也會改回原先的 如int 改為 integer)
        subjects1.add("國");
        subjects1.add("英");
        subjects1.add("數");
        System.out.println(subjects1);
        
        Set subjects2 = new LinkedHashSet(); // 有序
        subjects2.add("國");
        subjects2.add("英");
        subjects2.add("數");
        System.out.println(subjects2);
        
        // 走訪每一個元素
        Set subjects3 = new LinkedHashSet(); 
        subjects3.add("國"); // String
        subjects3.add("英"); // String
        subjects3.add(null); // null
        subjects3.add("數"); // String
        subjects3.add(100); //Intger
        subjects3.add(200); //Intger
        System.out.println(subjects3);
        Iterator iter = subjects3.iterator();
        System.out.println(iter.next() + ", " + iter.hasNext()); //  .next()自動儲存此筆元素位置下次輸入下筆元素
        System.out.println(iter.next() + ", " + iter.hasNext()); // .hasNext() 回傳boolean值，表示是否有下一個元素
        System.out.println(iter.next() + ", " + iter.hasNext()); 
        System.out.println(iter.next() + ", " + iter.hasNext()); 
        System.out.println(iter.next() + ", " + iter.hasNext()); 
        // 透過迴圈列印出每個元素
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next == null) {
                iter.remove();
                continue; // 已經移除，所以無需再執行下面的迴圈以提升效率
            }
            if (next instanceof Integer) {
                iter.remove();
            }
            if ((Integer)next == 100) {
                iter.remove();
            }
        }
        System.out.println(subjects3);
    }
}
