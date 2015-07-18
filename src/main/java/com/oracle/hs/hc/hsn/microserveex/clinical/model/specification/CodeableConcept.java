/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification;

import com.oracle.hs.hc.hsn.microserveex.common.types.RelatedBy;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public interface CodeableConcept {
    String getConceptIdentifier();
    String getDescription();
    Set<RelatedBy<ConceptRelationshipType, CodeableConcept>> getRelatedConcepts();
    Map<String, ConceptAttribute> getConceptAttributes();
}
