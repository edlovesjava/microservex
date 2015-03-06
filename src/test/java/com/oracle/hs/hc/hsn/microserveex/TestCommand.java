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
public class TestCommand implements Command<Double> {
    private Double args;
    private String commandName;
    
    TestCommand(String commandName) {
        this(commandName, null);
    }
    TestCommand(String commandName, Double args) {
        this.commandName = commandName;
        this.args = args;
    }
    
    @Override
    public Double getArgs() {
        return this.args;
    }

    /**
     * @return the commandName
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * @param commandName the commandName to set
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
    
}
