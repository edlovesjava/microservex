/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edlovesjava
 */
class TestEventPublisher<T> implements EventPublisher<TestEvent> {

    List<EventHandler<TestEvent>> handlers;

    TestEventPublisher() {
        handlers = new ArrayList<EventHandler<TestEvent>>();
    }

    @Override
    public void publish(TestEvent event) {

        for (EventHandler<TestEvent> handler : handlers) {
            handler.handle(event);
        }
    }

    @Override
    public void addHandler(EventHandler<TestEvent> eventHandler) {

        this.handlers.add(eventHandler);
    }
}
