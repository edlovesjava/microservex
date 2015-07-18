/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification;

import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeSystem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeableConcept;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ConceptMapping;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.PatientEncounter;
import com.oracle.hs.hc.hsn.microserveex.common.types.TimeInterval;
import java.time.Instant;

/**
 *
 * @author edlovesjava
 */
public interface ClinicalEvent<CC extends CodeableConcept, CS extends CodeSystem> {
    PatientEncounter getEncounter();
    TimeInterval getEventInterval();
    ConceptMapping<CC,CS> getWhatOccurred();
    
    
}
