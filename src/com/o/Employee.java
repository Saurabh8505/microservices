package com.o;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary(); 
}


class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class SalaryCalculator {
    public static void printSalary(Employee employee) {
        System.out.println(employee.name + "'s Salary: " + employee.calculateSalary());
    }
}