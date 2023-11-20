package com.workintech.Company;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDev[] juniors;
    private MidDev[] mids;
    private SeniorDev[] seniors;

    public HRManager(long id, String name, JuniorDev[] juniors,
                     MidDev[] mids, SeniorDev[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    @Override
    public void work(){
        setSalary(100000);
        System.out.println(getName() + " HR Manager starts working.");
    }

    public void addEmployee(int index, JuniorDev junior){
        try {
            if(juniors[index] == null){
                juniors[index] = junior;
            } else {
                System.out.println("Index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found. " + index);
        }

    }

    public void addEmployee(int index, MidDev mid){
        try {
            if(mids[index] == null) {
                mids[index] = mid;
            } else {
                System.out.println("Index is full.");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found. " + index);
        }
    }

    public void addEmployee(int index, SeniorDev senior){
        try {
            if(seniors[index] == null){
                seniors[index] = senior;
            } else {
                System.out.println("Index is full. " + index);
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found. " + index);
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) +
                '}';
    }
}
