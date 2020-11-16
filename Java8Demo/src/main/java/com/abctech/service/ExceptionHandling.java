package com.abctech.service;

import com.abctech.model.StudentDetails;

/**
 * Created by s.purakayastha
 * Date: 11/15/2020
 * Time: 11:53 PM
 */
public class ExceptionHandling {

    public void demonstrateException() throws Exception{

        StudentImpl impl = new StudentImpl();
        StudentDetails student = null;
        Integer intArr[] = {10,20,30};


        try {
           // System.out.println("Name of Student  : " + student.getName());
            //Integer val = intArr[6];
            String number = "abcd";
            Integer value = Integer.valueOf(number);

        }catch (NullPointerException np){
            System.out.println("Null pointer Exception occurred!!");
        }catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("ArrayIndexOutOfBound Exception occurred!!");
        }catch (ArithmeticException arith){
            System.out.println("Arithmetic Exception occurred!!");
        }catch(Exception e){
            System.out.println("Exception occurred!! , Exception is : " + e.getLocalizedMessage());
            throw e;
        } finally {

            System.out.println("Executing finally");
            // connection.close()
        }
        System.out.println("Hello after exception");

    }

    public static void main(String args[]) {
        ExceptionHandling ex = new ExceptionHandling();
        try {
            ex.demonstrateException();
        }catch (Exception e) {
            System.out.println(" Exception is thrown : " + e.getLocalizedMessage());
        }
    }
}
