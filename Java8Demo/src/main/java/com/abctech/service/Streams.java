package com.abctech.service;

import com.abctech.model.Employee;
import com.abctech.model.EmployeeSalaryDetails;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
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

        Optional<Employee> emp = Optional.ofNullable(employeeList.get(200));

        Long noOfage = employeeList.stream().filter(e -> e.getAge()==25).count();

    }

    public  static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<Employee>();

        Employee emp1 = new Employee();
        emp1.setDepartment("Dept1");
        emp1.setEmployeeName("Emp1");
        emp1.setAge(23);
        emp1.setSalary(10000);


        Employee emp2 = new Employee();
        emp2.setDepartment("Dept1");
        emp2.setEmployeeName("Emp1");
        emp2.setAge(20);
        emp2.setSalary(10000);


        Employee emp3 = new Employee();
        emp3.setDepartment("Dept1");
        emp3.setEmployeeName("Emp3");
        emp3.setAge(45);
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

    public static List<Employee> filterEmployee(List<Employee> empList, Predicate<Employee> predicate) {
       return empList.stream().filter(predicate::test).collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<Employee> employeeList = getEmployeeList();

        if(employeeList != null){
            //Some code

            String a = "ABC";
            String b = "XYZ";

            if(!a.equals(b)){
                // Not Same
            }

        }



        Predicate<Employee> empPredA = e -> e.getAge() > 20 ;
        Predicate<Employee> empPredB = e -> e.getAge() < 40;
            Long noOfage = employeeList.stream().filter(empPredA.negate()).count();

       // System.out.println("Number of employees with age 23 is  : "+ noOfage);
        List<Employee> employees = filterEmployee(employeeList,empPredA);


        employeeList.stream().filter(e -> e.getEmployeeName().equals("Mary")).count();

        Optional<Employee> seniorEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

        if(seniorEmployee.isPresent()) {
            System.out.println("Employee with max age is  " + seniorEmployee.get().getEmployeeName());
        }

        List<Employee> uniqueList = employeeList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());

        uniqueList.forEach(System.out::println);


        // Map

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        String number = "12345";
        Integer value = Integer.valueOf(number);


       List<Integer> integerList = stringList.stream().map(str -> Integer.valueOf(str)).collect(Collectors.toList());
       List<Integer> intList = stringList.stream().map(Integer::valueOf).collect(Collectors.toList());

       // FlatMap

        List<Integer> list1 =  new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        list3.add(7);
        list3.add(8);
        list3.add(9);

        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        List<String> strList = listOfList.stream().flatMap(e -> e.stream().map(String::valueOf)).collect(Collectors.toList());

        System.out.println("Printing strList");
        strList.forEach(System.out::println);

    }


}
