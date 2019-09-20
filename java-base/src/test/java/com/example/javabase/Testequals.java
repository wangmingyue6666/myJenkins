/**
 * Project Name: java-base
 * File Name: Testequals
 * Package Name: com.example.javabase
 * Date: 2019-8-23 14:55
 * Copyright (c) 2019,All Rights Reserved.
 */
package com.example.javabase;

public class Testequals {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i =100;
        System.out.println(v1.equals(v2));  //false
        System.out.println(v1 == v2);       //false
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        Integer integer1 = new Integer(44);
        Integer integer2 = new Integer(44);
//        System.out.println(integer1 == integer2);      //false
//        System.out.println(integer1 .equals(integer2)); //true

        String s = new String("43");
        String s2 = new String("43");
//        System.out.println(s == s2);        //false
//        System.out.println(s.equals(s2));     //true


    }
}

class Value{
    int i = 1;
}



