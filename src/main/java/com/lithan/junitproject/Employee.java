package com.lithan.junitproject;

public abstract class Employee {
    protected String name;
    protected double baseSalery;
    protected int EmployeeID;
    protected Employee manager;
    protected int headCount;
    protected double bonus;
    protected Accountant accountantSupport;
    private static int countID;



    public Employee(){

    }

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalery = baseSalary;
        countID++;
        this.EmployeeID = countID;


    }


    public String getName() {
        return name;
    }

    public double getBaseSalery() {
        return baseSalery;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Accountant getAccountantSupport() {
        return accountantSupport;
    }

    public void setAccountantSupport(Accountant accountantSupport) {
        this.accountantSupport = accountantSupport;
    }

    public boolean equals(Employee other) {
        if (this.EmployeeID==other.EmployeeID){
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        return EmployeeID + " " + name;
    }

    public abstract String employeeStatus();
}
