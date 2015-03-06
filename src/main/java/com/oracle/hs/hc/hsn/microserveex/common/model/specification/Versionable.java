/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.specification;

import java.time.Instant;

/**
 *
 * @author edlovesjava
 */
public interface Versionable {
    Long getVersion();
    Instant getEffectiveFrom();
    Instant getEffectiveTo();
    void initializeVersion();
    void updateVersion();
}
