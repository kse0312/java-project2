package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turn = sc.nextInt();
        int x, y = 0;
        int[][] result = new int[19][19];

        for(int i = 0 ; i < turn ; i++){
            y = sc.nextInt();
            x = sc.nextInt();
            result[y-1][x-1] = 1;
        }

        for(int i = 0 ; i < 19 ; i++){
            for(int j = 0 ; j < 19 ; j++){
                System.out.printf("%d ",result[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
