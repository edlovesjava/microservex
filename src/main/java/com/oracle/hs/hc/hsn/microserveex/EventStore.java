/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author edlovesjava
 */
public class EventStore<K,E extends Event> implements EventPublisher<E> {

    private Set<EventHandler> handlers;

    public static EventStore createEventStore() {
        return new EventStore();
    }
    
    private final Map<K,List<E>> store;
    
    private EventStore() {
        store = new HashMap<K,List<E>>();
    }

    /**
     * @return the store
     */
    public Map<K,List<E>> getStore() {
        return store;
    }
    
    public EventStore addEvent(K entityId, E newEvent) {
        List<E> events = findEvents(entityId);
        if (events == null) {
            events = new ArrayList<E>();
            getStore().put(entityId, events);
        }
        events.add(newEvent);
        publish(newEvent);
        return this;
        
    }

    List<E> findEvents(K entityId) {
        return getStore().get(entityId);
        
    }

    @Override
    public void addHandler(EventHandler<E> handler) {
        if (handlers == null) handlers = new HashSet<EventHandler>();
        handlers.add(handler);
    }
    
    @Override
    public void publish(E event) {
        
        if (handlers != null) {
            for(EventHandler<E> handler : handlers) {
                if (handler.canHandle(event)) {
                    handler.handle(event);
                }
            }
        }
    }

}
