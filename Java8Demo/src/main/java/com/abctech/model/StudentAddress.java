package com.abctech.model;

/**
 * Created by s.purakayastha
 * Date: 12/3/2020
 * Time: 12:21 AM
 */
public class StudentAddress {

    private String street;
    private String country;
    private StudentContact studentContact;

    public StudentAddress(String street, String country, StudentContact studentContact) {
        this.street = street;
        this.country = country;
        this.studentContact = studentContact;
    }

    public StudentContact getStudentContactDetails() {
        return studentContact;
    }
}
