/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.events;

import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeSystem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeableConcept;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Problem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.TreatmentOutcome;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ClinicalEvent;
import com.oracle.hs.hc.hsn.microserveex.common.types.TimeInterval;
import java.time.Instant;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public interface DiagnosisEvent<CC extends CodeableConcept, CS extends CodeSystem> extends ClinicalEvent<CC,CS> {
    Set<Problem> getProblemsDiagnosed();
    TimeInterval getProblemTimeInterval();
    Instant getProblemDiagnosedOn();
    Set<TreatmentOutcome> treatmentOutcomes();
}
