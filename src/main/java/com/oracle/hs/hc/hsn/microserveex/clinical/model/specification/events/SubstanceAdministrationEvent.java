/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.events;

import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeSystem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ConceptMapping;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Dosage;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Frequency;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Medication;

/**
 *
 * @author edlovesjava
 */
public interface SubstanceAdministrationEvent<CS extends CodeSystem> extends TreatmentEvent<Medication, CS> {
    ConceptMapping<Medication, CS> getMedicationTaken();
    ConceptMapping<Dosage, CS> getDosage();
    ConceptMapping<Frequency, CS> getFrequency();
          
    
}
