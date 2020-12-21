package com.lithan.junitproject;

public class TechnicalEmployee extends Employee {
    protected int checkIn;

    public TechnicalEmployee(){

    }


    public TechnicalEmployee(String name){
        super(name, 75000);
        checkIn = 0;

    }


    @Override
    public String employeeStatus() {
        return super.toString() + " has " + checkIn + " successfull check ins";
    }

    public void setCheckIn(){
        checkIn++;
    }


}
