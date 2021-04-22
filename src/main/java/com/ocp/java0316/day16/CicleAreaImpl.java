package com.ocp.java0316.day16;

public class CicleAreaImpl implements CircleArea{
    
    @Override
    public double getArea(double r) {
        return r * r * Math.PI;
    }
    
}
