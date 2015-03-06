/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.impl;

import com.oracle.hs.hc.hsn.microserveex.common.model.specification.AuditableIdentity;
import java.util.Objects;

/**
 *
 * @author edlovesjava
 */
public class AuditableIdentityImpl implements AuditableIdentity<String> {

    public final static String BASE_IDENTITY = "system";
    private String value;
    private static AuditableIdentityImpl systemIdentity = new AuditableIdentityImpl(BASE_IDENTITY);

    public static AuditableIdentityImpl getSystemIdentity() {
        return systemIdentity;
    }

    private AuditableIdentityImpl(String value) {
        this.value = value;
    }

    @Override
    public String valueOf() {
        return this.value;
    }

    @Override
    public String toString() {
        return "BaseIdentity{" + "value=" + value + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AuditableIdentityImpl other = (AuditableIdentityImpl) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }

}
