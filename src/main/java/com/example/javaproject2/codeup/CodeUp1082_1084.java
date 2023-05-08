package com.example.javaproject2.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1082_1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();               //1082
//        int input_int = Integer.parseInt(input,16);
//        for(int i=1;i<16;i++){
//            System.out.printf("%s*%s=%s\n",input,Integer.toString(i,16).toUpperCase(),Integer.toString(input_int*i,16).toUpperCase());
//        }

//        int input = sc.nextInt();           //1083
//        for(int i = 1 ; i <= input ; i++){
//            if(i%3==0)
//                System.out.printf("X ");
//            else
//                System.out.printf("%d ",i);
//        }

        int red = sc.nextInt();
        int blue = sc.nextInt();
        int green = sc.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<red;i++)
        {
            for(int j=0;j<blue;j++)
            {
                for(int k=0;k<green;k++)
                {

                    String st = i + " " + j + " " + k;
                    bf.write(st + "\n");
                    bf.flush();
                }
            }
        }
        bf.write(Integer.toString(red*green*blue));
        bf.close();
    }
}
