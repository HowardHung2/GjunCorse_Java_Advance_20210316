package com.ocp.java0316.day11;

public class Manager extends Employee{
    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Manager{" + "budget=" + budget + ", salary=" + getSalary() + '}';
    }
}
