/**
 * Project Name: java-base
 * File Name: RandomTest
 * Package Name: com.example.javabase
 * Date: 2019-8-23 16:17
 * Copyright (c) 2019,All Rights Reserved.
 */
package com.example.javabase;

public class RandomTest {
    public static void main(String[] args) {
        int number = (int) (Math.random()*100);
//        System.out.println(number);

        for(int i = 0; i<30 ; i++){
           if(i==20) {
                continue;
            }
            System.out.println(i);
        }
    }

}
