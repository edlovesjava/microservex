/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author edlovesjava
 */
public class CommandHandlerTest {
    
    public CommandHandlerTest() {
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
     * Test of process method, of class CommandHandler.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        TestCommand command = new TestCommand("Command1", 3.3);
        TestCommandHandler instance = new TestCommandHandlerImpl();
        double expResult = 33.0;
        double result = instance.process(command);
        assertEquals(expResult, result, 0.1);

    }


    
}
