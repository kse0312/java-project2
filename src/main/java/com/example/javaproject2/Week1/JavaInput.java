package com.example.javaproject2.Week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        //InputStreamReader 클래스를 is라는 이름으로 선언
        InputStreamReader is;
        //InputStreamReader를 인스턴스화
        is = new InputStreamReader(System.in);
        int asciiCode = 0;
        asciiCode = is.read();
        System.out.println(asciiCode);
    }
    public void readTwoChars() throws IOException {
        InputStreamReader is;
        is = new InputStreamReader(System.in);
        int asciiCode1 = 0;
        int asciiCode2 = 0;
        asciiCode1 = is.read();
        asciiCode2 = is.read();
        //soutm, soutv
        System.out.println("JavaInput.readTwoChars");
        System.out.println("asciiCode1 = " + asciiCode1);
        System.out.println("asciiCode2 = " + asciiCode2);

    }
}
