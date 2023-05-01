package com.example.javaproject2.codeup;

public class connectNumb {
    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int len    = num_list.length;
            String even = "";
            String odd  = "";

            for(int i = 0 ; i < len ; i++){
                if(num_list[i]%2==0){
                    even += Integer.toString(num_list[i]);
                }else{
                    odd += Integer.toString(num_list[i]);
                }
            }
            answer = Integer.parseInt(even) + Integer.parseInt(odd);
            return answer;
        }
    }
}
