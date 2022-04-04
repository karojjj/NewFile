package com.syntax.class20;

public class Parent {
    private String name; //private members do not participate in heritance
    int age;
    protected double weight;
    public String color;
}

    class Child extends Parent{ //
    void printInfo(){ //it is a method
       // System.out.println(name); it gives error because it is private and not have access to parent class even in the same file
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }
    }
