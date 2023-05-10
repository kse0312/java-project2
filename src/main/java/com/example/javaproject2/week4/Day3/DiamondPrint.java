package com.example.javaproject2.week4.Day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiamondPrint {
    String spaceChar;
    String repeater;
    public DiamondPrint(String spaceChar, String repeater){
        this.spaceChar = spaceChar;
        this.repeater  = repeater;
    }
    public String makeALine(int spaceLength, int repeat) {
        String line = "";
        for(int j = 0 ; j < spaceLength ; j++){
            line+=spaceChar;
        }
        for (int j = 0; j < repeat; j++) {
            line+=repeater;
        }
        line+="\n";
        return line;
    }

    public String makeADiamond(int length){
        String Diamond = "";
        for(int i = 1 ; i <= length ; i++){
            if (i <= length/2){
                Diamond += makeALine((length - i),2*i-1);
            }else{
                Diamond += makeALine(i-1,2*(length - i)+1);
            }
        }
        return Diamond;
    }

    public void printShape(String shape){
        try {
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(shape);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DiamondPrint print = new DiamondPrint(" ","*");

        int input = sc.nextInt();

        String Diamond = print.makeADiamond(input);
        print.printShape(Diamond);
        System.out.println(Diamond);

    }
}
