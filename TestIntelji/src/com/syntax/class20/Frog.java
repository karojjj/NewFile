package com.syntax.class20;

public class Frog {
    //our class instance variables
    String name;
    String color;
    int age;
    double weight;
    //creating constructor with class name"Frog"
    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
       //double weight = 20;
      // weight=10; gives us zero
        this.weight=10; // it gives us 10

    }

    public Frog(String name, String color, int age, double weight) {
       this(name, color, age);
     this.weight = weight;
    }
    void printInfo(){
        // this(name, color, age); this is not allowed to inside the methods
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
