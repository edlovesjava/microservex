/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.types;

import java.time.Instant;

/**
 *
 * @author edlovesjava
 */
public class TimeInterval {
    private Instant startTime;
    private Instant endTime;
    
    public Instant getStartTime() {
        return this.startTime;
    }
    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Instant getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }
    
    
}
