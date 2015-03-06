/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.impl;

import com.oracle.hs.hc.hsn.microserveex.common.model.specification.Auditable;
import com.oracle.hs.hc.hsn.microserveex.common.model.specification.Versionable;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 *
 * @author edlovesjava
 */
public abstract class AuditableBaseEntity<ID extends Serializable> extends BaseEntity<ID> implements Auditable<AuditableIdentityImpl>, Versionable {

    private AuditableIdentityImpl createdBy;
    private AuditableIdentityImpl modifiedBy;
    private Instant effectiveTo;
    private Instant effectiveFrom;
    private java.lang.Long version;
    private Instant createdOn;
    private Instant modifiedOn;

    public AuditableBaseEntity(ID id) {
        this(id, AuditableIdentityImpl.getSystemIdentity());
    }

    public AuditableBaseEntity(ID id, AuditableIdentityImpl creator) {
        super(id);
        createAuditable(creator);
        initializeVersion();
    }

    @Override
    public AuditableIdentityImpl getCreatedBy() {
        return createdBy;
    }

    @Override
    public AuditableIdentityImpl getModifiedBy() {
        return modifiedBy;
    }

    @Override
    public Instant getCreatedOn() {
        return createdOn;
    }

    @Override
    public Instant getModifiedOn() {
        return modifiedOn;
    }

    @Override
    public java.lang.Long getVersion() {
        return version;
    }

    @Override
    public Instant getEffectiveFrom() {
        return effectiveFrom;
    }

    @Override
    public Instant getEffectiveTo() {
        return effectiveTo;
    }


    @Override
    public void retireAuditable() {
        this.effectiveTo = Instant.now();
    }

    @Override
    public boolean isRetired() {
        return this.effectiveTo == null;
    }
    
    @Override
    public boolean isNew() {
        return this.modifiedOn == null;
    }

    @Override
    public final void createAuditable(AuditableIdentityImpl creator) {
        this.createdOn = Instant.now();
        this.modifiedOn = null;
        this.createdBy = (AuditableIdentityImpl) creator;
        this.effectiveFrom = Instant.now();
        this.effectiveTo = null;

    }

    @Override
    public void updateAuditable(AuditableIdentityImpl updatedBy) {
        this.modifiedBy = updatedBy;
        this.modifiedOn = Instant.now();
        updateVersion();
    }

    @Override
    public final void initializeVersion() {
        this.version = 1l;
    }

    @Override
    public void updateVersion() {
        this.version = this.version + 1;

    }
}
