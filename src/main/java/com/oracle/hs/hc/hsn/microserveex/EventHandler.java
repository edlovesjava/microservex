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
public interface EventHandler<E extends Event> {
    boolean canHandle(E event);
    void handle(E event);
}
