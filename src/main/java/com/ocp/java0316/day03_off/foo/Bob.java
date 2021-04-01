package com.ocp.java0316.day03_off.foo;

import com.ocp.java0316.day03_off.bar.John;

public class Bob {
    public void print() {
        John john = new John();
        System.out.print("Bob: ");
        System.out.print(john.a + "\n");
        //System.out.print(john.b + "\n");
        //System.out.print(john.c + "\n");
        //System.out.print(john.d + "\n");
    }
}