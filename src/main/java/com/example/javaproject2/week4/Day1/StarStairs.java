package com.example.javaproject2.week4.Day1;
import java.util.Scanner;

public class StarStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1 ; i <= input ; i++){
            for(int j = 0; j < i ; j++){
                System.out.printf(" ");
            }
            System.out.printf("**");
            System.out.printf("\n");
        }
    }
}

