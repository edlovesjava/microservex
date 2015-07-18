/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.types;

import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public class TypedValue {

    /**
     * @return the type
     */
    public ValueType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ValueType type) {
        this.type = type;
    }

    /**
     * @return the cardinality
     */
    public ValueCardinality getCardinality() {
        return cardinality;
    }

    /**
     * @param cardinality the cardinality to set
     */
    public void setCardinality(ValueCardinality cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * @return the values
     */
    public Set getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(Set values) {
        this.values = values;
    }
    public enum ValueType {
        integerNumber, realNumber, text, date, range, valueSet
    }
    public enum ValueCardinality {
        single, multiple
    }
    private ValueType type;
    private ValueCardinality cardinality;
    private Set values;
    
    
}
