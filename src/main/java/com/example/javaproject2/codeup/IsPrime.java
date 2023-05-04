package com.example.javaproject2.codeup;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int check = 0;
        for(int i = 2; i <= input/2 ; i++){
            if(input%i==0){
                check = 1;
                break;
            }
        }
        if(check == 1) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }

    }
}
