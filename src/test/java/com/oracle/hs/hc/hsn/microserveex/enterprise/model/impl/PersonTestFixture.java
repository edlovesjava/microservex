/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyContactEntry;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyIdentity;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PersonName;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PersonNameBuilder;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public class PersonTestFixture {
    private PartyIdentity testIdentity;
    private Set<PartyIdentity> testIdentities;
    private TestPersonName testPersonName;
    private BasePerson instance;
    
    PersonTestFixture() {
        
    }

    BasePerson getTestPerson() {
        if (instance == null) {
            instance = createTestPerson();
        }
        return instance;
    }

    private BasePerson createTestPerson() {
        BasePerson person = new BasePerson.Builder().setPersonName(getTestPersonName()).setDateOfBirth(LocalDate.of(16, Month.OCTOBER, 16)).setPrimaryIdentity(testIdentity).build();
        return person;
    }

    Set<PartyIdentity> getTestIdentities() {
        if (testIdentities == null) {
            testIdentities = createTestIdentities();
        }
        return testIdentities;
    }

    PartyIdentity getTestIdentity() {
        if (this.testIdentity == null) {
            this.testIdentity = new PartyIdentity() {
                @Override
                public String toValue() {
                    return "TestID";
                }
            };
        }
        return this.testIdentity;
    }

    private Set<PartyIdentity> createTestIdentities() {
        Set<PartyIdentity> identities = new HashSet<PartyIdentity>();
        identities.add(getTestIdentity());
        return identities;
    }

    PersonName getTestPersonName() {
        if (testPersonName == null) {
            testPersonName = new PersonNameBuilder<TestPersonName>() {
                @Override
                public TestPersonName create(PersonNameBuilder builder) {
                    return new TestPersonName(builder);
                }
            }.setFirstName("George").setMiddleI("W").setLastName("Bush").build();
        }
        return testPersonName;
    }

    private Set<PartyContactEntry> testContactEntries;
    
    Set<PartyContactEntry> getTestContactEntries() {
        if (this.testContactEntries == null) {
            this.testContactEntries = createContactEntries();
        }
        return this.testContactEntries;
        
    }

    private Set<PartyContactEntry> createContactEntries() {
        Set<PartyContactEntry> contactEntries = new HashSet<PartyContactEntry>();
        contactEntries.add(createTestContactEntry());
        return contactEntries;
    }

    private PartyContactEntry createTestContactEntry() {
        
        PartyContactEntry entry = new PartyContactEntry() {};
        return entry;
    }
    
}
