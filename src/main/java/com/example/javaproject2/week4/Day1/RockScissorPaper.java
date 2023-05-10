package com.example.javaproject2.week4.Day1;

import java.util.Scanner;

public class RockScissorPaper {

    public static String rockScissorPaper(int me, int com){
        String[][] result = {
                { "tie", "win","lose"},
                {"lose", "tie", "win"},
                { "win","lose", "tie"}};
        return result[me][com];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int me;
        int com;
        do{
            me = sc.nextInt();
            com = sc.nextInt();
            System.out.println(rockScissorPaper(me,com));
        }while(rockScissorPaper(me,com)!="win");
    }
}
