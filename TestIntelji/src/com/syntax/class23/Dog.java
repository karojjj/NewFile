package com.syntax.class23;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    //overloading constructor
    Dog() {
        System.out.println("no parameters=argument constructor");
    }

    Dog(String name) {
        this.name = name;
        System.out.println("one argument constructor");
    }

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("two argument constructor");
    }

    public Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void changeInfo(String name) {
        this.name = name;

    }

    void changeInfo(String name, String color) {
        this.name = name;
        this.color = color;

    }

    void printInfo(String name, String color) {
        this.name = name;
        this.color = color;

    }
    void changeInfo(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
//type inside the method "toString" the below code will automatically wll generate from Java
        @Override
        public String toString () {
            return "Dog{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", breed='" + breed + '\'' + ", age=" + age + ", weight=" + weight + '}';
        }
    }
