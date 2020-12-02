package com.abctech.service;

import com.abctech.model.EmployeeAddress;
import com.abctech.model.StudentAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s.purakayastha
 * Date: 12/2/2020
 * Time: 12:35 AM
 */
public class SpringInvoker {

    public static void main(String args[]) {

        //Setter Injection
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeAddress address = (EmployeeAddress) context.getBean("empAddress");

        System.out.println("Employee street address is  : " + address.getStreet());
        System.out.println("Employee email address is  : " + address.getEmployeeContact().getEmail());


        // Constructor Injection
        StudentAddress studentAdd = (StudentAddress)context.getBean("studentAdd");
        System.out.println("Student email id : " + studentAdd.getStudentContactDetails().getEmail());
    }
}
