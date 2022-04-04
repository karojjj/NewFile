package com.syntax.class24;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    //overloading the "DOG " class the constructors
    Dog(){ //constructor class
        System.out.println("no argument constructor");
    }
    Dog(String name){
        this.name = name;
        System.out.println("one argument constructor");
    }
    public Dog(String name, String color, String breed, int age, double weight) { //creating the class of the constructor
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        System.out.println("constructor with all the parameters");
    }
    void changeInfo(String name){
        this.name=name;

    }
    void changeInfo(String name, String color){
        this.name=name;
        this.color=color;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


}
