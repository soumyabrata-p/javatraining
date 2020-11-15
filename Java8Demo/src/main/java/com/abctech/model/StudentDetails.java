package com.abctech.model;

/**
 * Created by s.purakayastha
 * Date: 11/15/2020
 * Time: 11:35 PM
 */
public class StudentDetails {

    private String name;
    private String address;
    private String subject;
    private Integer phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
