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
public class FloatValueRange<T> extends ContinuousRange<Float>{
    FloatValueRange(Float fromValue, Float toValue) {
        super(fromValue, toValue);
    }
}
