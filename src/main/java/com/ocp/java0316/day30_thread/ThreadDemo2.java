/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.java0316.day30_thread;

class Race implements Runnable{

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        for(int i=1; i <= 1000; i++){
            System.out.printf("%s 跑了 %d 步\n", tname, i);
        }
    }
    
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread rabbit = new Thread(new Race(), "兔子");
        Thread turtle = new Thread(new Race());
        turtle.setName("烏龜");
        rabbit.setPriority(Thread.MIN_PRIORITY); // 設定權限大小(最大值為10, 最小值為1)
        turtle.setPriority(Thread.MAX_PRIORITY); // 在11次(rabbit的權限 1 + turtle的權限為 10)當中, 兔子每次實施1次, 烏龜每次實施10次
        System.out.println(rabbit.getPriority());
        System.out.println(turtle.getPriority());
        rabbit.start();
        turtle.start();
    }
}
