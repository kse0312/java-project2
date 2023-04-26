package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1018_1025 {
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

//        String input = sc.next();               //1023
//        String[] arrIn = input.split("\\.");
//        System.out.println(arrIn[0]);
//        System.out.println(arrIn[1]);

//        String input = sc.next();               //1024
//        String[] arrIn = input.split("");
//        for(int i=0;i< arrIn.length;i++){
//            System.out.printf("'%s'\n",arrIn[i]);
//        }

        String input = sc.next();               //1025
        String[] arrIn = input.split("");
        for(int i=0;i<arrIn.length;i++){
            int Numb = (int) (Integer.parseInt(arrIn[i])*Math.pow(10, arrIn.length-i-1));
            System.out.printf("[%d]\n",Numb);
        }
    }
}
