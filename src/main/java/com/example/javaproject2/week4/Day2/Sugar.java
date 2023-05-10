package com.example.javaproject2.week4.Day2;

import java.util.Scanner;

public class Sugar {
    private int[][] board;
    private int height;
    private int width;

    public Sugar(int height, int width){
        this.board  = new int[height][width];
        this.height = height;
        this.width  = width;
    }

    public void putStick(int length, int direct, int x, int y){
        for (int i = 0; i < length; i++) {
            if(direct == 0){ // 가로
                board[x - 1][y + i - 1] = 1;
            } else { // 세로
                board[x + i - 1][y - 1] = 1;
            }
        }
    }
    public void printBoard(){
        System.out.printf("\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sugar sugar = new Sugar(sc.nextInt(), sc.nextInt());
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sugar.putStick(l, d, x, y);
        }
        sugar.printBoard();
    }
}
