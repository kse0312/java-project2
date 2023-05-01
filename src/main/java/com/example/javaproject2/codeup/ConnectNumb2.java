package com.example.javaproject2.codeup;

public class ConnectNumb2 {
    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int len    = num_list.length;
            int even = 0;
            int odd  = 0;

            for(int i = 0 ; i < len ; i++){
                if(num_list[i]%2==0){
                    even *=10;
                    even += num_list[i];
                }else{

                    odd *=10;
                    odd += num_list[i];
                }
            }
            answer = even + odd;
            return answer;
        }
    }
}
