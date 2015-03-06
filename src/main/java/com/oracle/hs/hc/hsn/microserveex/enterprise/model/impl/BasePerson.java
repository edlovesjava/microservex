/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyContactEntry;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PartyIdentity;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Person;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PersonName;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public class BasePerson extends BaseParty implements Person {

    private Set<PartyContactEntry> contactEntries;
    private PartyContactEntry priamryContactEntry;
    private Set<PartyIdentity> identities;
    private PartyIdentity primaryIdentity;
    private MaritalStatusEnum maritalStatus;
    private PersonGenderEnum gender;
    private LocalDate dateOfBirth;
    private PersonName personName;

    private BasePerson(Builder builder) {
        
        setContactEntries(builder.getContactEntries());
        setDateOfBirth(builder.getDateOfBirth());
        setGender(builder.getGender());
        setIdentities(builder.getIdentities());
        setMaritalStatus(builder.getMaritalStatus());
        setPersonName(builder.getPersonName());
        setPriamryContactEntry(builder.getPriamryContactEntry());
        setPrimaryIdentity(builder.getPrimaryIdentity());
    }

    public static class Builder {

        private Set<PartyContactEntry> contactEntries = null;
        private PartyContactEntry priamryContactEntry;
        private Set<PartyIdentity> identities = null;
        private PartyIdentity primaryIdentity;
        private MaritalStatusEnum maritalStatus = null;
        private PersonGenderEnum gender = null;
        private LocalDate dateOfBirth;
        private PersonName personName;

        public Builder() {
        }

        public Builder setContactEntries(Set<PartyContactEntry> contactEntries) {
            this.contactEntries = contactEntries;
            return this;
        }

        public Builder setPriamryContactEntry(PartyContactEntry priamryContactEntry) {
            this.priamryContactEntry = priamryContactEntry;
            return this;
        }

        public Builder setIdentities(Set<PartyIdentity> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setPrimaryIdentity(PartyIdentity primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }

        public Builder setMaritalStatus(MaritalStatusEnum maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Builder setGender(PersonGenderEnum gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setPersonName(PersonName personName) {
            this.personName = personName;
            return this;
        }

        public BasePerson build() {
            return new BasePerson(this);
            //return new BasePerson(contactEntries, priamryContactEntry, identities, primaryIdentity, maritalStatus, gender, dateOfBirth, personName);
        }

        /**
         * @return the contactEntries
         */
        public Set<PartyContactEntry> getContactEntries() {
            return contactEntries;
        }

        /**
         * @return the priamryContactEntry
         */
        public PartyContactEntry getPriamryContactEntry() {
            return priamryContactEntry;
        }

        /**
         * @return the identities
         */
        public Set<PartyIdentity> getIdentities() {
            return identities;
        }

        /**
         * @return the primaryIdentity
         */
        public PartyIdentity getPrimaryIdentity() {
            return primaryIdentity;
        }

        /**
         * @return the maritalStatus
         */
        public MaritalStatusEnum getMaritalStatus() {
            return maritalStatus;
        }

        /**
         * @return the gender
         */
        public PersonGenderEnum getGender() {
            return gender;
        }

        /**
         * @return the dateOfBirth
         */
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * @return the personName
         */
        public PersonName getPersonName() {
            return personName;
        }

    }

    public BasePerson(Set<PartyContactEntry> contactEntries, PartyContactEntry priamryContactEntry, Set<PartyIdentity> identities, PartyIdentity primaryIdentity, MaritalStatusEnum maritalStatus, PersonGenderEnum gender, LocalDate dateOfBirth, PersonName personName) {
        this.contactEntries = contactEntries;
        this.priamryContactEntry = priamryContactEntry;
        this.identities = identities;
        this.primaryIdentity = primaryIdentity;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.personName = personName;
    }

    @Override
    public PersonName getPersonName() {
        return this.personName;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public PersonGenderEnum getGender() {
        return this.gender;
    }

    @Override
    public MaritalStatusEnum getMaritalStatus() {
        return this.maritalStatus;
    }

    @Override
    public PartyIdentity getPrimaryIdentity() {
        return this.primaryIdentity;
    }

    @Override
    public Set<PartyIdentity> getIdentities() {
        if (identities == null) {
            identities = new HashSet<PartyIdentity>();
        }
        return this.identities;
    }

    @Override
    public PartyContactEntry getPrimaryContactEntry() {
        return this.priamryContactEntry;
    }

    @Override
    public Set<PartyContactEntry> getContactEntries() {
        return this.contactEntries;
    }

    /**
     * @param contactEntries the contactEntries to set
     */
    public void setContactEntries(Set<PartyContactEntry> contactEntries) {
        this.contactEntries = contactEntries;
    }

    /**
     * @param priamryContactEntry the priamryContactEntry to set
     */
    public void setPriamryContactEntry(PartyContactEntry priamryContactEntry) {
        this.priamryContactEntry = priamryContactEntry;
    }

    /**
     * @param identities the identities to set
     */
    public void setIdentities(Set<PartyIdentity> identities) {
        this.identities = identities;
    }

    /**
     * @param primaryIdentity the primaryIdentity to set
     */
    public void setPrimaryIdentity(PartyIdentity primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
        getIdentities().add(primaryIdentity);
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(PersonGenderEnum gender) {
        this.gender = gender;
    }

    /**
     * @param dateOfBirth the getDateOfBirth to set
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @param personName the getPersonName to set
     */
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

}
