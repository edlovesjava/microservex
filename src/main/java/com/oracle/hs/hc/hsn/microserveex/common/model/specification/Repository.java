/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.specification;

import com.oracle.hs.hc.hsn.microserveex.common.model.impl.BaseEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author edlovesjava
 */
public interface Repository<ID, T extends BaseEntity<ID>> {
    List<T> findAll();
    T findById(ID id);
    T persist(T entity);
    void remove(T entity);
    
}
