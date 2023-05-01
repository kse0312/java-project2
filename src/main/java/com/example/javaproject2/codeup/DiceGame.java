package com.example.javaproject2.codeup;

public class DiceGame {
    public static void main(String[] args) {
        class Solution {
            public int solution(int a, int b, int c) {
                int answer = 1;
                int cnt = 0;
                if(a != b && b!=c && a != c){
                    cnt = 1;
                }else if(a==b && b==c){
                    cnt = 3;
                }else{
                    cnt = 2;
                }

                for(int i=1;i<=cnt; i++){
                    int temp = 0;
                    temp += Math.pow(a,i);
                    temp += Math.pow(b,i);
                    temp += Math.pow(c,i);
                    answer *= temp;
                }
                return answer;
            }
        }
    }
}
