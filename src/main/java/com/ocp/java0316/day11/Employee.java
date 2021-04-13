package com.ocp.java0316.day11;

public class Employee {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
    
}
