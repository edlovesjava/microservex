/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.types;

import com.oracle.hs.hc.hsn.microserveex.common.types.RoleType;

/**
 *
 * @author edlovesjava
 */
public class RoleTypeImpl implements RoleType {
    private String roleName;

    /**
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
