package com.lithan.junitproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareEngineerTest {

    @Test
    void checkInCodeFalse() {
        SoftwareEngineer se = new SoftwareEngineer();
        boolean result = se.setCodeAccess(false);
        assertFalse(result);

    }

    @Test
    void checkInCodeTrue() {
        SoftwareEngineer se = new SoftwareEngineer();
        boolean results = se.setCodeAccess(true);
        assertTrue(results);
    }










}