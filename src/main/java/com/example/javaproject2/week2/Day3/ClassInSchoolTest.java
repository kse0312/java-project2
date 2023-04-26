package com.example.javaproject2.week2.Day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no =1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name= "김누구";
        classInSchool.teacher.age=30;

        classInSchool.students=new  Student[30];

        System.out.println(classInSchool.teacher.name);

    }
}
