package com.example.javaproject2.week1.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
//    InputStreamReader is = new InputStreamReader(System.in);
//    BufferedReader br = new BufferedReader(is);
    public void readALine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("line1 = "+br.readLine());
        System.out.println("line2 = "+br.readLine());
    }

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println(br.read() + br.read());
    }



}
