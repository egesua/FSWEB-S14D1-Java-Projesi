package com.workintech.Company;

public class JuniorDev extends Employee{
    public JuniorDev (long id, String name) {
        super(id,name);
    }
    @Override
    public void work(){
        setSalary(45000);
        System.out.println(getName() + " has started working as junior developer.");
    }
}
