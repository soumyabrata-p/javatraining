package com.abctech.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s.purakayastha
 * Date: 11/13/2020
 * Time: 11:52 PM
 */
public class ArraysAndLoops {

    private Integer intArr[] = {10,20,30};

    private List<Integer> numberList;


    public void loopNumbers() {

        // For-Loop
        for(int i = 0; i < intArr.length; i++) {

            System.out.println("Value of intArr at index: "+i+ " is : " + intArr[i] );
        }

        // While Loop

        Integer counter = 1;

        while(counter <= 5){
            System.out.println("Print Counter : "+ counter);
            counter += 1;
        }

        Boolean flag = true;

        while(flag) {
            // Write some logic
            //flag = false;
        }

        // For Each Loop
        // ArrayList are part of Collections framework in Java

        List<String> stringList = new ArrayList<String>();
        stringList.add("Raghu");
        stringList.add("Ramesh");
        stringList.add("Veena");
        stringList.add("Rohini");


        for(String stringobj : stringList){
            System.out.println("Name  : " + stringobj);
        }
    }

}