package com.example.javaproject2.week4.Day2;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        input *=2;
        for(int i = 1 ; i <= input ; i+=2){
            for(int j = 0 ; j < (input - i)/2 ; j++){
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
