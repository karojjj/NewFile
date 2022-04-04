package com.syntax.Replit;

public class Replit150 {
    public static void main(String[] args) { //main class
        Employee emp=new Employee("Joe","Smith",35, 35000);
        emp.print();
        Student student=new Student("Adam", "Smith", 15, 10);
        student.print();
        Retiree retiree=new Retiree("Frank", "Smith", 15,"tour");
        retiree.print();
    }
}
    class Person{
        String name;
        String lastName;
        int age;
        Person(String name, String LastName,int age){ //constructor of the "person" class
            this.name=name;
            this.lastName=lastName;
            this.age=age;
        }
    }
    class Employee extends Person{
        int salary;
        Employee(String name, String lastName, int age, int salary){
            super(name,lastName, age);
            this.salary=salary;
        }
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " + salary);
        }
    }
    class Student extends Person{
        int grade;
        Student(String name,String lastName, int age, int grade ){
            super(name, lastName, age);
            this.grade=grade;
        }
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " + grade);
        }
    }
    class Retiree extends Person{
        String seniorActivity;
        Retiree(String name, String lastName, int age, String seniorActivity){
            super(name, lastName, age);
            this.seniorActivity=seniorActivity;
        }
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " +
                    seniorActivity);
        }
    }
