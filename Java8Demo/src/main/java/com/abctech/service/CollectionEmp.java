package com.abctech.service;

import com.abctech.model.EmployeeDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionEmp {

   public List<EmployeeDetails> getEmployeeList() { //method
        List<EmployeeDetails> EmployeeList = new ArrayList<EmployeeDetails>(); //Arraylist

    EmployeeDetails Employee1 = new EmployeeDetails();
    Employee1.setName("ABC");
    Employee1.setRole("Java");
    Employee1.setAddress("Herndon");
    Employee1.setEmp_id(45);
    Employee1.setNumber(757);


    EmployeeDetails Employee2 = new EmployeeDetails();
    Employee2.setName("DEF");
    Employee2.setAddress("Chantilly");
    Employee2.setRole("PHP");
    Employee2.setEmp_id(22);
    Employee2.setNumber(571);

    EmployeeDetails Employee3 = new EmployeeDetails();
    Employee3.setName("GHI");
    Employee3.setRole("Devops");
    Employee3.setAddress("Sterling");
    Employee3.setNumber(703);
    Employee3.setEmp_id(54);

    EmployeeList.add(Employee1);
    EmployeeList.add(Employee2);
    EmployeeList.add(Employee3);

       Collections.sort(EmployeeList);

       return EmployeeList;
    }
public static void main(String arg[]){
       CollectionEmp collectionEmp = new CollectionEmp();
       List<EmployeeDetails> employeeDetails = collectionEmp.getEmployeeList();
       employeeDetails.forEach(employee ->{
           System.out.println(employee.getName());
           System.out.println(employee.getRole());
       });


}

}
