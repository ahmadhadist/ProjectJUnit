package com.lithan.junitproject;

public class BusinessEmployee extends Employee{

    protected double bonusBudget;


    public BusinessEmployee(){

    }

    public BusinessEmployee(String name){
        super(name, 50000);
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    @Override
    public String employeeStatus() {
        return super.toString() + " with a budget of " + bonusBudget;
    }


}
