package com.example.javaproject2.week1.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class InputOneVal {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        if(index<10){
            arr[sc.nextInt()]=1;
        }
        System.out.println(Arrays.toString(arr));

    }
}
