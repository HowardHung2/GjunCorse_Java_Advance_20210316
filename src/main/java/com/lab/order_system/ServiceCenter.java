package com.lab.order_system;

import java.util.Set;

public class ServiceCenter {
    private Set<Food> catalog = new DataCenter().getCatalog();
    //根據 no 查找 food
    public Food getFoodByNo(int no){
        return catalog.stream()
                .filter(f -> f.getNo() == no)
                .findFirst() // 找到第一個
                .get(); // 取得
    }
    // 檢視 Catalog
    public void printCatalog(){
        System.out.println("訂單列表");
        System.out.println("+--+--------+----+-----+");
        System.out.println("|No|  品名  |尺寸|Price|");
        for(Food food : catalog){
            System.out.printf("|%2d|%s| %c|%5d|\n"
                    , food.getNo(), food.getName(), food.getSize(), food.getPrice());
        }
    }
    // 檢視系統 menu 
    public void menu(){
        System.out.println("系統項目");
        System.out.println("--------------------");
        System.out.println("1. 檢視 Catalog");
        System.out.println("2. 新增訂單餐點");
        System.out.println("3. 查詢訂單餐點");
        System.out.println("4. 取消訂單餐點");
        System.out.println("5. 刪除全部訂單");
        System.out.println("6. 結帳");
        System.out.println("0. 離開");
    }
}
