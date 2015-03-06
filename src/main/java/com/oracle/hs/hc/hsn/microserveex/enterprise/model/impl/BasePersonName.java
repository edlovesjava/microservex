/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PersonName;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.PersonNameBuilder;
import java.text.MessageFormat;

/**
 *
 * @author edlovesjava
 */
public class BasePersonName implements PersonName {

    private String suffix;
    private String prefix;
    private String lastName;
    private String middleI;
    private String firstName;

    BasePersonName(PersonNameBuilder builder) {
        this.setPrefix(builder.getPrefix());
        this.setFirstName(builder.getFirstName());
        this.setMiddleI(builder.getMiddleI());
        this.setLastName(builder.getLastName());
        this.setSuffix(builder.getSuffix());
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getMiddleI() {
        return this.middleI;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPrefix() {
        return this.prefix;
    }

    @Override
    public String getSuffix() {
        return this.suffix;
    }

    @Override
    public String getFullName() {
        return getSpaceSeparated(getPrefix(), getFirstName(), getMiddleI(), getLastName(), getSuffix());
    }

    public String getSpaceSeparated(String... vals) {
        StringBuilder sb = new StringBuilder();
        for (String val : vals) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            if (val != null) {
                sb.append(val);
            }
        }
        return sb.toString();
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param middleI the middleI to set
     */
    public void setMiddleI(String middleI) {
        this.middleI = middleI;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
