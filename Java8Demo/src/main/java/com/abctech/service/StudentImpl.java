package com.abctech.service;

import com.abctech.model.StudentDetails;

/**
 * Created by s.purakayastha
 * Date: 11/15/2020
 * Time: 11:40 PM
 */
public class StudentImpl {

    public void getStudentDetails() {
       // StudentDetails student = populateStudentDetails();
        StudentDetails student = populateStudentDetails();

            System.out.println("Name of Student  : " + student.getName());
            System.out.println("Address of Student  : "+ student.getAddress());


    }


    public StudentDetails populateStudentDetails() {
        StudentDetails details = new StudentDetails();
        details.setName("Raghu");
        details.setAddress("Chicago");
        details.setPhoneNumber(1000000);
        details.setSubject("Java");

        return details;
    }

    public static void main(String args[]) {
        StudentImpl impl = new StudentImpl();
        impl.getStudentDetails();
    }
}
