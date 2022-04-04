package com.replit.exercises;

public class Replit88 {
	 String breed, name, color;
	  
	   void bark(){
	     System.out.println(name+" can bark");
	   }
	   void run(){
	     System.out.println(name+" can run");
	   }
	   void play(){
	    System.out.println(name+" can play");
	   }
	public static void main(String[] args) {
		/*
		 * Create a Class Replit88 In this class, you should specify the following
		 * attributes: breed, name, color, and following behaviors: bark(), run(),
		 * play(). Create 3 different objects of it: Husky, Bulldog, Labrador with
		 * specific attributes and behaviors. The output of the program should be as
		 * following: Husky can bark Husky can bark Husky can run Bulldog can bark
		 * Bulldog can bark Bulldog can run Labrador can bark Labrador can bark Labrador
		 * can run
		 */
		Replit88 dog1 = new Replit88();
		dog1.name = "Husky";
		dog1.breed = "Siberian";
		dog1.color = "White";
		dog1.bark();
		dog1.run();
		dog1.play();

		Replit88 dog2 = new Replit88();
		dog2.name = "Bulldog";
		dog2.breed = "American";
		dog2.color = "Black";
		dog2.bark();
		dog2.run();
		dog2.play();

		Replit88 dog3 = new Replit88();
		dog3.name = "Labrador";
		dog3.breed = "British";
		dog3.color = "Brown";
		dog3.bark();
		dog3.run();
		dog3.play();

	}

}
