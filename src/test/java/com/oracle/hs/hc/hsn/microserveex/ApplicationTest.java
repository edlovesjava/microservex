/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author edlovesjava
 */
public class ApplicationTest {
    
    public ApplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testArgs = new String[]{"one","two"};
        app = new Application(testArgs);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMainRun() {

        assertNotNull(app.getArgs());
    }
    
    @Test 
        
    public void testCreateEventStore() {
        EventStore eventStore = app.getEventStore();
        assertNotNull(eventStore);
        assertEquals(eventStore, app.getEventStore());
    }
    
    public void testAddEventToEventStore() {
        EventStore eventStore = app.getEventStore();
        assertNotNull(eventStore);
        
    }
    private Application app;
    private String[] testArgs;

    
}
