package com.example.javaproject2.week4.Day1;

public class User {
    public String name;
    public int age;
    public String phoneNumber;

    public String isAdult(){
        if(age >= 18)
            return name + "은 성인입니다.";
        return name + "은 성인이 아닙니다.";
    }
}
/*
        User user1 = new User();
        User user2 = new User();
        user1.name = "김나나";
        user1.age = 27;
        user1.name = "김미미";
        user2.age = 10;
        System.out.println(user1.isAdult());
        System.out.println(user2.isAdult());
 */