package com.syntax.class12;

public class Dog {
	//attributes, fields, properties
      String name;
      String color;
      String breed;
      char gender;
      int age;
      double weight;
      //behaviours , functions, and methods
      void bark() {
    	  System.out.println("Dog is barking...");
      }
      void eat() {
    	  System.out.println("Dog is eating");
      }
      void sleep() {
    	  System.out.println("Dog is sleeping");
      }
      
	  public static void main(String[] args) {
		
         Dog scooby=new  Dog(); //creating an obJect scooby from class dog
         
         //dog is a class
         //scooby is an object
         //= is an assignment operator
         //new is keyword that we use to create the objects of a class
         //Dog () we are calling the constructor of the class
         //Scanner scan=new Scanner(System.in);
        // scan.nextInt();
         
         scooby.bark();
         scooby.eat();
         scooby.sleep();
         
         
	}

}
