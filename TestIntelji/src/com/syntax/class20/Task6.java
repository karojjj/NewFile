package com.syntax.class20;

public class Task6 {

    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String bookName; //instance variable
    double price; //instance variable
    public Task6(){ //constructor 1 with no argument

        System.out.println("No argument constructor");
    }
    public Task6(String bookName, double price) { //constructor two with two arguments
        this(); //we use this() to call another constructor inside another
        this.bookName = bookName;
        this.price = price;
        //this (); constructor can not be here it must be upper
        System.out.println("two argument constructors");
    }
}
