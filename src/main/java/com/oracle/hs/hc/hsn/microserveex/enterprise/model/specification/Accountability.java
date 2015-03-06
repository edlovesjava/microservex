/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Party;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public interface Accountability<S extends Party, T extends Party> {
    Set<S> getSource();
    Set<T> getTarget();
    void addSource(S source);
    void addTarget(T target);
    
}
