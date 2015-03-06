/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Organization;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Person;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.WorksForAccountability;

/**
 *
 * @author edlovesjava
 */
public class BaseWorksForAccountability<S extends Person, T extends Organization> extends BaseAccountability<S, T> implements WorksForAccountability<S, T> {
    
}
