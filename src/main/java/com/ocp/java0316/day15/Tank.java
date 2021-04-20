package com.ocp.java0316.day15;

public class Tank extends Car implements Weapon, Oil{

    @Override
    void move() {
        System.out.println("用腹帶走");
    }

    @Override
    public void shoot() {
        System.out.println("彈");
    }

    @Override
    public int spend() {
        return 300;
    }
    
    
}
