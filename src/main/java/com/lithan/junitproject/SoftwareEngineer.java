package com.lithan.junitproject;

public class SoftwareEngineer extends TechnicalEmployee {

    protected boolean codeAccess;

    public SoftwareEngineer(){

    }

    public SoftwareEngineer(String name){
        super(name);
        codeAccess = true;
        checkIn = 0;

    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public boolean setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;

        return codeAccess;
    }

    public int getSuccessfulCheckIns(){
        return checkIn;
    }

    public boolean checkInCode(){
        TechnicalLead manager = (TechnicalLead) this.getManager();
        if (manager.approveCheckIn(this)){
            this.checkIn++;
            return true;
        }else {
            codeAccess = false;
            return false;
        }
    }
}
