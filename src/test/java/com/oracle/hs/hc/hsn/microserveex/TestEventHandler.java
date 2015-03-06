/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

/**
 *
 * @author edlovesjava
 */
class TestEventHandler implements EventHandler<TestEvent> {
    private final String name;

    TestEventHandler(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public void handle(TestEvent event) {
        System.out.println("Handler " + getName() + " handling event " + event.getValue());
    }

    @Override
    public boolean canHandle(TestEvent event) {
        return true;
    }
    
}
