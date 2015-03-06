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
public class RootAggregateTest {
    private static final Long TEST_ID = 1l;

    private EventPublisher<TestEvent> testEventPublisher;
    private Long testId;
    private TestAggregate testRootAggregate;


    public RootAggregateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testId = TEST_ID;
        testEventPublisher = new TestEventPublisher();
        testRootAggregate = new TestAggregate(testId, testEventPublisher);
        testRootAggregate.getEventPublisher().addHandler(new TestEventHandler("test handler 111"));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getEventPublisher method, of class RootAggregate.
     */
    @Test
    public void testGetEventPublisher() {
        System.out.println("getEventPublisher");
        EventPublisher expResult = testEventPublisher;
        EventPublisher result = testRootAggregate.getEventPublisher();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAggregateId method, of class RootAggregate.
     */
    @Test
    public void testGetAggregateId() {
        System.out.println("getAggregateId");
        Long expResult = testId;
        Long result = testRootAggregate.getAggregateId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHandleCommand() {
        TestCommand testCommand = new TestCommand("My Test command", 3.4);
        testRootAggregate.process(testCommand);
    }
    
    class TestAggCommandHandler implements CommandHandler<TestCommand, Object> {

        @Override
        public Object process(TestCommand command) {
            return "Handling commnand "+command.getCommandName() + " given args " + command.getArgs();
        }
    } 
}
