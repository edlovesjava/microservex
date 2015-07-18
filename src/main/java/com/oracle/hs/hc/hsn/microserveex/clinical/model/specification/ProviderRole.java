/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification;

import com.oracle.hs.hc.hsn.microserveex.common.types.RoleType;

/**
 *
 * @author edlovesjava
 */
public enum ProviderRole  implements RoleType {
    careProvider, treatingPhysician, clinician, attendant, counsiler, nurse, assistant
}
