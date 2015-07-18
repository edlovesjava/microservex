/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.events;

import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.AnatomicalSite;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeSystem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ConceptMapping;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Frequency;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Procedure;

/**
 *
 * @author edlovesjava
 */
public interface ProcedureEvent<CS extends CodeSystem> extends TreatmentEvent<Procedure, CS> {
    ConceptMapping<Procedure, CS> getProcedurePerformed();
    ConceptMapping<AnatomicalSite, CS> getAnatomicalSite();
    ConceptMapping<Frequency, CS> getFrequency();    
}
