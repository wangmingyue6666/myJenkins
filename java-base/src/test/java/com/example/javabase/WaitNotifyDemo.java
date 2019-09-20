/**
 * Project Name: rabbitmq2
 * File Name: WaitNotifyDemo
 * Package Name: com.wmy.rabbitmq2
 * Date: 2019-8-22 10:49
 * Copyright (c) 2019,All Rights Reserved.
 */
package com.example.javabase;

public class WaitNotifyDemo {
    final static Object OBJECT = new Object();

    public static class Thread1 extends  Thread{
        @Override
        public void run() {
            synchronized (OBJECT){
                System.out.println(System.currentTimeMillis()+"线程1开启");
                try {
                    OBJECT.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+"线程1结束");
            }
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (OBJECT){
                System.out.println(System.currentTimeMillis()+"线程2开启");
                OBJECT.notify();
                System.out.println(System.currentTimeMillis()+"线程2执行notify结束");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+"线程2结束");
            }
        }
    }

    public static void main(String[] args) {
//        Thread thread1 = new Thread1();
//        Thread thread2 = new Thread2();
//        thread1.start();
//        thread2.start();

        String [] ss = new String[3];
 //       System.out.println(ss.length);

        String str0 = "g";
        String str1 = "g";
        String str2 = new String("g");
        str2 = "ipp";

        String str = "gfhh";

  //      System.out.println(str.length());
//        System.out.println(System.identityHashCode(str0));
//        System.out.println(System.identityHashCode(str1));
//        System.out.println(System.identityHashCode(str2));
//        System.out.println(str2.hashCode());
//        System.out.println(str.hashCode());
        String sstr = "123456";

        System.out.println("sstr = " + sstr);

        sstr.replace('1', '0');

        System.out.println("sstr = " + sstr);

    }

}
