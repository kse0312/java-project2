package com.example.javaproject2.week1.Day3;

import java.util.Arrays;
import java.util.Scanner;


public class TwoDimArray {

    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // 2차원 배열 선언
        int[] arr0 = arr[0]; // 2차원 배열에서 배열을 꺼내 1차원 배열이 됨
        arr0[0] = 1; // 1차원 배열인 arr0에서 첫번째 칸에 값을 할당
        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);
    }
}