/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import com.oracle.hs.hc.hsn.microserveex.common.model.TestEntity;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author edlovesjava
 */
public class EventStoreTest {
    
    private EventStore<Long, TestEvent> instance;
    

    public EventStoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = EventStore.createEventStore();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of createEventStore method, of class EventStore.
     */
    @Test
    public void testCreateEventStore() {
        System.out.println("createEventStore");

        EventStore<Long, TestEvent> result = EventStore.createEventStore();
        assertNotNull(result);

    }
    
    /**
     * Test of getStore method, of class EventStore.
     */

    
    @Test
    public void testAddEventToEventStore() {
        TestEvent newEvent = new TestEvent(3.45) ;
        TestEntity newEntity = new TestEntity(1l);
        instance.addEvent(newEntity.getId(),newEvent);
        for(Event event : instance.findEvents(newEntity.getId())) {
            if (event.equals(newEvent)) {
                return;
            }
        }
        fail();
    }
    
    @Test
    public void testFindEventsByEntityId() {
        Long entityId = 1l;
        TestEvent newEvent = new TestEvent(3.45) ;
        TestEvent newEvent2 = new TestEvent(3.46) ;
        TestEvent newEvent3 = new TestEvent(3.47) ;
        TestEntity newEntity = new TestEntity(1l);
        TestEntity newEntity2 = new TestEntity(2l);
        instance.addHandler(new TestEventHandler("handler1"));
        instance.addHandler(new TestEventHandler("handler2"));
        instance.addEvent(newEntity.getId(),newEvent);
        instance.addEvent(newEntity.getId(),newEvent2);
        instance.addEvent(newEntity2.getId(),newEvent3);
        
        List<TestEvent> events = instance.findEvents(entityId);
        for(TestEvent event : events) {
            System.out.println("entity Long "+entityId + " event "+event.getValue());
        }
    }
    
    
    @Test
    public void testAggregateCreationWithAnEventPublisher() {
        RootAggregate<Long, TestEvent> agg = new TestAggregate.Builder(1l).build();
        assertEquals(Long.valueOf(1),agg.getAggregateId());
        TestEventHandler handler = new TestEventHandler("handler1");
        agg.getEventPublisher().addHandler(handler);
        
        TestEvent e1 = new TestEvent(3.2);
        agg.getEventPublisher().publish(e1);
        
        
    }
    
    
}
