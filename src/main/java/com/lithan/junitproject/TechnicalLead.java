package com.lithan.junitproject;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee{

    protected ArrayList<SoftwareEngineer> team;
    protected String teamStatus;

    public TechnicalLead(){

    }

    public TechnicalLead(String name){
        super(name);
        this.baseSalery = getBaseSalery() * 1.3;
        headCount = 4;
        this.team = new ArrayList<SoftwareEngineer>();

    }


    public boolean hasHeadCount(){
        if (team.size()<headCount){
            return true;
        }else {
            return false;
        }
    }

    public boolean addReport(SoftwareEngineer e){
        if (hasHeadCount()){
            team.add(e);
            e.setManager(this);
            return true;
        }else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        if (e.getManager().equals(this) && e.getCodeAccess()){
            return true;
        }else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus){
        BusinessLead businessLead= (BusinessLead)getAccountantSupport().getManager();
        if (businessLead.approveBonus(e, bonus)){
            return true;
        } else {
            return false;
        }
    }

    public String getTeamStatus() {
        if (team.size() == 0) {
            return this.employeeStatus() + " and no direct reports yet";
        } else {
            String teamStatus="";
            for (int i = 0; i < team.size(); i++){
                teamStatus += ("  " + team.get(i).employeeStatus() + "\n");
            }
            return this.employeeStatus() + " and is managing: \n" + teamStatus;
        }

    }
}
