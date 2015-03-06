/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification;

import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public interface Organization extends Party {

    /**
     * @return the location
     */
    Location getPrimaryLocation();
    
    Set<Location> getLocations();

    /**
     * @return the name
     */
    String getName();

    /**
     * @return the orgCode
     */
    String getOrgCode();

    /**
     * @return the parentOrgCode
     */
    String getParentOrgCode();
    
}
