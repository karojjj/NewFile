package com.syntax.class20;

public class Task5 {
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name; //instance variable
    String address; //instance variable (instance mean have multiple copy , for static only one copy)

    public Task5(String name, String address) { //Creating a constructor that will initialize those variables.
        this.name = name;
        this.address = address;
    }

    void displayInfo() {  //creating displayInfo method
        System.out.println(this.name + " " + this.address);

    }
}