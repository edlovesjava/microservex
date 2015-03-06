/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.impl;

import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Accountability;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Location;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Organization;
import com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification.Organization;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author edlovesjava
 */
public class BaseOrganization extends BaseParty implements Organization, Location {

    private String name;
    private String orgCode;
    private Location primaryLocation;
    private String parentOrgCode;
    private Set<Location> locations;

    public static class Builder {

        private String name;
        private String orgCode;
        private Location primaryLocation;
        private List<Location> locations;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOrgCode(String orgCode) {
            this.orgCode = orgCode;
            return this;
        }

        public Builder setPrimaryLocation(Location primaryLocation) {
            this.primaryLocation = primaryLocation;
            return this;
        }

        public BaseOrganization build() {
            BaseOrganization orgImpl = new BaseOrganization(name, orgCode, primaryLocation);
            if (this.getLocations() != null) {
                orgImpl.getLocations().addAll(this.getLocations());
            }

            return orgImpl;
        }

        /**
         * @return the locations
         */
        public List<Location> getLocations() {
            if (locations == null) {
                locations = new ArrayList<Location>();
            }
            return locations;
        }

        public void addLocation(Location location) {
            getLocations().add(location);
        }

        /**
         * @param locations the locations to set
         */
        public void setLocations(List<Location> locations) {
            this.locations = locations;
        }

    }

    public BaseOrganization(String name, String orgCode, Location primaryLocation) {
        this.name = name;
        this.orgCode = orgCode;
        this.primaryLocation = primaryLocation;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the orgCode
     */
    @Override
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * @param orgCode the orgCode to set
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return the location
     */
    @Override
    public Location getPrimaryLocation() {
        return primaryLocation;
    }

    /**
     * @param location the location to set
     */
    public void setPrimaryLocation(Location location) {
        this.primaryLocation = location;
        getLocations().add(location);
    }

    /**
     * @return the parentOrgCode
     */
    @Override
    public String getParentOrgCode() {
        return parentOrgCode;
    }

    /**
     * @param parentOrgCode the parentOrgCode to set
     */
    public void setParentOrgCode(String parentOrgCode) {
        this.parentOrgCode = parentOrgCode;
    }

    @Override
    public String getAddress() {
        return getPrimaryLocation().getAddress();
    }

    @Override
    public String getGeocode() {
        return getPrimaryLocation().getGeocode();
    }

    @Override
    public String getNickname() {
        return getPrimaryLocation().getNickname();
    }

    @Override
    public Set<Location> getLocations() {
        if (locations == null) {
            locations = new HashSet<Location>();
        }
        return locations;
    }

}
