/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Accountability;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Party;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyContactEntry;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyIdentity;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public  class BaseParty implements Party {
    private Set<PartyContactEntry> contactEntries;
    private PartyContactEntry primaryContactEntry;
    private Set<PartyIdentity> identities;
    private PartyIdentity primaryIdentity;
    private Set<Accountability> accountableFrom;
    private Set<Accountability> accountableTo;

    @Override
    public PartyIdentity getPrimaryIdentity() {
        return this.primaryIdentity;
    }

    @Override
    public Set<PartyIdentity> getIdentities() {
        return this.identities;
    }

    @Override
    public PartyContactEntry getPrimaryContactEntry() {
        return this.primaryContactEntry;
    }

    @Override
    public Set<PartyContactEntry> getContactEntries() {
        return this.contactEntries;
    }

    /**
     * @param contactEntries the contactEntries to set
     */
    public void setContactEntries(Set<PartyContactEntry> contactEntries) {
        this.contactEntries = contactEntries;
    }

    /**
     * @param primaryContactEntry the primaryContactEntry to set
     */
    public void setPrimaryContactEntry(PartyContactEntry primaryContactEntry) {
        this.primaryContactEntry = primaryContactEntry;
    }

    /**
     * @param identities the identities to set
     */
    public void setIdentities(Set<PartyIdentity> identities) {
        this.identities = identities;
    }

    /**
     * @param primaryIdentity the primaryIdentity to set
     */
    public void setPrimaryIdentity(PartyIdentity primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @Override
    public <A extends Accountability> Set<A> getAccountableTo(Class<A> clazz) {
        Set<A> accountabilitySet = (Set<A>) getAccountableTo();
        return getFilteredAccountability(accountabilitySet, clazz);
        
    }

    @Override
    public <A extends Accountability> Set<A> getAccountableFrom(Class<A> clazz) {
        Set<A> accountabilitySet = (Set<A>) getAccountableFrom();
        return getFilteredAccountability(accountabilitySet, clazz);    
    }

    @Override
    public Set<Accountability> getAccountableFrom() {
        if (accountableFrom == null) {
            accountableFrom = new HashSet<Accountability>();
        }
        return accountableFrom;
    }
    
    @Override
    public Set<Accountability> getAccountableTo() {
        if (accountableTo == null) {
            accountableTo = new HashSet<Accountability>();
        }
        return accountableTo;
    }
    
    @Override
    public void clearAccountableFrom() {
        getAccountableFrom().clear();
    }
    
    @Override
    public void clearAccountableTo() {
        getAccountableTo().clear();
    }
    
    @Override
    public void addAccountableFrom(Accountability accountability) {
        getAccountableFrom().add(accountability);

    }

    @Override
    public void addAccountableTo(Accountability accountability, Party target) {
        getAccountableTo().add(accountability);
        accountability.addSource(this);
        accountability.addTarget(target);
    }
    
    private <A extends Accountability> Set<A> getFilteredAccountability(Set<A> accoutabilities, Class<A> accountabilityType) {
        Set<A> filteredResult = new HashSet<A>();
        for (A candidate : accoutabilities) {
            if (accountabilityType.isAssignableFrom(candidate.getClass())) {
                filteredResult.add(candidate);
            }
        }
        return filteredResult;
    }

    
}
