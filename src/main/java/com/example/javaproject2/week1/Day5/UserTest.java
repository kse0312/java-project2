package com.example.javaproject2.week1.Day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김경록";
        user.phoneNumber = "010-1111-1212";
        user.age = 37;

        System.out.println(user.name);
        System.out.println(user.phoneNumber);
        System.out.println(user.age);

        System.out.printf("이 사용자는 성인입니까? %b",user.isAdult());
    }
}