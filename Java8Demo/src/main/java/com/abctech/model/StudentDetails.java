package com.abctech.model;

import java.util.Comparator;

/**
 * Created by s.purakayastha
 * Date: 11/15/2020
 * Time: 11:35 PM
 */
public class StudentDetails implements Comparator<StudentDetails> {

    private String name;
    private String address;
    private String subject;
    private Integer phoneNumber;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /*@Override
    public int compareTo(StudentDetails o) {
        return Integer.compare(getAge(),o.getAge());
    }*/

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
