package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] board = new int[20][20];
        for(int i = 1 ; i < 20 ; i++){
            for(int j = 1 ; j < 20 ; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int turns = sc.nextInt();
        int [][] points = new int[turns][2];
        for(int i = 0 ; i<turns ; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        for(int i = 0 ; i <turns ; i++){
            int y = points[i][0];
            int x = points[i][1];
            for(int j = 1 ; j < 20 ; j++){
                board[y][j] = board[y][j] == 1 ? 0 : 1;
            }
            for(int j = 1 ; j < 20 ; j++){
                board[j][x] = board[j][x] == 1 ? 0 : 1;
            }
        }

        for(int i = 1 ; i < 20 ; i++){
            for(int j = 1 ; j < 20 ; j++){
                System.out.printf("%d ", board[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
