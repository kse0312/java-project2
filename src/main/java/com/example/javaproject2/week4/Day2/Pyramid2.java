package com.example.javaproject2.week4.Day2;

public class Pyramid2 {
    private String spaceChar = " ";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(String spaceChar, int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height) {
        // 기능이 3가지
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(spaceChar, height, i));
        }
    }
    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" "); // argument " "를 넘겨서 초기화
        Pyramid2 pyramidSpaceZero = new Pyramid2("0"); // argument "0"을 넘겨서 초기화
        pyramid2.printPyramidWithSpaceChar(4);
        pyramidSpaceZero.printPyramidWithSpaceChar(5);
    }
}
