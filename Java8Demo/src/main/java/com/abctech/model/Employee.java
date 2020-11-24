package com.abctech.model;

/**
 * Created by s.purakayastha
 * Date: 11/20/2020
 * Time: 8:34 PM
 */
public class Employee {

    private String employeeName;
    private Integer salary;
    private String department;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
