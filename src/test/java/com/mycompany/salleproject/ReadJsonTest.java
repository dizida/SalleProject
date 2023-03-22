/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.salleproject;

import java.util.ArrayList;
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
public class ReadJsonTest {
    
    public ReadJsonTest() {
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
     * Test of readEntree method, of class ReadJson.
     */
    @Test
    public void testReadEntree() {
        System.out.println("readEntree");
        ReadJson instance = new ReadJson();
        ArrayList expResult = null;
        ArrayList result = instance.readEntree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPlate method, of class ReadJson.
     */
    @Test
    public void testReadPlate() {
        System.out.println("readPlate");
        ReadJson instance = new ReadJson();
        ArrayList<Dish> expResult = null;
        ArrayList<Dish> result = instance.readPlate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDessert method, of class ReadJson.
     */
    @Test
    public void testReadDessert() {
        System.out.println("readDessert");
        ReadJson instance = new ReadJson();
        ArrayList expResult = null;
        ArrayList result = instance.readDessert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
