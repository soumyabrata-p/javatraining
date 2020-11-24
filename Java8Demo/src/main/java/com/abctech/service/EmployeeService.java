package com.abctech.service;

import com.abctech.lib.AccessModifierDemo;

/**
 * Created by s.purakayastha
 * Date: 11/9/2020
 * Time: 11:15 PM
 */
public class EmployeeService extends AccessModifierDemo{

    String employeeName;
    public Integer age;
    public Double salary;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void printEmployeeDetails(){
        EmployeeService emp1 = new EmployeeService();
        emp1.setEmployeeName("Raghu");

        EmployeeService emp2 = new EmployeeService();
        emp2.setEmployeeName("Ramesh");

        EmployeeService emp3 = new EmployeeService();
        emp3.setEmployeeName("Gnana");


        System.out.println("Name of the employee is : "+emp1.employeeName);


        System.out.println("Name = "+name);
    }


    public void calculateNumber(Integer firstValue, Integer secondValue){

        Integer addition = firstValue + secondValue;
        System.out.println(" Sum is " + addition);
    }


    public void calculateNumber(Integer firstValue, Integer secondValue,Integer thirdValue) {
        Integer addition = firstValue + secondValue + thirdValue;

        System.out.println(" Sum is " + addition);
        Integer subtractionResult;

        if(secondValue > firstValue) {
            subtractionResult = secondValue - firstValue;
        } else if(thirdValue != null && secondValue != null){
            subtractionResult = thirdValue - secondValue;
        } else{
            subtractionResult =  firstValue - secondValue;
        }
    }


    public void calculate(){

        calculateNumber(10,20,20);
    }

    public void drawShape() {
        String shapeName = "Square";
        System.out.println("Shape name : " + shapeName);
    }



}
