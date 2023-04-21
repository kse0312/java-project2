package com.example.javaproject2.week1.Day5;

//꽤 괜찮은 코드
public class PointTest {

    public static void main(String[] args) {
        // 0, 0의 점 만들기
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 2;
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("p1의 x,y는 같은가 : %b\n", p1.isSameXY());

        // 또 다른 점 찍기
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("p2의 x,y는 같은가 : %b\n", p2.isSameXY());

        System.out.printf("두 점 사이의 거리 %.1f", p1.getDistance(p2));

    }
}