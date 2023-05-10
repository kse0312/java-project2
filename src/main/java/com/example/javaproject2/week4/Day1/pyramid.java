package com.example.javaproject2.week4.Day1;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < input - i; j++)
                System.out.printf(" ");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.printf("*");
            }

            System.out.printf("\n");
        }

    }
}
