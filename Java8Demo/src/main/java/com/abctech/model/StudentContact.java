package com.abctech.model;

/**
 * Created by s.purakayastha
 * Date: 12/3/2020
 * Time: 12:17 AM
 */
public class StudentContact {

    private String email;
    private Long phone;

    public StudentContact(String email, Long phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
}
