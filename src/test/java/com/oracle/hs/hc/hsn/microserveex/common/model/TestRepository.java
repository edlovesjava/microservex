/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model;

import com.oracle.hs.hc.hsn.microserveex.common.model.specification.Repository;
import com.oracle.hs.hc.hsn.microserveex.common.model.impl.BaseEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestRepository<ID,T extends BaseEntity<ID>> implements Repository<ID, T> {

    private Map<ID, T> data;
    
    TestRepository() {

    }
    @Override
    public List<T> findAll() {
        
        List<T> results = new ArrayList<T>(getData().values());
        return results;

    }

    @Override
    public T findById(ID id) {
        return getData().get(id);
    }

    @Override
    public T persist(T entity) {
        return getData().put(entity.getId(), entity);
    }

    @Override
    public void remove(T entity) {
        getData().remove(entity.getId());
    }

    /**
     * @return the data
     */
    public Map<ID, T> getData() {
        if (data == null) {
            data = new HashMap<ID, T>();            
        }
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Map<ID, T> data) {
        this.data = data;
    }
    
}
