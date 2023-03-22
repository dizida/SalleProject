/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.salleproject;

import javax.swing.JSpinner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarkissian
 */
public class MySpinnerTest {
    
    public MySpinnerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of resetJSpinner method, of class MySpinner.
     */
    @Test
    public void testResetJSpinner() {
        System.out.println("resetJSpinner");
        JSpinner sp = null;
        MySpinner instance = null;
        instance.resetJSpinner(sp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDish method, of class MySpinner.
     */
    @Test
    public void testGetDish() {
        System.out.println("getDish");
        MySpinner instance = null;
        Dish expResult = null;
        Dish result = instance.getDish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
