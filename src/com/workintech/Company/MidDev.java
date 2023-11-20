package com.workintech.Company;

public class MidDev extends Employee{
    public MidDev(long id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        setSalary(60000);
        System.out.println(getName() + " started working as Mid Developer.");
    }
}
