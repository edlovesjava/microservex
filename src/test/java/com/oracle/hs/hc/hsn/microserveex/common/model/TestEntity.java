/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model;

import com.oracle.hs.hc.hsn.microserveex.common.model.impl.AuditableIdentityImpl;
import com.oracle.hs.hc.hsn.microserveex.common.model.impl.AuditableBaseEntity;

/**
 *
 * @author edlovesjava
 */
public class TestEntity extends AuditableBaseEntity<Long> {

    public TestEntity(java.lang.Long id) {
        super(id);
    }

    public TestEntity(java.lang.Long id, AuditableIdentityImpl creator) {
        super(id, creator);
    }

    
}
