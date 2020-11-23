package com.abctech.service;

import com.abctech.model.Employee;

import java.util.*;

public class CollectionEmp {


    public static void main(String arg[]) {

        CollectionEmp emp = new CollectionEmp();
        List<Employee> employeeList = emp.getEmployeeDetailList();
        Set<Employee> empSet = emp.getEmployeeSet();
        List<String> stringList = new ArrayList<>();

        // Java 7:(Print employeeList)
        //The below line reads - "For Each Employee object "e" in employeeList
        System.out.println("************* Arraylist print starts ***************");
        System.out.println("");
       for(Employee e : employeeList) {
           // System.out.println("Name is : " + e.getEmployeeName() + " , Salary is : "+e.getSalary() + ", Department is : "+e.getDepartment());
            System.out.println(e);
        }
        System.out.println("************* Arraylist print ends ***************");
        System.out.println("");
       // System.out.println(employeeList);

        System.out.println("************* Set print starts ***************");
        System.out.println("");
        for(Employee e : empSet) {
            // System.out.println("Name is : " + e.getEmployeeName() + " , Salary is : "+e.getSalary() + ", Department is : "+e.getDepartment());
            System.out.println(e);
        }
        System.out.println("************* Set print ends ***************");
        System.out.println("");



        // Java 8 approach:
        System.out.println("************* Arraylist print starts (Java 8 approach) ***************");
        System.out.println("");
        employeeList.forEach(System.out::println);
        System.out.println("************* Arraylist print Ends (Java 8 approach) ***************");
        System.out.println("");

    }


    public  List<Employee> getEmployeeDetailList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setEmployeeName("XYZ");
        emp1.setSalary(90000);
        emp1.setDepartment("Department 1");

        Employee emp2 = new Employee();
        emp2.setEmployeeName("ABC");
        emp2.setSalary(90000);
        emp2.setDepartment("Department 2");

        Employee emp3 = new Employee();
        emp3.setEmployeeName("PQR");
        emp3.setSalary(90000);
        emp3.setDepartment("Department 3");


        Employee emp4 = new Employee();
        emp4.setEmployeeName("DEF");
        emp4.setSalary(90000);
        emp4.setDepartment("Department 4");


        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        return employeeList;
    }


    public Set<Employee> getEmployeeSet() {
       Set<Employee> employeeSet = new HashSet<>();

        Employee emp1 = new Employee();
        emp1.setEmployeeName("XYZ");
        emp1.setSalary(90000);
        emp1.setDepartment("Department 1");

        Employee emp2 = new Employee();
        emp2.setEmployeeName("ABC");
        emp2.setSalary(90000);
        emp2.setDepartment("Department 2");

        Employee emp3 = new Employee();
        emp3.setEmployeeName("PQR");
        emp3.setSalary(90000);
        emp3.setDepartment("Department 3");


        Employee emp4 = new Employee();
        emp4.setEmployeeName("PQR");
        emp4.setSalary(90000);
        emp4.setDepartment("Department 4");

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);

        return employeeSet;
    }


    public Set<Employee> getEmployeeSetFromList(List<Employee> employeeList) {
       Set<Employee> empSet = new HashSet<>();
       empSet.addAll(employeeList);

       return empSet;
    }

}
