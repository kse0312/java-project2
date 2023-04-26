package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1038_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextLong() + sc.nextLong());  //1038,9
//        System.out.println(sc.nextLong()*(-1)); //1040

//        char cVal = sc.next().charAt(0);    //1041
//        int iVal = (int)cVal+1;
//        System.out.println((char) iVal);

//        System.out.println(sc.nextLong() / sc.nextLong());  //1042

//        System.out.println(sc.nextLong() % sc.nextLong());  //1043

//        System.out.println(sc.nextLong()+1);    //1044

//        long val1 = sc.nextLong();              //1045
//        long val2 = sc.nextLong();
//        System.out.println(val1 + val2);
//        System.out.println(val1 - val2);
//        System.out.println(val1 * val2);
//        System.out.println(val1 / val2);
//        System.out.println(val1 % val2);
//        System.out.printf("%.2f",(float)val1/val2);

        Long sum = 0L;                          //1046
        sum += sc.nextLong();
        sum += sc.nextLong();
        sum += sc.nextLong();
        System.out.println(sum);
        System.out.printf("%.1f",(float)sum/3);

    }
}
