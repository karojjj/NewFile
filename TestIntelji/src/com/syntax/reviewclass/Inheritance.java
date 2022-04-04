package com.syntax.reviewclass;

public class Inheritance {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ashgar", "super white", 22, "123", "Java");
        teacher.printInfo();
    }
}
class Human{
    private String name;
    private String color;
   private int age;
    Human(String name, String color, int age){
        //we need to use this. to refer instance variables
        //it invokes instance variable of the current class
        this.name=name;
        this.color=color;
        this.age=age;
        System.out.println("inside the parent class Human");
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Employee extends Human{
//we are providing matching constructor, these fields are initialized properly
    String empID;
    Employee(String name, String color, int age, String empID) {
        super(name, color, age);
        this.empID=empID; // we used this because we need to initialize the instance variable
    }
}
class Teacher extends Employee{
 String favSubject;
    Teacher(String name, String color, int age, String empID,String favSubject) {
        super(name, color, age, empID);
        this.favSubject=favSubject;
    }
}