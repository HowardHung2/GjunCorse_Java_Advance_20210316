package com.ocp.java0316.day31_thread;

public class Cookies {
    private boolean empty = true; // 盤子
    public synchronized void eat(int i){
        while(empty == true){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 小狗開吃
        System.out.printf("小狗吃了第 %d 塊餅乾\n", i);
        // 吃完之後
        empty = true; //盤子變空
        notifyAll(); // 呼叫主人
    }
    public synchronized void put(int i){
        while(empty == false){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 主人放飯
        System.out.printf("主人放了第 %d 塊餅乾\n", i);
        // 主人放完後
        empty = false; // 盤子非空
        notifyAll(); // 呼叫小狗
    }
}
