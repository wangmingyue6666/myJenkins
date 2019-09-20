/**
 * Project Name: rabbitmq2
 * File Name: Tests
 * Package Name: com.wmy.rabbitmq2
 * Date: 2019-8-21 16:00
 * Copyright (c) 2019,All Rights Reserved.
 */
package com.example.javabase;



import java.io.IOException;
import java.io.InputStream;

public class Tests {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("e:\\writer.txt");
//        fw.write("写入信息writer");
//        fw.flush();
//        fw.close();

//        FileWriter fw2 = new FileWriter("e:\\writer.txt",true);
//        fw2.write("继续写入");
//        fw2.flush();
//        fw2.close();

        InputStream is = System.in;
        StringBuilder sb = new StringBuilder();
        while(true){
            int ch = is.read();
            if(ch=='\r')
                continue;
            if(ch=='\n'){
                String line = is.toString();
                if ("over".equals(line))
                break;
                System.out.println(line.toUpperCase());
            }else{
                sb.append((char)ch);
            }
        }
        is.close();

        }
        String [] s = new String []{"2","3"};

    }

