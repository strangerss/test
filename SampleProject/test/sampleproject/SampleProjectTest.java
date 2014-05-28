/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sampleproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k_imaizumi
 */
public class SampleProjectTest {
    
    public SampleProjectTest() {
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
     * Test of getMsg method, of class SampleProject.
     */
    @Test
    public void testGetMsg() {
        System.out.println("getMsg");
        String expResult = "test message";
        String result = SampleProject.getMsg();
        assertEquals(expResult, result);
    }
    
}
