package com.lithan.junitproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTest {

    @Test
    void approveBonusFalse() {
        Accountant acc = new Accountant();
        boolean result = acc.approveBonus(20000000);
        assertFalse(result);
        
    }

    @Test
    void approveBonusTrue() {
        Accountant acc = new Accountant();
        boolean results = acc.approveBonus(0);
        assertTrue(results);
    }
}