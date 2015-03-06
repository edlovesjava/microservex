/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import java.math.BigDecimal;

/**
 *
 * @author edlovesjava
 */
public final class TestEvent implements Event {
    private final BigDecimal value;

    public TestEvent(double value) {
        this.value = BigDecimal.valueOf(value);
    }
    public TestEvent(BigDecimal value) {
        this.value = value;
    }
    /**
     * @return the change
     */
    public BigDecimal getValue() {
        return value;
    }
    
}
