package com.abctech.service;

import com.abctech.model.StudentDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by s.purakayastha
 * Date: 11/20/2020
 * Time: 12:59 AM
 */
public class CollectionSorting {

    public List<StudentDetails> getStudentList() {
        List<StudentDetails> studentDetailsList = new ArrayList<StudentDetails>();

        StudentDetails student1 = new StudentDetails();
        student1.setSubject("Java");
        student1.setName("ABC");
        student1.setAge(20);
        student1.setPhoneNumber(12345);

        StudentDetails student2 = new StudentDetails();
        student2.setSubject("Python");
        student2.setName("XYZ");
        student2.setAge(18);
        student2.setPhoneNumber(12345);

        StudentDetails student3 = new StudentDetails();
        student3.setSubject("React");
        student3.setName("PQR");
        student3.setAge(25);
        student3.setPhoneNumber(12345);

        studentDetailsList.add(student1);
        studentDetailsList.add(student2);
        studentDetailsList.add(student3);

        // Sort the collections object using Comparator and comparable
        Collections.sort(studentDetailsList, new Comparator<StudentDetails>() {
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
        });


        return studentDetailsList;

    }

    public static void main(String args[]) {
        CollectionSorting collectionSorting = new CollectionSorting();
        List<StudentDetails> studentDetails = collectionSorting.getStudentList();
        //java 8
        studentDetails.forEach(student -> {
            System.out.println(student.getName());
        });

        // before java 8
        for(StudentDetails student : studentDetails) {
            System.out.println(student.getName());
        }

    }
}
