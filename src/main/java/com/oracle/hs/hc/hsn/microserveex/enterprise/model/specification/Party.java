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
public interface Party {
    PartyIdentity getPrimaryIdentity();
    Set<PartyIdentity> getIdentities();
    PartyContactEntry getPrimaryContactEntry();
    Set<PartyContactEntry> getContactEntries();
    <A extends Accountability> Set<A> getAccountableTo(Class<A> clazz);
    <A extends Accountability> Set<A> getAccountableFrom(Class<A> clazz);

    void addAccountableFrom(Accountability accountability);

    void addAccountableTo(Accountability accountability, Party target);

    void clearAccountableFrom();

    void clearAccountableTo();

    Set<Accountability> getAccountableFrom();

    Set<Accountability> getAccountableTo();
    
}
