/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.specification;

import java.io.Serializable;

/**
 *
 * @author edlovesjava
 */
public interface AuditableIdentity<T extends Serializable> {
    public T valueOf();
    
}
