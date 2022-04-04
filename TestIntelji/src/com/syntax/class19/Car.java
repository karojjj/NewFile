package com.syntax.class19;

public class Car {
    String name;
    String make;
    String color;
    String type;

    Car(String name, String make, String color, String type){
        //if we have same local and instance variables
        // java always prefer local variables
        // if you want to instruct java to use instance variable
        // we use the "this " keyword
        this.name=name;
       this.make=make;
       this.color=color;
       this.type=type;
    }
    //no argument constructor
     Car(){

   }
   void PrintCar(){
       String name="Toyota";
       System.out.println(name); //tesla
       System.out.println(this.name);//null
   }
}
