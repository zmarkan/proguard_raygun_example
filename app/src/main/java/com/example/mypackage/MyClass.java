package com.example.mypackage;

/**
 * Created by zan on 04/10/14.
 */
//class that will get obfuscated
public class MyClass {
    //method that will blow up on a NullPointerException
    public int myMethod(String params){
        return params.length();
    }
}
