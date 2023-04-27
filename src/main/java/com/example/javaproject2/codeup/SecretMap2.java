package com.example.javaproject2.codeup;

import java.util.Arrays;

public class SecretMap2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");

        for(int i=0;i<n;i++){
            int temp1 = arr1[i];    //arr1의 i번째 줄
            int temp2 = arr2[i];    //arr2의 i번째 줄

            // temp1과 temp2 | 계산 후 문자열로 만들어줌
            String code = Integer.toBinaryString(temp1|temp2);

            //code의 길이가 n보다 작은 경우 앞자리 0 개수만큼 " "을 넣어준다.
            if(code.length() < n){
                for(int z=0;z<n-code.length();z++){
                    answer[i] += " ";
                }
            }
            answer[i] += code.replace("1","#").replace("0"," ");
        }
        return answer;
    }
}
