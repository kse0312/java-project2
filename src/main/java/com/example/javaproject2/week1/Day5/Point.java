package com.example.javaproject2.week1.Day5;

public class Point {
    int x;
    int y;

    float getDistance(Point p2){
        int distanceX = (int) Math.pow(x - p2.x , 2);
        int distanceY = (int) Math.pow(y - p2.y , 2);
        return (float) Math.sqrt(distanceX + distanceY);
    }

    boolean isSameXY(){
        return x==y;
    }
}