package com.example.javaproject2.week1.Day3;

import java.util.Arrays;

public class ChangeArrValue {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        int temp;

        System.out.println(Arrays.toString(arr));

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
