package com.codewithmosh.part2oops;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // overloading
    // we can use it in JAVA to pass default arguments to methods
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Base salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return this.hourlyRate;
    }

}
