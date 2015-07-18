/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyIdentity;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Person;

/**
 *
 * @author edlovesjava
 */
public interface Patient extends Person {
    PartyIdentity getPatientNumber();
    PatientEncounter encounters();
}
