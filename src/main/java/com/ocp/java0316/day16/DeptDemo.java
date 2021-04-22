package com.ocp.java0316.day16;

public class DeptDemo {
    public static void main(String[] args) {
        //方法一
        Dept dept = new Dept();
        Dept.Stuff stuff = dept.new Stuff();
        stuff.job();
        //方法二
        Dept.Stuff stuff2 = new Dept().new Stuff();
        stuff2.job();
        //方法三
        new Dept().new Stuff().job();
    }
}