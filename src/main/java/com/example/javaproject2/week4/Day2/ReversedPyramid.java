package com.example.javaproject2.week4.Day2;

import java.util.Scanner;

public class ReversedPyramid {
    String spaceChar;
    String repeater;
    public ReversedPyramid(String spaceChar,String repeater){
        this.spaceChar = spaceChar;
        this.repeater = repeater;
    }
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), repeater.repeat(2*(height-i)+1));
    }
    public static void main(String[] args) {
        ReversedPyramid rp = new ReversedPyramid(" ","-");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1 ; i <= input ; i++){
            System.out.print(rp.makeALine(input, i));
        }
    }
}
