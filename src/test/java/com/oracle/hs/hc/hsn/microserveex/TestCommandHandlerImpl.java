/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;


public class TestCommandHandlerImpl implements TestCommandHandler {
    

    @Override
    public Double process(TestCommand command) {
        String message = "Handling test command "+command.getCommandName() + " with args "+ command.getArgs();
        System.out.println(message);
        return command.getArgs() * 10;
    }
    
}
