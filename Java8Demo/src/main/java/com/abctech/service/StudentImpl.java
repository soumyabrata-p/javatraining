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
        try {
            System.out.println("Name of Student  : " + student.getName());
            //System.out.println("Address of Student  : "+ student.getAddress());
        }catch (NullPointerException np){
            System.out.println("Null pointer Exception occurred!!");
        }catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("ArrayIndexOutOfBound Exception occurred!!");
        } catch (ArithmeticException arith){
            System.out.println("Arithmetic Exception occurred!!");
        }catch(Exception e){
            System.out.println("Exception occurred!!");
        }
        System.out.println("Hello after exception");

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
