/**
 * Project Name: java-base
 * File Name: StaticTest
 * Package Name: com.example.javabase
 * Date: 2019-8-23 11:24
 * Copyright (c) 2019,All Rights Reserved.
 */
package com.example.javabase;

public class StaticTest {
    static int i = 9;


    public static void main(String[] args) {
        StaticTest staticTest1 = new  StaticTest();
        StaticTest staticTest2= new StaticTest();

        StaticTest.i = 10;
//        System.out.println(staticTest1.i);
//        System.out.println(staticTest2.i);

//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("user.name"));

//        System.out.println(
//                System.getProperty("java.library.path")
//        );
        int x = 1, y = 2, z = 3;
        int a = x+ y -2/2 + z;
        int b = x + (y - 2)/(2 + z);
//        System.out.println("a = "+ a + "b = "+ b);






    }
}


