package com.workintech.Company;

public class SeniorDev extends Employee{
    public SeniorDev(long id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        setSalary(85000);
        System.out.println(getName() + " started working as SeniorDev..");
    }
}
