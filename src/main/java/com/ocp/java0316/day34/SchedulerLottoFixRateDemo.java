package com.ocp.java0316.day34;

// 頻率每隔 5 秒鐘開一次講

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerLottoFixRateDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            int delay = new Random().nextInt(3000); // 每次開獎所花費的時間
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            int n = new Random().nextInt(9) + 1;
            System.out.printf("開獎號碼: %d 搖獎花費時間: %.1f 開獎時間: %s\n", n, delay/10000.0, new Date());
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 初始 delay
        int intDelay = 0; //立即開獎
        // delay
        int delay = 5; // 設定開獎頻率
        service.scheduleWithFixedDelay(r, intDelay, delay, TimeUnit.SECONDS);
        
    }
}
