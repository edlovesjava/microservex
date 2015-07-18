/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.types;

/**
 *
 * @author edlovesjava
 */
public class ContinuousRange<T> {
    private final T fromValue;
    private final T toValue;
    
    public ContinuousRange(T fromValue, T toValue) {
        this.fromValue = fromValue;
        this.toValue = toValue;
    }
    
    public T getFromValue() {
        return this.fromValue;
    }
    public T getToValue() {
        return this.toValue;
    }
}
