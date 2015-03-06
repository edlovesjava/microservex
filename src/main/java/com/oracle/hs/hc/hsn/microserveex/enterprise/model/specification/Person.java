/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.enterprise.model.specification;

import java.time.LocalDate;

/**
 *
 * @author edlovesjava
 */
public interface Person extends Party {
    PersonName getPersonName();
    LocalDate getDateOfBirth();
    PersonGenderEnum getGender();
    MaritalStatusEnum getMaritalStatus();

    public enum PersonGenderEnum {
        Male, Female, NotSpecified
    }
    
    public enum MaritalStatusEnum {
        Married, Single, Divorced, Widowed
    }
}
