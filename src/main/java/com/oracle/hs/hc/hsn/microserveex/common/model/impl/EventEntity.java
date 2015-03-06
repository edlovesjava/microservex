/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.impl;

import com.oracle.hs.hc.hsn.microserveex.common.model.specification.ResourceIdentifier;
import com.oracle.hs.hc.hsn.microserveex.common.model.specification.ResourceIdentifierOrValue;

/**
 *
 * @author edlovesjava
 */
public class EventEntity extends AuditableBaseEntity<Long> {
    static long sequence = 1;
    
    private ResourceIdentifier idResource;
    private String relation;
    private ResourceIdentifierOrValue object;
    
    public EventEntity() {
        this(sequence++);
    }
    public EventEntity(java.lang.Long id) {
        super(id);
    }

    /**
     * @return the idResource
     */
    public ResourceIdentifier getIdResource() {
        return idResource;
    }

    /**
     * @param idResource the idResource to set
     */
    public void setIdResource(ResourceIdentifier idResource) {
        this.idResource = idResource;
    }

    /**
     * @return the relation
     */
    public String getRelation() {
        return relation;
    }

    /**
     * @param relation the relation to set
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * @return the object
     */
    public ResourceIdentifierOrValue getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(ResourceIdentifierOrValue object) {
        this.object = object;
    }
    
}
