package com.abctech.service;

/**
 * Created by s.purakayastha
 * Date: 11/11/2020
 * Time: 11:23 PM
 */
public class EmployerDetails extends ProjectDetails{

    protected String employeeSkill;

    public void getEmployerDetails(){
        System.out.println("Employer name is ABCTech");
    }

    public void getEmployeeContact(){
        System.out.println("Employee contact");
        System.out.println("Skill of employee is : "+ employeeSkill);
    }
}
