package com.abctech.init;

import com.abctech.lib.DemoFunctionalInterface;
import com.abctech.lib.Employee;
import com.abctech.lib.TwoParamFunctionalInterface;
import com.abctech.service.ArraysAndLoops;
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
        empSer.calculate();
		
		EmployeeService empSer2 = new EmployeeService();
        empSer2.calculate();*/

        /*ArraysAndLoops loops = new ArraysAndLoops();
        loops.loopNumbers();*/

        //Java 8
        DemoFunctionalInterface func = ()  -> {return  "Sample Message";};

        TwoParamFunctionalInterface intf  = (valueA,valueB) -> {return valueA + valueB;};

        //Java 7

       /* public String greet() {
            return "Sample Message";
        }
        */

        System.out.println(func.greet());
    }
}
