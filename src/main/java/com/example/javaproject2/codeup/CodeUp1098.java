package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizey = sc.nextInt();
        int sizex = sc.nextInt();
        int[][] board = new int[sizey][sizex];

        int numb = sc.nextInt();
        int[] length = new int[numb];
        int[] direct = new int[numb];
        int[] dy = new int[numb];
        int[] dx = new int[numb];
        for(int i = 0 ; i < numb ; i++){
            length[i] = sc.nextInt();
            direct[i] = sc.nextInt();
            dy[i] = sc.nextInt()-1;
            dx[i] = sc.nextInt()-1;
        }
        for(int i = 0 ; i < numb ; i++){
            if(direct[i] == 0){
                for(int j = 0 ; j < length[i] ; j++){
                    board[dy[i]][dx[i]+j]= 1;
                }
            }else{
                for(int j = 0 ; j < length[i] ; j++){
                    board[dy[i]+j][dx[i]]= 1;
                }
            }
        }

        for(int i = 0 ; i < sizey ; i++){
            for (int j = 0 ; j < sizex ; j++){
                System.out.printf("%d ",board[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
