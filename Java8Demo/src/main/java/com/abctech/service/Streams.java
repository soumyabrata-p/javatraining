package com.abctech.service;

import com.abctech.model.Employee;
import com.abctech.model.EmployeeSalaryDetails;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by s.purakayastha
 * Date: 11/20/2020
 * Time: 8:31 PM
 */
public class Streams {

    public void streamsOperation() {
        List<Employee> employeeList = getEmployeeList();
        employeeList.stream().forEach(System.out::println);

        employeeList.stream().filter(e -> e.getSalary() > 2000).collect(Collectors.toList());

       List<Employee> richEmployeeList = employeeList.stream().filter(emp -> emp.getSalary() > 2000).collect(Collectors.toList());

       //Java 7





        List<String> empNameList = employeeList.stream().map(e -> e.getEmployeeName()).collect(Collectors.toList());

        List<EmployeeSalaryDetails> salaryDetails = employeeList.stream().map(e -> {
            EmployeeSalaryDetails salary = new EmployeeSalaryDetails();
            salary.setEmployeeName(e.getEmployeeName());
            salary.setSalary(e.getSalary());
            return salary;
        }).collect(Collectors.toList());

        List<Employee> sortedBySalary = employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());


    }

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<Employee>();

        Employee emp1 = new Employee();
        emp1.setDepartment("Dept1");
        emp1.setEmployeeName("Emp1");
        emp1.setSalary(10000);


        Employee emp2 = new Employee();
        emp2.setDepartment("Dept2");
        emp2.setEmployeeName("Emp2");
        emp2.setSalary(10000);


        Employee emp3 = new Employee();
        emp3.setDepartment("Dept1");
        emp3.setEmployeeName("Emp1");
        emp3.setSalary(10000);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        return employeeList;

    }

    public List<Employee> getRichEmployee(List<Employee> empFullList) {
        List<Employee> richEmpList = new ArrayList<>();
        for(Employee emp : empFullList){
            if(emp.getSalary() > 2000) {
                richEmpList.add(emp);
            }
        }
        return richEmpList;
    }
}
