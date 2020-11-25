package com.abctech.service;

import com.abctech.lib.Employee;
import com.abctech.lib.Employer;


/**
 * Created by s.purakayastha
 * Date: 11/11/2020
 * Time: 11:40 PM
 */
public class EmployeeImpl implements Employee,Employer {
    public void getEmployeeSalary() {
        System.out.println("Salary of Emp1 is $X");
    }

    public void getEmployeeDetails() {
        System.out.println("Employee says hello !! ");
    }

    public static void main(String args[]) {
        Employee emp = new EmployeeImpl();
        emp.getEmployeeDetails();

        Employer employer = new EmployeeImpl();
        employer.getEmployeeDetails();
    }

}
