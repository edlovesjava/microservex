/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Accountability;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Party;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public class BaseAccountability<S extends Party,T extends Party> implements Accountability<S,T> {
    private Set<S> source;
    private Set<T> target;

    @Override
    public Set<S> getSource() {
        if (this.source == null) {
            this.source = new HashSet<S>();
        }
        return this.source;
    }

    @Override
    public Set<T> getTarget() {
        if (this.target == null) {
            this.target = new HashSet<T>();
        }
        return this.target;
    }

    @Override
    public void addSource(S source) {
        getSource().add(source);
    }

    @Override
    public void addTarget(T target) {
        getTarget().add(target);
    }
}
