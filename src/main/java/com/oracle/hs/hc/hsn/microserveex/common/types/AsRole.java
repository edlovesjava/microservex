/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.types;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public class AsRole<R extends RoleType,T> {
    private Set<R> role;
    private T subject;

    /**
     * @return the role
     */
    public Set<R> getRole() {
        if (role == null) {
            role = new HashSet<R>();
        }
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Set<R> role) {
        this.role = role;
    }

    /**
     * @return the subject
     */
    public T getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(T subject) {
        this.subject = subject;
    }
}
