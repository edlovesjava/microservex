/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification;

/**
 *
 * @author edlovesjava
 */
public abstract class PersonNameBuilder<T extends PersonName> {
    private String firstName;
    private String middleI;
    private String lastName;
    private String prefix;
    private String suffix;

    public abstract T create(PersonNameBuilder builder);

    public PersonNameBuilder() {
    }

    public T build() {
        return this.create(this);
    }

    /**
     * @param firstName the firstName to set
     */
    public PersonNameBuilder<T> setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * @param middleI the middleI to set
     */
    public PersonNameBuilder<T> setMiddleI(String middleI) {
        this.middleI = middleI;
        return this;
    }

    /**
     * @param lastName the lastName to set
     */
    public PersonNameBuilder<T> setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * @param prefix the prefix to set
     */
    public PersonNameBuilder<T> setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * @param suffix the suffix to set
     */
    public PersonNameBuilder<T> setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the middleI
     */
    public String getMiddleI() {
        return middleI;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }
    
}
