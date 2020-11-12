package com.abctech.init;

import com.abctech.lib.Employee;
import com.abctech.service.ContractorImpl;
import com.abctech.service.EmployeeImpl;
import com.abctech.service.EmployeeService;

/**
 * Created by s.purakayastha
 * Date: 11/9/2020
 * Time: 11:50 PM
 */
public class Initializer {

    public static void main(String args[]) {
       /* EmployeeService empSer = new EmployeeService();
        empSer.printEmployeeDetails();
*/
        //EmployeeImpl emp = new EmployeeImpl();
       //emp.getEmployeeSalary();

        //ContractorImpl contractor = new ContractorImpl();
        //contractor.getEmployeeSalary();

        EmployeeService empSer = new EmployeeService();
        empSer.calculate();
    }
}
