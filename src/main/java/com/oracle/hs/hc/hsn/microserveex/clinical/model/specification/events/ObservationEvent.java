/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.events;

import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ClinicalEvent;
import com.oracle.hs.hc.hsn.microserveex.common.types.TypedValue;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.UnitOfMeasure;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeSystem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ConceptMapping;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Observation;

/**
 *
 * @author edlovesjava
 */
public interface ObservationEvent<CS extends CodeSystem> extends ClinicalEvent<Observation, CS> {
    ConceptMapping<Observation, CS> getObservation();
    TypedValue getObservationValue();
    ConceptMapping<UnitOfMeasure, CS> getUnitOfMeasure();
    
    
}
