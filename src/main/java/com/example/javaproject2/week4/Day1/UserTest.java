package com.example.javaproject2.week4.Day1;


class UserTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user1 = userFactory.getAdultUser();
        User user2 = userFactory.getAdultUser();
        System.out.println(user1.isAdult());
        System.out.println(user2.isAdult());
    }
}