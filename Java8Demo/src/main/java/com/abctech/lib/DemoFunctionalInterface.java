package com.abctech.lib;

/**
 * Created by s.purakayastha
 * Date: 11/21/2020
 * Time: 11:38 PM
 */
@FunctionalInterface
public interface DemoFunctionalInterface {

    public String greet();

    default void greetHello() {
        System.out.println("Greet Hello");
    }

}