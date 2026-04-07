/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.carlycatering;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tylertinka
 */
public class CateringServicesTest {
    /*
    assertations
    1. assertEquals -> expected, actual | Pass if both are equals.
    2. assertTrue -> Pass if method returns true.
    3. asserFalse -> Pass if method returns False.
    4. assertNotEquals -> expected, actual | Pass if both are NOT equals.
 
    */
    
    
    CateringServices env = new CateringServices("Asus", 90);
    public CateringServicesTest() {
    }

    @Test
    public void testGetCode() {
    }

    @Test
    public void testGenBookingCode() {
    }

    @Test
    public void testGuests() {
    }

    @Test
    public void testGensitNumber() {
    }

    @Test
    public void testSum2num() {
        int expected = 15;
        int actual = env.sum2num(7, 8);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsCapps() {
        assertTrue(env.isCapps('D'));
    }
    
    @Test
    public void testIsCappsFail() {
        assertTrue(env.isCapps('d'));
    
    }  
}
