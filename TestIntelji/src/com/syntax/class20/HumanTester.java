package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        StudentClass student=new StudentClass();
        student.name="medine";
        System.out.println(student.name);
        student.printName();
        student.studentId="123";
        System.out.println("*******************************");
        PrincipleClass principle=new PrincipleClass();
        principle.name="Ashgar";
        principle.age=29;
        principle.weight=190;
        principle.specialParking =true;


    }
}
