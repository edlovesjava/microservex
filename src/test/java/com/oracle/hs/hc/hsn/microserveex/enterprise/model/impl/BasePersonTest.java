/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Organization;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyContactEntry;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyIdentity;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Person;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PersonName;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.WorksForAccountability;
import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edlovesjava
 */
public class BasePersonTest {
    
    private BasePerson instance;

    private PersonTestFixture fixture;
    
    public BasePersonTest() {
    }

    @Before
    public void setUp() {
        fixture = new PersonTestFixture();
        instance = fixture.getTestPerson();        
    }

    /**
     * Test of getPersonName method, of class BasePerson.
     */
    @Test
    public void testSetGetPersonName() {
        System.out.println("getPersonName");
        PersonName personName = fixture.getTestPersonName();
        instance.setPersonName(personName);
        PersonName expResult = fixture.getTestPersonName();
        PersonName result = instance.getPersonName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateOfBirth method, of class BasePerson.
     */
    @Test
    public void testSetGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        LocalDate getDateOfBirth = LocalDate.of(1966, Month.OCTOBER, 16);
        instance.setDateOfBirth(getDateOfBirth);
        LocalDate expResult = LocalDate.of(1966, Month.OCTOBER, 16);
        LocalDate result = instance.getDateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGender method, of class BasePerson.
     */
    @Test
    public void testSetGetGender() {
        System.out.println("getGender");
        Person.PersonGenderEnum gender = Person.PersonGenderEnum.Female;
        instance.setGender(gender);
        Person.PersonGenderEnum expResult = Person.PersonGenderEnum.Female;
        Person.PersonGenderEnum result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaritalStatus method, of class BasePerson.
     */
    @Test
    public void testSetGetMaritalStatus() {
        System.out.println("getMaritalStatus");
        Person.MaritalStatusEnum maritalStatus = Person.MaritalStatusEnum.Divorced;
        instance.setMaritalStatus(maritalStatus);
        Person.MaritalStatusEnum expResult = Person.MaritalStatusEnum.Divorced;
        Person.MaritalStatusEnum result = instance.getMaritalStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrimaryIdentity method, of class BasePerson.
     */
    @Test
    public void testSetGetPrimaryIdentity() {
        System.out.println("getPrimaryIdentity");
        PartyIdentity primaryIdentity = fixture.getTestIdentity();
        instance.setPrimaryIdentity(primaryIdentity);
        PartyIdentity expResult = fixture.getTestIdentity();
        PartyIdentity result = instance.getPrimaryIdentity();
        assertEquals(expResult, result);
        assertTrue(instance.getIdentities().contains(primaryIdentity));
    }

    /**
     * Test of getIdentities method, of class BasePerson.
     */
    @Test
    public void testSetGetIdentities() {
        System.out.println("getIdentities");
        Set<PartyIdentity> identities = fixture.getTestIdentities();
        instance.setIdentities(identities);
        Set<PartyIdentity> expResult = fixture.getTestIdentities();
        Set<PartyIdentity> result = instance.getIdentities();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getPrimaryContactEntry method, of class BasePerson.
     */
    @Test
    public void testSetGetPrimaryContactEntry() {
        System.out.println("getPrimaryContactEntry");
        PartyContactEntry priamryContactEntry = null;
        instance.setPriamryContactEntry(priamryContactEntry);
        PartyContactEntry expResult = null;
        PartyContactEntry result = instance.getPrimaryContactEntry();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContactEntries method, of class BasePerson.
     */
    @Test
    public void testGetContactEntries() {
        System.out.println("getContactEntries");
        Set<PartyContactEntry> contactEntries = fixture.getTestContactEntries();
        instance.setContactEntries(contactEntries);
        Set<PartyContactEntry> expResult = fixture.getTestContactEntries();
        Set<PartyContactEntry> result = instance.getContactEntries();
        assertEquals(expResult, result);
    }

 
    @Test
    public void testAccountabilities() {
        System.out.println("test acountabilities");
        WorksForAccountability wfa = new BaseWorksForAccountability();
        Organization o = createTestOrganization();
        instance.addAccountableTo(wfa, o);
        assertTrue(wfa.getTarget().contains(o));
        assertTrue(wfa.getSource().contains(instance));
        Set<WorksForAccountability> found = instance.getAccountableTo(WorksForAccountability.class);
        assertNotNull(found);
        assertTrue(found.contains(wfa));
        o.getAccountableFrom().contains(wfa);
                
    }

    private Organization createTestOrganization() {
        Organization o = new BaseOrganization.Builder().setName("testO").setOrgCode("TO").build();
        return o;
    }

}
