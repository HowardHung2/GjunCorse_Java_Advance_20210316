package com.ocp.java0316.day30_thread;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

// 匯率 https://financequotes-api.com/
/********************************
 * 1. 至網站將 MAVEN 複製至 pom.xml
 * 2. 將網站 SINGLE STOCK 複製至費率計算處 
 */
class Exchange implements Callable<Double> {

    @Override
    public Double call() throws Exception {
        Stock stock = YahooFinance.get("USDTWD=x"); // 將網站 SINGLE STOCK 複製至費率計算處 
        BigDecimal price = stock.getQuote().getPrice();
        return price.doubleValue();
    }
}

public class CallableDemo1 {

    public static void main(String[] args) throws Exception {
        double usd = 1000;
        // 換匯
        Exchange e = new Exchange();
        FutureTask<Double> task = new FutureTask<>(e);
        new Thread(task).start();
        // 取得回傳
        double rate = task.get();
        // 計算
        int ntd = (int) (usd * rate);
        System.out.printf("美金 $%.1f 可換 台幣 $%d 匯率: %.2f", usd, ntd, rate);
    }
}
