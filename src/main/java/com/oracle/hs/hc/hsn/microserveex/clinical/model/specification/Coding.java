/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification;

/**
 *
 * @author edlovesjava
 */
public class Coding<C extends CodeSystem> {
    private ClinicalCode code;
    private C system;

    /**
     * @return the code
     */
    public ClinicalCode getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(ClinicalCode code) {
        this.code = code;
    }

    /**
     * @return the system
     */
    public C getSystem() {
        return system;
    }

    /**
     * @param system the system to set
     */
    public void setSystem(C system) {
        this.system = system;
    }

}
