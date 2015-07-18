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
public class RelatedBy<R extends RelationshipType, T extends Object> {
    private R relationshipType;
    private T relatedConept;

    /**
     * @return the relationshipType
     */
    public R getRelationshipType() {
        return relationshipType;
    }

    /**
     * @param relationshipType the relationshipType to set
     */
    public void setRelationshipType(R relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * @return the relatedConept
     */
    public T getRelatedConept() {
        return relatedConept;
    }

    /**
     * @param relatedConept the relatedConept to set
     */
    public void setRelatedConept(T relatedConept) {
        this.relatedConept = relatedConept;
    }
}
