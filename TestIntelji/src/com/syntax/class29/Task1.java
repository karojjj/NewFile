package com.syntax.class29;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
       /*
       Create a Set collection that will hold Objects of Student Type. In this set
       we do not care about the insertion order. Each student object should have name and studentID.
       Display name of each student.
        */
        Set<Student> students=new HashSet<>();
        students.add(new Student("medine","123"));
        students.add(new Student("arin","12453"));
        students.add(new Student("berfin","19923"));
        students.add(new Student("renas","15252523"));
        for(Student s:students){
            s.printName();
        }

    }
}
class Student{
    String name;
    String studentId;
    Student(String name, String studentId){
        this.name=name;
        this.studentId=studentId;
    }
    void printName(){
        System.out.println(name);
    }
}