package com.syntax.class24;
class Student{

    void study(){
        System.out.println("students must study to pass ");
    }
    void doHomework(){
        System.out.println("students must do homeworks");
    }
    void practice(){
        System.out.println("students must do practice");
    }
}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("syntax students must study 25 hours a week");
    }
    void doHomework(){
        System.out.println("syntax students must solve Replits questions");
    }
@Override
void practice(){
        System.out.println("syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomework() {

        System.out.println("college students can skip some of the homeworks");
    }
}
class SchoolStudent extends Student{

}
public class Task1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}
