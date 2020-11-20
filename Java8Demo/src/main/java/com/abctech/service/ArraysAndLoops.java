package com.abctech.service;

import java.util.*;

/**
 * Created by s.purakayastha
 * Date: 11/13/2020
 * Time: 11:52 PM
 */
public class ArraysAndLoops {

    private Integer intArr[] = {10, 20, 30};

    private List<Integer> numberList;


    public void loopNumbers() {

        // For-Loop
        for (int i = 0; i < intArr.length; i++) {

            System.out.println("Value of intArr at index: " + i + " is : " + intArr[i]);
        }

        // While Loop

        Integer counter = 1;

        while (counter <= 5) {
            System.out.println("Print Counter : " + counter);
            counter += 1;
        }

        Boolean flag = true;

       /* while(flag) {
            // Write some logic
            //flag = false;
        }*/

        // For Each Loop
        // ArrayList are part of Collections framework in Java

        List<String> stringList = new ArrayList<String>();
        stringList.add("Raghu");
        stringList.add("Ramesh");
        stringList.add("Veena");
        stringList.add("Rohini");
        stringList.add("Aadya");

        for (String stringobj : stringList) {
            System.out.println("Name  : " + stringobj);
            //Testing git push
        }
        Collections.reverse(stringList);
        Iterator iter = stringList.iterator();
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name is :" + name);
        }

        Map<Integer, String> studentMap = new HashMap<Integer, String>();
        studentMap.put(10, "Raghu");
        studentMap.put(20, "Ramesh");
        studentMap.put(30, "Rohini");

        String name = studentMap.get(30);

        studentMap.put(null, "ABCD");

        //Hashmaps can have one and only one null key
    }

    public static void main(String args[]) {

        Map<Integer, String> studentMap = new HashMap<Integer, String>();
        studentMap.put(10, "Raghu");
        studentMap.put(20, null);
        studentMap.put(30, null);
        studentMap.put(10, "Ramesh");

        String name = studentMap.get(30);

        studentMap.put(null, "ABCD");

        System.out.println("Null key value : " + studentMap.get(null));
        System.out.println("10 key value : " + studentMap.get(10));

        /** Hashmap Interview questions
         * i) What is a hashmap?
         * ii) Can hasmap contain null keys?  -- Yes.. One null key is allowed
         * iii) HASHMAP can contain MULTIPLE NULL VALUES BUT ONLY ONE NULL KEY
         * iv) How do you iterate a hashmap
         * v) HOW DOES A HASHMAP WORK INTERNALLY?
         * https://dzone.com/articles/how-hashmap-works-internally-in-java
         *
         * Q: What is hashing in Java?
         *
         *
         */

        Iterator mapIter = studentMap.entrySet().iterator();
        /*while (mapIter.hasNext()) {
            Set<Map.Entry<Integer, String>> entry = (Set<Map.Entry<Integer, String>>) mapIter.next();
        }*/

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            name = entry.getValue();
        }

        // Collections - SET

        Set<String> stringSet = new HashSet<String>();
        //Set cannot contain duplicate objects
        stringSet.add("Ramesh");
        stringSet.add("Raghu");
        stringSet.add("ABCD");
        stringSet.add("Rohini");
        // stringSet.add("Raghu");

ArraysAndLoops integer = new ArraysAndLoops();
integer.sortIntegerList();
    }

    public void sortIntegerList() {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(59);
        integerList.add(9);
        Collections.sort(integerList,Collections.reverseOrder());
        for (Integer integervalue : integerList) {
            System.out.println("Number  : " + integervalue);

        }
    }
}