package com.syntax.class19;

public class Task2Tester {
    public static void main(String[] args) {
        Task2 student1=new Task2("maha",95,96,92);
        Task2 student2=new Task2("med",10,24,45);
        Task2 student3=new Task2("ali ",75,96,92);
        Task2 student4=new Task2("ahmet",45,96,92);
        Task2 student5=new Task2("ayse",95,26,92);
        student1.printAvgGrade();
        student2.printAvgGrade();
        student3.printAvgGrade();
        student4.printAvgGrade();
        student5.printAvgGrade();
/*
        the other way
        new Task2("maha",95,96,92).printAvgGrade();
        new Task2("med",10,24,45).printAvgGrade();
        new Task2("ali ",75,96,92).printAvgGrade();
        new Task2("ahmet",45,96,92).printAvgGrade();
        new Task2("ayse",95,26,92).printAvgGrade();
        */
    }}