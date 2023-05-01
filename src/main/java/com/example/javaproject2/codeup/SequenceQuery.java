package com.example.javaproject2.codeup;
//https://school.programmers.co.kr/learn/courses/30/lessons/181924
public class SequenceQuery {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = {};
            for(int i = 0 ; i < queries.length ; i++){
                int temp = arr[queries[i][0]];
                arr[queries[i][0]] = arr[queries[i][1]];
                arr[queries[i][1]] = temp;
            }
            answer = arr;
            return answer;
        }
    }
}
