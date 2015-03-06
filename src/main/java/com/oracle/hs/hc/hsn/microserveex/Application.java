package com.oracle.hs.hc.hsn.microserveex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edlovesjava
 */
public class Application {
    private final String[] args;
    private EventStore eventStore;

    public Application() {
        this(null);
    }
    
    public Application(String[] args) {
        this.args = args;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting!");
    }

    /**
     * @return the args
     */
    public String[] getArgs() {
        return args;
    }

    EventStore getEventStore() {
        
        if (eventStore == null) eventStore = EventStore.createEventStore();
        return eventStore;
    }


    
}
