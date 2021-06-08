package com.ocp.java0316.day33_executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lotto implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10));
            int num = new Random().nextInt(100);
            System.out.println(num);
        } catch (Exception e) {
        }
    }
    
    
}

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        System.out.println("請給我10組 Lotto 數字");
        ExecutorService service = Executors.newCachedThreadPool();
        // ExecutorService service = Executors.newFixedThreadPool(10); //()內輸入最多執行緒為何 目前最多執行緒為10
        for (int i = 0; i < 100; i++) {
            service.submit(new Lotto());
        }
        System.out.printf("Thread count: %d \n", Thread.activeCount());
        service.shutdown();
    }
}
