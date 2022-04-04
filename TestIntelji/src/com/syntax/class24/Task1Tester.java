package com.syntax.class24;

import com.syntax.class20.StudentClass;

public class Task1Tester {
    public static void main(String[] args) {
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
 /*
 as we can store the object of a child class in a parent class
 we can also create an array of these students as show below
  */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(),
                new CollegeStudent()};
        for(Student student:students){
            student.study();
            student.doHomework();
            student.practice();
        }
    }}
