package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.next());          //1018

//        String str = sc.next();                 //1019
//        String[] strArray = str.split("\\.");
//        int[] nums = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
//        System.out.printf("%04d.%02d.%02d",nums[0],nums[1],nums[2]);

//        String str = sc.next();                 //1020
//        String[] strArray = str.split("-");
//        System.out.println(strArray[0]+strArray[1]);

//        System.out.println(sc.next());          //1021

//        String str = sc.next();                 //1022
//        while(sc.hasNext()){
//            str += " "+sc.next();
//        }
//        System.out.println(str);

        float input = sc.nextFloat();
        System.out.println((int)input);
        System.out.println((input-(int)input)*1000000);

    }
}
