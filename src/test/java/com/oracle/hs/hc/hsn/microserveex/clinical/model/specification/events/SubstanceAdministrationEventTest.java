/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.events;

import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.CodeSystem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.ConceptMapping;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.PatientEncounter;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Dosage;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Frequency;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Medication;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.Problem;
import com.oracle.hs.hc.hsn.microserveex.clinical.model.specification.concepts.TreatmentOutcome;
import com.oracle.hs.hc.hsn.microserveex.common.types.TimeInterval;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edlovesjava
 */
public class SubstanceAdministrationEventTest {
    
    public SubstanceAdministrationEventTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMedicationTaken method, of class SubstanceAdministrationEvent.
     */
    @Test
    public void testGetMedicationTaken() {
        System.out.println("getMedicationTaken");
        SubstanceAdministrationEvent instance = new SubstanceAdministrationEventImpl();
        ConceptMapping expResult = null;
        ConceptMapping result = instance.getMedicationTaken();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDosage method, of class SubstanceAdministrationEvent.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        SubstanceAdministrationEvent instance = new SubstanceAdministrationEventImpl();
        ConceptMapping expResult = null;
        ConceptMapping result = instance.getDosage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrequency method, of class SubstanceAdministrationEvent.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        SubstanceAdministrationEvent instance = new SubstanceAdministrationEventImpl();
        ConceptMapping expResult = null;
        ConceptMapping result = instance.getFrequency();
        assertEquals(expResult, result);
    }

    public class SnomedCodeSystem implements CodeSystem {
        
    }
    public class SubstanceAdministrationEventImpl implements SubstanceAdministrationEvent<SnomedCodeSystem> {
        ConceptMapping<Medication, SnomedCodeSystem> medicationTaken;
        private ConceptMapping<Dosage, SnomedCodeSystem> dosage;
        private ConceptMapping<Frequency, SnomedCodeSystem> frequency;
        private Set<TreatmentOutcome> outcomes;
        private Set<Problem> problems;
        private PatientEncounter encounter;
        private TimeInterval interval;
        private ConceptMapping<Medication, SnomedCodeSystem> whatOccurred;
        
        @Override
        public ConceptMapping<Medication, SnomedCodeSystem> getMedicationTaken() {
            return medicationTaken;
        }

        @Override
        public ConceptMapping<Dosage, SnomedCodeSystem> getDosage() {
            return dosage;
        }

        @Override
        public ConceptMapping<Frequency, SnomedCodeSystem> getFrequency() {
            return frequency;
        }

        @Override
        public Set<Problem> problemsTreated() {
            return problems;
        }

        @Override
        public Set<TreatmentOutcome> treatmentOutcomes() {
            return outcomes;
        }

        @Override
        public PatientEncounter getEncounter() {
            return encounter;
        }

        @Override
        public TimeInterval getEventInterval() {
            return interval;
        }

        @Override
        public ConceptMapping<Medication, SnomedCodeSystem> getWhatOccurred() {
            return whatOccurred;
        }

     
    }
    
}
