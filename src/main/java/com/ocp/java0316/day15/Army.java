package com.ocp.java0316.day15;

import java.util.stream.Stream;

public class Army {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        
        Car[] cars = {tank, truck};
        Weapon[] weapons = {fighter, tank};
        
        Stream.of(cars).forEach(c -> c.move());
        Stream.of(weapons).forEach(w -> w.shoot());
        
        // 請問fighter, tank, trunk總油耗 = ?
        Oil[] oil = {fighter, tank, truck};
        int sum = Stream.of(oil)
                .mapToInt(o -> o.spend()) // Oil::spend
                .sum();
        System.out.println(sum);
    }
}
