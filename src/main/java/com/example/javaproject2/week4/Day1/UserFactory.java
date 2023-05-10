package com.example.javaproject2.week4.Day1;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.name = "김땡떙";
        user.age = 34;
        return user;
    }
}
