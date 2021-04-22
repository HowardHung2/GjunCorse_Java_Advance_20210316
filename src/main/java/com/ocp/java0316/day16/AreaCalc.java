package com.ocp.java0316.day16;

public class AreaCalc {
    public static void main(String[] args) {
        
        double r = 15.1;
        CircleArea ca = new CicleAreaImpl();
        System.out.println(ca.getArea(r));
        
        //匿名內部類別(圓面積)
        CircleArea ca2 = new CircleArea(){
            @Override
            public double getArea(double r){
                return r*r*Math.PI;
            }
        }; //{}表示實作 {輸入實作方法}內輸入實作方法
        System.out.println(ca2.getArea(r));
        
        //匿名內部類別(圓體積)
        CircleArea ca3 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return Math.pow(r, 3) * 4.0 / 3 * Math.PI;
            }
        };
        System.out.println(ca3.getArea(r));
    }
}
