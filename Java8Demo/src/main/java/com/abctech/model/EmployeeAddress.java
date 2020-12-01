package com.abctech.model;

/**
 * Created by s.purakayastha
 * Date: 12/2/2020
 * Time: 12:35 AM
 */
public class EmployeeAddress {

    private EmployeeContact employeeContact;
    private String street;
    private String country;

    public EmployeeContact getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(EmployeeContact employeeContact) {
        this.employeeContact = employeeContact;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
