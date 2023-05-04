package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mirro = new int[10][10];
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                mirro[i][j] = sc.nextInt();
            }
        }

        int dx = 1;
        int dy = 1;
        if(mirro[dy][dx]!=2){
            for(int i = 0 ; i<16 ; i++){
                if(mirro[dy][dx+1]==0){
                    dx++;
                    mirro[dy][dx]=9;
                } else if(mirro[dy][dx+1]==2){
                    mirro[dy][dx+1]=9;
                    break;
                } else if(mirro[dy+1][dx]==0) {
                    dy++;
                    mirro[dy][dx]=9;
                } else if(mirro[dy+1][dx]==2) {
                    mirro[dy + 1][dx] = 9;
                    break;
                }
            }
        }

        mirro[1][1]=9;
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                System.out.printf("%d ",mirro[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
