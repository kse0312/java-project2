package com.example.javaproject2.week4.Day4;

import java.util.*;

class Student{
    private int number;
    private String name;

    public Student(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
public class Main {
    private List<Student> students;

    public Main() {
        this.students = new ArrayList<>();
    }

    public Student makeAStudent(int number, String name){
        return new Student(number, name);
    }

    public void process(String code, int numb, String name){
        Student student = makeAStudent(numb, name);
        if(code.equals("I")){
            addAStudent(student);

        }else{
            removeAStudent(student);
        }
    }
    public void addAStudent(Student student){
        boolean check = true;
        for(Student temp : students)
            if(isExsist(student,temp)) check = false;
        if(check)students.add(student);
    }

    public void removeAStudent(Student student){
        for(Student temp : students){
            if(isExsist(student,temp)){
                students.remove(temp);
                break;
            }
        }
    }
    public void printAStudent(int index){
        Student student = students.get(index);
        System.out.printf("%d %s\n",student.getNumber(),student.getName());
    }
    public void printList(){
        for(Student student : students){
            System.out.printf("%d %s\n",student.getNumber(),student.getName());
        }
    }
    public boolean isExsist(Student student1, Student student2) {
        return student1.getNumber()==student2.getNumber();
    }
    public void listSort(){
        students.sort((p1, p2) -> p1.getNumber() - p2.getNumber());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Main main = new Main();
        String code = "";
        for(int i = 0 ; i < input ; i++){
            code = sc.next();
            int numb = sc.nextInt();
            String name = sc.next();
            main.process(code, numb, name);

        }
        main.listSort();

        for(int i = 0 ; i < 5 ; i++){
            main.printAStudent(sc.nextInt()-1);
        }
        //main.printList();
    }
}
