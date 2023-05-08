package com.example.javaproject2.week4;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < input * i; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}
