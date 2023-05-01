package com.example.javaproject2.codeup;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();                //총 몇개의 값이 들어오는지 받아준다.
        int[] inputs = new int[size];           //미리 받은 size에 맞게 int 배열을 만들어준다.

        //size만큼 반복문을 돌려 inputs 배열에 값을 넣어준다.
        for(int i = 0 ; i < size ;i++){
            inputs[i] = sc.nextInt();
        }

        //1번 for()문
        //버블 정렬 1바퀴를 돌았을 때 정렬되는 값은 마지막 수 1개이기 때문에
        //처음부터 끝까지 한 번 스캔하는 과정을 총 size번 거쳐야 한다.
        for(int i = 0; i < size ; i++ ){
            //2번 for문
            //정렬된 수를 제외한 나머지 수를 앞 뒤로 확인하는 반복문
            //j번째 값과 j+1번째 값을 비교하기 때문에
            //조건부를 j < size-1 로 해줘야 마지막에 size를 넘지 않고 계산할 수 있다.
            //조건부를 j < size로 한다면, size가 5라고 했을 때 4번과 5번을 검사할때 index를 초과한다.
            for(int j = 0 ; j < size-1-i ; j++ ){
                //0번째와 1번째를 확인해보고 1번이 더 작으면 앞으로 보낸다.
                if(inputs[j] > inputs[j+1]){
                    int temp = inputs[j];
                    inputs[j] = inputs[j+1];
                    inputs[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < size ; i++ ){
            System.out.println(inputs[i]);
        }
    }
}
