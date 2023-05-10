package com.example.javaproject2.week4.Day2;

public class MultiplicationTable {
    private String multipleSymbol;
    public MultiplicationTable(String multipleSymbol){
        this.multipleSymbol = multipleSymbol;
    }
    public void printDan(int dan){
        for(int i = 1; i <= 9 ; i++){
            System.out.printf("%d %s %d = %02d\n",dan,multipleSymbol,i,dan*i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(3);
    }
}
