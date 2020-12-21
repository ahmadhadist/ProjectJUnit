package com.lithan.junitproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLeadTest {

    @Test
    void requestBonusFalse() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        BusinessLead bl = new BusinessLead();
        boolean request = bl.requestBonus(softwareEngineer, 20000000);
        assertFalse(request);

    }

    @Test
    void requestBonusTrue() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        BusinessLead bl = new BusinessLead();
        boolean request = bl.requestBonus(softwareEngineer, 0);
        assertTrue(request);

    }


}